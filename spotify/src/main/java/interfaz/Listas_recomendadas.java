package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Lista_de_reproduccion_ajena;
import vistas.VistaListas_recomendadas;

@CssImport("./styles/shared-styles.css")
public class Listas_recomendadas extends VistaListas_recomendadas {

	public Vector<Lista_de_reproduccion_ajena> _list_Lista_de_reproduccion_ajena = new Vector<Lista_de_reproduccion_ajena>();
	
	
	
	public Listas_recomendadas() {
		
		
		
		CargarListasRecomendadas();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_list_Lista_de_reproduccion_ajena.firstElement());
	}
	
	public void CargarListasRecomendadas() {
		Lista_de_reproduccion_ajena temp;
		
		for (int i = 0; i < 2; i++) {
			temp = new Lista_de_reproduccion_ajena();
			temp.setClassName("fullSize");
			
			_list_Lista_de_reproduccion_ajena.add(temp);
		}
	}
}