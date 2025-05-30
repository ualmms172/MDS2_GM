/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class TextoDAO {
	public static Texto loadTextoByORMID(int id_texto) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTextoByORMID(session, id_texto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto getTextoByORMID(int id_texto) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getTextoByORMID(session, id_texto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByORMID(int id_texto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTextoByORMID(session, id_texto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto getTextoByORMID(int id_texto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getTextoByORMID(session, id_texto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByORMID(PersistentSession session, int id_texto) throws PersistentException {
		try {
			return (Texto) session.load(basededatos.Texto.class, Integer.valueOf(id_texto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto getTextoByORMID(PersistentSession session, int id_texto) throws PersistentException {
		try {
			return (Texto) session.get(basededatos.Texto.class, Integer.valueOf(id_texto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByORMID(PersistentSession session, int id_texto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Texto) session.load(basededatos.Texto.class, Integer.valueOf(id_texto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto getTextoByORMID(PersistentSession session, int id_texto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Texto) session.get(basededatos.Texto.class, Integer.valueOf(id_texto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTexto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryTexto(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTexto(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryTexto(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto[] listTextoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listTextoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto[] listTextoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listTextoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTexto(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Texto as Texto");
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
	
	public static List queryTexto(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Texto as Texto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Texto", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto[] listTextoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTexto(session, condition, orderBy);
			return (Texto[]) list.toArray(new Texto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto[] listTextoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTexto(session, condition, orderBy, lockMode);
			return (Texto[]) list.toArray(new Texto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTextoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTextoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Texto[] textos = listTextoByQuery(session, condition, orderBy);
		if (textos != null && textos.length > 0)
			return textos[0];
		else
			return null;
	}
	
	public static Texto loadTextoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Texto[] textos = listTextoByQuery(session, condition, orderBy, lockMode);
		if (textos != null && textos.length > 0)
			return textos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTextoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateTextoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTextoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateTextoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTextoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Texto as Texto");
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
	
	public static java.util.Iterator iterateTextoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Texto as Texto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Texto", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto createTexto() {
		return new basededatos.Texto();
	}
	
	public static boolean save(basededatos.Texto texto) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().saveObject(texto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Texto texto) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().deleteObject(texto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Texto texto)throws PersistentException {
		try {
			if (texto.getPerteneceA() != null) {
				texto.getPerteneceA().setContieneTexto(null);
			}
			
			return delete(texto);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Texto texto, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (texto.getPerteneceA() != null) {
				texto.getPerteneceA().setContieneTexto(null);
			}
			
			try {
				session.delete(texto);
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
	
	public static boolean refresh(basededatos.Texto texto) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().refresh(texto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Texto texto) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().evict(texto);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Texto loadTextoByCriteria(TextoCriteria textoCriteria) {
		Texto[] textos = listTextoByCriteria(textoCriteria);
		if(textos == null || textos.length == 0) {
			return null;
		}
		return textos[0];
	}
	
	public static Texto[] listTextoByCriteria(TextoCriteria textoCriteria) {
		return textoCriteria.listTexto();
	}
}
