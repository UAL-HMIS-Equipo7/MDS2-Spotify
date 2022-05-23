package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import basededatos.iAdministrador;
import interfaz.Album;
import spotify.GestorActor;
import vistas.VistaAlbumes_recomendados;

public class Albumes_recomendados extends VistaAlbumes_recomendados {
	public Vector<Album> _list_Album = new Vector<Album>();
	private iActor_comun bd = new BDPrincipal();
	
	
	public Albumes_recomendados() {
		
		
		
		CargarAlbumes();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		vl.add(_list_Album.firstElement());
		
	}
	
	public void CargarAlbumes() {
		basededatos.Album[] albumes = bd.Cargar_Albumes_Recomendados(GestorActor.getIdUsuario());
		Album temp;
		
		
		for (int i = 0; i < 4; i++) {
			temp = new Album(albumes[i]);
			temp.getElement().setAttribute("align-self", "center");
			
			_list_Album.add(temp);
		}
	}
	
}