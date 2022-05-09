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

public class Datos_AccesoDAO {
	public static Datos_Acceso loadDatos_AccesoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadDatos_AccesoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso getDatos_AccesoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getDatos_AccesoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadDatos_AccesoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso getDatos_AccesoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return getDatos_AccesoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Datos_Acceso) session.load(basededatos.Datos_Acceso.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso getDatos_AccesoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Datos_Acceso) session.get(basededatos.Datos_Acceso.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Datos_Acceso) session.load(basededatos.Datos_Acceso.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso getDatos_AccesoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Datos_Acceso) session.get(basededatos.Datos_Acceso.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatos_Acceso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryDatos_Acceso(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatos_Acceso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return queryDatos_Acceso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso[] listDatos_AccesoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listDatos_AccesoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso[] listDatos_AccesoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return listDatos_AccesoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDatos_Acceso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Datos_Acceso as Datos_Acceso");
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
	
	public static List queryDatos_Acceso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Datos_Acceso as Datos_Acceso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Datos_Acceso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso[] listDatos_AccesoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDatos_Acceso(session, condition, orderBy);
			return (Datos_Acceso[]) list.toArray(new Datos_Acceso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso[] listDatos_AccesoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDatos_Acceso(session, condition, orderBy, lockMode);
			return (Datos_Acceso[]) list.toArray(new Datos_Acceso[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadDatos_AccesoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return loadDatos_AccesoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Datos_Acceso[] datos_Accesos = listDatos_AccesoByQuery(session, condition, orderBy);
		if (datos_Accesos != null && datos_Accesos.length > 0)
			return datos_Accesos[0];
		else
			return null;
	}
	
	public static Datos_Acceso loadDatos_AccesoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Datos_Acceso[] datos_Accesos = listDatos_AccesoByQuery(session, condition, orderBy, lockMode);
		if (datos_Accesos != null && datos_Accesos.length > 0)
			return datos_Accesos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDatos_AccesoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateDatos_AccesoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDatos_AccesoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession();
			return iterateDatos_AccesoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDatos_AccesoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Datos_Acceso as Datos_Acceso");
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
	
	public static java.util.Iterator iterateDatos_AccesoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Datos_Acceso as Datos_Acceso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Datos_Acceso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso createDatos_Acceso() {
		return new basededatos.Datos_Acceso();
	}
	
	public static boolean save(basededatos.Datos_Acceso datos_Acceso) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().saveObject(datos_Acceso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Datos_Acceso datos_Acceso) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().deleteObject(datos_Acceso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Datos_Acceso datos_Acceso)throws PersistentException {
		try {
			if (datos_Acceso.getUsuario() != null) {
				datos_Acceso.getUsuario().setDatos(null);
			}
			
			return delete(datos_Acceso);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Datos_Acceso datos_Acceso, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (datos_Acceso.getUsuario() != null) {
				datos_Acceso.getUsuario().setDatos(null);
			}
			
			try {
				session.delete(datos_Acceso);
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
	
	public static boolean refresh(basededatos.Datos_Acceso datos_Acceso) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().refresh(datos_Acceso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Datos_Acceso datos_Acceso) throws PersistentException {
		try {
			AplicacióndeBúsquedayReproduccióndeMúsicaPersistentManager.instance().getSession().evict(datos_Acceso);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Datos_Acceso loadDatos_AccesoByCriteria(Datos_AccesoCriteria datos_AccesoCriteria) {
		Datos_Acceso[] datos_Accesos = listDatos_AccesoByCriteria(datos_AccesoCriteria);
		if(datos_Accesos == null || datos_Accesos.length == 0) {
			return null;
		}
		return datos_Accesos[0];
	}
	
	public static Datos_Acceso[] listDatos_AccesoByCriteria(Datos_AccesoCriteria datos_AccesoCriteria) {
		return datos_AccesoCriteria.listDatos_Acceso();
	}
}
