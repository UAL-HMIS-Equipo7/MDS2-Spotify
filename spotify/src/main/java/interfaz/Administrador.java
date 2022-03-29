package interfaz;

//import basededatos.iAdministrador;

public class Administrador extends Actor_comun {
//	private Button _menuAdministracionB;
//	public iAdministrador _iAdministrador;
	public Cabecera_Administrador _cabecera_Administrador;
	public Menu_Administracion _menu_Administracion;
	
	public Administrador() {
		// TODO Auto-generated constructor stub
		super();
		
		_cabecera_Administrador = new Cabecera_Administrador();
		_menu_Administracion = new Menu_Administracion();
		
		this.getMenuAdministracionB().setVisible(true);
	}
}