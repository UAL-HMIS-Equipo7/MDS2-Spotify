package interfaz;

import vistas.VistaRegistrarse;

public class Registrarse extends VistaRegistrarse {
//	private Image _emailImg;
//	private TextField _emailTF;
//	private Image _nickImg;
//	private TextField _nickTF;
//	private Image _contraseniaImg;
//	private TextField _contraseniaTF;
//	private TextField _repiteContrase�iaTF;
//	private Image _fotoImg;
//	private Label _opcionalL;
//	private FileChooser _fotoFC;
//	private Label _fotoL;
//	private Button _iniciarSesionB;
//	private Button _registrarseB;
//	private Button _atrasB;
//	private Label _errorL;
//	private Label _tituloL;
	public Iniciar_sesion _iniciar_sesion;
	public Confirmacion_de_correo _confirmacion_de_correo;
	
	public Registrarse() {
		_confirmacion_de_correo = new Confirmacion_de_correo();
	}

	public void Validar_datos_de_registro() {
		throw new UnsupportedOperationException();
	}
}