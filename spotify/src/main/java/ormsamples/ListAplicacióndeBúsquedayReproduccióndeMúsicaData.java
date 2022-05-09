/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListAplicacióndeBúsquedayReproduccióndeMúsicaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cancion...");
		basededatos.Cancion[] basededatosCancions = basededatos.CancionDAO.listCancionByQuery(null, null);
		int length = Math.min(basededatosCancions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosCancions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_generico...");
		basededatos.Usuario_generico[] basededatosUsuario_genericos = basededatos.Usuario_genericoDAO.listUsuario_genericoByQuery(null, null);
		length = Math.min(basededatosUsuario_genericos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuario_genericos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Artista...");
		basededatos.Artista[] basededatosArtistas = basededatos.ArtistaDAO.listArtistaByQuery(null, null);
		length = Math.min(basededatosArtistas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosArtistas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Album...");
		basededatos.Album[] basededatosAlbums = basededatos.AlbumDAO.listAlbumByQuery(null, null);
		length = Math.min(basededatosAlbums.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAlbums[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Lista_de_reproduccion...");
		basededatos.Lista_de_reproduccion[] basededatosLista_de_reproduccions = basededatos.Lista_de_reproduccionDAO.listLista_de_reproduccionByQuery(null, null);
		length = Math.min(basededatosLista_de_reproduccions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosLista_de_reproduccions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Usuario_Registrado...");
		basededatos.Usuario_Registrado[] basededatosUsuario_Registrados = basededatos.Usuario_RegistradoDAO.listUsuario_RegistradoByQuery(null, null);
		length = Math.min(basededatosUsuario_Registrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuario_Registrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Evento...");
		basededatos.Evento[] basededatosEventos = basededatos.EventoDAO.listEventoByQuery(null, null);
		length = Math.min(basededatosEventos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEventos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estilo...");
		basededatos.Estilo[] basededatosEstilos = basededatos.EstiloDAO.listEstiloByQuery(null, null);
		length = Math.min(basededatosEstilos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEstilos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Datos_Acceso...");
		basededatos.Datos_Acceso[] basededatosDatos_Accesos = basededatos.Datos_AccesoDAO.listDatos_AccesoByQuery(null, null);
		length = Math.min(basededatosDatos_Accesos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosDatos_Accesos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] basededatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estadistica...");
		basededatos.Estadistica[] basededatosEstadisticas = basededatos.EstadisticaDAO.listEstadisticaByQuery(null, null);
		length = Math.min(basededatosEstadisticas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosEstadisticas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Cancion by Criteria...");
		basededatos.CancionCriteria lbasededatosCancionCriteria = new basededatos.CancionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosCancionCriteria.id.eq();
		lbasededatosCancionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Cancion[] basededatosCancions = lbasededatosCancionCriteria.listCancion();
		int length =basededatosCancions== null ? 0 : Math.min(basededatosCancions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosCancions[i]);
		}
		System.out.println(length + " Cancion record(s) retrieved."); 
		
		System.out.println("Listing Usuario_generico by Criteria...");
		basededatos.Usuario_genericoCriteria lbasededatosUsuario_genericoCriteria = new basededatos.Usuario_genericoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuario_genericoCriteria.id.eq();
		lbasededatosUsuario_genericoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_generico[] basededatosUsuario_genericos = lbasededatosUsuario_genericoCriteria.listUsuario_generico();
		length =basededatosUsuario_genericos== null ? 0 : Math.min(basededatosUsuario_genericos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuario_genericos[i]);
		}
		System.out.println(length + " Usuario_generico record(s) retrieved."); 
		
		System.out.println("Listing Artista by Criteria...");
		basededatos.ArtistaCriteria lbasededatosArtistaCriteria = new basededatos.ArtistaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosArtistaCriteria.id.eq();
		lbasededatosArtistaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Artista[] basededatosArtistas = lbasededatosArtistaCriteria.listArtista();
		length =basededatosArtistas== null ? 0 : Math.min(basededatosArtistas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosArtistas[i]);
		}
		System.out.println(length + " Artista record(s) retrieved."); 
		
		System.out.println("Listing Album by Criteria...");
		basededatos.AlbumCriteria lbasededatosAlbumCriteria = new basededatos.AlbumCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAlbumCriteria.id.eq();
		lbasededatosAlbumCriteria.setMaxResults(ROW_COUNT);
		basededatos.Album[] basededatosAlbums = lbasededatosAlbumCriteria.listAlbum();
		length =basededatosAlbums== null ? 0 : Math.min(basededatosAlbums.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAlbums[i]);
		}
		System.out.println(length + " Album record(s) retrieved."); 
		
		System.out.println("Listing Lista_de_reproduccion by Criteria...");
		basededatos.Lista_de_reproduccionCriteria lbasededatosLista_de_reproduccionCriteria = new basededatos.Lista_de_reproduccionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosLista_de_reproduccionCriteria.id.eq();
		lbasededatosLista_de_reproduccionCriteria.setMaxResults(ROW_COUNT);
		basededatos.Lista_de_reproduccion[] basededatosLista_de_reproduccions = lbasededatosLista_de_reproduccionCriteria.listLista_de_reproduccion();
		length =basededatosLista_de_reproduccions== null ? 0 : Math.min(basededatosLista_de_reproduccions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosLista_de_reproduccions[i]);
		}
		System.out.println(length + " Lista_de_reproduccion record(s) retrieved."); 
		
		System.out.println("Listing Usuario_Registrado by Criteria...");
		basededatos.Usuario_RegistradoCriteria lbasededatosUsuario_RegistradoCriteria = new basededatos.Usuario_RegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuario_RegistradoCriteria.id.eq();
		lbasededatosUsuario_RegistradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Usuario_Registrado[] basededatosUsuario_Registrados = lbasededatosUsuario_RegistradoCriteria.listUsuario_Registrado();
		length =basededatosUsuario_Registrados== null ? 0 : Math.min(basededatosUsuario_Registrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuario_Registrados[i]);
		}
		System.out.println(length + " Usuario_Registrado record(s) retrieved."); 
		
		System.out.println("Listing Evento by Criteria...");
		basededatos.EventoCriteria lbasededatosEventoCriteria = new basededatos.EventoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEventoCriteria.id.eq();
		lbasededatosEventoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Evento[] basededatosEventos = lbasededatosEventoCriteria.listEvento();
		length =basededatosEventos== null ? 0 : Math.min(basededatosEventos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEventos[i]);
		}
		System.out.println(length + " Evento record(s) retrieved."); 
		
		System.out.println("Listing Estilo by Criteria...");
		basededatos.EstiloCriteria lbasededatosEstiloCriteria = new basededatos.EstiloCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEstiloCriteria.id.eq();
		lbasededatosEstiloCriteria.setMaxResults(ROW_COUNT);
		basededatos.Estilo[] basededatosEstilos = lbasededatosEstiloCriteria.listEstilo();
		length =basededatosEstilos== null ? 0 : Math.min(basededatosEstilos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEstilos[i]);
		}
		System.out.println(length + " Estilo record(s) retrieved."); 
		
		System.out.println("Listing Datos_Acceso by Criteria...");
		basededatos.Datos_AccesoCriteria lbasededatosDatos_AccesoCriteria = new basededatos.Datos_AccesoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosDatos_AccesoCriteria.id.eq();
		lbasededatosDatos_AccesoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Datos_Acceso[] basededatosDatos_Accesos = lbasededatosDatos_AccesoCriteria.listDatos_Acceso();
		length =basededatosDatos_Accesos== null ? 0 : Math.min(basededatosDatos_Accesos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosDatos_Accesos[i]);
		}
		System.out.println(length + " Datos_Acceso record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAdministradorCriteria.id.eq();
		lbasededatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] basededatosAdministradors = lbasededatosAdministradorCriteria.listAdministrador();
		length =basededatosAdministradors== null ? 0 : Math.min(basededatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Estadistica by Criteria...");
		basededatos.EstadisticaCriteria lbasededatosEstadisticaCriteria = new basededatos.EstadisticaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosEstadisticaCriteria.id.eq();
		lbasededatosEstadisticaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Estadistica[] basededatosEstadisticas = lbasededatosEstadisticaCriteria.listEstadistica();
		length =basededatosEstadisticas== null ? 0 : Math.min(basededatosEstadisticas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosEstadisticas[i]);
		}
		System.out.println(length + " Estadistica record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListAplicacióndeBúsquedayReproduccióndeMúsicaData listAplicacióndeBúsquedayReproduccióndeMúsicaData = new ListAplicacióndeBúsquedayReproduccióndeMúsicaData();
			try {
				listAplicacióndeBúsquedayReproduccióndeMúsicaData.listTestData();
				//listAplicacióndeBúsquedayReproduccióndeMúsicaData.listByCriteria();
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
