package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_album;
import vistas.VistaCanciones_a_aniadir_album;

public class Canciones_a_aniadir_album extends VistaCanciones_a_aniadir_album {
//	private event _aniadir_cancion_album;
//	private TextField _aniadirCancionTF;
//	private Button _anteriorB;
//	private Button _posteriorB;

	public Vector<Cancion_album> _list_Cancion_album = new Vector<Cancion_album>();
	
	public Canciones_a_aniadir_album() {
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		//Testing
		_list_Cancion_album.add(new Cancion_album());
		
		vl.add(_list_Cancion_album.firstElement());
		
		//Luego para el anterior y el posterior, usar el metodo vl.replace para cambiar entre una cancion y otra

	}

	public void Aniadir_cancion_album() {
		throw new UnsupportedOperationException();
	}
}