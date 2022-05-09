/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteAplicacióndeBúsquedayReproduccióndeMúsicaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Cancion lbasededatosCancion = basededatos.CancionDAO.loadCancionByQuery(null, null);
			// Delete the persistent object
			basededatos.CancionDAO.delete(lbasededatosCancion);
			basededatos.Usuario_generico lbasededatosUsuario_generico = basededatos.Usuario_genericoDAO.loadUsuario_genericoByQuery(null, null);
			// Delete the persistent object
			basededatos.Usuario_genericoDAO.delete(lbasededatosUsuario_generico);
			basededatos.Artista lbasededatosArtista = basededatos.ArtistaDAO.loadArtistaByQuery(null, null);
			// Delete the persistent object
			basededatos.ArtistaDAO.delete(lbasededatosArtista);
			basededatos.Album lbasededatosAlbum = basededatos.AlbumDAO.loadAlbumByQuery(null, null);
			// Delete the persistent object
			basededatos.AlbumDAO.delete(lbasededatosAlbum);
			basededatos.Lista_de_reproduccion lbasededatosLista_de_reproduccion = basededatos.Lista_de_reproduccionDAO.loadLista_de_reproduccionByQuery(null, null);
			// Delete the persistent object
			basededatos.Lista_de_reproduccionDAO.delete(lbasededatosLista_de_reproduccion);
			basededatos.Usuario_Registrado lbasededatosUsuario_Registrado = basededatos.Usuario_RegistradoDAO.loadUsuario_RegistradoByQuery(null, null);
			// Delete the persistent object
			basededatos.Usuario_RegistradoDAO.delete(lbasededatosUsuario_Registrado);
			basededatos.Evento lbasededatosEvento = basededatos.EventoDAO.loadEventoByQuery(null, null);
			// Delete the persistent object
			basededatos.EventoDAO.delete(lbasededatosEvento);
			basededatos.Estilo lbasededatosEstilo = basededatos.EstiloDAO.loadEstiloByQuery(null, null);
			// Delete the persistent object
			basededatos.EstiloDAO.delete(lbasededatosEstilo);
			basededatos.Datos_Acceso lbasededatosDatos_Acceso = basededatos.Datos_AccesoDAO.loadDatos_AccesoByQuery(null, null);
			// Delete the persistent object
			basededatos.Datos_AccesoDAO.delete(lbasededatosDatos_Acceso);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(lbasededatosAdministrador);
			basededatos.Estadistica lbasededatosEstadistica = basededatos.EstadisticaDAO.loadEstadisticaByQuery(null, null);
			// Delete the persistent object
			basededatos.EstadisticaDAO.delete(lbasededatosEstadistica);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteAplicacióndeBúsquedayReproduccióndeMúsicaData deleteAplicacióndeBúsquedayReproduccióndeMúsicaData = new DeleteAplicacióndeBúsquedayReproduccióndeMúsicaData();
			try {
				deleteAplicacióndeBúsquedayReproduccióndeMúsicaData.deleteTestData();
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
