package interfaz;

import java.util.Vector;
import interfaz.Usuario;
import vistas.VistaUsuarios;

public class Usuarios extends VistaUsuarios {
	public Ver_lista_seguidores _ver_lista_seguidores;
	public Ver_lista_seguidos _ver_lista_seguidos;
	public Vector<Usuario> _list_Usuario = new Vector<Usuario>();
}