package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import vistas.VistaEdicion_y_creacion_artista;

public class Edicion_y_Creacion_artista extends VistaEdicion_y_creacion_artista {
//	private event _guardar_cambios_artista;
//	private Label _tituloL;
//	private Image _fotoImg;
//	private Button _elegirFotoB;
//	private Label _emailL;
//	private TextField _emailTF;
//	private Label _nickL;
//	private TextField _nickTF;
//	private Label _contraseniaL;
//	private TextField _contraseniaTF;
//	private Label _estiloL;
//	private ComboBox _estiloCB;
//	private Button _guardarB;
//	private Button _cancelarB;
//	private Label _errorL;
	
	private basededatos.Artista _artista;
	private basededatos.Estilo[] _estilos;
	private iAdministrador bd = new BDPrincipal();

	public Edicion_y_Creacion_artista(basededatos.Artista artista) {
		
		Cargar_Estilos();
		
		//Hay que establecer la lista de estilos, donde se muestre su nombre, pero se almacene su id o el objeto completo, para poder ser enviada
		//this.getEstiloCB().set...
		
		_artista = artista;
		
		if (_artista != null) {
			this.getFotoImg().setSrc(_artista.getFotoRuta());
			this.getEmailTF().setValue(_artista.getDatos().getEmail());
			this.getNickTF().setValue(_artista.getNick());
			this.getContraseniaTF().setValue(_artista.getDatos().getPassword());
			//Poner bien el estilo??
			//this.getEstiloCB().setValue(_artista.getEstilo());
		}
		
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
				
				Validar_datos_artista();
				Guardar_cambios_artista();
				
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

	public void Guardar_cambios_artista() {
		if (_artista != null) {
			_artista.setFotoRuta(getFotoImg().getSrc());
			
			basededatos.Datos_Acceso datos = _artista.getDatos();
			datos.setEmail(getEmailTF().getValue());
			datos.setPassword(getContraseniaTF().getValue());
			_artista.setDatos(datos);

			_artista.setNick(getNickTF().getValue());
			
			//Poner bien el estilo??
			
			bd.Actualizar_Artista(_artista);
		}
		else {
			//Poner bien el estilo
			bd.Crear_Artista(getEmailTF().getValue(), getNickTF().getValue(),
							getContraseniaTF().getValue(), getFotoImg().getSrc(), -1);
		}
	}

	public void Validar_datos_artista() {
		//VALIDAR
	}
	
	public void Cargar_Estilos() {
		_estilos = bd.Cargar_Estilos();
	}
}