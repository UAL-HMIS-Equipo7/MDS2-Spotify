package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCancion;

public class Cancion extends VistaCancion {
//	private event _reproducir__No_Cibernauta_;
//	private Image _cancionImg;
	
	public Cancion() {
		this.getTituloB().setVisible(false);
		
		this.getCancionImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Reproducir__No_Cibernauta_();
				
			}
		});
	}
	
	

	public void Reproducir__No_Cibernauta_() {
		throw new UnsupportedOperationException();
	}
}