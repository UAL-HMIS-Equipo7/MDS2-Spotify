package basededatos;

import java.util.Vector;
import basededatos.Evento;

public class BD_Eventos {
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();
	public BDPrincipal _bDPrincipal_eventos;

	public void Crear_Evento(int aIdArtista, Evento aEvento) {
		throw new UnsupportedOperationException();
	}

	public Evento[] Cargar_Notificaciones(int aIdUsuarioGenerico) {
		throw new UnsupportedOperationException();
	}

	public void Marcar_Notificacion_Recibida(int aIdUsuarioGenerico, int aIdEvento) {
		throw new UnsupportedOperationException();
	}

	public Evento[] Cargar_Eventos_Artista(int aIdArtista) {
		throw new UnsupportedOperationException();
	}
}