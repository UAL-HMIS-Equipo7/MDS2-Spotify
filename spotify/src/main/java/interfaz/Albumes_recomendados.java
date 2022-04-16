package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Album;
import vistas.VistaAlbumes_recomendados;

public class Albumes_recomendados extends VistaAlbumes_recomendados {
	public Vector<Album> _list_Album = new Vector<Album>();
	
	private VerticalLayout layoutPadre;
	
	public Albumes_recomendados(VerticalLayout layoutPadre) {
		
		this.layoutPadre = layoutPadre;
		
		CargarAlbumes();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_list_Album.firstElement());
		
	}
	
	public void CargarAlbumes() {
		Album temp;
		
		for (int i = 0; i < 4; i++) {
			temp = new Album(layoutPadre);
			temp.getElement().setAttribute("align-self", "center");
			
			_list_Album.add(temp);
		}
	}
	
}