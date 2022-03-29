package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Cancion_a_eliminar_album;
import vistas.VistaCanciones_en_album;

public class Canciones_en_album extends VistaCanciones_en_album {
//	private event _aniadir_cancion_album;
//	private Label _tituloL;
//	private TextField _aniadirCancionTF;
//	private Button _aniadirCancionB;
//	private Button _anteriorB;
//	private Button _posteriorB;

	public Vector<Cancion_a_eliminar_album> _list_Cancion_a_eliminar_album = new Vector<Cancion_a_eliminar_album>();
	
	public Canciones_en_album() {
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		
		//Testing
		_list_Cancion_a_eliminar_album.add(new Cancion_a_eliminar_album());
		
		vl.add(_list_Cancion_a_eliminar_album.firstElement());
		
		//Luego para el anterior y el posterior, usar el metodo vl.replace para cambiar entre una cancion y otra
	}

	public void Aniadir_cancion_album() {
		throw new UnsupportedOperationException();
	}
}