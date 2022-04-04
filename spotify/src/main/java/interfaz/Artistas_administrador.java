package interfaz;

import vistas.VistaArtistas_administrador;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.Scroller;

import interfaz.Artista_administrador;

@CssImport("./styles/shared-styles.css")
public class Artistas_administrador extends VistaArtistas_administrador {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Artista_administrador> _list_Artista_administrador = new Vector<Artista_administrador>();
	
	public Artistas_administrador() {
		// TODO Auto-generated constructor stub
		
		CargarAlbumesAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		//Meter elementos en scroller?
	}
	
	public void CargarAlbumesAdministrador() {
		
		Artista_administrador temp;
		
		for (int i = 0; i < 5; i++) {
			temp = new Artista_administrador();
			temp.setClassName("artistaAdministrador");
			
			_list_Artista_administrador.add(temp);
		}
		
	}
}