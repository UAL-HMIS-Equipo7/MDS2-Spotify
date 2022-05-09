/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateAplicacióndeBúsquedayReproduccióndeMúsicaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.createCancion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : intepretes, incluida_en_listas, estilos, usuario, numReproducciones
			basededatos.CancionDAO.save(lbasededatosCancion);
			basededatos.Usuario_generico lbasededatosUsuario_generico = basededatos.Usuario_genericoDAO.createUsuario_generico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : lista_seguida, notificaciones, ultimas_reproducidas, estadistica, seguido, listas, seguidor, datos
			basededatos.Usuario_genericoDAO.save(lbasededatosUsuario_generico);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.createArtista();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : canciones, eventos, albumes, aparece_en, estilo
			basededatos.ArtistaDAO.save(lbasededatosArtista);
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.createAlbum();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : autores
			basededatos.AlbumDAO.save(lbasededatosAlbum);
			basededatos.Lista_de_reproduccion lbasededatosLista_de_reproduccion = basededatos.Lista_de_reproduccionDAO.createLista_de_reproduccion();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : canciones_incluidas, seguidor, autor
			basededatos.Lista_de_reproduccionDAO.save(lbasededatosLista_de_reproduccion);
			basededatos.Usuario_Registrado lbasededatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.createUsuario_Registrado();
			// Initialize the properties of the persistent object here
			basededatos.Usuario_RegistradoDAO.save(lbasededatosUsuario_Registrado);
			basededatos.Evento lbasededatosEvento = basededatos.EventoDAO.createEvento();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, precio, publicado_por
			basededatos.EventoDAO.save(lbasededatosEvento);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.createEstilo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : canciones, artistas, aparece_en
			basededatos.EstiloDAO.save(lbasededatosEstilo);
			basededatos.Datos_Acceso lbasededatosDatos_Acceso = basededatos.Datos_AccesoDAO.createDatos_Acceso();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario, numeroIntentos
			basededatos.Datos_AccesoDAO.save(lbasededatosDatos_Acceso);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : numeroCancionesMostradas, limiteCancionesReproducibles
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Estadistica lbasededatosEstadistica = basededatos.EstadisticaDAO.createEstadistica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : estilos_mas_escuchados, artistas_mas_escuchados, numeroArtistas, numeroCanciones, tiempoReproducido, usuario
			basededatos.EstadisticaDAO.save(lbasededatosEstadistica);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateAplicacióndeBúsquedayReproduccióndeMúsicaData createAplicacióndeBúsquedayReproduccióndeMúsicaData = new CreateAplicacióndeBúsquedayReproduccióndeMúsicaData();
			try {
				createAplicacióndeBúsquedayReproduccióndeMúsicaData.createTestData();
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
