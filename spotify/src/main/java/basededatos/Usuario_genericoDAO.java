/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Manuel David Montesinos Navarrete(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Usuario_genericoDAO {
	public static Usuario_generico loadUsuario_genericoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadUsuario_genericoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico getUsuario_genericoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getUsuario_genericoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadUsuario_genericoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico getUsuario_genericoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getUsuario_genericoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_generico) session.load(basededatos.Usuario_generico.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico getUsuario_genericoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Usuario_generico) session.get(basededatos.Usuario_generico.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_generico) session.load(basededatos.Usuario_generico.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico getUsuario_genericoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Usuario_generico) session.get(basededatos.Usuario_generico.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_generico(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryUsuario_generico(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_generico(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryUsuario_generico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico[] listUsuario_genericoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listUsuario_genericoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico[] listUsuario_genericoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listUsuario_genericoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_generico(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_generico as Usuario_generico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuario_generico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_generico as Usuario_generico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_generico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico[] listUsuario_genericoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuario_generico(session, condition, orderBy);
			return (Usuario_generico[]) list.toArray(new Usuario_generico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico[] listUsuario_genericoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuario_generico(session, condition, orderBy, lockMode);
			return (Usuario_generico[]) list.toArray(new Usuario_generico[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadUsuario_genericoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadUsuario_genericoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Usuario_generico[] usuario_genericos = listUsuario_genericoByQuery(session, condition, orderBy);
		if (usuario_genericos != null && usuario_genericos.length > 0)
			return usuario_genericos[0];
		else
			return null;
	}
	
	public static Usuario_generico loadUsuario_genericoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Usuario_generico[] usuario_genericos = listUsuario_genericoByQuery(session, condition, orderBy, lockMode);
		if (usuario_genericos != null && usuario_genericos.length > 0)
			return usuario_genericos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuario_genericoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateUsuario_genericoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_genericoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateUsuario_genericoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_genericoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_generico as Usuario_generico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuario_genericoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Usuario_generico as Usuario_generico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Usuario_generico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico createUsuario_generico() {
		return new basededatos.Usuario_generico();
	}
	
	public static boolean save(basededatos.Usuario_generico usuario_generico) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().saveObject(usuario_generico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Usuario_generico usuario_generico) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().deleteObject(usuario_generico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_generico usuario_generico)throws PersistentException {
		if (usuario_generico instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuario_generico);
		}
		
		if (usuario_generico instanceof basededatos.Usuario_Registrado) {
			return basededatos.Usuario_RegistradoDAO.deleteAndDissociate((basededatos.Usuario_Registrado) usuario_generico);
		}
		
		if (usuario_generico instanceof basededatos.Administrador) {
			return basededatos.AdministradorDAO.deleteAndDissociate((basededatos.Administrador) usuario_generico);
		}
		
		try {
			if (usuario_generico.getDatos() != null) {
				usuario_generico.getDatos().setUsuario(null);
			}
			
			basededatos.Usuario_generico[] lSeguidors = usuario_generico.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(usuario_generico);
			}
			basededatos.Lista_de_reproduccion[] lListass = usuario_generico.listas.toArray();
			for(int i = 0; i < lListass.length; i++) {
				lListass[i].setAutor(null);
			}
			if (usuario_generico.getFavorita() != null) {
				usuario_generico.getFavorita().setPropietario_favorito(null);
			}
			
			basededatos.Usuario_generico[] lSeguidos = usuario_generico.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(usuario_generico);
			}
			if (usuario_generico.getEstadistica() != null) {
				usuario_generico.getEstadistica().setUsuario(null);
			}
			
			basededatos.Cancion[] lUltimas_reproducidass = usuario_generico.ultimas_reproducidas.toArray();
			for(int i = 0; i < lUltimas_reproducidass.length; i++) {
				lUltimas_reproducidass[i].usuario.remove(usuario_generico);
			}
			basededatos.Evento[] lNotificacioness = usuario_generico.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(usuario_generico);
			}
			basededatos.Lista_de_reproduccion[] lLista_seguidas = usuario_generico.lista_seguida.toArray();
			for(int i = 0; i < lLista_seguidas.length; i++) {
				lLista_seguidas[i].seguidor.remove(usuario_generico);
			}
			return delete(usuario_generico);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Usuario_generico usuario_generico, org.orm.PersistentSession session)throws PersistentException {
		if (usuario_generico instanceof basededatos.Artista) {
			return basededatos.ArtistaDAO.deleteAndDissociate((basededatos.Artista) usuario_generico, session);
		}
		
		if (usuario_generico instanceof basededatos.Usuario_Registrado) {
			return basededatos.Usuario_RegistradoDAO.deleteAndDissociate((basededatos.Usuario_Registrado) usuario_generico, session);
		}
		
		if (usuario_generico instanceof basededatos.Administrador) {
			return basededatos.AdministradorDAO.deleteAndDissociate((basededatos.Administrador) usuario_generico, session);
		}
		
		try {
			if (usuario_generico.getDatos() != null) {
				usuario_generico.getDatos().setUsuario(null);
			}
			
			basededatos.Usuario_generico[] lSeguidors = usuario_generico.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].seguido.remove(usuario_generico);
			}
			basededatos.Lista_de_reproduccion[] lListass = usuario_generico.listas.toArray();
			for(int i = 0; i < lListass.length; i++) {
				lListass[i].setAutor(null);
			}
			if (usuario_generico.getFavorita() != null) {
				usuario_generico.getFavorita().setPropietario_favorito(null);
			}
			
			basededatos.Usuario_generico[] lSeguidos = usuario_generico.seguido.toArray();
			for(int i = 0; i < lSeguidos.length; i++) {
				lSeguidos[i].seguidor.remove(usuario_generico);
			}
			if (usuario_generico.getEstadistica() != null) {
				usuario_generico.getEstadistica().setUsuario(null);
			}
			
			basededatos.Cancion[] lUltimas_reproducidass = usuario_generico.ultimas_reproducidas.toArray();
			for(int i = 0; i < lUltimas_reproducidass.length; i++) {
				lUltimas_reproducidass[i].usuario.remove(usuario_generico);
			}
			basededatos.Evento[] lNotificacioness = usuario_generico.notificaciones.toArray();
			for(int i = 0; i < lNotificacioness.length; i++) {
				lNotificacioness[i].usuario.remove(usuario_generico);
			}
			basededatos.Lista_de_reproduccion[] lLista_seguidas = usuario_generico.lista_seguida.toArray();
			for(int i = 0; i < lLista_seguidas.length; i++) {
				lLista_seguidas[i].seguidor.remove(usuario_generico);
			}
			try {
				session.delete(usuario_generico);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(basededatos.Usuario_generico usuario_generico) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().refresh(usuario_generico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Usuario_generico usuario_generico) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().evict(usuario_generico);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Usuario_generico loadUsuario_genericoByCriteria(Usuario_genericoCriteria usuario_genericoCriteria) {
		Usuario_generico[] usuario_genericos = listUsuario_genericoByCriteria(usuario_genericoCriteria);
		if(usuario_genericos == null || usuario_genericos.length == 0) {
			return null;
		}
		return usuario_genericos[0];
	}
	
	public static Usuario_generico[] listUsuario_genericoByCriteria(Usuario_genericoCriteria usuario_genericoCriteria) {
		return usuario_genericoCriteria.listUsuario_generico();
	}
}
