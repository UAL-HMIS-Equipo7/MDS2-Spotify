package interfaz;

import vistas.VistaNotificaciones;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;

import interfaz.Notificacion;

public class Notificaciones extends VistaNotificaciones {
	public Ver_notificaciones _ver_notificaciones;
	public Vector<Notificacion> _list_Notificacion = new Vector<Notificacion>();
	
	public Notificaciones() {

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
			temp = new Notificacion();
			temp.setClassName("notificacion");
			
			_list_Notificacion.add(temp);
		}
		
	}
}	
