package interfaz;

import vistas.VistaNotificaciones;

import java.util.Vector;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Notificacion;

public class Notificaciones extends VistaNotificaciones {
	public Vector<Notificacion> _list_Notificacion = new Vector<Notificacion>();
	
	private VerticalLayout layoutPadre;
	private Dialog ventanaModal;
	
	public Notificaciones(VerticalLayout layoutPadre, Dialog ventanaModal) {
		
		this.layoutPadre = layoutPadre;
		this.ventanaModal = ventanaModal;

		CargarNotificaciones();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Notificacion notificacion : _list_Notificacion) {
			div.add(notificacion);
		}
		
		scroll.setContent(div);
	}
	
	public void CargarNotificaciones() {
		
		Notificacion temp;
		
		for (int i = 0; i < 5; i++) {
			temp = new Notificacion(layoutPadre, ventanaModal);
			
			_list_Notificacion.add(temp);
		}
		
	}
}	
