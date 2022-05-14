package basededatos;

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

	public int Crear_Artista(Artista aArtista) throws PersistentException {
		//Creo que para las creaciones es mejor pasar los parametros sueltos
		//Pq nos va a dar problemas cosas como el Email, que no esta directamente en artista
		//sino en el Datos_Acceso que esta dentro
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Artista(Artista aArtista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			//Se actualiza asi??
			ArtistaDAO.refresh(aArtista);
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
		Artista artistasSeguidores[] = new Artista[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			
			ArtistaCriteria criteria = new ArtistaCriteria();
			//Como hacer el criteria para buscar artistas donde la aIdUsuarioGenerico esta en su lista de seguidos??
			
			artistasSeguidores = ArtistaDAO.listArtistaByCriteria(criteria);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		
		return artistasSeguidores;
	}

	public Artista[] Cargar_Artistas_Lista_Seguidos(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			artista.seguidor.add(usuario);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}