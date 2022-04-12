package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_menu_de_altas;

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
	
	public Ver_menu_de_altas(VerticalLayout layoutPadre, Dialog ventanaModal) {
		
		this.getCancionB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				layoutPadre.removeAll();
				
				_edicion_y_Creacion_cancion = new Edicion_y_Creacion_cancion(layoutPadre);
				layoutPadre.add(_edicion_y_Creacion_cancion);
				
				ventanaModal.close();
			}
		});
		
		this.getEstiloB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				layoutPadre.removeAll();

				_dar_de_alta_estilo = new Dar_de_alta_estilo(layoutPadre);
				layoutPadre.add(_dar_de_alta_estilo);

				ventanaModal.close();
			}
		});
		
		this.getAlbumB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				layoutPadre.removeAll();

				_dar_de_alta_album = new Dar_de_alta_album(layoutPadre);
				layoutPadre.add(_dar_de_alta_album);

				ventanaModal.close();
			}
		});
		
		this.getArtistaB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {

				layoutPadre.removeAll();

				_edicion_y_Creacion_artista = new Edicion_y_Creacion_artista(layoutPadre);
				layoutPadre.add(_edicion_y_Creacion_artista);

				ventanaModal.close();
			}
		});
		
		this.getCerrarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				ventanaModal.close();

			}
		});
	}
}