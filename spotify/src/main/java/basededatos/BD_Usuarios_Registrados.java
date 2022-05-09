package basededatos;

import java.util.Vector;
import basededatos.Usuario_Registrado;

public class BD_Usuarios_Registrados {
	public Vector<Usuario_Registrado> _contiene_usuarios_registrados = new Vector<Usuario_Registrado>();
	public BDPrincipal _bDPrincipal_UR;

	public void Eliminar_usuario(int aIdUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado[] Realizar_Busqueda_Usuarios(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public int Crear_Usuario(int aIdDatosAcceso, String aNick, String aFoto) {
		throw new UnsupportedOperationException();
	}

	public Usuario_generico Obtener_Usuario(int aIdDatosAcceso) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Usuario(Usuario_Registrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidores(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Registrado[] Cargar_Usuarios_Lista_Seguidos(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Perfil(int aIdUsuario, String aNuevoEmail, String aNuevoNick) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Usuario(int aIdSeguidor, int aIdSeguido) {
		throw new UnsupportedOperationException();
	}
}