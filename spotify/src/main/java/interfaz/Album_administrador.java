package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaAlbum_administrador;

public class Album_administrador extends VistaAlbum_administrador {
//	private Label _albumL;
//	private Image _albumImg;
//	private Button _editarAlbumB;
//	private Button _eliminarAlbumB;
	public Editar_album _editar_album;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	public Album_administrador() {
		
		this.getEditarAlbumB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				

				_editar_album = new Editar_album();
				GestorVentana.CambiarVentana(_editar_album);
			}
		});

		this.getEliminarAlbumB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();

				_confirmacion_eliminacion = new Confirmacion_eliminacion(ventanaModal);

				ventanaModal.add(_confirmacion_eliminacion);
				ventanaModal.open();

			}
		});
	}
}