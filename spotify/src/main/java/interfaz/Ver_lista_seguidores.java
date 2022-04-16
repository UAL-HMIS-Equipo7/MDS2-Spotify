package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVer_lista_seguidores;

public class Ver_lista_seguidores extends VistaVer_lista_seguidores {
//	private ScrollBar _navegacionSB;
	public Artistas _artistas;
	public Usuarios _usuarios;
	
	public Ver_lista_seguidores(VerticalLayout layoutPadre) {

		Scroller scroll = this.getNavegacionSB();
		
		_usuarios = new Usuarios(layoutPadre);
		_artistas = new Artistas(layoutPadre);
		
		VerticalLayout vlizq = new VerticalLayout();
		VerticalLayout vlder = new VerticalLayout();
		HorizontalLayout hl = new HorizontalLayout();
		
		vlizq.add(_usuarios);
		vlder.add(_artistas);
		hl.add(vlizq);
		hl.add(vlder);
		
		scroll.setContent(hl);
	}
}