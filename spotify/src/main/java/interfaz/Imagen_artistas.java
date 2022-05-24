package interfaz;

import spotify.GestorArchivos;
import vistas.VistaImagen_artistas;

public class Imagen_artistas extends VistaImagen_artistas {
//	private Image _artistaImg;

	
	public Imagen_artistas(basededatos.Artista artista) {
		
		
		this.getArtistaImg().setSrc(GestorArchivos.CargarImagen(artista.getFotoRuta()));
		
	}
}