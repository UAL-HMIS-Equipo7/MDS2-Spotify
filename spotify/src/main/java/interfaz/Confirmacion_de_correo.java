package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorActor;
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
	
	public Confirmacion_de_correo(String email) {
		
		this.getErrorL().setVisible(false);
		
		this.getReenviarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Reenviar_correo();
			}
		});
		
		this.getConfirmarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				// TODO Validación del código de correo
				if (getCodigoTF().getValue() != null) {
					Notification.show("Correo validado");
					GestorActor.Cibernauta();
				}
				else{
					Notification.show("Validación incorrecta");
				}
			}
		});
		
		this.getAtrasB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				GestorActor.Cibernauta();
			}
		});
	}

	public void Reenviar_correo() {
		Notification.show("Se ha reenviado el correo");
	}
}