package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import spotify.GestorArchivos;
import vistas.VistaEditar_usuario;

@CssImport("./styles/shared-styles.css")
public class Editar_usuario extends VistaEditar_usuario {
//	private event _guardar_cambios_usuario;
//	private Label _tituloL;
//	private Image _fotoImg;
//	private Button _elegirFotoB;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _nickL;
//	private TextField _nickTF;
//	private Label _contraseniaL;
//	private TextField _contraseniaTF;
//	private Button _guardarB;
//	private Button _cancelarB;
//	private Label _errorL;
	
	private basededatos.Usuario_Registrado _usuario;
	private iAdministrador bd = new BDPrincipal();
	private Image _img;
	
	public Editar_usuario(basededatos.Usuario_Registrado usuario) {
		
		_usuario = usuario;
		
		_img = new Image(GestorArchivos.CargarImagen(_usuario.getFotoRuta()), _usuario.getFotoRuta());
		_img.setClassName("imagenEdicionCreacionAdministrador");
		this.getFotoImgLayout().add(_img);
		
		this.getEmailTF().setValue(_usuario.getDatos().getEmail());
		this.getNickTF().setValue(_usuario.getNick());
		this.getContraseniaTF().setValue(_usuario.getDatos().getPassword());
		
		this.getElegirFotoB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {
					
					@Override
					public void onComponentEvent(FinishedEvent event) {
						String rutaFoto = GestorArchivos.SubirImagen(buffer);

						_img = new Image(GestorArchivos.CargarImagen(rutaFoto), rutaFoto);
						_img.setClassName("imagenEdicionCreacionAdministrador");
						getFotoImgLayout().removeAll();
						getFotoImgLayout().add(_img);
						
						modal.close();
					}
				});
				
				modal.open();
			}
		});
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				if(Validar_datos_usuario() == false) {
					Notification.show("Hay algun error en los campos introducidos");
					return;
				}
				
				
				
				Guardar_cambios_usuario();
				
				GestorVentana.Atras();
			}
		});
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorVentana.Atras();
			}
		});
	}

	public void Guardar_cambios_usuario() {
		
		if(bd.Comprobar_Nick_Usuario(getNickTF().getValue()) == true) {
			Notification.show("El nick introducido ya existe");
			return;
		}
		
		_usuario.setFotoRuta(_img.getSrc());
		
		basededatos.Datos_Acceso datos = _usuario.getDatos();
		datos.setEmail(getEmailTF().getValue());
		datos.setPassword(getContraseniaTF().getValue());
		_usuario.setDatos(datos);

		_usuario.setNick(getNickTF().getValue());
		
		bd.Actualizar_Usuario(_usuario);
	}

	public boolean Validar_datos_usuario() {
		boolean correcto = true;

		if(this.getEmailTF().getValue().isBlank() || this.getContraseniaTF().getValue().isBlank() || this.getNickTF().getValue().isBlank()) {
			correcto = false;
		}
		return correcto;
	}
}