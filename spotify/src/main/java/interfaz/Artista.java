package interfaz;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iArtista;

@CssImport("./styles/shared-styles.css")
public class Artista extends Actor_comun {
//	public iArtista _iArtista;
	public Cabecera_Artista _cabecera_Artista;
	
	public Artista() {
		// TODO Auto-generated constructor stub
		super();
		
		_cabecera_Artista = new Cabecera_Artista();
		_cabecera_Artista.setClassName("cabecera");
		
		VerticalLayout vl = this.getLayoutPrincipal().as(VerticalLayout.class);
		
		vl.addComponentAsFirst(_cabecera_Artista);
	}
}