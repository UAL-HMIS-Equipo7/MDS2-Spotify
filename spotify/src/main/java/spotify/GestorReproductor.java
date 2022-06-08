package spotify;

import interfaz.Reproductor;

public class GestorReproductor {
	private static Reproductor _reproductor;
	
	public static void setReproductor(Reproductor reproductor) {
		
		if (_reproductor == null) {
			_reproductor = reproductor;
		}
	}
	
	public static void setReproductorCibernauta(Reproductor reproductor) {
		_reproductor = reproductor;
	}
	
	public static void setCancion(basededatos.Cancion cancion) {
		
		_reproductor._cancion = cancion;
		
		_reproductor.CargarCancion();
	}
}
