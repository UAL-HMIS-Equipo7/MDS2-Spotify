package interfaz;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

//import basededatos.iAdministrador;

public class Administrador extends Actor_comun {
//	private Button _menuAdministracionB;
//	public iAdministrador _iAdministrador;
	public Cabecera_Administrador _cabecera_Administrador;
	public Menu_Administracion _menu_Administracion;
	
	public Administrador() {
		super(true);
		
		_cabecera_Administrador = new Cabecera_Administrador();
		
		_cabecera_Administrador.getInicioB().addClickListener(new ComponentEventListener<ClickEvent<Image>>() {

			@Override
			public void onComponentEvent(ClickEvent<Image> event) {
				Inicializar();

			}
		});
		
		VerticalLayout vl = this.getLayoutCabecera().as(VerticalLayout.class);
		vl.add(_cabecera_Administrador);
		
		this.getMenuAdministracionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {
			
			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getLayoutPrincipal().as(VerticalLayout.class);
				
				vl.removeAll();
				
				_menu_Administracion = new Menu_Administracion(vl);
				vl.add(_menu_Administracion);
			}
		});
	}
	
	void Inicializar() {
		
		Inicializar(true);
		
		this.getMenuAdministracionB().addClickListener(new ComponentEventListener<ClickEvent<Button>>() {

			@Override
			public void onComponentEvent(ClickEvent<Button> event) {
				VerticalLayout vl = getLayoutPrincipal().as(VerticalLayout.class);

				vl.removeAll();

				_menu_Administracion = new Menu_Administracion(vl);
				vl.add(_menu_Administracion);
			}
		});
	}
}