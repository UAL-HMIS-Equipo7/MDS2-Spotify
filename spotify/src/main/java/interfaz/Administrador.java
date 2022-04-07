package interfaz;

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
		//_menu_Administracion = new Menu_Administracion();
		
		VerticalLayout vl = this.getLayoutCabecera().as(VerticalLayout.class);
		vl.add(_cabecera_Administrador);
		
	}
}