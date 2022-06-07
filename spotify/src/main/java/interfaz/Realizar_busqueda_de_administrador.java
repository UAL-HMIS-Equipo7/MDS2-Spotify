package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaRealizar_busqueda_de_administrador;

public class Realizar_busqueda_de_administrador extends VistaRealizar_busqueda_de_administrador {
//	private Label _errorL;
//	private Button _atrasB;
	public Canciones_administrador _canciones_administrador;
	public Albumes_administrador _albumes_administrador;
	public Artistas_administrador _artistas_administrador;
	public Usuarios_administrador _usuarios_administrador;
	
	public Realizar_busqueda_de_administrador(String parametrosBusqueda) {
		_canciones_administrador = new Canciones_administrador(parametrosBusqueda);
		_albumes_administrador = new Albumes_administrador(parametrosBusqueda);
		_artistas_administrador = new Artistas_administrador(parametrosBusqueda);
		_usuarios_administrador = new Usuarios_administrador(parametrosBusqueda);
		
		this.getErrorL().setVisible(false);
		
		HorizontalLayout hlcs = this.getContenedorSuperior();
		hlcs.add(_canciones_administrador);
		hlcs.add(_albumes_administrador);
		HorizontalLayout hlci = this.getContenedorInferior();
		hlci.add(_artistas_administrador);
		hlci.add(_usuarios_administrador);
		
		if (_canciones_administrador._list_Cancion_administrador.isEmpty() &&
			_albumes_administrador._list_Album_administrador.isEmpty() &&
			_artistas_administrador._list_Artista_administrador.isEmpty() &&
			_usuarios_administrador._list_Usuario_administrador.isEmpty()) {
			this.getErrorL().setVisible(true);
		} else {
			this.getErrorL().setVisible(false);
		}
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorVentana.Atras();
			}
		});
	}
}