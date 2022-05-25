package basededatos;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Artista;

public class BD_Artistas {
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();
	public BDPrincipal _bDPrincipal_artistas;

	public Artista[] Realizar_Busqueda_Artistas(String aParametrosBusqueda) throws PersistentException {
		Artista[] artistas = new Artista[0];
		
		ArtistaCriteria criteria = new ArtistaCriteria();
		criteria.nick.like("%" + aParametrosBusqueda.trim().toLowerCase() + "%");
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			artistas = ArtistaDAO.listArtistaByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return artistas;
	}

	public Artista Obtener_Artista(int aIdDatosAcceso) {
		//Hace falta si DatosAcceso ya tiene la referencia al usuario??
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Foto_Perfil(int aIdArtista, String aNuevaFoto) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			
			artista.setFotoRuta(aNuevaFoto);
			ArtistaDAO.save(artista);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public int Crear_Artista(int aIdDatosAcceso, String aNick, String aFotoRuta, int aIdEstilo) throws PersistentException {
		int id_artista = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {

			Datos_Acceso dato = Datos_AccesoDAO.getDatos_AccesoByORMID(aIdDatosAcceso);
			Artista artista = ArtistaDAO.createArtista();
			
			Estilo estilo = EstiloDAO.getEstiloByORMID(aIdEstilo);
			artista.setEstilo(estilo);
			
			artista.setFotoRuta(aFotoRuta);
			artista.setNick(aNick);
			artista.setDatos(dato);
			dato.setUsuario(artista);
			
			Estadistica estadistica = EstadisticaDAO.createEstadistica();
			estadistica.setUsuario(artista);
			artista.setEstadistica(estadistica);
			
			Lista_de_reproduccion lista = Lista_de_reproduccionDAO.createLista_de_reproduccion();
			lista.setPropietario_favorito(artista);
			lista.setTitulo("Canciones favoritas");
			lista.setAutor(artista);
			artista.setFavorita(lista);
			
			Datos_AccesoDAO.save(dato);
			ArtistaDAO.save(artista);
			
			id_artista = artista.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		return id_artista;
	}

		

	public void Actualizar_Artista(Artista aArtista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			ArtistaDAO.save(aArtista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public void Eliminar_Artista(int aIdArtista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.loadArtistaByORMID(aIdArtista);
			ArtistaDAO.delete(artista);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Artista[] Cargar_Artistas_Similares(int aIdArtista) throws PersistentException {
		//Los artistas similares son aquellos que tienen el mismo estilo
		
		Artista artistasSimilares[] = new Artista[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.loadArtistaByORMID(aIdArtista);
			
			int estiloId = artista.getEstilo().getId();
			
			ArtistaCriteria criteria = new ArtistaCriteria();
			criteria.estiloId.eq(estiloId);
			
			artistasSimilares = ArtistaDAO.listArtistaByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return artistasSimilares;
	}

	public Artista[] Cargar_Artistas_Lista_Seguidores(int aIdUsuarioGenerico) throws PersistentException {
		List<Artista> artistasSeguidores = new Vector<Artista>();
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Iterator<Usuario_generico> iterador = usuario.seguidor.getIterator();
			
			Usuario_generico temp;
			
			while(iterador.hasNext()) {
				temp = iterador.next();
				
				if (temp instanceof Artista){
			      artistasSeguidores.add((Artista)temp);
			    }
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return artistasSeguidores.toArray(new Artista[artistasSeguidores.size()]);
	}

	public Artista[] Cargar_Artistas_Lista_Seguidos(int aIdUsuarioGenerico) throws PersistentException {
		List<Artista> artistasSeguidos = new Vector<Artista>();
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Iterator<Usuario_generico> iterador = usuario.seguido.getIterator();
			
			Usuario_generico temp;
			
			while(iterador.hasNext()) {
				temp = iterador.next();
				
				if (temp instanceof Artista){
					artistasSeguidos.add((Artista)temp);
			    }
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return artistasSeguidos.toArray(new Artista[artistasSeguidos.size()]);
	}

	public void Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			artista.seguidor.add(usuario);
			usuario.seguido.add(artista);
			
			ArtistaDAO.save(artista);
			Usuario_genericoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
	
	public void Dejar_De_Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			artista.seguidor.remove(usuario);
			usuario.seguido.remove(artista);
			
			ArtistaDAO.save(artista);
			Usuario_genericoDAO.save(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}