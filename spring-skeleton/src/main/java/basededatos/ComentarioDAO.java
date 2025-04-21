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

public class ComentarioDAO {
	public static Comentario loadComentarioByORMID(int id_cont) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, id_cont);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int id_cont) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getComentarioByORMID(session, id_cont);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadComentarioByORMID(session, id_cont, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getComentarioByORMID(session, id_cont, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int id_cont) throws PersistentException {
		try {
			return (Comentario) session.load(basededatos.Comentario.class, Integer.valueOf(id_cont));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int id_cont) throws PersistentException {
		try {
			return (Comentario) session.get(basededatos.Comentario.class, Integer.valueOf(id_cont));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByORMID(PersistentSession session, int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.load(basededatos.Comentario.class, Integer.valueOf(id_cont), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario getComentarioByORMID(PersistentSession session, int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Comentario) session.get(basededatos.Comentario.class, Integer.valueOf(id_cont), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryComentario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Comentario as Comentario");
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
	
	public static List queryComentario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario[] listComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryComentario(session, condition, orderBy, lockMode);
			return (Comentario[]) list.toArray(new Comentario[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static Comentario loadComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Comentario[] comentarios = listComentarioByQuery(session, condition, orderBy, lockMode);
		if (comentarios != null && comentarios.length > 0)
			return comentarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateComentarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Comentario as Comentario");
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
	
	public static java.util.Iterator iterateComentarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Comentario as Comentario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Comentario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario createComentario() {
		return new basededatos.Comentario();
	}
	
	public static boolean save(basededatos.Comentario comentario) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().saveObject(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Comentario comentario) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().deleteObject(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Comentario comentario)throws PersistentException {
		try {
			if (comentario.getComentadoEn() != null) {
				comentario.getComentadoEn().comentarios.remove(comentario);
			}
			
			basededatos.UsuarioRegistrado[] lMeGustaPors = comentario.meGustaPor.toArray();
			for(int i = 0; i < lMeGustaPors.length; i++) {
				lMeGustaPors[i].meGusta.remove(comentario);
			}
			if (comentario.getEscritoPor() != null) {
				comentario.getEscritoPor().escribe.remove(comentario);
			}
			
			basededatos.Multimedia[] lContieneMultimedias = comentario.contieneMultimedia.toArray();
			for(int i = 0; i < lContieneMultimedias.length; i++) {
				lContieneMultimedias[i].setPerteneceA(null);
			}
			if (comentario.getContieneTexto() != null) {
				comentario.getContieneTexto().setPerteneceA(null);
			}
			
			return delete(comentario);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Comentario comentario, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (comentario.getComentadoEn() != null) {
				comentario.getComentadoEn().comentarios.remove(comentario);
			}
			
			basededatos.UsuarioRegistrado[] lMeGustaPors = comentario.meGustaPor.toArray();
			for(int i = 0; i < lMeGustaPors.length; i++) {
				lMeGustaPors[i].meGusta.remove(comentario);
			}
			if (comentario.getEscritoPor() != null) {
				comentario.getEscritoPor().escribe.remove(comentario);
			}
			
			basededatos.Multimedia[] lContieneMultimedias = comentario.contieneMultimedia.toArray();
			for(int i = 0; i < lContieneMultimedias.length; i++) {
				lContieneMultimedias[i].setPerteneceA(null);
			}
			if (comentario.getContieneTexto() != null) {
				comentario.getContieneTexto().setPerteneceA(null);
			}
			
			try {
				session.delete(comentario);
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
	
	public static boolean refresh(basededatos.Comentario comentario) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().refresh(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Comentario comentario) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().evict(comentario);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Comentario loadComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		Comentario[] comentarios = listComentarioByCriteria(comentarioCriteria);
		if(comentarios == null || comentarios.length == 0) {
			return null;
		}
		return comentarios[0];
	}
	
	public static Comentario[] listComentarioByCriteria(ComentarioCriteria comentarioCriteria) {
		return comentarioCriteria.listComentario();
	}
}
