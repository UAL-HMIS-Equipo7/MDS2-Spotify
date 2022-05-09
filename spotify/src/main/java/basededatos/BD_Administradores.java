package basededatos;

import java.util.Vector;
import basededatos.Administrador;

public class BD_Administradores {
	public Vector<Administrador> _contiene_administradores = new Vector<Administrador>();
	public BDPrincipal _bDPrincipal_admin;

	public Administrador Obtener_Administrador(int aIdDatosAcceso) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Perfil(int aIdAdministrador, String aNuevoEmail, String aNuevoNick) {
		throw new UnsupportedOperationException();
	}
}