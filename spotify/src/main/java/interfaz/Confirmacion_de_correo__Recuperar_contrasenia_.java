package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Confirmacion_de_correo__Recuperar_contrasenia_ extends Confirmacion_de_correo {
//	private Button _confirmarB;
	
	public Nueva_contrasenia _nueva_contrasenia;
	
	public Confirmacion_de_correo__Recuperar_contrasenia_() {
		super();
		
		//_nueva_contrasenia = new Nueva_contrasenia();
		
		//Lo unico que cambia con respecto a su padre es a donde te lleva el boton de confirmar
	}
	
	public Confirmacion_de_correo__Recuperar_contrasenia_(VerticalLayout layoutPadre) {
		super(layoutPadre);
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación del código de correo
				
				_nueva_contrasenia = new Nueva_contrasenia(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_nueva_contrasenia);
				
			}
		});
		
	}
}