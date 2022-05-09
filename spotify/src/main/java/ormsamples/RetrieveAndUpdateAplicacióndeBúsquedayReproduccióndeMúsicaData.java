/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAplicacióndeBúsquedayReproduccióndeMúsicaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.CancionDAO.save(lbasededatosCancion);
			basededatos.Usuario_generico lbasededatosUsuario_generico = basededatos.Usuario_genericoDAO.loadUsuario_genericoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Usuario_genericoDAO.save(lbasededatosUsuario_generico);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ArtistaDAO.save(lbasededatosArtista);
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AlbumDAO.save(lbasededatosAlbum);
			basededatos.Lista_de_reproduccion lbasededatosLista_de_reproduccion = basededatos.Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Lista_de_reproduccionDAO.save(lbasededatosLista_de_reproduccion);
			basededatos.Usuario_Registrado lbasededatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Usuario_RegistradoDAO.save(lbasededatosUsuario_Registrado);
			basededatos.Evento lbasededatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EventoDAO.save(lbasededatosEvento);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstiloDAO.save(lbasededatosEstilo);
			basededatos.Datos_Acceso lbasededatosDatos_Acceso = basededatos.Datos_AccesoDAO.loadDatos_AccesoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.Datos_AccesoDAO.save(lbasededatosDatos_Acceso);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Estadistica lbasededatosEstadistica = basededatos.EstadisticaDAO.loadEstadisticaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.EstadisticaDAO.save(lbasededatosEstadistica);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cancion by CancionCriteria");
		basededatos.CancionCriteria lbasededatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosCancionCriteria.id.eq();
		System.out.println(lbasededatosCancionCriteria.uniqueCancion());
		
		System.out.println("Retrieving Usuario_generico by Usuario_genericoCriteria");
		basededatos.Usuario_genericoCriteria lbasededatosUsuario_genericoCriteria = new basededatos.Usuario_genericoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuario_genericoCriteria.id.eq();
		System.out.println(lbasededatosUsuario_genericoCriteria.uniqueUsuario_generico());
		
		System.out.println("Retrieving Artista by ArtistaCriteria");
		basededatos.ArtistaCriteria lbasededatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosArtistaCriteria.id.eq();
		System.out.println(lbasededatosArtistaCriteria.uniqueArtista());
		
		System.out.println("Retrieving Album by AlbumCriteria");
		basededatos.AlbumCriteria lbasededatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAlbumCriteria.id.eq();
		System.out.println(lbasededatosAlbumCriteria.uniqueAlbum());
		
		System.out.println("Retrieving Lista_de_reproduccion by Lista_de_reproduccionCriteria");
		basededatos.Lista_de_reproduccionCriteria lbasededatosLista_de_reproduccionCriteria = new basededatos.Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosLista_de_reproduccionCriteria.id.eq();
		System.out.println(lbasededatosLista_de_reproduccionCriteria.uniqueLista_de_reproduccion());
		
		System.out.println("Retrieving Usuario_Registrado by Usuario_RegistradoCriteria");
		basededatos.Usuario_RegistradoCriteria lbasededatosUsuario_RegistradoCriteria = new basededatos.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuario_RegistradoCriteria.id.eq();
		System.out.println(lbasededatosUsuario_RegistradoCriteria.uniqueUsuario_Registrado());
		
		System.out.println("Retrieving Evento by EventoCriteria");
		basededatos.EventoCriteria lbasededatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEventoCriteria.id.eq();
		System.out.println(lbasededatosEventoCriteria.uniqueEvento());
		
		System.out.println("Retrieving Estilo by EstiloCriteria");
		basededatos.EstiloCriteria lbasededatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEstiloCriteria.id.eq();
		System.out.println(lbasededatosEstiloCriteria.uniqueEstilo());
		
		System.out.println("Retrieving Datos_Acceso by Datos_AccesoCriteria");
		basededatos.Datos_AccesoCriteria lbasededatosDatos_AccesoCriteria = new basededatos.Datos_AccesoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosDatos_AccesoCriteria.id.eq();
		System.out.println(lbasededatosDatos_AccesoCriteria.uniqueDatos_Acceso());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAdministradorCriteria.id.eq();
		System.out.println(lbasededatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Estadistica by EstadisticaCriteria");
		basededatos.EstadisticaCriteria lbasededatosEstadisticaCriteria = new basededatos.EstadisticaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosEstadisticaCriteria.id.eq();
		System.out.println(lbasededatosEstadisticaCriteria.uniqueEstadistica());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAplicacióndeBúsquedayReproduccióndeMúsicaData retrieveAndUpdateAplicacióndeBúsquedayReproduccióndeMúsicaData = new RetrieveAndUpdateAplicacióndeBúsquedayReproduccióndeMúsicaData();
			try {
				retrieveAndUpdateAplicacióndeBúsquedayReproduccióndeMúsicaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateAplicacióndeBúsquedayReproduccióndeMúsicaData.retrieveByCriteria();
			}
			finally {
				basededatos.AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
