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

			Lista_de_reproduccion favoritos = usuario.getFavorita();
			favoritos.canciones_incluidas.add(cancion);
			
			usuario.setFavorita(favoritos);
			Lista_de_reproduccionDAO.save(favoritos);
			Usuario_genericoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public void Quitar_cancion_favoritos(int aIdUsuarioGenerico, int aIdCancion) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);

			Lista_de_reproduccion favoritos = usuario.getFavorita();
			favoritos.canciones_incluidas.remove(cancion);
			
			usuario.setFavorita(favoritos);
			Lista_de_reproduccionDAO.save(favoritos);
			Usuario_genericoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public void Quitar_Cancion_Lista(int aIdCancion, int aIdLista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.getLista_de_reproduccionByORMID(aIdLista);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);

			if (lista.canciones_incluidas.contains(cancion)) {
				lista.canciones_incluidas.remove(cancion);
			}
			
			Lista_de_reproduccionDAO.save(lista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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

	public int Crear_Cancion(String titulo, int idEstilo, String tituloAlbum, String compositores, String productores, String ficheroMultimediaRuta, String ficheroMultimediaAltaCalidadRuta, String interpretes) throws PersistentException {
		int id_cancion = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			Cancion cancion = CancionDAO.createCancion();
			Estilo estilo = EstiloDAO.getEstiloByORMID(idEstilo);
			
			if (tituloAlbum != null && !tituloAlbum.trim().toLowerCase().isBlank()) {
				AlbumCriteria criteria = new AlbumCriteria();
				criteria.titulo.like("%" + tituloAlbum.trim().toLowerCase() + "%");
				Album alb = AlbumDAO.loadAlbumByCriteria(criteria);
				
				cancion.setIncluida_en_albumes(alb);
			}
			
			
			cancion.setTitulo(titulo.trim());
			cancion.setCompositores(compositores.trim());
			cancion.setFicheroMultimediaAltaCalidadRuta(ficheroMultimediaAltaCalidadRuta.trim());
			cancion.setFicheroMultimediaRuta(ficheroMultimediaRuta.trim());
			cancion.setProductores(productores.trim());
			cancion.estilos.add(estilo);
			
			
			String[] artistas = interpretes.split(",");
			ArtistaCriteria criteriaArtista;
			
			for (int i = 0; i < artistas.length; i++) {
				criteriaArtista = new ArtistaCriteria();
				criteriaArtista.nick.like("%" + artistas[i].trim().strip() + "%");
				Artista artista = ArtistaDAO.loadArtistaByCriteria(criteriaArtista);
				
				if (artista != null) {
					System.out.println("Artista a añadir: " + artista.getNick());
					cancion.intepretes.add(artista);
				}
			}
			id_cancion = cancion.getORMID();
			CancionDAO.save(cancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		return id_cancion;
	}

	public void Actualizar_Cancion(Cancion aCancion, String aTituloAlbum, String[] aInterpretes) throws PersistentException {
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Cancion cancion = CancionDAO.getCancionByORMID(aCancion.getORMID());
			
			cancion.setTitulo(aCancion.getTitulo());
			cancion.setCompositores(aCancion.getCompositores());
			cancion.setFicheroMultimediaAltaCalidadRuta(aCancion.getFicheroMultimediaAltaCalidadRuta());
			cancion.setFicheroMultimediaRuta(aCancion.getFicheroMultimediaRuta());
			cancion.setProductores(aCancion.getProductores());
			
			AlbumCriteria criteriaAlbum = new AlbumCriteria();
			criteriaAlbum.titulo.like("%" + aTituloAlbum.trim().strip() + "%");
			
			Album album = AlbumDAO.loadAlbumByCriteria(criteriaAlbum);
			cancion.setIncluida_en_albumes(album);
			
			Artista[] artistas = cancion.intepretes.toArray();
			
			for (Artista artista : artistas) {
				cancion.intepretes.remove(artista);
			}
			
			CancionDAO.save(cancion);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		
		PersistentTransaction t2 = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Cancion cancion = CancionDAO.getCancionByORMID(aCancion.getORMID());
			
			basededatos.Artista temp;
			ArtistaCriteria criteriaArtista;
			
			for (int i = 0; i < aInterpretes.length; i++) {
				criteriaArtista = new ArtistaCriteria();
				criteriaArtista.nick.like("%" + aInterpretes[i].trim().strip() + "%");
				
				temp = ArtistaDAO.loadArtistaByCriteria(criteriaArtista);
				
				if (temp != null) {
					cancion.intepretes.add(temp);
				}
			}
			
			CancionDAO.save(cancion);
			t2.commit();
		} catch (Exception e) {
			t2.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda) throws PersistentException {
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
			Cancion cancion2 = null;
			if(!(usuario.ultimas_reproducidas.size()>=12)) {
			usuario.ultimas_reproducidas.add(cancion);
			}else {
				Cancion[] listaCanciones = usuario.ultimas_reproducidas.toArray();
				if(listaCanciones.length>0) {
				 cancion2 = listaCanciones[0];
				}
				usuario.ultimas_reproducidas.remove(cancion2);
				usuario.ultimas_reproducidas.add(cancion);
			}
			Usuario_genericoDAO.save(usuario);
			
			int numReproducciones = cancion.getNumReproducciones();
			numReproducciones++;
			cancion.setNumReproducciones(numReproducciones);
			CancionDAO.save(cancion);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
	}
	
	public Cancion[] Cargar_Canciones_Aleatorias(int aNumCanciones) throws PersistentException {
		Cancion[] cancionesAleatorias = new Cancion[aNumCanciones];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Cancion[] canciones = CancionDAO.listCancionByQuery(null, null);
			
			Random generator = new Random();
			int randomIndex;
			
			for (int i = 0; i < aNumCanciones; i++) {
				randomIndex = generator.nextInt(canciones.length);
				cancionesAleatorias[i] = canciones[randomIndex];
			}
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return cancionesAleatorias;
	}
	
	public boolean Comprobar_Cancion_Favorita(int aIdUsuarioGenerico, int aIdCancion) throws PersistentException {
		boolean esFavorita = false;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			Cancion cancion = CancionDAO.getCancionByORMID(aIdCancion);
			
			esFavorita = usuario.getFavorita().canciones_incluidas.contains(cancion);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return esFavorita;
	}
	
	public Cancion Obtener_Cancion(int aIdCancion) throws PersistentException {
		Cancion cancion = null;
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			cancion = CancionDAO.getCancionByORMID(aIdCancion);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return cancion;
	}
}