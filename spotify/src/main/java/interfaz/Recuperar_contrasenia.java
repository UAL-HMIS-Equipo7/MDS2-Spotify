package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
				
				_confirmacion_de_correo__Recuperar_contrasenia_ = new Confirmacion_de_correo__Recuperar_contrasenia_();
				
				GestorVentana.CambiarVentana(_confirmacion_de_correo__Recuperar_contrasenia_);
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Como implementamos el tema de volver atrás??
				
				
				//llamar al Inicialize de Cibernauta??
			}
		});
	}
	
	public void Validar_correo_electronico() {
		throw new UnsupportedOperationException();
	}
}