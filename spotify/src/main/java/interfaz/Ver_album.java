package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_album;

public class Ver_album extends VistaVer_album {
//	private Label _informacionL;
//	private Label _tituloL;
//	private Label _fechaEdicionL;

	public Canciones_album _canciones_album;
	public Autores_album _autores_album;
	
	public Ver_album(basededatos.Album album) {
		
		this.getTituloL().setText(album.getTitulo());
		this.getFechaEdicionL().setText(album.getFechaEdicion());
		
		_canciones_album = new Canciones_album(album);
		_canciones_album.setClassName("fullSize");
		_autores_album = new Autores_album(album);
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(_canciones_album);
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_autores_album);
	}
}