package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.Cancion;
import vistas.VistaCanciones_mas_exitosas;

@CssImport("./styles/shared-styles.css")
public class Canciones_mas_exitosas extends VistaCanciones_mas_exitosas {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();

	private basededatos.Artista _artista;
	private iActor_comun bd = new BDPrincipal();
	
	public Canciones_mas_exitosas(basededatos.Artista artista) {
		
		_artista = artista;
		
		CargarCancionesExitosas();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		div.setClassName("divScroll350");
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("hlCancionesLista");
		
		for (int i = 0; i < _list_Cancion.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("hlCancionesLista");
			}
			
			tempHl.add(_list_Cancion.get(i));
			
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarCancionesExitosas() {
		
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Exitosas(_artista.getORMID());
		
		Cancion temp;
		
		for (int i = 0; i < canciones.length; i++) {
			temp = new Cancion(canciones[i]);
			temp.setClassName("max250");
			
			_list_Cancion.add(temp);
		}
	}
}