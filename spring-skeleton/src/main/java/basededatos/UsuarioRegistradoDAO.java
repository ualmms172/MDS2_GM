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

public class UsuarioRegistradoDAO {
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int id_logueado) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, id_logueado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int id_logueado) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, id_logueado);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(int id_logueado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByORMID(session, id_logueado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(int id_logueado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getUsuarioRegistradoByORMID(session, id_logueado, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int id_logueado) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatos.UsuarioRegistrado.class, Integer.valueOf(id_logueado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int id_logueado) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatos.UsuarioRegistrado.class, Integer.valueOf(id_logueado));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByORMID(PersistentSession session, int id_logueado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.load(basededatos.UsuarioRegistrado.class, Integer.valueOf(id_logueado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado getUsuarioRegistradoByORMID(PersistentSession session, int id_logueado, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (UsuarioRegistrado) session.get(basededatos.UsuarioRegistrado.class, Integer.valueOf(id_logueado), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryUsuarioRegistrado(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static List queryUsuarioRegistrado(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUsuarioRegistrado(session, condition, orderBy, lockMode);
			return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		if (usuarioRegistrados != null && usuarioRegistrados.length > 0)
			return usuarioRegistrados[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateUsuarioRegistradoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
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
	
	public static java.util.Iterator iterateUsuarioRegistradoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.UsuarioRegistrado as UsuarioRegistrado");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("UsuarioRegistrado", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado createUsuarioRegistrado() {
		return new basededatos.UsuarioRegistrado();
	}
	
	public static boolean save(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().saveObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().deleteObject(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioRegistrado usuarioRegistrado)throws PersistentException {
		try {
			basededatos.UsuarioRegistrado[] lBloqueaAs = usuarioRegistrado.bloqueaA.toArray();
			for(int i = 0; i < lBloqueaAs.length; i++) {
				lBloqueaAs[i].bloqueadoPor.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lSigueAs = usuarioRegistrado.sigueA.toArray();
			for(int i = 0; i < lSigueAs.length; i++) {
				lSigueAs[i].seguidoPor.remove(usuarioRegistrado);
			}
			basededatos.Tweet[] lMencionadoEns = usuarioRegistrado.mencionadoEn.toArray();
			for(int i = 0; i < lMencionadoEns.length; i++) {
				lMencionadoEns[i].mencionaA.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lBloqueadoPors = usuarioRegistrado.bloqueadoPor.toArray();
			for(int i = 0; i < lBloqueadoPors.length; i++) {
				lBloqueadoPors[i].bloqueaA.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lSeguidoPors = usuarioRegistrado.seguidoPor.toArray();
			for(int i = 0; i < lSeguidoPors.length; i++) {
				lSeguidoPors[i].sigueA.remove(usuarioRegistrado);
			}
			basededatos.Contenido[] lMeGustas = usuarioRegistrado.meGusta.toArray();
			for(int i = 0; i < lMeGustas.length; i++) {
				lMeGustas[i].meGustaPor.remove(usuarioRegistrado);
			}
			basededatos.Hashtag[] lCreaHashtags = usuarioRegistrado.creaHashtag.toArray();
			for(int i = 0; i < lCreaHashtags.length; i++) {
				lCreaHashtags[i].setCreadoPor(null);
			}
			basededatos.Contenido[] lEscribes = usuarioRegistrado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEscritoPor(null);
			}
			if (usuarioRegistrado.getBaneo() != null) {
				usuarioRegistrado.getBaneo().setUsuarioRegistrado(null);
			}
			
			return delete(usuarioRegistrado);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.UsuarioRegistrado usuarioRegistrado, org.orm.PersistentSession session)throws PersistentException {
		try {
			basededatos.UsuarioRegistrado[] lBloqueaAs = usuarioRegistrado.bloqueaA.toArray();
			for(int i = 0; i < lBloqueaAs.length; i++) {
				lBloqueaAs[i].bloqueadoPor.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lSigueAs = usuarioRegistrado.sigueA.toArray();
			for(int i = 0; i < lSigueAs.length; i++) {
				lSigueAs[i].seguidoPor.remove(usuarioRegistrado);
			}
			basededatos.Tweet[] lMencionadoEns = usuarioRegistrado.mencionadoEn.toArray();
			for(int i = 0; i < lMencionadoEns.length; i++) {
				lMencionadoEns[i].mencionaA.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lBloqueadoPors = usuarioRegistrado.bloqueadoPor.toArray();
			for(int i = 0; i < lBloqueadoPors.length; i++) {
				lBloqueadoPors[i].bloqueaA.remove(usuarioRegistrado);
			}
			basededatos.UsuarioRegistrado[] lSeguidoPors = usuarioRegistrado.seguidoPor.toArray();
			for(int i = 0; i < lSeguidoPors.length; i++) {
				lSeguidoPors[i].sigueA.remove(usuarioRegistrado);
			}
			basededatos.Contenido[] lMeGustas = usuarioRegistrado.meGusta.toArray();
			for(int i = 0; i < lMeGustas.length; i++) {
				lMeGustas[i].meGustaPor.remove(usuarioRegistrado);
			}
			basededatos.Hashtag[] lCreaHashtags = usuarioRegistrado.creaHashtag.toArray();
			for(int i = 0; i < lCreaHashtags.length; i++) {
				lCreaHashtags[i].setCreadoPor(null);
			}
			basededatos.Contenido[] lEscribes = usuarioRegistrado.escribe.toArray();
			for(int i = 0; i < lEscribes.length; i++) {
				lEscribes[i].setEscritoPor(null);
			}
			if (usuarioRegistrado.getBaneo() != null) {
				usuarioRegistrado.getBaneo().setUsuarioRegistrado(null);
			}
			
			try {
				session.delete(usuarioRegistrado);
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
	
	public static boolean refresh(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().refresh(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.UsuarioRegistrado usuarioRegistrado) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().evict(usuarioRegistrado);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static UsuarioRegistrado loadUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		UsuarioRegistrado[] usuarioRegistrados = listUsuarioRegistradoByCriteria(usuarioRegistradoCriteria);
		if(usuarioRegistrados == null || usuarioRegistrados.length == 0) {
			return null;
		}
		return usuarioRegistrados[0];
	}
	
	public static UsuarioRegistrado[] listUsuarioRegistradoByCriteria(UsuarioRegistradoCriteria usuarioRegistradoCriteria) {
		return usuarioRegistradoCriteria.listUsuarioRegistrado();
	}
}
