package basededatos;

import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Cancion;

public class BD_Canciones {
	public BDPrincipal _bDPrincipal_canciones;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public void Marcar_cancion_favorita(int aIdUsuarioGenerico, int aIdCancion) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			//Esto se queda guardado bien??
			usuario.getFavorita().canciones_incluidas.add(cancion);
			Usuario_genericoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Aniadir_cancion_a_lista(int aIdCancion, int aIdLista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);

			lista.canciones_incluidas.add(cancion);
			Lista_de_reproduccionDAO.save(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Cancion[] Cargar_Ultimas_Canciones_Reproducidas(int aIdUsuarioGenerico) throws PersistentException {
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			canciones = usuario.ultimas_reproducidas.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
	}

	public Cancion[] Realizar_Busqueda_Canciones(String aParametrosBusqueda) throws PersistentException {
		Cancion[] canciones = new Cancion[0];
		
		CancionCriteria criteria = new CancionCriteria();
		criteria.titulo.like("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			canciones = CancionDAO.listCancionByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
	}

	public void Crear_Cancion(Cancion aCancion) throws PersistentException {
		//Pasamos mejor los parametros sueltos??
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Cancion(Cancion aCancion) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			CancionDAO.save(aCancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda) throws PersistentException {
		//Podriamos usar el método de busqueda ya creado?? (Realizar_Busqueda_Canciones)
		return Realizar_Busqueda_Canciones(aParametrosBusqueda);
	}

	public Cancion[] Cargar_Canciones_Album(int aIdAlbum) throws PersistentException {
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.getAlbumByORMID(aIdAlbum);
			canciones = album.incluye_a.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
	}

	public Cancion[] Cargar_Canciones_Lista(int aIdListaReproduccion) throws PersistentException {
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdListaReproduccion);
			canciones = lista.canciones_incluidas.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
	}

	public Cancion[] Cargar_Canciones_Exitosas(int aIdArtista) throws PersistentException {
		
		//Devolver canciones ordenadas por nº reproducciones
		
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			canciones = artista.canciones.toArray("numReproducciones", false);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
	}

	public Cancion[] Cargar_Canciones_Recomendadas(int aIdUsuarioGenerico) throws PersistentException {
		//Las recomendaciones se van a realizar de manera aleatoria
		
		Cancion[] canciones = new Cancion[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			canciones = CancionDAO.listCancionByQuery(null, null);
			
			Random generator = new Random();
			int randomIndex = generator.nextInt(canciones.length);
			Cancion randomCancion = canciones[randomIndex];
			canciones = new Cancion[] {randomCancion};
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return canciones;
	}

	public void Aniadir_Cancion_Reproducida(int aIdCancion, int aIdUsuarioGenerico) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			
			usuario.ultimas_reproducidas.add(cancion);
			Usuario_genericoDAO.save(usuario);
			
			int numReproducciones = cancion.getNumReproducciones();
			numReproducciones++;
			cancion.setNumReproducciones(numReproducciones);
			CancionDAO.save(cancion);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Eliminar_Cancion(int aIdCancion) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			CancionDAO.delete(cancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}