/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Antonio Gallardo(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class baneoDAO {
	public static baneo loadBaneoByORMID(int id_baneo) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadBaneoByORMID(session, id_baneo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo getBaneoByORMID(int id_baneo) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getBaneoByORMID(session, id_baneo);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByORMID(int id_baneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadBaneoByORMID(session, id_baneo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo getBaneoByORMID(int id_baneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getBaneoByORMID(session, id_baneo, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByORMID(PersistentSession session, int id_baneo) throws PersistentException {
		try {
			return (baneo) session.load(basededatos.baneo.class, Integer.valueOf(id_baneo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo getBaneoByORMID(PersistentSession session, int id_baneo) throws PersistentException {
		try {
			return (baneo) session.get(basededatos.baneo.class, Integer.valueOf(id_baneo));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByORMID(PersistentSession session, int id_baneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (baneo) session.load(basededatos.baneo.class, Integer.valueOf(id_baneo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo getBaneoByORMID(PersistentSession session, int id_baneo, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (baneo) session.get(basededatos.baneo.class, Integer.valueOf(id_baneo), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBaneo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryBaneo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBaneo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryBaneo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo[] listBaneoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listBaneoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo[] listBaneoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listBaneoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBaneo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.baneo as baneo");
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
	
	public static List queryBaneo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.baneo as baneo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("baneo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo[] listBaneoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBaneo(session, condition, orderBy);
			return (baneo[]) list.toArray(new baneo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo[] listBaneoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBaneo(session, condition, orderBy, lockMode);
			return (baneo[]) list.toArray(new baneo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadBaneoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadBaneoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		baneo[] baneos = listBaneoByQuery(session, condition, orderBy);
		if (baneos != null && baneos.length > 0)
			return baneos[0];
		else
			return null;
	}
	
	public static baneo loadBaneoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		baneo[] baneos = listBaneoByQuery(session, condition, orderBy, lockMode);
		if (baneos != null && baneos.length > 0)
			return baneos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBaneoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateBaneoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBaneoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateBaneoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBaneoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.baneo as baneo");
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
	
	public static java.util.Iterator iterateBaneoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.baneo as baneo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("baneo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo createBaneo() {
		return new basededatos.baneo();
	}
	
	public static boolean save(basededatos.baneo lbaneo) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().saveObject(lbaneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.baneo lbaneo) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().deleteObject(lbaneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.baneo lbaneo)throws PersistentException {
		try {
			if (lbaneo.getUsuarioRegistrado() != null) {
				lbaneo.getUsuarioRegistrado().setBaneo(null);
			}
			
			if (lbaneo.getAdministrador() != null) {
				lbaneo.getAdministrador().baneos.remove(lbaneo);
			}
			
			return delete(lbaneo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.baneo lbaneo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lbaneo.getUsuarioRegistrado() != null) {
				lbaneo.getUsuarioRegistrado().setBaneo(null);
			}
			
			if (lbaneo.getAdministrador() != null) {
				lbaneo.getAdministrador().baneos.remove(lbaneo);
			}
			
			try {
				session.delete(lbaneo);
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
	
	public static boolean refresh(basededatos.baneo lbaneo) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().refresh(lbaneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.baneo lbaneo) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().evict(lbaneo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static baneo loadBaneoByCriteria(baneoCriteria baneoCriteria) {
		baneo[] baneos = listBaneoByCriteria(baneoCriteria);
		if(baneos == null || baneos.length == 0) {
			return null;
		}
		return baneos[0];
	}
	
	public static baneo[] listBaneoByCriteria(baneoCriteria baneoCriteria) {
		return baneoCriteria.listBaneo();
	}
}
