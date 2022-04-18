package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaLista_de_reproduccion_ajena;

public class Lista_de_reproduccion_ajena extends VistaLista_de_reproduccion_ajena {
//	private Object _fotoB;

	public Ver_lista_de_reproduccion _ver_lista_de_reproduccion;
	
	public Lista_de_reproduccion_ajena() {
		
		this.getFotoB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_ver_lista_de_reproduccion = new Ver_lista_de_reproduccion();
				
				
				GestorVentana.CambiarVentana(_ver_lista_de_reproduccion);
			}
		});
	}
}