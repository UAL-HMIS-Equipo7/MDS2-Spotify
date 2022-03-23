package interfaz;

import java.util.Vector;
import interfaz.Cancion;
import interfaz.Ver_mas_canciones_favoritas;
import vistas.VistaCanciones_favoritas;

public class Canciones_favoritas extends VistaCanciones_favoritas {
//	private Label _tituloL;
//	private Button _verMasB;
	public Actor_comun _actor_comun;
	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	public Vector<Ver_mas_canciones_favoritas> _list_Ver_mas_canciones_favoritas = new Vector<Ver_mas_canciones_favoritas>();
}