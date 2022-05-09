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

public class EstadisticaDAO {
	public static Estadistica loadEstadisticaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadEstadisticaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getEstadisticaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadEstadisticaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getEstadisticaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estadistica) session.load(basededatos.Estadistica.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Estadistica) session.get(basededatos.Estadistica.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadistica) session.load(basededatos.Estadistica.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica getEstadisticaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadistica) session.get(basededatos.Estadistica.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryEstadistica(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryEstadistica(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listEstadisticaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listEstadisticaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadistica as Estadistica");
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
	
	public static List queryEstadistica(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadistica as Estadistica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estadistica", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstadistica(session, condition, orderBy);
			return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica[] listEstadisticaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstadistica(session, condition, orderBy, lockMode);
			return (Estadistica[]) list.toArray(new Estadistica[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadEstadisticaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadEstadisticaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estadistica[] estadisticas = listEstadisticaByQuery(session, condition, orderBy);
		if (estadisticas != null && estadisticas.length > 0)
			return estadisticas[0];
		else
			return null;
	}
	
	public static Estadistica loadEstadisticaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estadistica[] estadisticas = listEstadisticaByQuery(session, condition, orderBy, lockMode);
		if (estadisticas != null && estadisticas.length > 0)
			return estadisticas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstadisticaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateEstadisticaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadisticaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateEstadisticaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadisticaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadistica as Estadistica");
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
	
	public static java.util.Iterator iterateEstadisticaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Estadistica as Estadistica");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Estadistica", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica createEstadistica() {
		return new basededatos.Estadistica();
	}
	
	public static boolean save(basededatos.Estadistica estadistica) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().saveObject(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Estadistica estadistica) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().deleteObject(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Estadistica estadistica)throws PersistentException {
		try {
			if (estadistica.getUsuario() != null) {
				estadistica.getUsuario().setEstadistica(null);
			}
			
			basededatos.Artista[] lArtistas_mas_escuchadoss = estadistica.artistas_mas_escuchados.toArray();
			for(int i = 0; i < lArtistas_mas_escuchadoss.length; i++) {
				lArtistas_mas_escuchadoss[i].aparece_en.remove(estadistica);
			}
			basededatos.Estilo[] lEstilos_mas_escuchadoss = estadistica.estilos_mas_escuchados.toArray();
			for(int i = 0; i < lEstilos_mas_escuchadoss.length; i++) {
				lEstilos_mas_escuchadoss[i].aparece_en.remove(estadistica);
			}
			return delete(estadistica);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Estadistica estadistica, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (estadistica.getUsuario() != null) {
				estadistica.getUsuario().setEstadistica(null);
			}
			
			basededatos.Artista[] lArtistas_mas_escuchadoss = estadistica.artistas_mas_escuchados.toArray();
			for(int i = 0; i < lArtistas_mas_escuchadoss.length; i++) {
				lArtistas_mas_escuchadoss[i].aparece_en.remove(estadistica);
			}
			basededatos.Estilo[] lEstilos_mas_escuchadoss = estadistica.estilos_mas_escuchados.toArray();
			for(int i = 0; i < lEstilos_mas_escuchadoss.length; i++) {
				lEstilos_mas_escuchadoss[i].aparece_en.remove(estadistica);
			}
			try {
				session.delete(estadistica);
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
	
	public static boolean refresh(basededatos.Estadistica estadistica) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().refresh(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Estadistica estadistica) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().evict(estadistica);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica loadEstadisticaByCriteria(EstadisticaCriteria estadisticaCriteria) {
		Estadistica[] estadisticas = listEstadisticaByCriteria(estadisticaCriteria);
		if(estadisticas == null || estadisticas.length == 0) {
			return null;
		}
		return estadisticas[0];
	}
	
	public static Estadistica[] listEstadisticaByCriteria(EstadisticaCriteria estadisticaCriteria) {
		return estadisticaCriteria.listEstadistica();
	}
}
