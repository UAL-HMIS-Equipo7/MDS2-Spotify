package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.Evento;
import vistas.VistaEventos;

@CssImport("./styles/shared-styles.css")
public class Eventos extends VistaEventos {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Evento> _list_Evento = new Vector<Evento>();
	
	private basededatos.Artista _artista;
	private iActor_comun bd = new BDPrincipal();
	
	public Eventos(basededatos.Artista artista) {
		
		_artista = artista;
		
		CargarEventos();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		div.setClassName("divScroll350");
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("hlCancionesLista");
		
		for (int i = 0; i < _list_Evento.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("hlCancionesLista");
			}
			
			tempHl.add(_list_Evento.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarEventos() {
		
		basededatos.Evento[] eventos = bd.Cargar_Eventos_Artista(_artista.getORMID());
		
		Evento temp;
		
		for (int i = 0; i < eventos.length; i++) {
			temp = new Evento(eventos[i], true);
			temp.setClassName("max250");
			
			_list_Evento.add(temp);
		}
	}
}