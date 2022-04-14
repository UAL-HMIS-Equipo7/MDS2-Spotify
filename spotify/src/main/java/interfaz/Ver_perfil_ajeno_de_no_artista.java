package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Ver_perfil_ajeno_de_no_artista extends Ver_perfil_ajeno {
//	private event _seguir_usuario;

	public Ver_perfil_ajeno_de_no_artista(VerticalLayout layoutPadre) {
		
		super(layoutPadre);
		
		this.getSeguirB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				Seguir_usuario();
				
			}
		});
		
				
	}
	public void Seguir_usuario() {
		throw new UnsupportedOperationException();
	}
}