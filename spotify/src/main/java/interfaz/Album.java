package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaAlbum;

@CssImport("./styles/shared-styles.css")
public class Album extends VistaAlbum {
//	private Button _fotoB;

	public Ver_album _ver_album;
	
	public Album(basededatos.Album album) {
		
		this.getTituloL().setText(album.getTitulo());
		
		VerticalLayout vl = getContenedor().as(VerticalLayout.class);
		
		Image img = new Image(GestorArchivos.CargarImagen(album.getImagenRuta()),
				album.getImagenRuta());
		img.setClassName("max350");
		vl.add(img);
		
		vl.addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				_ver_album = new Ver_album(album);
				
				GestorVentana.CambiarVentana(_ver_album);
			}
		});
	}
}