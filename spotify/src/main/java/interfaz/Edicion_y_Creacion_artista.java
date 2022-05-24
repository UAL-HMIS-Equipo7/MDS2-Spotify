package interfaz;

import java.util.List;
import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import spotify.GestorArchivos;
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
		
		List<String> nombreEstilos = new Vector<String>(_estilos.length);
		
		for (basededatos.Estilo estilo : _estilos) {
			nombreEstilos.add(estilo.getNombre());
		}
		
		this.getEstiloCB().setItems(nombreEstilos);
		
		_artista = artista;
		
		if (_artista != null) {
			this.getFotoImg().setSrc(GestorArchivos.CargarImagen(_artista.getFotoRuta()));
			this.getEmailTF().setValue(_artista.getDatos().getEmail());
			this.getNickTF().setValue(_artista.getNick());
			this.getContraseniaTF().setValue(_artista.getDatos().getPassword());
			this.getEstiloCB().setValue(_artista.getEstilo().getNombre());
		}
		
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

						getFotoImg().setSrc(rutaFoto);
						
						modal.close();
					}
				});
				
				modal.open();
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
		basededatos.Estilo estiloSeleccionado = null;
		
		for (basededatos.Estilo estilo : _estilos) {
			if (estilo.getNombre().equals(getEstiloCB().getValue())) {
				estiloSeleccionado = estilo;
				break;
			}
		}
		
		if (_artista != null) {
			_artista.setFotoRuta(getFotoImg().getSrc());
			
			basededatos.Datos_Acceso datos = _artista.getDatos();
			datos.setEmail(getEmailTF().getValue());
			datos.setPassword(getContraseniaTF().getValue());
			_artista.setDatos(datos);

			_artista.setNick(getNickTF().getValue());
			
			_artista.setEstilo(estiloSeleccionado);
			
			bd.Actualizar_Artista(_artista);
		}
		else {
			bd.Crear_Artista(getEmailTF().getValue(), getNickTF().getValue(),
							getContraseniaTF().getValue(), getFotoImg().getSrc(), estiloSeleccionado.getORMID());
		}
	}

	public void Validar_datos_artista() {
		//VALIDAR
	}
	
	public void Cargar_Estilos() {
		_estilos = bd.Cargar_Estilos();
	}
}