package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_ajeno_de_artista extends Ver_perfil_ajeno {
//	private event _seguir_artista;
	public Panel_artista _panel_artista;

	public Ver_perfil_ajeno_de_artista() {
		super();
		_panel_artista = new Panel_artista();
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_panel_artista);
	}
	
	public void Seguir_artista() {
		throw new UnsupportedOperationException();
	}
}