package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.Usuario_generico;
import basededatos.iActor_comun;
import spotify.GestorVentana;

public class Notificacion extends Evento {
//	private Label _nombreL;
	
	private Dialog _ventanaModal;
	private Usuario_generico _usuario;
	private basededatos.Evento _evento;
	private iActor_comun bd = new BDPrincipal();
	
	public Notificacion(Dialog ventanaModal, basededatos.Evento evento, Usuario_generico usuario) {
		
		super(evento, false);
		
		_ventanaModal = ventanaModal;
		_usuario = usuario;
		_evento = evento;
		
		this.getNombreL().setText(evento.getPublicado_por().getNick());
		this.getNombreL().setVisible(true);
		
		this.getFotoEventoImg().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
			
				RecibirNotificacion();
			}
		});
		
		this.getNombreL().getElement().addEventListener("click", e -> {
			
			RecibirNotificacion();
		});
	}
	
	public void RecibirNotificacion() {
		bd.Marcar_Notificacion_Recibida(_usuario.getORMID(), _evento.getORMID());
		
		_ver_evento = new Ver_evento(_evento);
		
		_ventanaModal.close();
		
		GestorVentana.CambiarVentana(_ver_evento);
	}
}