package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.upload.FinishedEvent;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MemoryBuffer;

import spotify.SubirArchivos;
import vistas.VistaEditar_foto_de_perfil_artista;

public class Editar_foto_de_perfil__Artista_ extends VistaEditar_foto_de_perfil_artista {
//	private FileChooser _eligirFotoFC;
	
	public Editar_foto_de_perfil__Artista_(Image foto) {
		
		this.getElegirFotoFC().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				MemoryBuffer buffer = new MemoryBuffer();
				Upload upload = new Upload(buffer);
				Dialog modal = new Dialog(upload);
				
				upload.addFinishedListener(new ComponentEventListener<FinishedEvent>() {
					
					@Override
					public void onComponentEvent(FinishedEvent event) {
						String rutaFoto = SubirArchivos.Imagen(buffer);
						
						foto.setSrc(rutaFoto);
						
						modal.close();
					}
				});
			}
		});
	}
}