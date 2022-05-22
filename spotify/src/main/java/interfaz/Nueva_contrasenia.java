package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import spotify.GestorActor;
import vistas.VistaNueva_contrasenia;

public class Nueva_contrasenia extends VistaNueva_contrasenia {
//	private Label _tituloL;
//	private Image _contraseniaImg;
//	private TextField _contraseniaTF;
//	private TextField _repiteContraseniaTF;
//	private Button _confirmarB;
//	private Button _atrasB;
//	private Label _errorL;
	
	iCibernauta bd = new BDPrincipal();
	
	public Nueva_contrasenia(String email) {
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación de contraseña
				Validar_contrasenia();
				
				bd.Actualizar_Contrasenia(email, getContraseniaTF().getValue());
				
				GestorActor.Cibernauta();
			}
		});

		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}
	
	public void Validar_contrasenia() {
		//VALIDACION
	}
}