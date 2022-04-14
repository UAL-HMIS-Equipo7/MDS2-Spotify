package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import vistas.VistaUltimas_canciones_reproducidas;
import vistas.VistaVer_lista_de_reproduccion;
import vistas.VistaVer_lista_de_reproduccion_propia;
@CssImport("./styles/shared-styles.css")

public class Ver_lista_de_reproduccion extends VistaVer_lista_de_reproduccion {
//	private event _compartir_lista_de_reproduccion;
//	private event _seguir_lista_de_reproduccion;
//	private Button _compartirB;
//	private Button _seguirB;
//	private Label _informacionL;
//	private Label _tituloL;
//	private Button _autorB;
	
	public Ver_perfil_ajeno_de_no_artista _ver_perfil_ajeno_de_no_artista;
	public Ver_perfil_ajeno_de_artista _ver_perfil_ajeno_de_artista;
	public Canciones_de_lista _canciones_de_lista;

	public Ver_lista_de_reproduccion() {
		
//		_ver_perfil_ajeno_de_artista = new Ver_perfil_ajeno_de_artista();
//		_ver_perfil_ajeno_de_no_artista = new Ver_perfil_ajeno_de_no_artista();
		_canciones_de_lista = new Canciones_de_lista();
		_canciones_de_lista.setClassName("fullSize");
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		
		hl.add(_canciones_de_lista);
		
		this.getSeguirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Seguir_lista_de_reproduccion();
				
			}
		});
		
		this.getCompartirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>(){
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Compartir_lista_de_reproduccion();
				
			}
		});
		
		
	}
	
	
	
	
	public void Compartir_lista_de_reproduccion() {
		throw new UnsupportedOperationException();
	}

	public void Seguir_lista_de_reproduccion() {
		throw new UnsupportedOperationException();
	}
}