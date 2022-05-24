package interfaz;

import java.util.Vector;


import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Section;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import interfaz.Album_administrador;
import vistas.VistaAlbumes_administrador;

@CssImport("./styles/shared-styles.css")
public class Albumes_administrador extends VistaAlbumes_administrador {
//	private Label _tituloL;
//	private ScrollBar _navegacionSB;

	public Vector<Album_administrador> _list_Album_administrador = new Vector<Album_administrador>();
	private iAdministrador bd = new BDPrincipal();
	private String parametrosBusqueda;
	
	public Albumes_administrador(String paramBusqueda) {
		
		parametrosBusqueda = paramBusqueda;
		
		CargarAlbumesAdministrador();
		
		Scroller scroll = this.getNavegacionSB();
		
		Div div = new Div();
		
		for (Album_administrador album : _list_Album_administrador) {
			div.add(album);
		}
		
		scroll.setContent(div);
	}
	
	public void CargarAlbumesAdministrador() {
		
		basededatos.Album[] albumes = bd.Realizar_Busqueda_Albumes(parametrosBusqueda);
		
		if (albumes == null)
			return;
		
		Album_administrador temp;
		
		for (int i = 0; i < 5 && i < albumes.length; i++) {
			temp = new Album_administrador(albumes[i]);
			temp.setClassName("albumAdministrador");
			
			_list_Album_administrador.add(temp);
		}
		
	}
}