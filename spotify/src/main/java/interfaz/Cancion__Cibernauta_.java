package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorReproductor;
import vistas.VistaCancion_cibernauta;

public class Cancion__Cibernauta_ extends VistaCancion_cibernauta {
//	private Button _fotoCancionB;

	public Reproductor__Cibernauta_ _reproductor__Cibernauta_;
	
	public Cancion__Cibernauta_(basededatos.Cancion cancion) {
		
		Image foto = getFotoCancionB();
		
		foto.setSrc(GestorArchivos.CargarImagen(cancion.getFicheroMultimediaAltaCalidadRuta()));
		
		foto.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				GestorReproductor.setCancion(cancion);
			}
		});
	}
}