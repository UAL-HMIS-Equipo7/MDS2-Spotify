package interfaz;

import java.util.Vector;
import interfaz.NickArtista;
import vistas.VistaArtistas;

public class Artistas extends VistaArtistas {
	public Ver_lista_seguidores _ver_lista_seguidores;
	public Ver_lista_seguidos _ver_lista_seguidos;
	public Vector<NickArtista> _list_NickArtista = new Vector<NickArtista>();
}