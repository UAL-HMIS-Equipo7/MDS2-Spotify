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
		Album[] albumes = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			albumes = artista.albumes.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return albumes;
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
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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

	public int Crear_Album(String titulo, String imagenRuta, String fechaEdicion, String[] listaArtistas, Cancion[] listaCanciones) throws PersistentException {
		
		int id_album = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			Album alb = AlbumDAO.createAlbum();
			alb.setTitulo(titulo.trim());
			alb.setImagenRuta(imagenRuta.trim());
			alb.setFechaEdicion(fechaEdicion);
			
			ArtistaCriteria criteria;
			
			for (String nombre : listaArtistas) {
				criteria = new ArtistaCriteria();
				criteria.nick.like("%" + nombre.trim() + "%");
				Artista artista = ArtistaDAO.loadArtistaByCriteria(criteria);
				alb.autores.add(artista);
			}
			
			Cancion cancionBD;
			
			for (Cancion cancion : listaCanciones) {
				cancionBD = CancionDAO.getCancionByORMID(cancion.getORMID());
				alb.incluye_a.add(cancionBD);
			}

			AlbumDAO.save(alb);
			id_album = alb.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		return id_album;
	}

	public void Actualizar_Album(Album aAlbum, String[] aAutores) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			aAlbum.autores.clear();
			
			ArtistaCriteria[] criterias = new ArtistaCriteria[aAutores.length];
			
			for (int i = 0; i < aAutores.length; i++) {
				System.out.println("Artista: " + aAutores[i]);
				ArtistaCriteria criteria = new ArtistaCriteria();
				criteria.nick.like("%" + aAutores[i].trim() + "%");
				
				criterias[i] = criteria;
				
			}
			
			for (int i = 0; i < criterias.length; i++) {
				
				basededatos.Artista temp = ArtistaDAO.loadArtistaByCriteria(criterias[i]);
				
				if (temp != null) {
					System.out.println("Artista cargado: " + temp.getNick());
					aAlbum.autores.add(temp);
				}
			}
			
			AlbumDAO.save(aAlbum);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
}