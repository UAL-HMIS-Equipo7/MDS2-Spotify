package basededatos;

import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Lista_de_reproduccion;

public class BD_Lista_de_reproduccion {
	public BDPrincipal _bDPrincipal_lista_reproduccion;
	public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

	public void Seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			
			usuario.lista_seguida.add(lista);
			lista.seguidor.add(usuario);
			
			Usuario_genericoDAO.save(usuario);
			Lista_de_reproduccionDAO.save(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public void Dejar_de_seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			
			usuario.lista_seguida.remove(lista);
			lista.seguidor.remove(usuario);
			
			Usuario_genericoDAO.save(usuario);
			Lista_de_reproduccionDAO.save(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}

	public Lista_de_reproduccion[] Realizar_Busqueda_Listas_Ajenas(String aParametrosBusqueda, int aIdUsuarioGenerico) throws PersistentException {
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];
		
		Lista_de_reproduccionCriteria criteria = new Lista_de_reproduccionCriteria();
		criteria.titulo.like("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
		criteria.autorId.ne(aIdUsuarioGenerico);
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listas;
	}

	public Lista_de_reproduccion[] Cargar_Listas_Recomendadas(int aIdUsuarioGenerico) throws PersistentException {
		//Las recomendaciones se van a realizar de manera aleatoria
		
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			listas = Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
			
			Random generator = new Random();
			int randomIndex = generator.nextInt(listas.length);
			Lista_de_reproduccion randomAlbum = listas[randomIndex];
			listas = new Lista_de_reproduccion[] {randomAlbum};
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listas;
	}

	public Lista_de_reproduccion[] Cargar_Listas_Perfil(int aIdUsuarioGenerico) throws PersistentException {
		Lista_de_reproduccion[] listas = new Lista_de_reproduccion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			listas = usuario.listas.toArray();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listas;
	}

	public int Crear_Lista_de_Reproduccion(int aIdUsuarioGenericoAutor, String aTitulo) throws PersistentException {
		int id_lista = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenericoAutor);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.createLista_de_reproduccion();
			lista.setTitulo(aTitulo.trim());
			lista.setAutor(usuario);
			Lista_de_reproduccionDAO.save(lista);
			
			id_lista = lista.getORMID();
			t.commit();

		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		
		return id_lista;
	}

	public Lista_de_reproduccion Cargar_Canciones_Favoritas(int aIdUsuarioGenerico) throws PersistentException {
		Lista_de_reproduccion lista = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			lista = usuario.getFavorita();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return lista;
	}
	
	public Lista_de_reproduccion[] Cargar_Listas_Usuario(int aIdUsuarioGenerico) throws PersistentException {
		Lista_de_reproduccion[] listas = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			listas = usuario.listas.toArray();
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return listas;
	}
	
	public boolean Comprobar_Lista_Seguida(int aIdUsuarioGenerico, int aIdLista) throws PersistentException {
		boolean yaSeguida = false;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			
			yaSeguida = usuario.lista_seguida.contains(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return yaSeguida;
	}
	
	public void Eliminar_Lista_De_Reproduccion(int aIdLista) throws PersistentException {
		
		PersistentTransaction t2 = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			
			Cancion[] canciones = lista.canciones_incluidas.toArray();
			
			for (Cancion cancion : canciones) {
				lista.canciones_incluidas.remove(cancion);
			}
			
			Usuario_generico[] usuarios = lista.seguidor.toArray();
			
			for (Usuario_generico usuario : usuarios) {
				lista.seguidor.remove(usuario);
			}
			
			Lista_de_reproduccionDAO.delete(lista);
			
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public void Actualizar_Lista(Lista_de_reproduccion aLista) throws PersistentException{
		
		Cancion[] cancionesNuevas = aLista.canciones_incluidas.toArray();
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aLista.getORMID());
			
			lista.setTitulo(aLista.getTitulo());
			
			Cancion[] canciones = lista.canciones_incluidas.toArray();
			for (Cancion cancion : canciones) {
				lista.canciones_incluidas.remove(cancion);
			}
			
			Lista_de_reproduccionDAO.save(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		
		PersistentTransaction t2 = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aLista.getORMID());
			
			basededatos.Cancion tempCancion;
			for (Cancion cancion : cancionesNuevas) {
				tempCancion = CancionDAO.getCancionByORMID(cancion.getORMID());
				lista.canciones_incluidas.add(tempCancion);
			}
			
			Lista_de_reproduccionDAO.save(lista);
			
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
}