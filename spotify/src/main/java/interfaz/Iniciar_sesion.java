package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import spotify.GestorVentana;
import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion {
//	private Image _emailImg;
//	private TextField _emailTF;
//	private Image _contraseniaImg;
//	private TextField _contraseniaTF;
//	private Button _registrarseB;
//	private Button _recuperarContraseniaB;
//	private Button _iniciarSesionB;
//	private Button _googleB;
//	private Button _microsoftB;
//	private Button _facebookB;
//	private Button _atrasB;
//	private Label _errorL;
//	private Label _tituloL;

	public Registrarse _registrarse;
	public Recuperar_contrasenia _recuperar_contrasenia;
	public Iniciar_sesion_con_aplicacion_de_terceros _iniciar_sesion_con_aplicacion_de_terceros;
	public Bloqueo_inicio_sesion _bloqueo_inicio_sesion;
	
	private int intentosInicioSesion = 0;
	
	public Iniciar_sesion() {

		this.getIniciarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//TODO Validación de Usuario + bloqueo usuario
				String usuario = getEmailTF().getValue();
				
				//Esto debería estar en MainView para poder cambiar el usuario??
				switch(usuario) {
					case "usuario":
						GestorActor.Usuario_Registrado();
						break;
					case "artista":
						GestorActor.Artista();
						break;
					case "admin":
						GestorActor.Administrador();
						break;
				
					//TODO: DEBUG
					default:
						GestorActor.Usuario_Registrado();
						break;
				}
				
				intentosInicioSesion++;
				
				if (intentosInicioSesion >= 3) {
					_bloqueo_inicio_sesion = new Bloqueo_inicio_sesion();
					
					intentosInicioSesion = 0;
					
					
					GestorVentana.CambiarVentana(_bloqueo_inicio_sesion);
				}
				
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Como implementamos el tema de volver atrás??
				
				
				//llamar al Inicialize de Cibernauta??

			}
		});
		
		this.getRegistrarseB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_registrarse = new Registrarse();
				
				
				GestorVentana.CambiarVentana(_registrarse);
				
			}
		});
		
		this.getRecuperarContraseniaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_recuperar_contrasenia = new Recuperar_contrasenia();
				
				
				GestorVentana.CambiarVentana(_recuperar_contrasenia);
				
			}
		});
		
		this.getGoogleB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_iniciar_sesion_con_aplicacion_de_terceros = new Iniciar_sesion_con_aplicacion_de_terceros();
				
				
				GestorVentana.CambiarVentana(_iniciar_sesion_con_aplicacion_de_terceros);
				
			}
		});
		
		this.getMicrosoftB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_iniciar_sesion_con_aplicacion_de_terceros = new Iniciar_sesion_con_aplicacion_de_terceros();
				
				
				GestorVentana.CambiarVentana(_iniciar_sesion_con_aplicacion_de_terceros);
				
			}
		});

		this.getFacebookB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_iniciar_sesion_con_aplicacion_de_terceros = new Iniciar_sesion_con_aplicacion_de_terceros();
				
				
				GestorVentana.CambiarVentana(_iniciar_sesion_con_aplicacion_de_terceros);
				
			}
		});
		
	}

	public void Validar_datos_de_usuario() {
		throw new UnsupportedOperationException();
	}
}