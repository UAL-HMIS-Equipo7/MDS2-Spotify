package basededatos;

import java.util.Random;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Evento;

public class BD_Eventos {
	public Vector<Evento> _contiene_eventos = new Vector<Evento>();
	public BDPrincipal _bDPrincipal_eventos;

	public int Crear_Evento(int aIdArtista, String imagenRuta, String fechaYHora, String descripcion, int precio) throws PersistentException {
		int id_evento = -1;
		PersistentTransaction t = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().beginTransaction();
		try {
			Evento evento = EventoDAO.createEvento();
			Artista artista = ArtistaDAO.getArtistaByORMID(aIdArtista);
			evento.setImagenRuta(imagenRuta);
			evento.setFechaYHora(fechaYHora);
			evento.setDescripcion(descripcion);
			evento.setPrecio(precio);
			evento.setPublicado_por(artista);
			id_evento = evento.getORMID();
			EventoDAO.save(evento);
			
			Usuario_generico[] seguidores = artista.seguidor.toArray();
			Usuario_generico temp;
			
			for (int i = 0; i < seguidores.length; i++) {
				temp = seguidores[i];
				temp.notificaciones.add(evento);
				Usuario_genericoDAO.save(temp);
			}
			
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
		return id_evento;
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
		AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().disposePersistentManager();
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