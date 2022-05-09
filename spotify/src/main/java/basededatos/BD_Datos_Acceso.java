package basededatos;

import java.util.Vector;
import basededatos.Datos_Acceso;

public class BD_Datos_Acceso {
	public BDPrincipal _bDPrincipal_datos_acceso;
	public Vector<Datos_Acceso> _contiene_datos_acceso = new Vector<Datos_Acceso>();

	public int Dar_De_Alta_Cuenta(String aEmail, String aContrasenia, String aTipoUsuario) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Contrasenia(String aEmail, String aNuevaContrasenia) {
		throw new UnsupportedOperationException();
	}

	public Datos_Acceso Realizar_Intento_Inicio_Sesion(String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}
}