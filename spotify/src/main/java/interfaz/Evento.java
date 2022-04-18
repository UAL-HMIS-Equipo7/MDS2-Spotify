package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaEvento;

public class Evento extends VistaEvento {
//	private Image _fotoEventoImg;

	public Ver_evento _ver_evento;
	
	public Evento() {
		
		this.getNombreL().setVisible(false);
		
		this.getFotoEventoImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
			
				_ver_evento = new Ver_evento();
				
				
				GestorVentana.CambiarVentana(_ver_evento);
			}
		});
	}
}