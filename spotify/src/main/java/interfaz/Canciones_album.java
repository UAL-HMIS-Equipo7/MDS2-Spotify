package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.TituloCancion;
import vistas.VistaCanciones_album;

public class Canciones_album extends VistaCanciones_album {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;
	public Vector<TituloCancion> _list_TituloCancion = new Vector<TituloCancion>();
	
	
	
	public Canciones_album() {
		
		
		
		CargarCancionesAlbum();
		
		Scroller scroll = this.getNavegacionSB();
		
		//Testing elements
		Div div = new Div();
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.getElement().setAttribute("justify-content", "space-evenly");
		
		for (int i = 0; i < _list_TituloCancion.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.getElement().setAttribute("justify-content", "space-evenly");
			}
			
			tempHl.add(_list_TituloCancion.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarCancionesAlbum() {
		TituloCancion temp;
		
		for (int i = 0; i < 6; i++) {
			temp = new TituloCancion();
			
			_list_TituloCancion.add(temp);
		}
	}
}