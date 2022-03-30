package interfaz;

import vistas.VistaCibernauta;

//import basededatos.iCibernauta;

public class Cibernauta extends VistaCibernauta {
//	private Button _iniciarSesionB;
//	private Image _logoImg;
//	private Label _nombreAppL;
//	public iCibernauta _iCibernauta;
	public Iniciar_sesion _iniciar_sesion;
	public Canciones_ultimos_exitos _canciones_ultimos_exitos;
	
	public Cibernauta() {
		_canciones_ultimos_exitos = new Canciones_ultimos_exitos();
		_canciones_ultimos_exitos.getElement().setAttribute("width", "100%");
		_canciones_ultimos_exitos.getElement().setAttribute("height", "100%");
		
		_iniciar_sesion = new Iniciar_sesion();
		
		this.getVaadinHorizontalLayout().add(_canciones_ultimos_exitos);
	}
}