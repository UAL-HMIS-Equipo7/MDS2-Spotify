package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion;
import vistas.VistaCanciones_mas_exitosas;

public class Canciones_mas_exitosas extends VistaCanciones_mas_exitosas {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	
	
	public Canciones_mas_exitosas() {
		
		
		
		CargarCanciones();
		
		Scroller scroll = this.getNavegacionSB();
		
		//Testing elements
		Div div = new Div();
		
		HorizontalLayout tempHl = new HorizontalLayout();
		
		for (int i = 0; i < _list_Cancion.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
			}
			
			tempHl.add(_list_Cancion.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarCanciones() {
		Cancion temp;
		
		for (int i = 0; i < 4; i++) {
			temp = new Cancion();
			
			_list_Cancion.add(temp);
		}
	}
}