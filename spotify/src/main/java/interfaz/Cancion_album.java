package interfaz;

import vistas.VistaCancion_album;

public class Cancion_album extends VistaCancion_album {
//	private Image _fotoImg;
	public basededatos.Cancion cancion;
	
	public Cancion_album(basededatos.Cancion cancion) {
		this.cancion = cancion;
		this.getEliminarB().setVisible(false);
	}
}