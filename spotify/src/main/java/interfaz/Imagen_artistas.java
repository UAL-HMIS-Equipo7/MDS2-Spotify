package interfaz;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import vistas.VistaImagen_artistas;

public class Imagen_artistas extends VistaImagen_artistas {
//	private Image _artistaImg;

	
	public Imagen_artistas(basededatos.Artista artista) {
		
		VerticalLayout vl = this.getContenedor().as(VerticalLayout.class);
		
		Image img = new Image(GestorArchivos.CargarImagen(artista.getFotoRuta()), artista.getFotoRuta());
		img.setClassName("max350");
		
		vl.add(img);
	}
}