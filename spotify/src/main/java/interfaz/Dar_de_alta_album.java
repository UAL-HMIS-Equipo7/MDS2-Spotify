package interfaz;

import java.time.LocalDateTime;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorVentana;
import vistas.VistaDar_de_alta_album;

@CssImport("./styles/shared-styles.css")
public class Dar_de_alta_album extends VistaDar_de_alta_album {

	public Edicion_y_Creacion_album _edicion_y_Creacion_album;
	public Canciones_a_aniadir_album _canciones_a_aniadir_album;
	private iAdministrador bd = new BDPrincipal();
	
	public Dar_de_alta_album() {
		
		_edicion_y_Creacion_album = new Edicion_y_Creacion_album(null)  {
			@Override
			public void Guardar_cambios_album() {
				basededatos.Cancion[] canciones = new basededatos.Cancion[_canciones_a_aniadir_album._list_Cancion_album.size()];
				
				for(int i = 0; i<_canciones_a_aniadir_album._list_Cancion_album.size();i++) {
					canciones[i] = _canciones_a_aniadir_album._list_Cancion_album.get(i).cancion;
				}
				
				String[] artistas = this.getArtistaTF().getValue().split(",");
				
				bd.Crear_Album(this.getTituloAlbumTF().getValue(), this.getFotoImg().getSrc(), LocalDateTime.now().toString(), artistas, canciones);
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