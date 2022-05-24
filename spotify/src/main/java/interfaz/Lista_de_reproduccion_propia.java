package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaLista_de_reproduccion_propia;

public class Lista_de_reproduccion_propia extends VistaLista_de_reproduccion_propia {
//	private Button _fotoB;

	public Ver_lista_de_reproduccion_propia _ver_lista_de_reproduccion_propia;
	
	public Lista_de_reproduccion_propia(basededatos.Lista_de_reproduccion lista) {
		
		basededatos.Cancion[] canciones = lista.canciones_incluidas.toArray();
		
		this.getFotoB().setSrc(GestorArchivos.CargarImagen(canciones[0].getFicheroMultimediaAltaCalidadRuta()));
		
		this.getFotoB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_ver_lista_de_reproduccion_propia = new Ver_lista_de_reproduccion_propia(lista);
				
				
				GestorVentana.CambiarVentana(_ver_lista_de_reproduccion_propia);
			}
		});
	}
}