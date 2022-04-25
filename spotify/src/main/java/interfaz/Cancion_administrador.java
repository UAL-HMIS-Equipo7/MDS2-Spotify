package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaCancion_administrador;

public class Cancion_administrador extends VistaCancion_administrador {
//	private event _aniadir_cancion_a_vista_cibernauta;
//	private Label _cancionL;
//	private Image _cancionImg;
//	private Button _editarCancionB;
//	private Button _eliminarCancionB;
//	private Button _aniadirAVistaCibernautaB;

	public Edicion_y_Creacion_cancion _edicion_y_Creacion_cancion;
	public Confirmacion_eliminacion _confirmacion_eliminacion;
	
	public Cancion_administrador() {
		
		this.getEditarCancionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				

				_edicion_y_Creacion_cancion = new Edicion_y_Creacion_cancion();
				GestorVentana.CambiarVentana(_edicion_y_Creacion_cancion);
			}
		});

		this.getEliminarCancionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Dialog ventanaModal = new Dialog();

				_confirmacion_eliminacion = new Confirmacion_eliminacion(ventanaModal) {
					@Override
					public void Eliminar_elemento() {
						System.out.println("Override cancion");
					}
					
				};

				ventanaModal.add(_confirmacion_eliminacion);
				ventanaModal.open();

			}
		});
	}

	public void Aniadir_cancion_a_vista_cibernauta() {
		throw new UnsupportedOperationException();
	}
}