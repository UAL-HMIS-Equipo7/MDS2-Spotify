package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import interfaz.Foto_Artista;
import vistas.VistaResultados_artistas;

public class Resultados_artistas extends VistaResultados_artistas {
//	private Label _tituloL;
	public Vector<Foto_Artista> _list_Artista = new Vector<Foto_Artista>();
	
	public Resultados_artistas() {

		CargarFotoArtistas();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 4 && i < _list_Artista.size(); i++) {
			hlSup.add(_list_Artista.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 4; i < 8  && i < _list_Artista.size(); i++) {
			hlInf.add(_list_Artista.get(i));
		}
	}
	
	public void CargarFotoArtistas() {
		Foto_Artista temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Foto_Artista();
			
			_list_Artista.add(temp);
		}
	}
}