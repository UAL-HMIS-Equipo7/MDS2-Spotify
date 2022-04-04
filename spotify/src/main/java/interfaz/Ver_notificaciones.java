package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_notificaciones;

public class Ver_notificaciones extends VistaVer_notificaciones {
//	private Label _numeroNotificacionesL;
//	private Button _cerrarB;
	public Ver_perfil_propio _ver_perfil_propio;
	public Notificaciones _notificaciones;
	
	public Ver_notificaciones() {
		_notificaciones = new Notificaciones();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_notificaciones);
	}
}