package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_notificaciones;

public class Ver_notificaciones extends VistaVer_notificaciones {
//	private Label _numeroNotificacionesL;
//	private Button _cerrarB;
	public Notificaciones _notificaciones;
	
	public Ver_notificaciones(Dialog ventanaModal) {
		_notificaciones = new Notificaciones();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_notificaciones);
		
		this.getCerrarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				ventanaModal.close();
				
			}
		});
	}
}