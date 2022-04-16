package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaCrear_lista_de_reproduccion;

public class Crear_lista_de_reproduccion extends VistaCrear_lista_de_reproduccion {
//	private event _guardar_cambios_lista;
	
	public Crear_lista_de_reproduccion(VerticalLayout layoutPadre) {
		
		this.getGuardarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Guardar_cambios_lista();
				//Volver a la anterior pantalla
				
			}
		});
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//Volver atras
				
			}
		});
		
	}

	public void Validar_datos_lista() {
		throw new UnsupportedOperationException();
	}

	public void Guardar_cambios_lista() {
		throw new UnsupportedOperationException();
	}
}