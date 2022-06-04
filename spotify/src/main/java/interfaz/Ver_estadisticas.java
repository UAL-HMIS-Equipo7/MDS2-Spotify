package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import vistas.VistaVer_estadisticas;

public class Ver_estadisticas extends VistaVer_estadisticas {
//	private Label _tituloL;
//	private Label _tiempoTituloL;
//	private Label _tiempoL;
//	private Label _numCancionesTituloL;
//	private Label _numCancionesL;
//	private Label _numArtistasTituloL;
//	private Label _numArtistasL;
	public Artistas_mas_escuchados _artistas_mas_escuchados;
	public Estilos_mas_escuchados _estilos_mas_escuchados;
	
	iActor_comun bd = new BDPrincipal();
	
	int _numCanciones = -1;
	
	basededatos.Usuario_generico _usuario;
	
	public Ver_estadisticas(basededatos.Usuario_generico usuario) {
		
		_usuario = usuario;
		
		Cargar_ultimas_reproducidas();
		
		this.getNumCancionesL().setText(Integer.toString(_numCanciones));
		
		_artistas_mas_escuchados = new Artistas_mas_escuchados(_usuario);
		_estilos_mas_escuchados = new Estilos_mas_escuchados(_usuario);
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		
		hl.add(_artistas_mas_escuchados);
		hl.add(_estilos_mas_escuchados);
	}
	
	public void Cargar_ultimas_reproducidas() {
		basededatos.Cancion[] ultimas = bd.Cargar_Ultimas_Canciones_Reproducidas(_usuario.getORMID());
		
		if (ultimas != null) {
			_numCanciones = ultimas.length;
		}
	}
}