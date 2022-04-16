package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class NickArtista extends Foto_Artista {
//	private Button _nickB;
	
	public NickArtista(VerticalLayout layoutPadre) {
		super(layoutPadre);
		
		this.getNickB().setVisible(true);
		
		this.getNickB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_ver_perfil_ajeno_de_artista);
			}
		});
	}
}