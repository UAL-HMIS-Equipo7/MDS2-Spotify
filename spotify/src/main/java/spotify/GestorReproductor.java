package spotify;

import com.vaadin.flow.component.notification.Notification;

import interfaz.Reproductor;

public class GestorReproductor {
	private static Reproductor _reproductor;
	private static boolean _esCibernauta = false;
	
	public static boolean setReproductor(Reproductor reproductor) {
		
		boolean aniadido = false;
		
		if (_reproductor == null || _esCibernauta) {
			_reproductor = reproductor;
			aniadido = true;
		}
		
		_esCibernauta = false;
		
		return aniadido;
	}
	
	public static Reproductor getReproductor() {
		return _reproductor;
	}
	
	
	
	public static void setReproductorCibernauta(Reproductor reproductor) {
		_reproductor = reproductor;
		_esCibernauta = true;
	}
	
	public static void setCancion(basededatos.Cancion cancion) {
		
		if (_reproductor._cancion != null && _reproductor._cancion.getORMID() == cancion.getORMID()) {
			return;
		}
		
		if (_esCibernauta) {
			if (_reproductor._limReproducibles != -1 && _reproductor._reproduccionesActuales >= _reproductor._limReproducibles) {
				Notification.show("Se ha superado el límite de canciones reproducibles por hoy");
				return;
			}
		}
		
		_reproductor._cancion = cancion;
		
		_reproductor.CargarCancion();
	}
}
