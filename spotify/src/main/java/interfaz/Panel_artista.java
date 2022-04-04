package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaPanel_artista;

public class Panel_artista extends VistaPanel_artista {
//	private Label _estiloL;
	public Ver_perfil_propio__Artista_ _ver_perfil_propio__Artista_;
	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	public Canciones_mas_exitosas _canciones_mas_exitosas;
	public Albumes _albumes;
	public Eventos _eventos;
	public Artistas_similares _artistas_similares;
	
	public Panel_artista() {
		_ver_perfil_propio__Artista_= new Ver_perfil_propio__Artista_();
		 _ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista();
		 _canciones_mas_exitosas = new Canciones_mas_exitosas();
		 _albumes = new Albumes();
		 _eventos = new Eventos();
		_artistas_similares = new Artistas_similares();
		
		HorizontalLayout hl = this.getContenedorSuperior();
		hl.add(_albumes);
		hl.add(_canciones_mas_exitosas);
		HorizontalLayout hl2 = this.getContenedorInferior();
		hl2.add(_artistas_similares);
		hl2.add(_eventos);
		
	}
}