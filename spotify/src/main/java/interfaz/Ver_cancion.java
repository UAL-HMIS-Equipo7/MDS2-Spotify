package interfaz;

import java.util.stream.Collectors;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iActor_comun;
import spotify.GestorActor;
import spotify.GestorArchivos;
import vistas.VistaVer_cancion;

@CssImport("./styles/shared-styles.css")
public class Ver_cancion extends VistaVer_cancion {
//	private event _marcar_cancion_como_favorita;
//	private event _aniadir_cancion_a_lista_de_reproduccion;
//	private Label _tituloL;
//	private Button _aniadirFavoritosB;
//	private Label _aniadirListaL;
//	private Button _aniadirListaB;
//	private Label _creditosTituloL;
//	private Label _creditosTituloCancionL;
//	private Label _creditosTituloAlbumL;
//	private Label _creditosCompositorL;
//	private Label _creditosProductorL;
//	private Label _creditosInterpreteL;
//	private Label _creditosFicheroL;
//	private Label _creditoEstiloL;
//	private Image _fotoCancionImg;
	
	iActor_comun bd = new BDPrincipal();
	basededatos.Cancion _cancion;
	basededatos.Lista_de_reproduccion[] _listas;
	
	boolean _esFavorita = false;
	
	public Ver_cancion(basededatos.Cancion cancion) {
		
		_cancion = cancion;
		
		Cargar_cancion();
		
		Comprobar_si_favorita();
		
		Image img = new Image(GestorArchivos.CargarImagen(_cancion.getFicheroMultimediaAltaCalidadRuta()),
				_cancion.getFicheroMultimediaAltaCalidadRuta());
		img.setClassName("max500");
		getFotoCancionImgLayout().add(img);
		
		this.getTituloL().setText(_cancion.getTitulo());
		this.getCreditosTituloCancionL().setText("Título Canción: " + _cancion.getTitulo());
		if (_cancion.getIncluida_en_albumes() != null) {
			this.getCreditosTituloAlbumL().setText("Título Álbum: " + _cancion.getIncluida_en_albumes().getTitulo());
		}
		else {
			this.getCreditosTituloAlbumL().setText("Título Álbum: --");
		}
		this.getCreditosCompositorL().setText("Compositores: " + _cancion.getCompositores());
		this.getCreditosProductorL().setText("Productores: " + _cancion.getProductores());
		
		StringBuilder intepretes = new StringBuilder();
		basededatos.Artista[] artistas = _cancion.intepretes.toArray();
		
		for (int i = 0; i < artistas.length; i++) {
			intepretes.append(artistas[i].getNick() + ", ");
		}
		
		this.getCreditosInterpreteL().setText("Intérpretes: " + intepretes.toString());
		
		basededatos.Estilo[] estilo = _cancion.estilos.toArray();
		
		if (estilo.length > 0) {
			this.getCreditoEstiloL().setText("Estilo: " + estilo[0].getNombre());
		}
		else {
			this.getCreditoEstiloL().setText("Estilo: --");
		}
		
		this.getCreditosFicheroL().setText("Fichero: " + _cancion.getFicheroMultimediaRuta());
		
		if (_esFavorita) {
			this.getAniadirFavoritosB().setText("Eliminar de favoritos");
		}
		else {
			this.getAniadirFavoritosB().setText("Añadir a favoritos");
		}
		
		this.getAniadirFavoritosB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				if (_esFavorita) {
					Quitar_cancion_favoritos();
				}
				else {
					Marcar_cancion_como_favorita();
				}
				
			}
		});
		

		//Este método hay que rehacerlo
		
//		for(int i=0; i<this.getAniadirListaB().getPageSize(); i++) {
//			this.getAniadirListaB().getElement().addEventListener("click", e ->{
//				
//				Aniadir_cancion_a_lista_de_reproduccion(e);
//				
//			});
//			
//		}

	}
	
	public void Cargar_cancion() {
		_cancion = bd.Obtener_Cancion(_cancion.getORMID());
	}
	
	public void Cargar_Listas() {
		_listas = bd.Cargar_Listas_Usuario(GestorActor.getIdUsuario());
	}
	
	public void Comprobar_si_favorita() {
		_esFavorita = bd.Comprobar_Cancion_Favorita(GestorActor.getIdUsuario(), _cancion.getORMID());
	}

	public void Marcar_cancion_como_favorita() {
		bd.Marcar_cancion_favorita(GestorActor.getIdUsuario(), _cancion.getORMID());
		_esFavorita = true;
		this.getAniadirFavoritosB().setText("Eliminar de favoritos");
	}
	
	public void Quitar_cancion_favoritos() {
		bd.Quitar_cancion_favoritos(GestorActor.getIdUsuario(), _cancion.getORMID());
		_esFavorita = false;
		this.getAniadirFavoritosB().setText("Añadir a favoritos");
	}

	public void Aniadir_cancion_a_lista_de_reproduccion(int idLista) {
		bd.Aniadir_cancion_a_lista(_cancion.getORMID(), idLista);
	}
}