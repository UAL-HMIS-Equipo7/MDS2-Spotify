package interfaz;

import vistas.VistaLista_de_reproduccion_ajena;

public class Lista_de_reproduccion_ajena extends VistaLista_de_reproduccion_ajena {
//	private Object _fotoB;

	public Ver_lista_de_reproduccion _ver_lista_de_reproduccion;
	
	public Lista_de_reproduccion_ajena() {
		_ver_lista_de_reproduccion = new Ver_lista_de_reproduccion();
	}
}