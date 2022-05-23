package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.Album;
import vistas.VistaAlbumes;

@CssImport("./styles/shared-styles.css")
public class Albumes extends VistaAlbumes {

	public Vector<Album> _list_Album = new Vector<Album>();
	private iActor_comun bd = new BDPrincipal();
	private basededatos.Artista artista;
	
	public Albumes(basededatos.Artista artista) {
		this.artista = artista;
		CargarAlbumes();
		
		Scroller scroll = this.getVaadinScroller();
		
		//Testing elements
		Div div = new Div();
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("hlAlbumes");
		
		for (int i = 0; i < _list_Album.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				div.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("hlAlbumes");
			}
			
			tempHl.add(_list_Album.get(i));
		}
		
		div.add(tempHl);

		scroll.setContent(div);
	}
	
	public void CargarAlbumes() {
		basededatos.Album[] albumes = bd.Cargar_Albumes_Artista(artista.getId());
 		Album temp;

		for (int i = 0; i < 6 && i < albumes.length; i++) {
			temp = new Album(albumes[i]);
			temp.setClassName("album");
			
			_list_Album.add(temp);
		}
	}
}