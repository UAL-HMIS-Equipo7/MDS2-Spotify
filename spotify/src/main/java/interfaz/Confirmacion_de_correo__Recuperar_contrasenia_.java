package interfaz;

public class Confirmacion_de_correo__Recuperar_contrasenia_ extends Confirmacion_de_correo {
//	private Button _confirmarB;
	
	public Nueva_contrasenia _nueva_contrasenia;
	
	public Confirmacion_de_correo__Recuperar_contrasenia_() {
		super();
		
		_nueva_contrasenia = new Nueva_contrasenia();
		
		//Lo unico que cambia con respecto a su padre es a donde te lleva el boton de confirmar
	}
}