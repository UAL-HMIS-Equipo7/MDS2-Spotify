package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import interfaz.Cancion;
import vistas.VistaCanciones_recomendadas;

public class Canciones_recomendadas extends VistaCanciones_recomendadas {

	public Vector<Cancion> _list_Cancion = new Vector<Cancion>();
	
	private Usuario_generico _usuario;
	private iActor_comun bd = new BDPrincipal();
	
	public Canciones_recomendadas(Usuario_generico usuario) {
		
		_usuario = usuario;
		
		CargarCancionesRecomendadas();
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		if (!_list_Cancion.isEmpty())
			vl.add(_list_Cancion.firstElement());
	}
	
	public void CargarCancionesRecomendadas() {
		
		basededatos.Cancion[] canciones = bd.Cargar_Canciones_Recomendadas(_usuario.getORMID());
		
		Cancion temp;
		
		for (int i = 0; i < 4 && i < canciones.length; i++) {
			temp = new Cancion(canciones[i]);
			temp.getElement().setAttribute("width", "100%");
			temp.getElement().setAttribute("height", "100%");
			
			_list_Cancion.add(temp);
		}
	}
}