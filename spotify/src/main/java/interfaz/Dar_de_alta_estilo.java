package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaDar_de_alta_estilo;

public class Dar_de_alta_estilo extends VistaDar_de_alta_estilo {
//	private event _guardar_cambios_estilo;
//	private Label _tituloL;
//	private Label _nombreL;
//	private TextField _nombreTF;
//	private Label _descripcionL;
//	private TextField _descripcionTF;
//	private Button _guardarB;
//	private Button _cancelarB;
//	private Label _errorL;
	
	public Dar_de_alta_estilo() {
		
		//Botones de Guardar y Cancelar
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorVentana.Atras();
			}
		});
		
		this.getCancelarL().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorVentana.Atras();
			}
		});
	}

	public void Guardar_cambios_estilo() {
		throw new UnsupportedOperationException();
	}

	public void Validar_datos_estilo() {
		throw new UnsupportedOperationException();
	}
}