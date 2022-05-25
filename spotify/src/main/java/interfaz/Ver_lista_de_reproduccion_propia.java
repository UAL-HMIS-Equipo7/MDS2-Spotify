package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;
import vistas.VistaVer_lista_de_reproduccion_propia;

public class Ver_lista_de_reproduccion_propia extends VistaVer_lista_de_reproduccion_propia {
//	private Label _editarL;
//	private Button _editarB;

	public Modificar_lista_de_reproduccion _modificar_lista_de_reproduccion;
	public Ver_lista_de_reproduccion _ver_lista_de_reproduccion;
	
	
	public Ver_lista_de_reproduccion_propia(basededatos.Lista_de_reproduccion lista) {

		_ver_lista_de_reproduccion = new Ver_lista_de_reproduccion(lista);
		_ver_lista_de_reproduccion.getSeguirB().setVisible(false);
		
		HorizontalLayout hl = this.getVaadinHorizontalLayout();
		
		hl.add(_ver_lista_de_reproduccion);
		
		this.getEditarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				
				_modificar_lista_de_reproduccion = new Modificar_lista_de_reproduccion(lista);
				GestorVentana.CambiarVentana(_modificar_lista_de_reproduccion);
			}
		});
		
	}
}