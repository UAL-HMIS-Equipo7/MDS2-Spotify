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
import vistas.VistaEdicion_y_creacion_cancion;

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

	public Edicion_y_Creacion_cancion(basededatos.Cancion cancion) {
		
		Cargar_Estilos();
		
		List<String> nombreEstilos = new Vector<String>(_estilos.length);
		
		for (basededatos.Estilo estilo : _estilos) {
			nombreEstilos.add(estilo.getNombre());
		}
		
		this.getEstiloCB().setItems(nombreEstilos);
		
		_cancion = cancion;
		
		if (_cancion != null) {
			this.getTituloTF().setValue(_cancion.getTitulo());
			
			basededatos.Estilo[] estilo = _cancion.estilos.toArray();
			this.getEstiloCB().setValue(estilo[0].getNombre());
			
			this.getCreditosTituloTF().setValue(_cancion.getTitulo());
			
			this.getTituloAlbumTF().setValue(_cancion.getIncluida_en_albumes().getTitulo());
			this.getCompositorTF().setValue(_cancion.getCompositores());
			this.getProductorTF().setValue(_cancion.getProductores());
			
			StringBuilder intepretes = new StringBuilder();
			basededatos.Artista[] artistas = _cancion.intepretes.toArray();
			
			for (int i = 0; i < artistas.length; i++) {
				intepretes.append(artistas[i].getNick() + ", ");
			}
			
			this.getInterpreteTF().setValue(intepretes.toString());
			
			this.getFotoImg().setSrc(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()));
			_rutaFicheroMultimedia = _cancion.getFicheroMultimediaRuta();
		}
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Validar_datos_cancion(); //bool??
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

						getFotoImg().setSrc(rutaFoto);
						
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
			
			//No es posible actualizar bien pq tenemos cosas como el titulo de album,
			//en lugar del objeto de album
		}
		else {
			bd.Crear_Cancion(getTituloTF().getValue(), estiloSeleccionado.getORMID(),
							getTituloAlbumTF().getValue(),
							getCompositorTF().getValue(),
							getProductorTF().getValue(),
							_rutaFicheroMultimedia,
							getFotoImg().getSrc(),
							getInterpreteTF().getValue());
		}
	}

	public void Validar_datos_cancion() {
		//VALIDACION
	}
	
	public void Cargar_Estilos() {
		_estilos = bd.Cargar_Estilos();
	}
}