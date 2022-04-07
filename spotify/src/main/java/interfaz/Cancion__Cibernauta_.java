package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
				
				_reproductor__Cibernauta_ = new Reproductor__Cibernauta_(layoutPadre);
				_reproductor__Cibernauta_.getStyle().set("margin", "var(--lumo-space-m)");
				
				layoutPadre.add(_reproductor__Cibernauta_);
				
			}
		});
	}
}