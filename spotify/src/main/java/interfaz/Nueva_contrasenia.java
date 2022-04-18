package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaNueva_contrasenia;

public class Nueva_contrasenia extends VistaNueva_contrasenia {
//	private Label _tituloL;
//	private Image _contraseniaImg;
//	private TextField _contraseniaTF;
//	private TextField _repiteContraseniaTF;
//	private Button _confirmarB;
//	private Button _atrasB;
//	private Label _errorL;
	
	public Nueva_contrasenia() {
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación de contraseña, donde mandamos de vuelta la interfaz??
				
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
	
	public void Validar_contrasenia() {
		throw new UnsupportedOperationException();
	}
}