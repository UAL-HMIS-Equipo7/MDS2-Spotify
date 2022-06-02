package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Foto_Artista;
import vistas.VistaResultados_artistas;

@CssImport("./styles/shared-styles.css")
public class Resultados_artistas extends VistaResultados_artistas {
//	private Label _tituloL;
	public Vector<Foto_Artista> _list_Artista = new Vector<Foto_Artista>();
	
	private String _params;
	private iActor_comun bd = new BDPrincipal();
	
	public Resultados_artistas(String parametrosBusqueda) {
		
		_params = parametrosBusqueda;

		CargarArtistas();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 4 && i < _list_Artista.size(); i++) {
			hlSup.add(_list_Artista.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 4; i < 8  && i < _list_Artista.size(); i++) {
			hlInf.add(_list_Artista.get(i));
		}
	}
	
	public void CargarArtistas() {
		
		basededatos.Artista[] artistas = bd.Realizar_Busqueda_Artistas(_params);
		
		Foto_Artista temp;
		
		for (int i = 0; i < artistas.length; i++) {
			temp = new Foto_Artista(artistas[i]);
			temp.setClassName("max350");
			
			_list_Artista.add(temp);
		}
	}
}