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

	private basededatos.Album _album;

	public Edicion_y_Creacion_album(basededatos.Album album) {
		_album = album;
		
		if (_album != null) {
			this.getTituloAlbumTF().setValue(_album.getTitulo());
			this.getFotoImg().setSrc(_album.getImagenRuta());
			this.getFechaEdicionTF().setValue(_album.getFechaEdicion());
			
			StringBuilder intepretes = new StringBuilder();
			basededatos.Artista[] artistas = _album.autores.toArray();
			
			for (int i = 0; i < artistas.length; i++) {
				intepretes.append(artistas[i].getNick() + ", ");
			}
			
			this.getArtistaTF().setValue(intepretes.toString());
		}
		
		//Implementar FileChooser
		this.getElegirFotoB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//getFotoImg().setSrc("");
			}
		});
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Validar_cambios_album();
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
		//Implementado con Override
		throw new UnsupportedOperationException();
	}

	public void Validar_cambios_album() {
		//VALIDAR
	}
}