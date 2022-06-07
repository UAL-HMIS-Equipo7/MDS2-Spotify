package interfaz;

import com.mchange.v2.codegen.bean.PropsToStringGeneratorExtension;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iCibernauta;
import spotify.GestorActor;
import spotify.GestorVentana;
import spotify.GestorArchivos;
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
	iCibernauta bd = new BDPrincipal();
	String rutaFoto = "";
	
	public Registrarse() {
		
		
		this.getIniciarSesionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_iniciar_sesion = new Iniciar_sesion();
				
				
				GestorVentana.CambiarVentana(_iniciar_sesion);
			}
		});
		
		this.getFotoFC().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {
					
					@Override
					public void onComponentEvent(FinishedEvent event) {
						rutaFoto = GestorArchivos.SubirImagen(buffer);

						getFotoImg().setSrc(rutaFoto);
						
						modal.close();
					}
				});
				
				modal.open();
			}
		});
		
		this.getRegistrarseB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(Validar_datos_de_registro() == false) {
					Notification.show("Hay algun error en los campos introducidos, revise si ha introducido al menos 3 caracteres especiales en la contraseña, que la contraseña contenga un minimo de 10 caracteres y que contenga letras mayusculas y minusculas");
					return;
				}
			
				RegistrarUsuario();
				
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}

	public void RegistrarUsuario() {
		if(bd.Comprobar_Email(getEmailTF().getValue()) == true) {
			Notification.show("El email introducido ya existe");
			return;
		}
		
		if(bd.Comprobar_Nick_Usuario(getNickTF().getValue()) == true) {
			Notification.show("El nick introducido ya existe");
			return;
		}
		
		int id = bd.Registrar_Usuario(getEmailTF().getValue(), getNickTF().getValue(), getContraseniaTF().getValue(), rutaFoto);
		
		if (id == -1) {
			Notification.show("Error al registrar usuario");
		}
		else {
			_confirmacion_de_correo = new Confirmacion_de_correo(getEmailTF().getValue());
			
			GestorVentana.CambiarVentana(_confirmacion_de_correo);
		}
	}
	
	public boolean Validar_datos_de_registro() {
		//VALIDAR
		boolean correcto = true;
		
		int especiales = 0;
		int mayuscula = 0;
		int minuscula = 0;
		
		for(char c : this.getContraseniaTF().getValue().toCharArray()) {
			if(c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '&' )
				especiales++;
			
			if(Character.isUpperCase(c))
				mayuscula++;
			
			if(Character.isLowerCase(c))
				minuscula++;
		}
		
		if(this.getNickTF().getValue().isBlank() || this.getEmailTF().getValue().isBlank() || 
			this.getContraseniaTF().getValue().isBlank() || this.getRepiteContraseniaTF().getValue().isBlank() ||
			this.getContraseniaTF().getValue().length() < 10 || especiales < 3 || 
			this.getRepiteContraseniaTF().getValue().compareTo(this.getContraseniaTF().getValue())!= 0  ||
			mayuscula < 0 || minuscula < 0)
			correcto = false;
		
		return correcto;
	}
}