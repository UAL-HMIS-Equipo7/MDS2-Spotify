package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.NickArtista;
import vistas.VistaArtistas;

@CssImport("./styles/shared-styles.css")
public class Artistas extends VistaArtistas {

	public Vector<NickArtista> _list_NickArtista = new Vector<NickArtista>();
	
	
	
	public Artistas() {		
		
		
		
		CargarArtistas();
		
		//TODO -> Añadir un scroller??
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("hlArtistas");
		
		for (int i = 0; i < _list_NickArtista.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				vl.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("hlAlbumes");
			}
			
			tempHl.add(_list_NickArtista.get(i));
		}
		
		vl.add(tempHl);
	}
	
	public void CargarArtistas() {
		NickArtista temp;
		
		for (int i = 0; i < 6; i++) {
			temp = new NickArtista();
			temp.setClassName("fullSize");
			
			_list_NickArtista.add(temp);
		}
	}
}