package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaAniadir_informacion_de_eventos;

public class Aniadir_informacion_de_eventos extends VistaAniadir_informacion_de_eventos {
//	private event _confirmar_evento;
	
	public Aniadir_informacion_de_eventos() {
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				//Ver como mandarlo de vuelta al Ver_perfil_propio_Artista
				
			}
		});
		
		this.getCancelarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				// Ver como mandarlo de vuelta al Ver_perfil_propio_Artista

			}
		});
	}

	public void Validar_informacion_evento() {
		throw new UnsupportedOperationException();
	}

	public void Confirmar_evento() {
		throw new UnsupportedOperationException();
	}
}