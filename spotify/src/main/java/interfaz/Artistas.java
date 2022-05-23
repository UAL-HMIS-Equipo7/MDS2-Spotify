package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.NickArtista;
import spotify.GestorActor;
import vistas.VistaArtistas;

@CssImport("./styles/shared-styles.css")
public class Artistas extends VistaArtistas {

	public Vector<NickArtista> _list_NickArtista = new Vector<NickArtista>();
	
	private int _tipoLista;
	private Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Artistas(int tipoLista, Usuario_generico usuario) {		
		
		_tipoLista = tipoLista;
		_usuario = usuario;
		
		CargarArtistas();
		
		//TODO -> Añadir un scroller??
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		HorizontalLayout tempHl = new HorizontalLayout();
		tempHl.setClassName("hlArtistas");
		
		for (int i = 0; i < _list_NickArtista.size(); i++) {
			if (i % 2 == 0 && i != 0) {
				vl.add(tempHl);
				
				tempHl = new HorizontalLayout();
				tempHl.setClassName("hlAlbumes");
			}
			
			tempHl.add(_list_NickArtista.get(i));
		}
		
		vl.add(tempHl);
	}
	
	public void CargarArtistas() {
		basededatos.Artista[] artistas = null;
		if (_tipoLista == 0) {
			 artistas = bd.Cargar_Artistas_Lista_Seguidores(_usuario.getORMID());
		}
		else if (_tipoLista == 1) {
			 artistas = bd.Cargar_Artistas_Lista_Seguidos(_usuario.getORMID());
		}
		
		if(artistas!=null) {
			NickArtista temp;

			for (int i = 0; i < 6 && i < artistas.length; i++) {
				temp = new NickArtista(artistas[i]);
				temp.setClassName("fullSize");

				_list_NickArtista.add(temp);
			}
		}
	}
}