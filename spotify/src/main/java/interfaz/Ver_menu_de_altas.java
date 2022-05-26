package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaVer_menu_de_altas;

@CssImport("./styles/shared-styles.css")
public class Ver_menu_de_altas extends VistaVer_menu_de_altas {
//	private Button _cerrarB;
//	private Button _cancionB;
//	private Label _cancionL;
//	private Button _estiloB;
//	private Label _estiloL;
//	private Button _albumB;
//	private Label _albumL;
//	private Button _artistaB;
//	private Label _artistaL;
	public Edicion_y_Creacion_cancion _edicion_y_Creacion_cancion;
	public Dar_de_alta_estilo _dar_de_alta_estilo;
	public Dar_de_alta_album _dar_de_alta_album;
	public Edicion_y_Creacion_artista _edicion_y_Creacion_artista;
	
	private Image _cancionImg;
	private Image _estiloImg;
	private Image _albumImg;
	private Image _artistaImg;
	
	public Ver_menu_de_altas(Dialog ventanaModal) {
		
		VerticalLayout vlCancion = this.getContenedorCancion().as(VerticalLayout.class);
		
		_cancionImg = new Image(GestorArchivos.CargarImagen("img/aniadir_cancion.png"), "img/aniadir_cancion.png");
		_cancionImg.setClassName("max150");
		_cancionImg.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_edicion_y_Creacion_cancion = new Edicion_y_Creacion_cancion(null);
				GestorVentana.CambiarVentana(_edicion_y_Creacion_cancion);
				
				ventanaModal.close();
			}
		});
		
		vlCancion.add(_cancionImg);
		
		VerticalLayout vlEstilo = this.getContenedorEstilo().as(VerticalLayout.class);
		
		_estiloImg = new Image(GestorArchivos.CargarImagen("img/aniadir_estilo.png"), "img/aniadir_estilo.png");
		_estiloImg.setClassName("max150");
		_estiloImg.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				_dar_de_alta_estilo = new Dar_de_alta_estilo();
				GestorVentana.CambiarVentana(_dar_de_alta_estilo);

				ventanaModal.close();
			}
		});
		
		vlEstilo.add(_estiloImg);
		
		VerticalLayout vlAlbum = this.getContenedorAlbum().as(VerticalLayout.class);
		
		_albumImg = new Image(GestorArchivos.CargarImagen("img/aniadir_album.png"), "img/aniadir_album.png");
		_albumImg.setClassName("max150");
		_albumImg.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				_dar_de_alta_album = new Dar_de_alta_album();
				GestorVentana.CambiarVentana(_dar_de_alta_album);

				ventanaModal.close();
			}
		});
		
		vlAlbum.add(_albumImg);
		
		VerticalLayout vlArtista = this.getContenedorArtista().as(VerticalLayout.class);
		
		_artistaImg = new Image(GestorArchivos.CargarImagen("img/aniadir_artista.png"), "img/aniadir_artista.png");
		_artistaImg.setClassName("max150");
		_artistaImg.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				_edicion_y_Creacion_artista = new Edicion_y_Creacion_artista(null);
				GestorVentana.CambiarVentana(_edicion_y_Creacion_artista);

				ventanaModal.close();
			}
		});
		
		vlArtista.add(_artistaImg);
		
		this.getCerrarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				ventanaModal.close();

			}
		});
	}
}