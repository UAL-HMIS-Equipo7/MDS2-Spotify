package interfaz;

import vistas.VistaArtistas_administrador;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Artista_administrador;

@CssImport("./styles/shared-styles.css")
public class Artistas_administrador extends VistaArtistas_administrador {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Artista_administrador> _list_Artista_administrador = new Vector<Artista_administrador>();
	
	private VerticalLayout layoutPadre;
	
	public Artistas_administrador(VerticalLayout layoutPadre) {
		
		this.layoutPadre = layoutPadre;
		
		CargarAlbumesAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Artista_administrador aa : _list_Artista_administrador) {
			div.add(aa);
		}
		
		scroll.setContent(div);
	}
	
	public void CargarAlbumesAdministrador() {
		
		Artista_administrador temp;
		
		for (int i = 0; i < 5; i++) {
			temp = new Artista_administrador(layoutPadre);
			temp.setClassName("artistaAdministrador");
			
			_list_Artista_administrador.add(temp);
		}
		
	}
}