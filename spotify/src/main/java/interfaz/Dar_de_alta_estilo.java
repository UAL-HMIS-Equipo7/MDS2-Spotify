package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
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
	
	private iAdministrador bd = new BDPrincipal();
	
	public Dar_de_alta_estilo() {
		
		//Botones de Guardar y Cancelar
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(Validar_datos_estilo()) {
					Notification.show("Hay algun error en los campos introducidos");
					return;
				}
				Guardar_cambios_estilo();
				
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
		bd.Crear_Estilo(getNombreTF().getValue());
	}

	public boolean Validar_datos_estilo() {
		//VALIDAR
		boolean correcto = true;
		if(this.getNombreTF().getValue().isBlank()) {
			correcto = false;
		}
		return correcto;
	}
}