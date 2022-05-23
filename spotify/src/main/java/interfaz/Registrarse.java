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
import spotify.SubirImagen;
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
						rutaFoto = SubirImagen.Upload(buffer);
						
						System.out.println("Ruta: " + rutaFoto);
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
				// TODO Validación de registro
				Validar_datos_de_registro(); //deberia ser bool?
				
				int id = bd.Registrar_Usuario(getEmailTF().getValue(), getNickTF().getValue(), getContraseniaTF().getValue(), rutaFoto);
				
				if (id == -1) {
					Notification.show("Error al registrar usuario");
				}
				else {
					_confirmacion_de_correo = new Confirmacion_de_correo(getEmailTF().getValue());
					
					GestorVentana.CambiarVentana(_confirmacion_de_correo);
				}
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}

	public void Validar_datos_de_registro() {
		//VALIDAR
	}
}