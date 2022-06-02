package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuario_Registrado;
import spotify.GestorActor;
import spotify.GestorVentana;

public class Cabecera_Usuario_Registrado extends Cabecera_superior {
//	private Button _verPerfilUsuarioB;
	
	public Ver_perfil_propio__Usuario_Registrado_ _ver_perfil_propio__Usuario_Registrado_;
	
	private iUsuario_Registrado bd = new BDPrincipal();
	
	public Cabecera_Usuario_Registrado() {

		super();
		
		this.getVerPerfilUsuarioB().setVisible(true);
		
		this.getVerPerfilUsuarioB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				Ver_perfil();
			}
		});
	}
	
	@Override
	public void Ver_perfil() {
		
		basededatos.Usuario_Registrado usuario = bd.Obtener_Usuario(GestorActor.getIdUsuario());
		
		_ver_perfil_propio__Usuario_Registrado_ = new Ver_perfil_propio__Usuario_Registrado_(usuario);
		
		GestorVentana.CambiarVentana(_ver_perfil_propio__Usuario_Registrado_);
	}
}