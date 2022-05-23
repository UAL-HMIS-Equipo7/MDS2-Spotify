package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_ajeno_de_artista extends Ver_perfil_ajeno {
//	private event _seguir_artista;
	public Panel_artista _panel_artista;

	public Ver_perfil_ajeno_de_artista(basededatos.Artista artista) {
		super();

		_panel_artista = new Panel_artista();
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_panel_artista);

		this.getSeguirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Seguir_artista();

			}
		});

	}

	public void Seguir_artista() {
		throw new UnsupportedOperationException();
	}
}