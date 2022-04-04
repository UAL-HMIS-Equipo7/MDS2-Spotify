package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import interfaz.Cancion;
import vistas.VistaResultados_canciones;

public class Resultados_canciones extends VistaResultados_canciones {
//	private Label _tituloL;
	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	public Resultados_canciones() {

		CargarCanciones();
		
		HorizontalLayout hlSup = this.getContenedorSuperior();
		
		for (int i = 0; i < 5 && i < _list_Cancion.size(); i++) {
			hlSup.add(_list_Cancion.get(i));
		}
		
		HorizontalLayout hlInf = this.getContenedorInferior();
		
		for (int i = 5; i < 10 && i < _list_Cancion.size(); i++) {
			hlInf.add(_list_Cancion.get(i));
		}
	}
	
	public void CargarCanciones() {
		Cancion temp;
		
		for (int i = 0; i < 10; i++) {
			temp = new Cancion();
			
			_list_Cancion.add(temp);
		}
	}
}