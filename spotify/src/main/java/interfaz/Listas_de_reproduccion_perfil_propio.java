package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.Crear_lista_de_reproduccion;

public class Listas_de_reproduccion_perfil_propio extends Listas_de_reproduccion_perfil {
//	private Button _crearListaB;

	public Crear_lista_de_reproduccion _crear_lista_de_reproduccion;
	
	public Listas_de_reproduccion_perfil_propio(VerticalLayout layoutPadre) {
		super(layoutPadre);
		
		this.getCrearListaB().setVisible(true);
		
		this.getCrearListaB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_crear_lista_de_reproduccion = new Crear_lista_de_reproduccion(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_crear_lista_de_reproduccion);
				
			}
		});
	}
}