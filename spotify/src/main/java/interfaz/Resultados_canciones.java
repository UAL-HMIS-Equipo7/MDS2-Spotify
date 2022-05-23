package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Cancion;
import vistas.VistaResultados_canciones;

public class Resultados_canciones extends VistaResultados_canciones {
//	private Label _tituloL;
	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	private String _params;
	private iActor_comun bd = new BDPrincipal();
	
	public Resultados_canciones(String parametrosBusqueda) {
		
		_params = parametrosBusqueda;

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
		
		basededatos.Cancion[] canciones = bd.Realizar_Busqueda_Canciones(_params);
		
		Cancion temp;
		
		for (int i = 0; i < canciones.length; i++) {
			temp = new Cancion(canciones[i]);
			
			_list_Cancion.add(temp);
		}
	}
}