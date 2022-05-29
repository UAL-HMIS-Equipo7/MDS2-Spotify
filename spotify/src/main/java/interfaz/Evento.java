package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaEvento;

@CssImport("./styles/shared-styles.css")
public class Evento extends VistaEvento {
//	private Image _fotoEventoImg;

	public Ver_evento _ver_evento;
	protected Image _fotoEventoImg;
	
	public Evento(basededatos.Evento evento, boolean debeAniadirClickListener) {
		this.getNombreL().setVisible(false);
		
		Image img = new Image(GestorArchivos.CargarImagen(evento.getImagenRuta()),
				evento.getImagenRuta());
		img.setClassName("max150");
		_fotoEventoImg = img;
		
		if (debeAniadirClickListener) {
			_fotoEventoImg.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
				
				@Override
				public void onComponentEvent(ClickEvent<Image> event) {
				
					_ver_evento = new Ver_evento(evento);
					
					GestorVentana.CambiarVentana(_ver_evento);
				}
			});
		}
		
		getFotoEventoImgLayout().add(_fotoEventoImg);
	}
}