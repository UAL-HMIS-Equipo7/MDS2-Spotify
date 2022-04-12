package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_administrador;
import vistas.VistaCanciones_administrador;

@CssImport("./styles/shared-styles.css")
public class Canciones_administrador extends VistaCanciones_administrador {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Cancion_administrador> _list_Cancion_administrador = new Vector<Cancion_administrador>();
	
	private VerticalLayout layoutPadre;
	
	public Canciones_administrador(VerticalLayout layoutPadre) {
		
		this.layoutPadre = layoutPadre;

		CargarCancionesAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Cancion_administrador cancion : _list_Cancion_administrador) {
			div.add(cancion);
		}
		
		scroll.setContent(div);
		
	}
	
	public void CargarCancionesAdministrador() {
		Cancion_administrador temp;
		
		for (int i = 0; i < 4; i++) {
			temp = new Cancion_administrador(layoutPadre);
			temp.setClassName("cancionAdministrador");
			
			_list_Cancion_administrador.add(temp);
		}
	}
}