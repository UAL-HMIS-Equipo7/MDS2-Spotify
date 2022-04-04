package interfaz;

//import basededatos.iUsuario_Registrado;

public class Usuario_Registrado extends Actor_comun {
//	public iUsuario_Registrado _iUsuario_Registrado;
	public Cabecera_Usuario_Registrado _cabecera_Usuario_Registrado;
	
	public Usuario_Registrado() {
		super();
		_cabecera_Usuario_Registrado = new Cabecera_Usuario_Registrado();
	}
}