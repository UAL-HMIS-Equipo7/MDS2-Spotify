package interfaz;

import java.util.Vector;
import interfaz.TituloCancion;
import vistas.VistaCanciones_de_lista;

public class Canciones_de_lista extends VistaCanciones_de_lista {
//	private Label _tituloPanelL;
	public Ver_lista_de_reproduccion _ver_lista_de_reproduccion;
	public Vector<TituloCancion> _list_TituloCancion = new Vector<TituloCancion>();
}