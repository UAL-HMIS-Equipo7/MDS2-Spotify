package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorReproductor;
import vistas.VistaCancion_cibernauta;

@CssImport("./styles/shared-styles.css")
public class Cancion__Cibernauta_ extends VistaCancion_cibernauta {
//	private Button _fotoCancionB;

	public Reproductor__Cibernauta_ _reproductor__Cibernauta_;
	
	public Cancion__Cibernauta_(basededatos.Cancion cancion) {
		
		
		VerticalLayout vl = this.getContenedor().as(VerticalLayout.class);
		
		Image img = new Image(GestorArchivos.CargarImagen(cancion.getFicheroMultimediaAltaCalidadRuta()),
				cancion.getFicheroMultimediaAltaCalidadRuta());
		img.setClassName("cancionCiber");
		vl.add(img);
		
		vl.addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				GestorReproductor.setCancion(cancion);
			}
		});
	}
}