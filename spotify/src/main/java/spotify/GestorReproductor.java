package spotify;

import interfaz.Reproductor;

public class GestorReproductor {
	private static Reproductor _reproductor;
	
	public static void setReproductor(Reproductor reproductor) {
		_reproductor = reproductor;
	}
	
	public static void setCancion(basededatos.Cancion cancion) {
		
		_reproductor._cancion = cancion;
		_reproductor._audioPlayer.setSource(cancion.getFicheroMultimediaRuta());
		
		_reproductor.getTituloL().setText(cancion.getTitulo());
		_reproductor.getTituloB().setText(cancion.getTitulo());
	}
}
