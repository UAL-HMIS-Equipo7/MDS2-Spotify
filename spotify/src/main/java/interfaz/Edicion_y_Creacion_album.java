package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import vistas.VistaEdicion_y_creacion_album;

public class Edicion_y_Creacion_album extends VistaEdicion_y_creacion_album {
//	private event _guardar_cambios_album;
//	private Label _tituloL;
//	private Image _fotoImg;
//	private Button _elegirFotoB;
//	private Label _tituloAlbumL;
//	private TextField _tituloAlbumTF;
//	private Label _artistaL;
//	private TextField _artistaTF;
//	private Label _fechaEdicionL;
//	private TextField _fechaEdicionTF;
//	private Button _guardarB;
//	private Button _cancelarB;
//	private Label _errorL;
	private iAdministrador bd = new BDPrincipal();
	private basededatos.Album album;

	public Edicion_y_Creacion_album(basededatos.Album album) {
		this.album = album;
		//Botones de Guardar y Cancelar
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Guardar_cambios_album();
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

	public void Guardar_cambios_album() {
	
		throw new UnsupportedOperationException();
	}

	public void Validar_cambios_album() {
		throw new UnsupportedOperationException();
	}
}