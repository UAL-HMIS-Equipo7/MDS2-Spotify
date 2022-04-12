package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRealizar_busqueda_de_administrador;

public class Realizar_busqueda_de_administrador extends VistaRealizar_busqueda_de_administrador {
//	private Label _errorL;
//	private Button _atrasB;
	public Canciones_administrador _canciones_administrador;
	public Albumes_administrador _albumes_administrador;
	public Artistas_administrador _artistas_administrador;
	public Usuarios_administrador _usuarios_administrador;
	
	public Realizar_busqueda_de_administrador(VerticalLayout layoutPadre) {
		_canciones_administrador = new Canciones_administrador(layoutPadre);
		_albumes_administrador = new Albumes_administrador(layoutPadre);
		_artistas_administrador = new Artistas_administrador(layoutPadre);
		_usuarios_administrador = new Usuarios_administrador(layoutPadre);
		
		HorizontalLayout hlcs = this.getContenedorSuperior();
		hlcs.add(_canciones_administrador);
		hlcs.add(_albumes_administrador);
		HorizontalLayout hlci = this.getContenedorInferior();
		hlci.add(_artistas_administrador);
		hlci.add(_usuarios_administrador);
	}
}