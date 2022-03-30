package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion;
import vistas.VistaCanciones_recomendadas;

public class Canciones_recomendadas extends VistaCanciones_recomendadas {

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	public Canciones_recomendadas() {
		
		CargarCanciones();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_list_Cancion.firstElement());
	}
	
	public void CargarCanciones() {
		Cancion temp;
		
		for (int i = 0; i < 4; i++) {
			temp = new Cancion();
			temp.getElement().setAttribute("width", "100%");
			temp.getElement().setAttribute("height", "100%");
			
			_list_Cancion.add(temp);
		}
	}
}