package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaConfirmacion_de_correo;

public class Confirmacion_de_correo extends VistaConfirmacion_de_correo {
//	private TextField _codigoTF;
//	private Button _confirmarB;
//	private Button _reenviarB;
//	private Button _atrasB;
//	private Label _errorL;
//	private event _reenviar_correo;
//	private Label _tituloL;
	public Servicio_de_Correo_Electronico _servicio_de_Correo_Electronico;
	
	public Confirmacion_de_correo() {
		
	}
	
	public Confirmacion_de_correo(VerticalLayout layoutPadre) {
		
		
		this.getReenviarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Reenviar_correo
				
			}
		});
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación del código de correo, donde mandamos de vuelta la interfaz?? Le iniciamos sesión automaticamente?
				
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Como implementamos el tema de volver atrás??
				
				
				//llamar al Inicialize de Cibernauta??
			}
		});
	}

	public void Reenviar_correo() {
		throw new UnsupportedOperationException();
	}
}