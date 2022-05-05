package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaDar_de_alta_album;

@CssImport("./styles/shared-styles.css")
public class Dar_de_alta_album extends VistaDar_de_alta_album {

	public Edicion_y_Creacion_album _edicion_y_Creacion_album;
	public Canciones_a_aniadir_album _canciones_a_aniadir_album;
	
	public Dar_de_alta_album() {
		_edicion_y_Creacion_album = new Edicion_y_Creacion_album()  {
			@Override
			public void Guardar_cambios_album() {
				
				//Override para tener acceso a:
				//_canciones_a_aniadir_album._list_Cancion_album
			}
		};
		_canciones_a_aniadir_album = new Canciones_a_aniadir_album();
		
		_edicion_y_Creacion_album.setClassName("fullSize");
		_canciones_a_aniadir_album.setClassName("fullSize");
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_edicion_y_Creacion_album);
		vl.add(_canciones_a_aniadir_album);
	}
}