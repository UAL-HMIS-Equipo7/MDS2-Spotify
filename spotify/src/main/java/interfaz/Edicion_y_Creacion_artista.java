package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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

	public Edicion_y_Creacion_artista() {
		
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

	public void Guardar_cambios_artista() {
		throw new UnsupportedOperationException();
	}

	public void Validar_datos_artista() {
		throw new UnsupportedOperationException();
	}
}