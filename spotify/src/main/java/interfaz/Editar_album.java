package interfaz;

import java.time.LocalDateTime;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEditar_album;

@CssImport("./styles/shared-styles.css")
public class Editar_album extends VistaEditar_album {

	public Edicion_y_Creacion_album _edicion_y_Creacion_album;
	public Canciones_en_album _canciones_en_album;
	
	basededatos.Album _album;
	
	public Editar_album(basededatos.Album album) {
		
		_album = album;
		
		_edicion_y_Creacion_album = new Edicion_y_Creacion_album(_album)  {
			@Override
			public void Guardar_cambios_album() {
				
				_album.incluye_a.clear();
				
				for(int i = 0; i< _canciones_en_album._list_Cancion_a_eliminar_album.size();i++) {
					_album.incluye_a.add(_canciones_en_album._list_Cancion_a_eliminar_album.get(i).cancion);
				}
				
				_album.setTitulo(this.getTituloAlbumTF().getValue());
				_album.setFechaEdicion(LocalDateTime.now().toString());
				_album.setImagenRuta(this.getFotoImg().getSrc());
				
				//No es posible actualizar los autores pq lo que tenemos son string
				//_album.autores
			}
		};
		
		_canciones_en_album = new Canciones_en_album(_album);
		
		_edicion_y_Creacion_album.setClassName("fullSize");
		_canciones_en_album.setClassName("fullSize");
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_edicion_y_Creacion_album);
		vl.add(_canciones_en_album);
	}
}