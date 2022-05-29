package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;

import spotify.GestorArchivos;
import vistas.VistaCreditos;

@CssImport("./styles/shared-styles.css")
public class Creditos extends VistaCreditos {
//	private Image _cancionImg;
//	private Label _tituloL;
//	private Label _tituloAlbumL;
//	private Label _compositorL;
//	private Label _productorL;
//	private Label _interpreteL;
//	private Label _ficheroL;
//	private Label _estiloL;
//	private Button _cerrarB;

	public Creditos(Dialog ventanaModal, basededatos.Cancion cancion) {
		
		Image img = new Image(GestorArchivos.CargarImagen(cancion.getFicheroMultimediaAltaCalidadRuta()),
				cancion.getFicheroMultimediaAltaCalidadRuta());
		img.setClassName("max150");
		this.getCancionImgLayout().add(img);
		
		this.getTituloL().setText(cancion.getTitulo());
		this.getTituloAlbumL().setText(cancion.getIncluida_en_albumes().getTitulo());
		this.getCompositorL().setText(cancion.getCompositores());
		this.getProductorL().setText(cancion.getProductores());
		
		StringBuilder intepretes = new StringBuilder();
		basededatos.Artista[] artistas = cancion.intepretes.toArray();
		
		for (int i = 0; i < artistas.length; i++) {
			intepretes.append(artistas[i].getNick() + ", ");
		}
		
		this.getInterpreteL().setText(intepretes.toString());
		
		basededatos.Estilo[] estilo = cancion.estilos.toArray();
		
		this.getEstiloL().setText(estilo[0].getNombre());
		
		this.getFicheroL().setText(cancion.getFicheroMultimediaRuta());
		
		this.getCerrarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				ventanaModal.close();
				
			}
		});
	}
}