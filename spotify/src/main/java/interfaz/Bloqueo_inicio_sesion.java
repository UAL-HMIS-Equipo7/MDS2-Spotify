package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaBloqueo_inicio_sesion;

public class Bloqueo_inicio_sesion extends VistaBloqueo_inicio_sesion {
//	private Image _alertaImg;
//	private Label _errorL;
//	private Label _tiempoL;
//	private Button _atrasB
	
	public Bloqueo_inicio_sesion() {
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Como implementamos el tema de volver atrás??
				
				
				//llamar al Inicialize de Cibernauta??
			}
		});
	}
}