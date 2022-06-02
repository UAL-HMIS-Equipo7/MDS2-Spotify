package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import spotify.GestorVentana;

//import basededatos.iAdministrador;

public class Administrador extends Actor_comun {
//	private Button _menuAdministracionB;
//	public iAdministrador _iAdministrador;
	public Cabecera_Administrador _cabecera_Administrador;
	public Menu_Administracion _menu_Administracion;
	
	private basededatos.Administrador _administrador;
	
	public Administrador(basededatos.Administrador administrador) {
		super(administrador, true);
		
		_administrador = administrador;
		
		VerticalLayout vl = this.getLayoutCabecera().as(VerticalLayout.class);
		
		_cabecera_Administrador = new Cabecera_Administrador();
		
		_cabecera_Administrador.getInicioB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Inicializar();
			}
		});
		
		
		vl.add(_cabecera_Administrador);
		
		this.getMenuAdministracionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				
				_menu_Administracion = new Menu_Administracion(_administrador);
				GestorVentana.CambiarVentana(_menu_Administracion);
			}
		});
	}
	
	void Inicializar() {
		
		Inicializar(true);
		
		this.getMenuAdministracionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				_menu_Administracion = new Menu_Administracion(_administrador);
				GestorVentana.CambiarVentana(_menu_Administracion);
			}
		});
	}
}