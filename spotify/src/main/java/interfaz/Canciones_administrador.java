package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Cancion_administrador;
import vistas.VistaCanciones_administrador;

@CssImport("./styles/shared-styles.css")
public class Canciones_administrador extends VistaCanciones_administrador {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;
	private iAdministrador bd = new BDPrincipal();
	private String parametrosBusqueda;

	public Vector<Cancion_administrador> _list_Cancion_administrador = new Vector<Cancion_administrador>();
	
	
	
	public Canciones_administrador(String paramBusqueda) {
		
		parametrosBusqueda = paramBusqueda;

		CargarCancionesAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		div.setClassName("divScroll350");
		
		for (Cancion_administrador cancion : _list_Cancion_administrador) {
			div.add(cancion);
		}
		
		scroll.setContent(div);
		
	}
	
	public void CargarCancionesAdministrador() {
		
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Administrador(parametrosBusqueda);
		
		if (canciones == null)
			return;
		
		Cancion_administrador temp;
		
		for (int i = 0; i < 4 && i < canciones.length; i++) {
			temp = new Cancion_administrador(canciones[i]);
			temp.setClassName("cancionAdministrador");
			
			_list_Cancion_administrador.add(temp);
		}
	}
}