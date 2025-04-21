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

public class ContenidoDAO {
	public static Contenido loadContenidoByORMID(int id_cont) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadContenidoByORMID(session, id_cont);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido getContenidoByORMID(int id_cont) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getContenidoByORMID(session, id_cont);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByORMID(int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadContenidoByORMID(session, id_cont, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido getContenidoByORMID(int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getContenidoByORMID(session, id_cont, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByORMID(PersistentSession session, int id_cont) throws PersistentException {
		try {
			return (Contenido) session.load(basededatos.Contenido.class, Integer.valueOf(id_cont));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido getContenidoByORMID(PersistentSession session, int id_cont) throws PersistentException {
		try {
			return (Contenido) session.get(basededatos.Contenido.class, Integer.valueOf(id_cont));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByORMID(PersistentSession session, int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contenido) session.load(basededatos.Contenido.class, Integer.valueOf(id_cont), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido getContenidoByORMID(PersistentSession session, int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Contenido) session.get(basededatos.Contenido.class, Integer.valueOf(id_cont), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContenido(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryContenido(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContenido(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryContenido(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido[] listContenidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listContenidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido[] listContenidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listContenidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryContenido(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Contenido as Contenido");
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
	
	public static List queryContenido(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Contenido as Contenido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contenido", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido[] listContenidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryContenido(session, condition, orderBy);
			return (Contenido[]) list.toArray(new Contenido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido[] listContenidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryContenido(session, condition, orderBy, lockMode);
			return (Contenido[]) list.toArray(new Contenido[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadContenidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadContenidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Contenido[] contenidos = listContenidoByQuery(session, condition, orderBy);
		if (contenidos != null && contenidos.length > 0)
			return contenidos[0];
		else
			return null;
	}
	
	public static Contenido loadContenidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Contenido[] contenidos = listContenidoByQuery(session, condition, orderBy, lockMode);
		if (contenidos != null && contenidos.length > 0)
			return contenidos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateContenidoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateContenidoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContenidoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateContenidoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateContenidoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Contenido as Contenido");
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
	
	public static java.util.Iterator iterateContenidoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Contenido as Contenido");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Contenido", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido createContenido() {
		return new basededatos.Contenido();
	}
	
	public static boolean save(basededatos.Contenido contenido) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().saveObject(contenido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Contenido contenido) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().deleteObject(contenido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Contenido contenido)throws PersistentException {
		if (contenido instanceof basededatos.Tweet) {
			return basededatos.TweetDAO.deleteAndDissociate((basededatos.Tweet) contenido);
		}
		
		if (contenido instanceof basededatos.Comentario) {
			return basededatos.ComentarioDAO.deleteAndDissociate((basededatos.Comentario) contenido);
		}
		
		try {
			basededatos.UsuarioRegistrado[] lMeGustaPors = contenido.meGustaPor.toArray();
			for(int i = 0; i < lMeGustaPors.length; i++) {
				lMeGustaPors[i].meGusta.remove(contenido);
			}
			if (contenido.getEscritoPor() != null) {
				contenido.getEscritoPor().escribe.remove(contenido);
			}
			
			basededatos.Multimedia[] lContieneMultimedias = contenido.contieneMultimedia.toArray();
			for(int i = 0; i < lContieneMultimedias.length; i++) {
				lContieneMultimedias[i].setPerteneceA(null);
			}
			if (contenido.getContieneTexto() != null) {
				contenido.getContieneTexto().setPerteneceA(null);
			}
			
			return delete(contenido);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Contenido contenido, org.orm.PersistentSession session)throws PersistentException {
		if (contenido instanceof basededatos.Tweet) {
			return basededatos.TweetDAO.deleteAndDissociate((basededatos.Tweet) contenido, session);
		}
		
		if (contenido instanceof basededatos.Comentario) {
			return basededatos.ComentarioDAO.deleteAndDissociate((basededatos.Comentario) contenido, session);
		}
		
		try {
			basededatos.UsuarioRegistrado[] lMeGustaPors = contenido.meGustaPor.toArray();
			for(int i = 0; i < lMeGustaPors.length; i++) {
				lMeGustaPors[i].meGusta.remove(contenido);
			}
			if (contenido.getEscritoPor() != null) {
				contenido.getEscritoPor().escribe.remove(contenido);
			}
			
			basededatos.Multimedia[] lContieneMultimedias = contenido.contieneMultimedia.toArray();
			for(int i = 0; i < lContieneMultimedias.length; i++) {
				lContieneMultimedias[i].setPerteneceA(null);
			}
			if (contenido.getContieneTexto() != null) {
				contenido.getContieneTexto().setPerteneceA(null);
			}
			
			try {
				session.delete(contenido);
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
	
	public static boolean refresh(basededatos.Contenido contenido) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().refresh(contenido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Contenido contenido) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().evict(contenido);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Contenido loadContenidoByCriteria(ContenidoCriteria contenidoCriteria) {
		Contenido[] contenidos = listContenidoByCriteria(contenidoCriteria);
		if(contenidos == null || contenidos.length == 0) {
			return null;
		}
		return contenidos[0];
	}
	
	public static Contenido[] listContenidoByCriteria(ContenidoCriteria contenidoCriteria) {
		return contenidoCriteria.listContenido();
	}
}
