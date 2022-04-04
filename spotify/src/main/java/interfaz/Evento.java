package interfaz;

import vistas.VistaEvento;

public class Evento extends VistaEvento {
//	private Image _fotoEventoImg;

	public Ver_evento _ver_evento;
	
	public Evento() {
		_ver_evento = new Ver_evento();
		
		this.getNombreL().setVisible(false);
	}
}