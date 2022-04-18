package interfaz;

import vistas.VistaRecomendaciones;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Canciones_recomendadas;
import interfaz.Listas_recomendadas;
import interfaz.Albumes_recomendados;

public class Recomendaciones extends VistaRecomendaciones {
//	private Label _tituloL;
	public Canciones_recomendadas _canciones_recomendadas;
	public Listas_recomendadas _listas_recomendadas;
	public Albumes_recomendados _albumes_recomendados;

	public Recomendaciones() {
		
		_canciones_recomendadas = new Canciones_recomendadas();
		_listas_recomendadas = new Listas_recomendadas();
		_albumes_recomendados = new Albumes_recomendados();
		
		_canciones_recomendadas.getStyle().set("align-self", "center");
		_canciones_recomendadas.getStyle().set("height", "30%");
		_albumes_recomendados.getStyle().set("align-self", "center");
		_albumes_recomendados.getStyle().set("height", "30%");
		_listas_recomendadas.getStyle().set("align-self", "center");
		_listas_recomendadas.getStyle().set("height", "30%");
		
		VerticalLayout vl = this.getContenedor().as(VerticalLayout.class);
		
		vl.add(_canciones_recomendadas);
		vl.add(_listas_recomendadas);
		vl.add(_albumes_recomendados);
		
		
	}
	
}