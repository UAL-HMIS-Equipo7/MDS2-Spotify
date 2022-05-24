package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorReproductor;
import vistas.VistaCancion;

public class Cancion extends VistaCancion {
//	private event _reproducir__No_Cibernauta_;
//	private Image _cancionImg;
	
	private basededatos.Cancion _cancion;
	
	public Cancion(basededatos.Cancion cancion) {
		
		_cancion = cancion;
		
		this.getTituloB().setVisible(false);
		
		this.getTituloB().setText(_cancion.getTitulo());
		this.getCancionImg().setSrc(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()));
		
		this.getCancionImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Reproducir__No_Cibernauta_();
			}
		});
	}
	
	

	public void Reproducir__No_Cibernauta_() {
		GestorReproductor.setCancion(_cancion);
	}
}