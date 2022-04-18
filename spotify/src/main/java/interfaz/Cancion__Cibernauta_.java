package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorReproductor;
import vistas.VistaCancion_cibernauta;

public class Cancion__Cibernauta_ extends VistaCancion_cibernauta {
//	private Button _fotoCancionB;

	public Reproductor__Cibernauta_ _reproductor__Cibernauta_;
	
	public Cancion__Cibernauta_() {
		
	}
	
	public Cancion__Cibernauta_(VerticalLayout layoutPadre) {
		
		this.getFotoCancionB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				//TODO: Datos de la cancion
				//GestorReproductor.setCancion(null);
			}
		});
	}
}