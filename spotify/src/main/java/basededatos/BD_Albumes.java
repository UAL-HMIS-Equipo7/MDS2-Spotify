package basededatos;

import java.util.List;
import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Album;

public class BD_Albumes {
	public Vector<Album> _contiene_albumes = new Vector<Album>();
	public BDPrincipal _bDPrincipal_albumes;

	public Album[] Cargar_Albumes_Artistas(int aIdArtista) throws PersistentException {
		//Seria mejor que este metodo estuviera en BD_Artistas para devolver directamente su lista de albumes?
		throw new UnsupportedOperationException();
	}

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda) throws PersistentException {
		Album[] albumes = new Album[0];
		
		AlbumCriteria criteria = new AlbumCriteria();
		criteria.titulo.like("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			albumes = AlbumDAO.listAlbumByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return albumes;
	}

	public Album[] Cargar_Albumes_Recomendados(int aIdUsuarioGenerico) throws PersistentException {
		//Las recomendaciones se van a realizar de manera aleatoria
		
		Album[] albumes = new Album[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			albumes = AlbumDAO.listAlbumByQuery(null, null);
			
			Random generator = new Random();
			int randomIndex = generator.nextInt(albumes.length);
			Album randomAlbum = albumes[randomIndex];
			albumes = new Album[] {randomAlbum};
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return albumes;
		
	}

	public void Borrar_Album(int aIdAlbum) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Album album = AlbumDAO.loadAlbumByORMID(aIdAlbum);
			AlbumDAO.delete(album);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public basededatos.Artista[] Cargar_Autores_Album(int aIdAlbum) throws PersistentException {
		basededatos.Artista[] artistas = null;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			artistas = AlbumDAO.getAlbumByORMID(aIdAlbum).autores.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return artistas;
	}

	public int Crear_Album(String titulo, String imagenRuta, String fechaEdicion, Artista[] listaArtistas, Cancion[] listaCanciones) throws PersistentException {
		
		int id_album = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			Album alb = AlbumDAO.createAlbum();
			alb.setTitulo(titulo);
			alb.setImagenRuta(imagenRuta);
			alb.setFechaEdicion(fechaEdicion);
			
			for (Artista artista : listaArtistas) {
				alb.autores.add(artista);
			}
			
			for (Cancion cancion :listaCanciones) {
				alb.incluye_a.add(cancion);
			}

			AlbumDAO.save(alb);
			id_album = alb.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return id_album;
	}

	public void Actualizar_Album(Album aAlbum) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			AlbumDAO.save(aAlbum);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}