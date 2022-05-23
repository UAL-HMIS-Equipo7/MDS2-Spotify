package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaAlbum;

public class Album extends VistaAlbum {
//	private Button _fotoB;

	public Ver_album _ver_album;
	
	public Album(basededatos.Album album) {
		
		this.getFotoB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_ver_album = new Ver_album();
				
				
				GestorVentana.CambiarVentana(_ver_album);
			}
		});
	}
}