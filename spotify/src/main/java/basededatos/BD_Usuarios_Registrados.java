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
			
			Cancion[] ultimasReproducidas = usuario.ultimas_reproducidas.toArray();
			for (Cancion cancion : ultimasReproducidas) {
				usuario.ultimas_reproducidas.remove(cancion);
			}
			
			Evento[] notificaciones = usuario.notificaciones.toArray();
			for (Evento notificacion : notificaciones) {
				usuario.notificaciones.remove(notificacion);
			}
			
			Lista_de_reproduccion[] listas = usuario.listas.toArray();
			for (Lista_de_reproduccion lista : listas) {
				usuario.listas.remove(lista);
				
				Cancion[] cancionesLista = lista.canciones_incluidas.toArray();
				
				for (Cancion cancion : cancionesLista) {
					lista.canciones_incluidas.remove(cancion);
				}
				
				Usuario_generico[] usuarios = lista.seguidor.toArray();
				
				for (Usuario_generico usuarioSeguidorLista : usuarios) {
					lista.seguidor.remove(usuarioSeguidorLista);
				}
				
				Lista_de_reproduccionDAO.delete(lista);
			}
			
			Lista_de_reproduccion[] listasSeguidas = usuario.lista_seguida.toArray();
			for (Lista_de_reproduccion lista : listasSeguidas) {
				usuario.lista_seguida.remove(lista);
			}
			
			Usuario_generico[] seguidos = usuario.seguido.toArray();
			for (Usuario_generico seguido : seguidos) {
				usuario.seguido.remove(seguido);
			}
			
			Usuario_generico[] seguidores = usuario.seguidor.toArray();
			for (Usuario_generico seguidor : seguidores) {
				usuario.seguidor.remove(seguidor);
			}
			
			Estadistica estadistica = usuario.getEstadistica();
			Artista[] artistasEscuchados = estadistica.artistas_mas_escuchados.toArray();
			for (Artista artistaEscuchado : artistasEscuchados) {
				estadistica.artistas_mas_escuchados.remove(artistaEscuchado);
			}
			
			Estilo[] estilosEscuchados = estadistica.estilos_mas_escuchados.toArray();
			for (Estilo estiloEscuchado : estilosEscuchados) {
				estadistica.estilos_mas_escuchados.remove(estiloEscuchado);
			}
			EstadisticaDAO.delete(estadistica);
			
			Lista_de_reproduccion favoritos = usuario.getFavorita();
			
			Cancion[] cancionesLista = favoritos.canciones_incluidas.toArray();
			
			for (Cancion cancion : cancionesLista) {
				favoritos.canciones_incluidas.remove(cancion);
			}
			
			Usuario_generico[] usuarios = favoritos.seguidor.toArray();
			
			for (Usuario_generico usuarioSeguirLista : usuarios) {
				favoritos.seguidor.remove(usuario);
			}
			
			Lista_de_reproduccionDAO.delete(favoritos);
			
			int idDatos = usuario.getDatos().getORMID();
			
			Usuario_RegistradoDAO.delete(usuario);
			
			Datos_Acceso datos = Datos_AccesoDAO.getDatos_AccesoByORMID(idDatos);
			Datos_AccesoDAO.delete(datos);

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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
			usuario.setNick(aNick.trim());
			usuario.setFotoRuta(aFoto.trim());
			usuario.setDatos(datos);
			
			Estadistica estadistica = EstadisticaDAO.createEstadistica();
			estadistica.setUsuario(usuario);
			usuario.setEstadistica(estadistica);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.createLista_de_reproduccion();
			lista.setPropietario_favorito(usuario);
			lista.setTitulo("Canciones favoritas");
			lista.setAutor(usuario);
			usuario.setFavorita(lista);
			
			datos.setUsuario(usuario);
			
			EstadisticaDAO.save(estadistica);
			Lista_de_reproduccionDAO.save(lista);
			Usuario_RegistradoDAO.save(usuario);
			Datos_AccesoDAO.save(datos);
			
			id_usuario = usuario.getORMID();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		
		return id_usuario;
	}

	public Usuario_Registrado Obtener_Usuario(int aIdUsuario) throws PersistentException {
		Usuario_Registrado usuario = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdUsuario);
			
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
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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
			
			Iterator<Usuario_generico> iterador = usuario.seguido.getIterator();
			
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

	public void Actualizar_Perfil_Usuario(int aIdUsuario, String aNuevoEmail, String aNuevoNick) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_Registrado usuario = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdUsuario);
			Datos_Acceso datos = usuario.getDatos();
			
			datos.setEmail(aNuevoEmail.trim());
			usuario.setNick(aNuevoNick.trim());
			
			usuario.setDatos(datos);
			
			Datos_AccesoDAO.save(datos);
			Usuario_RegistradoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}

	public void Seguir_Usuario(int aIdSeguidor, int aIdSeguido) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuarioSeguidor = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdSeguidor);
			Usuario_Registrado usuarioSeguido = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdSeguido);
			
			usuarioSeguidor.seguido.add(usuarioSeguido);
			usuarioSeguido.seguidor.add(usuarioSeguidor);

			Usuario_genericoDAO.save(usuarioSeguidor);
			Usuario_RegistradoDAO.save(usuarioSeguido);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public void Dejar_De_Seguir_Usuario(int aIdSeguidor, int aIdSeguido) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuarioSeguidor = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdSeguidor);
			Usuario_Registrado usuarioSeguido = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdSeguido);
			
			usuarioSeguidor.seguido.remove(usuarioSeguido);
			usuarioSeguido.seguidor.remove(usuarioSeguidor);

			Usuario_genericoDAO.save(usuarioSeguidor);
			Usuario_RegistradoDAO.save(usuarioSeguido);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public boolean Comprobar_Usuario_Seguido(int aIdSeguidor, int aIdSeguido) throws PersistentException {
		boolean yaSeguido = false;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuarioSeguidor = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdSeguidor);
			Usuario_Registrado usuarioSeguido = Usuario_RegistradoDAO.getUsuario_RegistradoByORMID(aIdSeguido);
			
			yaSeguido = usuarioSeguidor.seguido.contains(usuarioSeguido);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return yaSeguido;
	}
	
	public boolean Comprobar_Nick_Usuario(String aNick) throws PersistentException {
		boolean existe = false;
		Usuario_RegistradoCriteria criteria = new Usuario_RegistradoCriteria();
		criteria.nick.eq(aNick.trim());
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_Registrado datos = Usuario_RegistradoDAO.loadUsuario_RegistradoByCriteria(criteria);
			if(datos == null) {
				existe = false;
			}else {
				if(datos.getNick().contentEquals(aNick)){
					existe = true;
				}
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		return existe;
	}
}