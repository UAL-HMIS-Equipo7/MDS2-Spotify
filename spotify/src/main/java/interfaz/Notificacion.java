package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;

public class Notificacion extends Evento {
//	private Label _nombreL;
	
	public Notificacion(Dialog ventanaModal) {
		
		super(false);
		
		this.getNombreL().setVisible(true);
		
		this.getFotoEventoImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				System.out.println("Estoy en notificación");
			
				_ver_evento = new Ver_evento();
				
				ventanaModal.close();
				
				GestorVentana.CambiarVentana(_ver_evento);
				
			}
		});
		
		this.getNombreL().getElement().addEventListener("click", e -> {
			
			_ver_evento = new Ver_evento();
			
			ventanaModal.close();
			
			GestorVentana.CambiarVentana(_ver_evento);
			
		});
	}
}