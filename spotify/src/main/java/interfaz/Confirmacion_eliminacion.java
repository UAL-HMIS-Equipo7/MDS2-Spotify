package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;

import vistas.VistaConfirmacion_eliminacion;

public class Confirmacion_eliminacion extends VistaConfirmacion_eliminacion {
//	private event _eliminar_elemento;
//	private Label _mensajeL;
//	private Label _nombreElementoL;
//	private Button _confirmarB;
//	private Button _cancelarB;

	public Confirmacion_eliminacion(Dialog ventanaModal) {
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				ventanaModal.close();
				
			}
		});
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//Eliminar el elemento en BD
				Eliminar_elemento();
				ventanaModal.close();
			}
		});
	}

	public void Eliminar_elemento() {
		throw new UnsupportedOperationException();
	}
}