package interfaz;

import vistas.VistaIniciar_sesion;

public class Iniciar_sesion extends VistaIniciar_sesion {
//	private Image _emailImg;
//	private TextField _emailTF;
//	private Image _contraseniaImg;
//	private TextField _contraseniaTF;
//	private Button _registrarseB;
//	private Button _recuperarContraseniaB;
//	private Button _iniciarSesionB;
//	private Button _googleB;
//	private Button _microsoftB;
//	private Button _facebookB;
//	private Button _atrasB;
//	private Label _errorL;
//	private Label _tituloL;

	public Registrarse _registrarse;
	public Recuperar_contrasenia _recuperar_contrasenia;
	public Iniciar_sesion_con_aplicacion_de_terceros _iniciar_sesion_con_aplicacion_de_terceros;
	public Bloqueo_inicio_sesion _bloqueo_inicio_sesion;
	
	public Iniciar_sesion() {
		_registrarse = new Registrarse();
		_recuperar_contrasenia = new Recuperar_contrasenia();
		_iniciar_sesion_con_aplicacion_de_terceros = new Iniciar_sesion_con_aplicacion_de_terceros();
		_bloqueo_inicio_sesion = new Bloqueo_inicio_sesion();
		
	}

	public void Validar_datos_de_usuario() {
		throw new UnsupportedOperationException();
	}
}