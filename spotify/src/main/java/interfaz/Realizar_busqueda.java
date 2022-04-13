package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaRealizar_busqueda;

public class Realizar_busqueda extends VistaRealizar_busqueda {
//	private Label _mensajeL;
//	private Label _errorL;

	public Resultados_canciones _resultados_canciones;
	public Resultados_listas_de_reproduccion _resultados_listas_de_reproduccion;
	public Resultados_artistas _resultados_artistas;
	
	public Realizar_busqueda(VerticalLayout layoutPadre) {
		_resultados_canciones = new Resultados_canciones();
		_resultados_artistas = new Resultados_artistas();
		_resultados_listas_de_reproduccion = new Resultados_listas_de_reproduccion();
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		hl.add(_resultados_canciones);
		hl.add(_resultados_listas_de_reproduccion);
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_resultados_artistas);
		
	}
}