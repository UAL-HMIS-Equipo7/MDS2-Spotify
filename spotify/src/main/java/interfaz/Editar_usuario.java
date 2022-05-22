package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import vistas.VistaEditar_usuario;

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
	
	public Editar_usuario(basededatos.Usuario_Registrado usuario) {
		
		_usuario = usuario;
		
		this.getFotoImg().setSrc(_usuario.getFotoRuta());
		this.getEmailTF().setValue(_usuario.getDatos().getEmail());
		this.getNickTF().setValue(_usuario.getNick());
		this.getContraseniaTF().setValue(_usuario.getDatos().getPassword());
		
		//Implementar boton FileChooser
		this.getElegirFotoB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				
				//getFotoImg().setSrc("");
			}
		});
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Validar_datos_usuario();
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
		_usuario.setFotoRuta(getFotoImg().getSrc());
		
		basededatos.Datos_Acceso datos = _usuario.getDatos();
		datos.setEmail(getEmailTF().getValue());
		datos.setPassword(getContraseniaTF().getValue());
		_usuario.setDatos(datos);

		_usuario.setNick(getNickTF().getValue());
		
		bd.Actualizar_Usuario(_usuario);
	}

	public void Validar_datos_usuario() {
		//VALIDAR
	}
}