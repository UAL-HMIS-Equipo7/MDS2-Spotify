package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;

public class BD_Administradores {
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();
	public BDPrincipal _bDPrincipal_admin;

	public Administrador Obtener_Administrador(int aIdDatosAcceso) {
		//Hace falta si DatosAcceso ya tiene la referencia al usuario??
		
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Administrador admin = AdministradorDAO.getAdministradorByORMID(aIdAdministrador);
			
			//Hay que hacer un save de Datos_Acceso en Datos_AccesoDAO??
			Datos_Acceso datos = admin.getDatos();
			datos.setEmail(aNuevoEmail);
			Datos_AccesoDAO.save(datos);
			
			admin.setNick(aNuevoNick);
			AdministradorDAO.save(admin);
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}
}