package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaVer_estadisticas;

public class Ver_estadisticas extends VistaVer_estadisticas {
//	private Label _tituloL;
//	private Label _tiempoTituloL;
//	private Label _tiempoL;
//	private Label _numCancionesTituloL;
//	private Label _numCancionesL;
//	private Label _numArtistasTituloL;
//	private Label _numArtistasL;
	public Actor_comun _actor_comun;
	public Artistas_mas_escuchados _artistas_mas_escuchados;
	public Estilos_mas_escuchados _estilos_mas_escuchados;
	
	public Ver_estadisticas() {
		_actor_comun = new Actor_comun();
		_artistas_mas_escuchados = new Artistas_mas_escuchados();
		_estilos_mas_escuchados = new Estilos_mas_escuchados();
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		
		hl.add(_artistas_mas_escuchados);
		hl.add(_estilos_mas_escuchados);
		
	}
}