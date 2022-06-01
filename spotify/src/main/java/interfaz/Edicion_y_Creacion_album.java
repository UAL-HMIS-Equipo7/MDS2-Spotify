package interfaz;

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
import vistas.VistaEdicion_y_creacion_album;

@CssImport("./styles/shared-styles.css")
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
	protected Image _img;

	public Edicion_y_Creacion_album(basededatos.Album album) {
		_album = album;
		
		if (_album != null) {
			this.getTituloAlbumTF().setValue(_album.getTitulo());
			this.getFechaEdicionTF().setValue(_album.getFechaEdicion());
			
			StringBuilder intepretes = new StringBuilder();
			basededatos.Artista[] artistas = _album.autores.toArray();
			
			for (int i = 0; i < artistas.length; i++) {
				intepretes.append(artistas[i].getNick() + ", ");
			}
			
			this.getArtistaTF().setValue(intepretes.toString());
			
			_img = new Image(GestorArchivos.CargarImagen(_album.getImagenRuta()), _album.getImagenRuta());
			_img.setClassName("imagenEdicionCreacionAdministrador");
			this.getFotoImgLayout().add(_img);
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
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if(Validar_cambios_album() == false) {
					Notification.show("Hay algun error en los campos introducidos");
					return;
				}
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

	public boolean Validar_cambios_album() {
		//VALIDAR
		boolean correcto = true;
		if(this.getTituloAlbumTF().getValue().isBlank() || _img.getSrc().isBlank() || this.getArtistaTF().getValue().isBlank() ) {
			correcto = false;
		}
		return correcto;
	}
}