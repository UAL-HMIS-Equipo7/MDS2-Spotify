package interfaz;

import vistas.VistaAlbum_administrador;

public class Album_administrador extends VistaAlbum_administrador {
//	private Label _albumL;
//	private Image _albumImg;
//	private Button _editarAlbumB;
//	private Button _eliminarAlbumB;
	public Editar_album _editar_album;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	public Album_administrador() {
		// TODO Auto-generated constructor stub
		_editar_album = new Editar_album();
		_confirmacion_eliminacion = new Confirmacion_eliminacion();
	}
}