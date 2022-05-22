package interfaz;

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
	
	public Editar_album(basededatos.Album album) {
		
		_edicion_y_Creacion_album = new Edicion_y_Creacion_album(album)  {
			@Override
			public void Guardar_cambios_album() {
				
				//Override para tener acceso a:
				//_canciones_en_album._list_Cancion_a_eliminar_album
			}
		};
		
		_canciones_en_album = new Canciones_en_album(album);
		
		_edicion_y_Creacion_album.setClassName("fullSize");
		_canciones_en_album.setClassName("fullSize");
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_edicion_y_Creacion_album);
		vl.add(_canciones_en_album);
		
		
	}
}