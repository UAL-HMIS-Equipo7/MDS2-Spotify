package interfaz;

import vistas.VistaCabecera_superior;

public class Cabecera_superior extends VistaCabecera_superior {
//	private Button _inicioB;
//	private Label _telefonoL;
//	private Button _contactoB;
//	private Button _buscarB;
//	private TextField _buscarTF;
//	private Image _perfilImg;
//	private Button _cerrarSesionB;
//	private event _cerrar_sesion;
//	private Button _volverAInicioB;

	public Contactar_con_la_empresa _contactar_con_la_empresa;
	public Realizar_busqueda _realizar_busqueda;
	
	public Cabecera_superior() {
		
		_contactar_con_la_empresa = new Contactar_con_la_empresa();
		_realizar_busqueda = new Realizar_busqueda();
		
		this.getVerPerfilAdministradorB().setVisible(false);
		this.getVerPerfilArtistaB().setVisible(false);
		this.getVerPerfilUsuarioB().setVisible(false);
	}

	public void Cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}