package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iArtista;
import interfaz.Foto_Artista;
import vistas.VistaArtistas_similares;

@CssImport("./styles/shared-styles.css")
public class Artistas_similares extends VistaArtistas_similares {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Foto_Artista> _list_Artista = new Vector<Foto_Artista>();
	private iArtista bd = new BDPrincipal();
	private basededatos.Artista artista;
	
	public Artistas_similares(basededatos.Artista artista) {		
		
		this.artista = artista;
		CargarArtistasSimilares();
		
		Scroller scroll = this.getNavegacionSB();
		
		//Testing elements
		Div div = new Div();
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setHeight("100%");
		tempHl.setWidth("98%");
		
		for (int i = 0; i < _list_Artista.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setHeight("100%");
				tempHl.setWidth("98%");
			}
			
			tempHl.add(_list_Artista.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarArtistasSimilares() {
		
		basededatos.Artista[] artistas = bd.Cargar_Artistas_Similares(this.artista.getORMID());
		Foto_Artista temp;
		
		for (int i = 0; i < 4; i++) {
			temp = new Foto_Artista(artistas[i]);
			temp.setClassName("artistasSimilares");
			temp.getNickB().setVisible(false);
			
			_list_Artista.add(temp);
		}
		
	}
}