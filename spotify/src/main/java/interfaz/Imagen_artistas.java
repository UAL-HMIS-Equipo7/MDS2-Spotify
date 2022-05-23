package interfaz;

import vistas.VistaImagen_artistas;

public class Imagen_artistas extends VistaImagen_artistas {
//	private Image _artistaImg;

	
	public Imagen_artistas(basededatos.Artista artista) {
		
		
		this.getArtistaImg().setSrc(artista.getFotoRuta());
		
	}
}