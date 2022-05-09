package basededatos;

import java.util.Vector;
import basededatos.Album;

public class BD_Albumes {
	public Vector<Album> _contiene_albumes = new Vector<Album>();
	public BDPrincipal _bDPrincipal_albumes;

	public Album[] Cargar_Albumes_Artistas(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Album[] Realizar_Busqueda_Albumes(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public Album[] Cargar_Albumes_Recomendados(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Borrar_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public String[] Cargar_Autores_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public int Crear_Album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Album(Album aAlbum) {
		throw new UnsupportedOperationException();
	}
}