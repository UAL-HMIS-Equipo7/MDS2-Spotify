package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import spotify.GestorVentana;

public class Confirmacion_de_correo__Recuperar_contrasenia_ extends Confirmacion_de_correo {
//	private Button _confirmarB;
	
	public Nueva_contrasenia _nueva_contrasenia;
	
	public Confirmacion_de_correo__Recuperar_contrasenia_(String email) {
		super(email);
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación del código de correo
				if (email.equals(getCodigoTF().getValue())) {
					_nueva_contrasenia = new Nueva_contrasenia(email);
					
					GestorVentana.CambiarVentana(_nueva_contrasenia);
				}
				else{
					Notification.show("Validación incorrecta");
				}

			}
		});
		
	}
}