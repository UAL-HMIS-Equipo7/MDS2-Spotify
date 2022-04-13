package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Cabecera_Usuario_Registrado extends Cabecera_superior {
//	private Button _verPerfilUsuarioB;
	
	public Ver_perfil_propio__Usuario_Registrado_ _ver_perfil_propio__Usuario_Registrado_;
	
	public Cabecera_Usuario_Registrado(VerticalLayout layoutPadre) {

		super(layoutPadre);
		
		this.getVerPerfilUsuarioB().setVisible(true);
		
		this.getVerPerfilUsuarioB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {

				_ver_perfil_propio__Usuario_Registrado_ = new Ver_perfil_propio__Usuario_Registrado_(layoutPadre);

				layoutPadre.removeAll();
				layoutPadre.add(_ver_perfil_propio__Usuario_Registrado_);
			}
		});
	}
}