package interfaz;

import java.util.List;
import java.util.Vector;

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
import vistas.VistaEdicion_y_creacion_cancion;

@CssImport("./styles/shared-styles.css")
public class Edicion_y_Creacion_cancion extends VistaEdicion_y_creacion_cancion {
//	private event _guardar_cambios_cancion;
//	private Label _cancionTituloL;
//	private Label _tituloL;
//	private TextField _tituloTF;
//	private Label _estiloL;
//	private ComboBox _estiloCB;
//	private Label _creditosL;
//	private Label _creditosTituloL;
//	private TextField _creditosTituloTF;
//	private Label _tituloAlbumL;
//	private TextField _tituloAlbumTF;
//	private Label _compositorL;
//	private TextField _compositorTF;
//	private Label _productorL;
//	private TextField _productorTF;
//	private Label _interpreteL;
//	private TextField _interpreteTF;
//	private Label _ficheroL;
//	private Button _elegirFicheroB;
//	private Button _guardarB;
//	private Button _cancelarB;
//	private Label _errorL;
	
	private basededatos.Cancion _cancion;
	private basededatos.Estilo[] _estilos;
	private iAdministrador bd = new BDPrincipal();
	
	private String _rutaFicheroMultimedia;
	private Image _img;

	public Edicion_y_Creacion_cancion(basededatos.Cancion cancion) {
		
		
		Cargar_Estilos();
		
		List<String> nombreEstilos = new Vector<String>(_estilos.length);
		
		for (basededatos.Estilo estilo : _estilos) {
			nombreEstilos.add(estilo.getNombre());
		}
		
		this.getEstiloCB().setItems(nombreEstilos);
		
		this.getErrorL().setVisible(false);
		
		_cancion = cancion;
		
		if (_cancion != null) {
			this.getTituloTF().setValue(_cancion.getTitulo());
			
			basededatos.Estilo[] estilo = _cancion.estilos.toArray();
			this.getEstiloCB().setValue(estilo[0].getNombre());
			
			this.getCreditosTituloTF().setValue(_cancion.getTitulo());
			
			if (_cancion.getIncluida_en_albumes() != null)
				this.getTituloAlbumTF().setValue(_cancion.getIncluida_en_albumes().getTitulo());
			this.getCompositorTF().setValue(_cancion.getCompositores());
			this.getProductorTF().setValue(_cancion.getProductores());
			
			StringBuilder intepretes = new StringBuilder();
			basededatos.Artista[] artistas = _cancion.intepretes.toArray();
			
			for (int i = 0; i < artistas.length; i++) {
				intepretes.append(artistas[i].getNick() + ", ");
			}
			
			this.getInterpreteTF().setValue(intepretes.toString());
			
			_img = new Image(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()),
					_cancion.getFicheroMultimediaAltaCalidadRuta());
			_img.setClassName("imagenEdicionCreacionAdministrador");
			this.getFotoImgLayout().add(_img);
			
			_rutaFicheroMultimedia = _cancion.getFicheroMultimediaRuta();
			this.getFicheroL().setText(_rutaFicheroMultimedia);
		}
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(Validar_datos_cancion() == false) {
					Notification.show("Hay algun error en los campos introducidos");
					return;
				}
				
				Guardar_cambios_cancion();
				
				GestorVentana.Atras();
			}
		});
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorVentana.Atras();
			}
		});
		
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
		
		this.getElegirFicheroB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {
					
					@Override
					public void onComponentEvent(FinishedEvent event) {
						
						_rutaFicheroMultimedia = GestorArchivos.SubirAudio(buffer);
						getFicheroL().setText(_rutaFicheroMultimedia);
						
						modal.close();
					}
				});
				
				modal.open();
			}
		});
	}

	public void Guardar_cambios_cancion() {
		
		basededatos.Estilo estiloSeleccionado = null;
		
		for (basededatos.Estilo estilo : _estilos) {
			if (estilo.getNombre().equals(getEstiloCB().getValue())) {
				estiloSeleccionado = estilo;
				break;
			}
		}
		
		if (_cancion != null) {
			_cancion.setTitulo(getTituloTF().getValue());
			_cancion.setProductores(getProductorTF().getValue());
			_cancion.setCompositores(getCompositorTF().getValue());
			_cancion.setFicheroMultimediaRuta(_rutaFicheroMultimedia);
			_cancion.setFicheroMultimediaAltaCalidadRuta(_img.getSrc());
			
			_cancion.estilos.clear();
			_cancion.estilos.add(estiloSeleccionado);
			
			String[] interpretes = getInterpreteTF().getValue().trim().split(",");
			
			bd.Actualizar_Cancion(_cancion, getTituloAlbumTF().getValue(), interpretes);
		}
		else {
			bd.Crear_Cancion(getTituloTF().getValue(), estiloSeleccionado.getORMID(),
							getTituloAlbumTF().getValue(),
							getCompositorTF().getValue(),
							getProductorTF().getValue(),
							_rutaFicheroMultimedia,
							_img.getSrc(),
							getInterpreteTF().getValue());
		}
	}

	public boolean Validar_datos_cancion() {
		//VALIDACION
		boolean correcto = true;
		if(this.getTituloTF().getValue().isBlank() || this.getCompositorTF().getValue().isBlank() || this.getProductorTF().getValue().isBlank() || _rutaFicheroMultimedia == null || _rutaFicheroMultimedia.isBlank() || _img.getSrc() == null || _img.getSrc().isBlank() || this.getInterpreteTF().getValue().isBlank()) {
			correcto = false;
		}
		return correcto;
	}
	
	public void Cargar_Estilos() {
		_estilos = bd.Cargar_Estilos();
	}
}