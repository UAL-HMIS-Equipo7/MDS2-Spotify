package interfaz;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Usuario_generico;
import vistas.VistaVer_lista_seguidores;

@CssImport("./styles/shared-styles.css")
public class Ver_lista_seguidores extends VistaVer_lista_seguidores {
//	private ScrollBar _navegacionSB;
	public Artistas _artistas;
	public Usuarios _usuarios;
	
	public Ver_lista_seguidores(Usuario_generico usuario) {

		Scroller scroll = this.getNavegacionSB();
		
		_usuarios = new Usuarios(0, usuario);
		_artistas = new Artistas(0, usuario);
		
		VerticalLayout vlizq = new VerticalLayout();
		vlizq.setClassName("divScroll500");
		VerticalLayout vlder = new VerticalLayout();
		vlder.setClassName("divScroll500");
		
		HorizontalLayout hl = new HorizontalLayout();
		
		vlizq.add(_usuarios);
		vlder.add(_artistas);
		hl.add(vlizq);
		hl.add(vlder);
		
		scroll.setContent(hl);
	}
}