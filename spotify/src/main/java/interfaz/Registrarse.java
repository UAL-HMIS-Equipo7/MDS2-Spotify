package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {
//	private Image _emailImg;
//	private TextField _emailTF;
//	private Image _nickImg;
//	private TextField _nickTF;
//	private Image _contraseniaImg;
//	private TextField _contraseniaTF;
//	private TextField _repiteContrase�iaTF;
//	private Image _fotoImg;
//	private Label _opcionalL;
//	private FileChooser _fotoFC;
//	private Label _fotoL;
//	private Button _iniciarSesionB;
//	private Button _registrarseB;
//	private Button _atrasB;
//	private Label _errorL;
//	private Label _tituloL;
	public Iniciar_sesion _iniciar_sesion;
	public Confirmacion_de_correo _confirmacion_de_correo;
	
	public Registrarse() {
		
		this.getIniciarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_iniciar_sesion = new Iniciar_sesion();
				
				
				GestorVentana.CambiarVentana(_iniciar_sesion);
			}
		});
		
		this.getRegistrarseB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación de registro
				
				_confirmacion_de_correo = new Confirmacion_de_correo();
				
				GestorVentana.CambiarVentana(_confirmacion_de_correo);
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

	public void Validar_datos_de_registro() {
		throw new UnsupportedOperationException();
	}
}