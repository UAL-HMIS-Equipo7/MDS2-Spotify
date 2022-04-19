package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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

	public Edicion_y_Creacion_cancion() {
		
		//Botones Guardar y Cancelar
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
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
		throw new UnsupportedOperationException();
	}

	public void Validar_datos_cancion() {
		throw new UnsupportedOperationException();
	}
}