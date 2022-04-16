package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends Actor_comun {
//	public iUsuario_Registrado _iUsuario_Registrado;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	
	public Usuario_Registrado() {
		super();
		
		VerticalLayout vl = this.getLayoutCabecera().as(VerticalLayout.class);
		
		_cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado(getLayoutPrincipal().as(VerticalLayout.class));
		
		_cabecera_Usuario_Registrado.getInicioB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Inicializar(false);
				
			}
		});
		
		vl.add(_cabecera_Usuario_Registrado);
	}
}