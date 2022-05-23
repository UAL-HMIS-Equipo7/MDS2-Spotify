package interfaz;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import vistas.VistaVer_lista_seguidos;

public class Ver_lista_seguidos extends VistaVer_lista_seguidos {
//	private ScrollBar _navegacionSB;
	public Usuarios _usuarios;
	public Artistas _artistas;
	
	public Ver_lista_seguidos(Usuario_generico usuario) {
		
		Scroller scroll = this.getNavegacionSB();
		
		_usuarios = new Usuarios(1, usuario);
		_artistas = new Artistas(1, usuario);
		
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