package basededatos;

import java.util.Vector;
import basededatos.Lista_de_reproduccion;

public class BD_Lista_de_reproduccion {
	public BDPrincipal _bDPrincipal_lista_reproduccion;
	public Vector<Lista_de_reproduccion> _contiene_listas_de_reproduccion = new Vector<Lista_de_reproduccion>();

	public void Seguir_lista_de_reproduccion(int aIdUsuarioGenerico, int aIdLista) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] Realizar_Busqueda_Listas_Ajenas(String aParametrosBusqueda, int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] Cargar_Listas_Recomendadas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion[] Cargar_Listas_Perfil(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public int Crear_Lista_de_Reproduccion(int aIdUsuarioGenericoAutor, String aTitulo) {
		throw new UnsupportedOperationException();
	}

	public Lista_de_reproduccion Cargar_Canciones_Favoritas(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}
}