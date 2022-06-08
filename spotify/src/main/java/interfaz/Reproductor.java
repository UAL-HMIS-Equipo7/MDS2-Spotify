package interfaz;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import spotify.AudioPlayer;
import spotify.GestorArchivos;
import vistas.VistaReproductor;

public class Reproductor extends VistaReproductor {
//	private event _reanudar_Pausar;
//	private event _modificar_volumen;
//	private Button _reanudarPausarB;
//	private Button _volumenB;
//
//	public void Reanudar_Pausar() {
//		throw new UnsupportedOperationException();
//	}
//
//	public void Modificar_volumen() {
//		throw new UnsupportedOperationException();
//	}
	
	public basededatos.Cancion _cancion;
	
	public AudioPlayer _audioPlayer;
	
	public int _limReproducibles = -1;
	public int _reproduccionesActuales = 0;
	
	public Reproductor() {
		
		HorizontalLayout hl = this.getContenedor();
		
		_audioPlayer = new AudioPlayer();
		
		hl.add(_audioPlayer);
	}
	
	public Reproductor(int limiteReproducibles) {
		this();
		_limReproducibles = limiteReproducibles;
		_reproduccionesActuales = 0;
		
	}
	
	public void CargarCancion() {
		
		if (_cancion != null) {
			_audioPlayer.setSource(GestorArchivos.CargarAudio(_cancion.getFicheroMultimediaRuta()));
			_reproduccionesActuales++;
		}
		
		//Overrideado
	}
}