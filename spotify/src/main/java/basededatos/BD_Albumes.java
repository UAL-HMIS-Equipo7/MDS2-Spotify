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

	public String[] Cargar_Autores_Album(int aIdAlbum) {
		//String o Artista?
		
		throw new UnsupportedOperationException();
	}

	public int Crear_Album(Album aAlbum) throws PersistentException {
		
		int id_album = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			Album alb = AlbumDAO.createAlbum();
			alb.setTitulo(aAlbum.getTitulo());
			alb.setImagenRuta(aAlbum.getImagenRuta());
			alb.setFechaEdicion(aAlbum.getFechaEdicion());
			
			for (Artista artista : aAlbum.autores.toArray()) {
				alb.autores.add(artista);
			}
			
			for (Cancion cancion : aAlbum.incluye_a.toArray()) {
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
			//Se actualiza asi??
			AlbumDAO.refresh(aAlbum);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}