package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import spotify.GestorActor;
import spotify.GestorVentana;

public class Cabecera_Administrador extends Cabecera_superior {
//	private Button _verPerfilAdministradorB;

	public Ver_perfil_propio__Administrador_ _ver_perfil_propio__Administrador_;
	private iAdministrador bd = new BDPrincipal();
	
	public Cabecera_Administrador() {
		super();
		
		this.getVerPerfilAdministradorB().setVisible(true);
		
		this.getVerPerfilAdministradorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Ver_perfil();
			}
		});
	}
	
	@Override
	public void Ver_perfil() {
		
		basededatos.Administrador administrador = bd.Obtener_Administrador(GestorActor.getIdUsuario());
		
		_ver_perfil_propio__Administrador_ = new Ver_perfil_propio__Administrador_(administrador);
		
		GestorVentana.CambiarVentana(_ver_perfil_propio__Administrador_);
	}
}