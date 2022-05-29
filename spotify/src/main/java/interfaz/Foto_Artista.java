package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorArchivos;
import spotify.GestorVentana;
import vistas.VistaFoto_artista;

@CssImport("./styles/shared-styles.css")
public class Foto_Artista extends VistaFoto_artista {
//	private Button _fotoB;

	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	
	public Foto_Artista(basededatos.Artista artista) {
		
		this.getNickB().setVisible(false);
		
		Image img = new Image(GestorArchivos.CargarImagen(artista.getFotoRuta()),artista.getFotoRuta());
		img.setClassName("max350");
		img.addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista(artista);
				
				GestorVentana.CambiarVentana(_ver_perfil_ajeno_de_artista);
			}
		});
		
		getFotoImgLayout().add(img);
	}
}