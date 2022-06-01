package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaRecuperar_contrasenia;

public class Recuperar_contrasenia extends VistaRecuperar_contrasenia {
//	private Label _tituloL;
//	private Label _correoL;
//	private TextField _correoTF;
//	private Button _confirmarB;
//	private Button _atrasB;
//	private Label _errorL;
	public Confirmacion_de_correo__Recuperar_contrasenia_ _confirmacion_de_correo__Recuperar_contrasenia_;
	
	public Recuperar_contrasenia() {
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación de correo
				if(Validar_correo_electronico() == false) {
					Notification.show("Hay algun error en los campos introducidos");
					return;
				}
				
				_confirmacion_de_correo__Recuperar_contrasenia_ = new Confirmacion_de_correo__Recuperar_contrasenia_(getCorreoTF().getValue());
				
				GestorVentana.CambiarVentana(_confirmacion_de_correo__Recuperar_contrasenia_);
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}
	
	public boolean Validar_correo_electronico() {
		//VALIDACION
		boolean correcto = true;
		if(this.getCorreoTF().getValue().isBlank()) {
			correcto = false;
		}
		return correcto;
		
	}
}