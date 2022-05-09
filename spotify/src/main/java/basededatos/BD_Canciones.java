package basededatos;

import java.util.Vector;
import basededatos.Cancion;

public class BD_Canciones {
	public BDPrincipal _bDPrincipal_canciones;
	public Vector<Cancion> _contiene_canciones = new Vector<Cancion>();

	public void Marcar_cancion_favorita(int aIdUsuarioGenerico, int aIdCancion) {
		throw new UnsupportedOperationException();
	}

	public void Aniadir_cancion_a_lista(int aIdCancion, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Ultimas_Canciones_Reproducidas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Realizar_Busqueda_Canciones(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public void Crear_Cancion(Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public void Actualizar_Cancion(Cancion aCancion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Administrador(String aParametrosBusqueda) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Album(int aIdAlbum) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Lista(int aIdListaReproduccion) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Exitosas(int aIdArtista) {
		throw new UnsupportedOperationException();
	}

	public Cancion[] Cargar_Canciones_Recomendadas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Aniadir_Cancion_Reproducida(int aIdCancion, int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Cancion(int aIdCancion) {
		throw new UnsupportedOperationException();
	}
}