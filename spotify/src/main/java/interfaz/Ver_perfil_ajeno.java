package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_perfil_ajeno;

public class Ver_perfil_ajeno extends VistaVer_perfil_ajeno {
//	private Label _seguidoresL;
//	private Label _seguidosL;
//	private Image _fotoImg;
//	private Label _emailL;
//	private Label _nickL;
//	private Button _seguirB;
	public Listas_de_reproduccion_perfil _listas_de_reproduccion_perfil;
	
	public  Ver_perfil_ajeno(VerticalLayout layoutPadre) {
		
		_listas_de_reproduccion_perfil = new Listas_de_reproduccion_perfil(layoutPadre);
		
		VerticalLayout vl = this.getVaadinVerticalLayout().as(VerticalLayout.class);
		vl.add(_listas_de_reproduccion_perfil);
		
		this._listas_de_reproduccion_perfil.getCrearListaB().setVisible(false);
	}
}