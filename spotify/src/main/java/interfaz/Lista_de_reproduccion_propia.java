package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaLista_de_reproduccion_propia;

public class Lista_de_reproduccion_propia extends VistaLista_de_reproduccion_propia {
//	private Button _fotoB;

	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	
	public Lista_de_reproduccion_propia(VerticalLayout layoutPadre) {
		
		this.getFotoB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_ver_lista_de_reproduccion_propia = new Ver_lista_de_reproduccion_propia(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_ver_lista_de_reproduccion_propia);
			}
		});
	}
}