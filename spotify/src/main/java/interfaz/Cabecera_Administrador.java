package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera_Administrador extends Cabecera_superior {
//	private Button _verPerfilAdministradorB;

	public Ver_perfil_propio__Administrador_ _ver_perfil_propio__Administrador_;
	
	public Cabecera_Administrador(VerticalLayout layoutPadre) {
		super(layoutPadre);
		
		this.getVerPerfilAdministradorB().setVisible(true);
		
		this.getVerPerfilAdministradorB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_ver_perfil_propio__Administrador_ = new Ver_perfil_propio__Administrador_(layoutPadre);
				
				layoutPadre.removeAll();
				layoutPadre.add(_ver_perfil_propio__Administrador_);
			}
		});
	}
}