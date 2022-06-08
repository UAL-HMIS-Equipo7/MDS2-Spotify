package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.TituloCancion;
import vistas.VistaCanciones_album;

public class Canciones_album extends VistaCanciones_album {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;
	public Vector<TituloCancion> _list_TituloCancion = new Vector<TituloCancion>();
	
	private basededatos.Album _album;
	private iActor_comun bd = new BDPrincipal();
	
	public Canciones_album(basededatos.Album album) {
		
		_album = album;
		
		this.getLabel().setText(_album.getTitulo());
		
		CargarCancionesAlbum();
		
		Scroller scroll = this.getNavegacionSB();
		
		//Testing elements
		Div div = new Div();
		div.setClassName("divScroll500");
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
		
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Album(_album.getORMID());
		
		TituloCancion temp;
		
		for (int i = 0; i < canciones.length; i++) {
			temp = new TituloCancion(canciones[i]);
			
			_list_TituloCancion.add(temp);
		}
	}
}