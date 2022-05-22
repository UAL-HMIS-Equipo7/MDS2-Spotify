package interfaz;


import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Reproductor__Cibernauta_ extends Reproductor {
//	private Label _tituloL;
//	private Button _creditosB;

	public Creditos _creditos;
	
	public Reproductor__Cibernauta_() {
		
		super();
		
		this.getTituloB().setVisible(false);
		
		this.getCreditosB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				Dialog ventanaModal = new Dialog();
				
				_creditos = new Creditos(ventanaModal, _cancion);
				
				ventanaModal.add(_creditos);
				ventanaModal.open();
				
			}
		});
		
	}
}