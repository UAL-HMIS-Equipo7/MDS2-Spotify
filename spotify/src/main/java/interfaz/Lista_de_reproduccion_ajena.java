package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaLista_de_reproduccion_ajena;

@CssImport("./styles/shared-styles.css")
public class Lista_de_reproduccion_ajena extends VistaLista_de_reproduccion_ajena {
//	private Object _fotoB;

	public Ver_lista_de_reproduccion _ver_lista_de_reproduccion;
	
	public Lista_de_reproduccion_ajena(basededatos.Lista_de_reproduccion lista) {
		
		basededatos.Cancion[] canciones = lista.canciones_incluidas.toArray();
		
		this.getTituloL().setText(lista.getTitulo());
		
		VerticalLayout vl = getContenedor().as(VerticalLayout.class);
		
		Image img;
		
		if (canciones.length == 0) {
			img = new Image(GestorArchivos.CargarImagen("img/defaultplaylist.jpg"), "Sin-Canciones");
		}
		else {
			img = new Image(GestorArchivos.CargarImagen(canciones[0].getFicheroMultimediaAltaCalidadRuta()),
					canciones[0].getFicheroMultimediaAltaCalidadRuta());
		}
		
		img.setClassName("max350");

		vl.add(img);
		
		vl.addClickListener(new ComponentEventListener<ClickEvent<VerticalLayout>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<VerticalLayout> event) {
				_ver_lista_de_reproduccion = new Ver_lista_de_reproduccion(lista);
				
				GestorVentana.CambiarVentana(_ver_lista_de_reproduccion);
			}
		});
	}
}