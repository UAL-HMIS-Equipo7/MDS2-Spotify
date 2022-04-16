package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaFoto_artista;

public class Foto_Artista extends VistaFoto_artista {
//	private Button _fotoB;

	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	
	public Foto_Artista(VerticalLayout layoutPadre) {
		
		this.getNickB().setVisible(false);
		
		this.getFotoB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				
				_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_ver_perfil_ajeno_de_artista);
			}
		});
	}
}