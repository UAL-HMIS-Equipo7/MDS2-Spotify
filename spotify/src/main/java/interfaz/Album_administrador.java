package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaAlbum_administrador;

@CssImport("./styles/shared-styles.css")
public class Album_administrador extends VistaAlbum_administrador {
//	private Label _albumL;
//	private Image _albumImg;
//	private Button _editarAlbumB;
//	private Button _eliminarAlbumB;
	public Editar_album _editar_album;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	basededatos.Album _album;
	iAdministrador bd = new BDPrincipal();
	
	public Album_administrador(basededatos.Album album) {
		
		_album = album;
		
		Image img = new Image(GestorArchivos.CargarImagen(_album.getImagenRuta()), _album.getImagenRuta());
		img.setClassName("imagenResultadosAdministrador");
		getAlbumImgLayout().add(img);
			
		this.getAlbumL().setText(_album.getTitulo());
		
	
		this.getEditarAlbumB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				_editar_album = new Editar_album(_album);
				GestorVentana.CambiarVentana(_editar_album);
			}
		});

		this.getEliminarAlbumB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();

				_confirmacion_eliminacion = new Confirmacion_eliminacion(ventanaModal, _album.getTitulo()) {
					@Override
					public void Eliminar_elemento() {
						bd.Borrar_Album(_album.getORMID());
					}
					
				};

				ventanaModal.add(_confirmacion_eliminacion);
				ventanaModal.open();
			}
		});
	}
}