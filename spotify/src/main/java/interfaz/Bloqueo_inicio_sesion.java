package interfaz;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
import vistas.VistaBloqueo_inicio_sesion;

public class Bloqueo_inicio_sesion extends VistaBloqueo_inicio_sesion {
//	private Image _alertaImg;
//	private Label _errorL;
//	private Label _tiempoL;
//	private Button _atrasB
	
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public Bloqueo_inicio_sesion() {
		
		fechaInicio = LocalDateTime.now();
		fechaFin = fechaInicio.plus(Duration.of(15, ChronoUnit.MINUTES));
		
		this.getTiempoL().setText(fechaFin.toString());
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}
}