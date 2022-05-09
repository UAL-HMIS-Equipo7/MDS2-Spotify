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

public class Lista_de_reproduccionDAO {
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getLista_de_reproduccionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getLista_de_reproduccionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.load(basededatos.Lista_de_reproduccion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.get(basededatos.Lista_de_reproduccion.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.load(basededatos.Lista_de_reproduccion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion getLista_de_reproduccionByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Lista_de_reproduccion) session.get(basededatos.Lista_de_reproduccion.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryLista_de_reproduccion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryLista_de_reproduccion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryLista_de_reproduccion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
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
	
	public static List queryLista_de_reproduccion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_de_reproduccion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryLista_de_reproduccion(session, condition, orderBy);
			return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryLista_de_reproduccion(session, condition, orderBy, lockMode);
			return (Lista_de_reproduccion[]) list.toArray(new Lista_de_reproduccion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByQuery(session, condition, orderBy);
		if (lista_de_reproduccions != null && lista_de_reproduccions.length > 0)
			return lista_de_reproduccions[0];
		else
			return null;
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		if (lista_de_reproduccions != null && lista_de_reproduccions.length > 0)
			return lista_de_reproduccions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateLista_de_reproduccionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateLista_de_reproduccionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
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
	
	public static java.util.Iterator iterateLista_de_reproduccionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Lista_de_reproduccion as Lista_de_reproduccion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Lista_de_reproduccion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion createLista_de_reproduccion() {
		return new basededatos.Lista_de_reproduccion();
	}
	
	public static boolean save(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().saveObject(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().deleteObject(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista_de_reproduccion lista_de_reproduccion)throws PersistentException {
		try {
			if (lista_de_reproduccion.getPropietario_favorito() != null) {
				lista_de_reproduccion.getPropietario_favorito().setFavorita(null);
			}
			
			if (lista_de_reproduccion.getAutor() != null) {
				lista_de_reproduccion.getAutor().listas.remove(lista_de_reproduccion);
			}
			
			basededatos.Usuario_generico[] lSeguidors = lista_de_reproduccion.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].lista_seguida.remove(lista_de_reproduccion);
			}
			basededatos.Cancion[] lCanciones_incluidass = lista_de_reproduccion.canciones_incluidas.toArray();
			for(int i = 0; i < lCanciones_incluidass.length; i++) {
				lCanciones_incluidass[i].incluida_en_listas.remove(lista_de_reproduccion);
			}
			return delete(lista_de_reproduccion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Lista_de_reproduccion lista_de_reproduccion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lista_de_reproduccion.getPropietario_favorito() != null) {
				lista_de_reproduccion.getPropietario_favorito().setFavorita(null);
			}
			
			if (lista_de_reproduccion.getAutor() != null) {
				lista_de_reproduccion.getAutor().listas.remove(lista_de_reproduccion);
			}
			
			basededatos.Usuario_generico[] lSeguidors = lista_de_reproduccion.seguidor.toArray();
			for(int i = 0; i < lSeguidors.length; i++) {
				lSeguidors[i].lista_seguida.remove(lista_de_reproduccion);
			}
			basededatos.Cancion[] lCanciones_incluidass = lista_de_reproduccion.canciones_incluidas.toArray();
			for(int i = 0; i < lCanciones_incluidass.length; i++) {
				lCanciones_incluidass[i].incluida_en_listas.remove(lista_de_reproduccion);
			}
			try {
				session.delete(lista_de_reproduccion);
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
	
	public static boolean refresh(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().refresh(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Lista_de_reproduccion lista_de_reproduccion) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().evict(lista_de_reproduccion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Lista_de_reproduccion loadLista_de_reproduccionByCriteria(Lista_de_reproduccionCriteria lista_de_reproduccionCriteria) {
		Lista_de_reproduccion[] lista_de_reproduccions = listLista_de_reproduccionByCriteria(lista_de_reproduccionCriteria);
		if(lista_de_reproduccions == null || lista_de_reproduccions.length == 0) {
			return null;
		}
		return lista_de_reproduccions[0];
	}
	
	public static Lista_de_reproduccion[] listLista_de_reproduccionByCriteria(Lista_de_reproduccionCriteria lista_de_reproduccionCriteria) {
		return lista_de_reproduccionCriteria.listLista_de_reproduccion();
	}
}
