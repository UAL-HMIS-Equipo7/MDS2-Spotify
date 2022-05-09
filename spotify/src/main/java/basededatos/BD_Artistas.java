package basededatos;

import java.util.Vector;
import basededatos.Artista;

public class BD_Artistas {
	public Vector<Artista> _contiene_artistas = new Vector<Artista>();
	public BDPrincipal _bDPrincipal_artistas;

	public Artista[] Realizar_Busqueda_Artistas(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public Artista Obtener_Artista(int aIdDatosAcceso) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Foto_Perfil(int aIdArtista, String aNuevaFoto) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Artista(Artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Artista(Artista aArtista) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] Cargar_Artistas_Similares(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Artista[] Cargar_Artistas_Lista_Seguidores(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Artista[] Cargar_Artistas_Lista_Seguidos(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Artista(int aIdUsuarioGenerico, int aIdArtista) {
		throw new UnsupportedOperationException();
	}
}