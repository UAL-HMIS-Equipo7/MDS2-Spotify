package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.TituloCancion;
import vistas.VistaCanciones_de_lista;

@CssImport("./styles/shared-styles.css")
public class Canciones_de_lista extends VistaCanciones_de_lista {
//	private Label _tituloPanelL;

	public Vector<TituloCancion> _list_TituloCancion = new Vector<TituloCancion>();
	
	basededatos.Lista_de_reproduccion _lista;
	iActor_comun bd = new BDPrincipal();
	
	public Canciones_de_lista(basededatos.Lista_de_reproduccion lista) {
		
		_lista = lista;
		
		CargarCancionesLista();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		div.setClassName("divScroll500");
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("hlCancionesLista");
		
		for (int i = 0; i < _list_TituloCancion.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("hlCancionesLista");
			}
			
			tempHl.add(_list_TituloCancion.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarCancionesLista() {
		
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Lista(_lista.getORMID());
		
		TituloCancion temp;
		
		for (int i = 0; i < canciones.length; i++) {
			temp = new TituloCancion(canciones[i]);
			temp.setClassName("max500");
			
			_list_TituloCancion.add(temp);
		}
	}
}