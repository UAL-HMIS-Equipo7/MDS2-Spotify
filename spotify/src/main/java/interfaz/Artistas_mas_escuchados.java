package interfaz;

import vistas.VistaArtistas_mas_escuchados;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import interfaz.Imagen_artistas;
import spotify.GestorActor;

@CssImport("./styles/shared-styles.css")
public class Artistas_mas_escuchados extends VistaArtistas_mas_escuchados {
//	private Label _tituloL;

	public Vector<Imagen_artistas> _list_Imagen_artistas = new Vector<Imagen_artistas>();
	private iActor_comun bd = new BDPrincipal();
	
	public Artistas_mas_escuchados() {
		
		CargarArtistasMasEscuchados();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 3 && i < _list_Imagen_artistas.size(); i++) {
			hlSup.add(_list_Imagen_artistas.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 3; i < 6 && i < _list_Imagen_artistas.size(); i++) {
			hlInf.add(_list_Imagen_artistas.get(i));
		}
		
		
	}
	
	public void CargarArtistasMasEscuchados() {
		basededatos.Artista[] artistas = bd.Cargar_Artistas_Mas_Escuchados(GestorActor.getIdUsuario());
		Imagen_artistas temp;
		
		for (int i = 0; i < 6 && i < artistas.length; i++) {
			temp = new Imagen_artistas(artistas[i]);
			temp.setClassName("imagenArtista");
			
			_list_Imagen_artistas.add(temp);
		}
	}
}