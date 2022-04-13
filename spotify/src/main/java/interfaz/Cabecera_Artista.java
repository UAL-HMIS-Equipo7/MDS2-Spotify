package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera_Artista extends Cabecera_superior {
//	private Button _verPerfilArtistaB;

	public Ver_perfil_propio__Artista_ _ver_perfil_propio__Artista_;
	
	public Cabecera_Artista(VerticalLayout layoutPadre) {

		super(layoutPadre);
		
		this.getVerPerfilArtistaB().setVisible(true);
		
		this.getVerPerfilArtistaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				_ver_perfil_propio__Artista_ = new Ver_perfil_propio__Artista_(layoutPadre);

				layoutPadre.removeAll();
				layoutPadre.add(_ver_perfil_propio__Artista_);
			}
		});
	}
}