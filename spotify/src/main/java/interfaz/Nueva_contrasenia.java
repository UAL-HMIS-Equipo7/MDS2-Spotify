package interfaz;

import com.vaadin.flow.component.ClickEvent;

import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import java.lang.Character;
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
		
		this.getErrorL().setVisible(false);
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación de contraseña
				if(Validar_contrasenia()==false) {
					Notification.show("Hay algun error en los campos introducidos, revise si ha introducido al menos 3 caracteres especiales, que la contraseña contenga un minimo de 10 caracteres y que contenga letras mayusculas y minusculas");
					return;
				}
				
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
	
	public boolean Validar_contrasenia() {
		//VALIDACION
		boolean correcto = true;
		int contador = 0;
		int mayuscula = 0;
		int minuscula = 0;
		
		for(char c : this.getContraseniaTF().getValue().toCharArray()) {
			if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&' )
				contador++;
		}
		
		for(char c : this.getContraseniaTF().getValue().toCharArray()) {
			if(Character.isUpperCase(c))
				mayuscula++;
		}
		
		for(char c : this.getContraseniaTF().getValue().toCharArray()) {
			if(Character.isLowerCase(c))
				minuscula++;
		}
		
		if(this.getContraseniaTF().getValue().isBlank() || this.getContraseniaTF().getValue().length() < 10 || contador < 3 || this.getRepiteContraseniaTF().getValue() != this.getContraseniaTF().getValue() || mayuscula < 0 || minuscula < 0) {
			correcto = false;
		}
		return correcto;
	}
}