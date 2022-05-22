package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
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

	public Edicion_y_Creacion_cancion(basededatos.Cancion cancion) {
		
		Cargar_Estilos();
		
		//Hay que establecer la lista de estilos, donde se muestre su nombre, pero se almacene su id, para poder ser enviada
		//this.getEstiloCB().set...
		
		_cancion = cancion;
		
		if (_cancion != null) {
			this.getTituloTF().setValue(_cancion.getTitulo());
			
			//TODO: Revisar como trabajar bien con los estilos
			basededatos.Estilo[] estilo = _cancion.estilos.toArray();
			//this.getEstiloCB()
			
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
			
			//FICHERO MULTIMEDIA??
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
	}

	public void Guardar_cambios_cancion() {
		if (_cancion != null) {
			_cancion.setTitulo(getTituloTF().getValue());
			
			//No es posible actualizar bien pq tenemos cosas como el titulo de album,
			//en lugar del objeto de album
		}
		else {
			//Obtener bien el id de estilo y los ficheros
			bd.Crear_Cancion(getTituloTF().getValue(), -1,
							getTituloAlbumTF().getValue(),
							getCompositorTF().getValue(),
							getProductorTF().getValue(),
							"ficheroMultimedia",
							"ficheroMultimediaAltaCalidad",
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