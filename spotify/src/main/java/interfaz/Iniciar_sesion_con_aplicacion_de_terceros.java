package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;

import spotify.GestorActor;
import vistas.VistaIniciar_sesion_con_aplicacion_de_terceros;

public class Iniciar_sesion_con_aplicacion_de_terceros extends VistaIniciar_sesion_con_aplicacion_de_terceros {

	public Servicio_de_autenticacion_externo _Servicio_de_autenticacion_externo;
	
	public Iniciar_sesion_con_aplicacion_de_terceros() {
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}
}