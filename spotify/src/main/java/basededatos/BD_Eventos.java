package basededatos;

import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Evento;

public class BD_Eventos {
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();
	public BDPrincipal _bDPrincipal_eventos;

	public void Crear_Evento(int aIdArtista, Evento aEvento) {
		//Pasar mejor los parametros sueltos del evento??
		
		//Aqui hay que notificar a todos los que sigan al artista
		throw new UnsupportedOperationException();
	}

	public Evento[] Cargar_Notificaciones(int aIdUsuarioGenerico) throws PersistentException {
		Evento[] notificaciones = new Evento[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			notificaciones = usuario.notificaciones.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return notificaciones;
	}

	public void Marcar_Notificacion_Recibida(int aIdUsuarioGenerico, int aIdEvento) throws PersistentException {
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_generico usuario = Usuario_genericoDAO.getUsuario_genericoByORMID(aIdUsuarioGenerico);
			
			Evento evento = EventoDAO.getEventoByORMID(aIdEvento);
			
			usuario.notificaciones.remove(evento);
			Usuario_genericoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
	}

	public Evento[] Cargar_Eventos_Artista(int aIdArtista) throws PersistentException {
		Evento[] eventos = new Evento[0];
		
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			
			eventos = artista.eventos.toArray();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return eventos;
	}
}