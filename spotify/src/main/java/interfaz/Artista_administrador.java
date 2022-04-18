package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaArtista_administrador;

public class Artista_administrador extends VistaArtista_administrador {
//	private Label _artistaL;
//	private Image _artistaImg;
//	private Button _editarArtistaB;
//	private Button _eliminarArtistaB;

	public Confirmacion_eliminacion _confirmacion_eliminacion;
	public Edicion_y_Creacion_artista _edicion_y_Creacion_artista;

	public Artista_administrador() {
		
		this.getEditarArtistaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				

				_edicion_y_Creacion_artista = new Edicion_y_Creacion_artista();
				GestorVentana.CambiarVentana(_edicion_y_Creacion_artista);
			}
		});

		this.getEliminarArtistaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

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