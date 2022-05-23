package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.Cancion;
import vistas.VistaCanciones_mas_exitosas;

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
	
	public void CargarCancionesExitosas() {
		
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Exitosas(_artista.getORMID());
		
		Cancion temp;
		
		for (int i = 0; i < canciones.length; i++) {
			temp = new Cancion(canciones[i]);
			
			_list_Cancion.add(temp);
		}
	}
}