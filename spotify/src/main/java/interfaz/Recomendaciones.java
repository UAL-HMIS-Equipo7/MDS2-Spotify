package interfaz;

import vistas.VistaRecomendaciones;

import java.util.Vector;
import interfaz.Canciones_recomendadas;
import interfaz.Listas_recomendadas;
import interfaz.Albumes_recomendados;

public class Recomendaciones extends VistaRecomendaciones {
//	private Label _tituloL;
	public Actor_comun _actor_comun;
	public Vector<Canciones_recomendadas> _list_Canciones_recomendadas = new Vector<Canciones_recomendadas>();
	public Vector<Listas_recomendadas> _list_Listas_recomendadas = new Vector<Listas_recomendadas>();
	public Vector<Albumes_recomendados> _list_Albumes_recomendados = new Vector<Albumes_recomendados>();
}