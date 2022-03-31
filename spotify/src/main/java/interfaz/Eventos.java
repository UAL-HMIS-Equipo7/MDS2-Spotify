package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;

import interfaz.Evento;
import vistas.VistaEventos;

@CssImport("./styles/shared-styles.css")
public class Eventos extends VistaEventos {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Evento> _list_Evento = new Vector<Evento>();
	
	public Eventos() {
		
		CargarEventos();
		
		Scroller scroll = this.getNavegacionSB();
		
		//Testing elements
		Div div = new Div();
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("fullSize");
		
		for (int i = 0; i < _list_Evento.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("fullSize");
			}
			
			tempHl.add(_list_Evento.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarEventos() {
		Evento temp;
		
		for (int i = 0; i < 4; i++) {
			temp = new Evento();
			
			_list_Evento.add(temp);
		}
	}
}