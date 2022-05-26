package interfaz;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;

import spotify.GestorArchivos;
import vistas.VistaCancion_album;

@CssImport("./styles/shared-styles.css")
public class Cancion_album extends VistaCancion_album {
//	private Image _fotoImg;
	public basededatos.Cancion cancion;
	private Image _img;
	
	public Cancion_album(basededatos.Cancion cancion) {
		this.cancion = cancion;
		this.getEliminarB().setVisible(false);
		
		this.getNombreL().setText(cancion.getTitulo());
		
		_img = new Image(GestorArchivos.CargarImagen(cancion.getFicheroMultimediaAltaCalidadRuta()),
				cancion.getFicheroMultimediaAltaCalidadRuta());
		_img.setClassName("max150");
		this.getFotoImgLayout().add(_img);
	}
}