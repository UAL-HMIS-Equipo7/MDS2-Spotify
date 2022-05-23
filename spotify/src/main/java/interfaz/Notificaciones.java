package interfaz;

import vistas.VistaNotificaciones;

import java.util.Vector;

import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Notificacion;

public class Notificaciones extends VistaNotificaciones {
	public Vector<Notificacion> _list_Notificacion = new Vector<Notificacion>();
	
	private Dialog _ventanaModal;
	private Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Notificaciones(Dialog ventanaModal, Usuario_generico usuario) {
		
		_usuario = usuario;
		_ventanaModal = ventanaModal;

		CargarNotificaciones();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Notificacion notificacion : _list_Notificacion) {
			div.add(notificacion);
		}
		
		scroll.setContent(div);
	}
	
	public void CargarNotificaciones() {
		
		basededatos.Evento[] notificaciones = bd.Cargar_Notificaciones(_usuario.getORMID());
		
		Notificacion temp;
		
		for (int i = 0; i < notificaciones.length; i++) {
			temp = new Notificacion(_ventanaModal, notificaciones[i], _usuario);
			
			_list_Notificacion.add(temp);
		}
		
	}
}	
