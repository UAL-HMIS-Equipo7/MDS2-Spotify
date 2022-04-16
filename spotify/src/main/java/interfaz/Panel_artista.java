package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaPanel_artista;

public class Panel_artista extends VistaPanel_artista {
//	private Label _estiloL;
	public Canciones_mas_exitosas _canciones_mas_exitosas;
	public Albumes _albumes;
	public Eventos _eventos;
	public Artistas_similares _artistas_similares;
	
	public Panel_artista(VerticalLayout layoutPadre) {

		 _canciones_mas_exitosas = new Canciones_mas_exitosas(layoutPadre);
		 _albumes = new Albumes(layoutPadre);
		 _eventos = new Eventos(layoutPadre);
		_artistas_similares = new Artistas_similares(layoutPadre);
		
		HorizontalLayout hl = this.getContenedorSuperior();
		hl.add(_albumes);
		hl.add(_canciones_mas_exitosas);
		HorizontalLayout hl2 = this.getContenedorInferior();
		hl2.add(_artistas_similares);
		hl2.add(_eventos);
		
	}
}