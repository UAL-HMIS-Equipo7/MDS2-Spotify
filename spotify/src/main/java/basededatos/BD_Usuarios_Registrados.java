package basededatos;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Usuario_Registrado;

public class BD_Usuarios_Registrados {
	public Vector<Usuario_Registrado> _contiene_usuarios_registrados = new Vector<Usuario_Registrado>();
	public BDPrincipal _bDPrincipal_UR;

	public void Eliminar_usuario(int aIdUsuario) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdUsuario);
			Usuario_RegistradoDAO.delete(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda) throws PersistentException {
		Usuario_Registrado[] usuarios = new Usuario_Registrado[0];
		
		Usuario_RegistradoCriteria criteria = new Usuario_RegistradoCriteria();
		criteria.nick.like("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			usuarios = Usuario_RegistradoDAO.listUsuario_RegistradoByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return usuarios;
	}

	public int Crear_Usuario(int aIdDatosAcceso, String aNick, String aFoto) throws PersistentException {
		int id_usuario = -1;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Datos_Acceso datos = Datos_AccesoDAO.getDatos_AccesoByORMID(aIdDatosAcceso);
			
			Usuario_Registrado usuario = Usuario_RegistradoDAO.createUsuario_Registrado();
			usuario.setNick(aNick);
			usuario.setFotoRuta(aFoto);
			usuario.setDatos(datos);
			datos.setUsuario(usuario);
			
			Usuario_RegistradoDAO.save(usuario);
			Datos_AccesoDAO.save(datos);
			
			id_usuario = usuario.getORMID();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return id_usuario;
	}

	public Usuario_Registrado Obtener_Usuario(int aIdDatosAcceso) throws PersistentException {
		Usuario_Registrado usuario = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Datos_Acceso datos = Datos_AccesoDAO.getDatos_AccesoByORMID(aIdDatosAcceso);
			
			usuario = (Usuario_Registrado) datos.getUsuario();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return usuario;
	}

	public void Actualizar_Usuario(Usuario_Registrado aUsuario) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_RegistradoDAO.save(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidores(int aIdUsuarioGenerico) throws PersistentException {
		List<Usuario_Registrado> usuariosSeguidores = new Vector<Usuario_Registrado>();
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Iterator<Usuario_generico> iterador = usuario.seguidor.getIterator();
			
			Usuario_generico temp;
			
			while(iterador.hasNext()) {
				temp = iterador.next();
				
				if (temp instanceof Usuario_Registrado){
					usuariosSeguidores.add((Usuario_Registrado)temp);
			    }
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return usuariosSeguidores.toArray(new Usuario_Registrado[usuariosSeguidores.size()]);
	}

	public Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidos(int aIdUsuarioGenerico) throws PersistentException {
		List<Usuario_Registrado> usuariosSeguidos = new Vector<Usuario_Registrado>();
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Iterator<Usuario_generico> iterador = usuario.seguidor.getIterator();
			
			Usuario_generico temp;
			
			while(iterador.hasNext()) {
				temp = iterador.next();
				
				if (temp instanceof Usuario_Registrado){
					usuariosSeguidos.add((Usuario_Registrado)temp);
			    }
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return usuariosSeguidos.toArray(new Usuario_Registrado[usuariosSeguidos.size()]);
	}

	public void Actualizar_Perfil(int aIdUsuario, String aNuevoEmail, String aNuevoNick) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdUsuario);
			Datos_Acceso datos = usuario.getDatos();
			
			datos.setEmail(aNuevoEmail);
			usuario.setNick(aNuevoNick);
			
			usuario.setDatos(datos);
			
			Datos_AccesoDAO.save(datos);
			Usuario_RegistradoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Seguir_Usuario(int aIdSeguidor, int aIdSeguido) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuarioSeguidor = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdSeguidor);
			Usuario_Registrado usuarioSeguido = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdSeguido);
			
			usuarioSeguidor.seguido.add(usuarioSeguido);
			usuarioSeguido.seguidor.add(usuarioSeguidor);

			Usuario_RegistradoDAO.save(usuarioSeguidor);
			Usuario_RegistradoDAO.save(usuarioSeguido);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}