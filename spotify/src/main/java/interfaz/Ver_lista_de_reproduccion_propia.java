package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaVer_lista_de_reproduccion_propia;

public class Ver_lista_de_reproduccion_propia extends VistaVer_lista_de_reproduccion_propia {
//	private Label _editarL;
//	private Button _editarB;

	public Modificar_lista_de_reproduccion _modificar_lista_de_reproduccion;
	public Ver_lista_de_reproduccion _ver_lista_de_reproduccion;
	
	public Ver_lista_de_reproduccion_propia() {
<<<<<<< HEAD
//		_modificar_lista_de_reproduccion = new Modificar_lista_de_reproduccion();
//		_ver_lista_de_reproduccion = new Ver_lista_de_reproduccion();
=======
		//_modificar_lista_de_reproduccion = new Modificar_lista_de_reproduccion();
		_ver_lista_de_reproduccion = new Ver_lista_de_reproduccion();
>>>>>>> branch 'master' of https://github.com/mdmontesinos/MDS2-Spotify.git
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		
		hl.add(_ver_lista_de_reproduccion);
		
	}
}