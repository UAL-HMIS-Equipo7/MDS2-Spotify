package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;

import vistas.VistaCreditos;

public class Creditos extends VistaCreditos {
//	private Image _cancionImg;
//	private Label _tituloL;
//	private Label _tituloAlbumL;
//	private Label _compositorL;
//	private Label _productorL;
//	private Label _interpreteL;
//	private Label _ficheroL;
//	private Label _estiloL;
//	private Button _cerrarB;

	public Creditos(Dialog ventanaModal) {
		
		this.getCerrarB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				ventanaModal.close();
				
			}
		});
	}
}