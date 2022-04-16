package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iArtista;

@CssImport("./styles/shared-styles.css")
public class Artista extends Actor_comun {
//	public iArtista _iArtista;
	public Cabecera_Artista _cabecera_Artista;
	
	public Artista() {
		super();
		
		VerticalLayout vl = this.getLayoutCabecera().as(VerticalLayout.class);
		
		_cabecera_Artista = new Cabecera_Artista(getLayoutPrincipal().as(VerticalLayout.class));
		//_cabecera_Artista.setClassName("cabecera");
		
		_cabecera_Artista.getInicioB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Inicializar(false);
				
			}
		});
		
		
		vl.add(_cabecera_Artista);
	}
}