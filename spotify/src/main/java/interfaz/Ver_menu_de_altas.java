package interfaz;

import vistas.VistaVer_menu_de_altas;

public class Ver_menu_de_altas extends VistaVer_menu_de_altas {
//	private Button _cerrarB;
//	private Button _cancionB;
//	private Label _cancionL;
//	private Button _estiloB;
//	private Label _estiloL;
//	private Button _albumB;
//	private Label _albumL;
//	private Button _artistaB;
//	private Label _artistaL;
	public Menu_Administracion _menu_Administracion;
	public Edicion_y_Creacion_cancion _edicion_y_Creacion_cancion;
	public Dar_de_alta_estilo _dar_de_alta_estilo;
	public Dar_de_alta_album _dar_de_alta_album;
	public Edicion_y_Creacion_artista _edicion_y_Creacion_artista;
	
	public Ver_menu_de_altas() {
		_menu_Administracion = new Menu_Administracion();
		_edicion_y_Creacion_cancion = new Edicion_y_Creacion_cancion();
		_dar_de_alta_estilo = new Dar_de_alta_estilo();
		_dar_de_alta_album = new Dar_de_alta_album();
		_edicion_y_Creacion_artista = new Edicion_y_Creacion_artista();
	}
}