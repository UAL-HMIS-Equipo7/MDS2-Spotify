package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import basededatos.BDPrincipal;
import basededatos.iArtista;
import spotify.GestorActor;
import spotify.GestorArchivos;
import vistas.VistaEditar_foto_de_perfil_artista;

public class Editar_foto_de_perfil__Artista_ extends VistaEditar_foto_de_perfil_artista {
//	private FileChooser _eligirFotoFC;
	iArtista bd = new BDPrincipal();
	protected Image _img;
	
	public Editar_foto_de_perfil__Artista_(Image foto) {
		
		_img = foto;
		this.getElegirFotoFC().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {
					
					@Override
					public void onComponentEvent(FinishedEvent event) {
						String rutaFoto = GestorArchivos.SubirImagen(buffer);
						
						_img.setSrc(rutaFoto);
						
						modal.close();
					}
				});
			}
		});
	}
	public void ActualizarFotoPerfil() {
		bd.Actualizar_Foto_Perfil(GestorActor.getIdUsuario(), _img.getSrc());
	}
}