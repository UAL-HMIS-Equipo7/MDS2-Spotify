package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaContactar_con_la_empresa;

public class Contactar_con_la_empresa extends VistaContactar_con_la_empresa {
//	private event _enviar;
//	private Label _soporteL;
//	private Label _asuntoL;
//	private TextField _asuntoTF;
//	private Label _incidenciaL;
//	private TextField _incidenciaTF;
//	private Button _enviarB;
//	private Button _cancelarB;
	
	public Contactar_con_la_empresa() {
		
		//Enviar y Cancelar Button
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				
			}
		});
	}

	public void Enviar() {
		throw new UnsupportedOperationException();
	}
}