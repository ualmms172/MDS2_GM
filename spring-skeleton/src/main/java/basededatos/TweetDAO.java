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

public class TweetDAO {
	public static Tweet loadTweetByORMID(int id_cont) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTweetByORMID(session, id_cont);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(int id_cont) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getTweetByORMID(session, id_cont);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTweetByORMID(session, id_cont, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return getTweetByORMID(session, id_cont, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(PersistentSession session, int id_cont) throws PersistentException {
		try {
			return (Tweet) session.load(basededatos.Tweet.class, Integer.valueOf(id_cont));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(PersistentSession session, int id_cont) throws PersistentException {
		try {
			return (Tweet) session.get(basededatos.Tweet.class, Integer.valueOf(id_cont));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByORMID(PersistentSession session, int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tweet) session.load(basededatos.Tweet.class, Integer.valueOf(id_cont), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet getTweetByORMID(PersistentSession session, int id_cont, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tweet) session.get(basededatos.Tweet.class, Integer.valueOf(id_cont), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryTweet(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return queryTweet(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return listTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTweet(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tweet as Tweet");
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
	
	public static List queryTweet(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tweet as Tweet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tweet", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTweet(session, condition, orderBy);
			return (Tweet[]) list.toArray(new Tweet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet[] listTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTweet(session, condition, orderBy, lockMode);
			return (Tweet[]) list.toArray(new Tweet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return loadTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tweet[] tweets = listTweetByQuery(session, condition, orderBy);
		if (tweets != null && tweets.length > 0)
			return tweets[0];
		else
			return null;
	}
	
	public static Tweet loadTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tweet[] tweets = listTweetByQuery(session, condition, orderBy, lockMode);
		if (tweets != null && tweets.length > 0)
			return tweets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTweetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateTweetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTweetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS12425PFGallardoMartínezPersistentManager.instance().getSession();
			return iterateTweetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTweetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tweet as Tweet");
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
	
	public static java.util.Iterator iterateTweetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From basededatos.Tweet as Tweet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tweet", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet createTweet() {
		return new basededatos.Tweet();
	}
	
	public static boolean save(basededatos.Tweet tweet) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().saveObject(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(basededatos.Tweet tweet) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().deleteObject(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Tweet tweet)throws PersistentException {
		try {
			if (tweet.getRetweeteaA() != null) {
				tweet.getRetweeteaA().retweeteadoPor.remove(tweet);
			}
			
			basededatos.Comentario[] lComentarioss = tweet.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setComentadoEn(null);
			}
			basededatos.Hashtag[] lContienes = tweet.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].contenidoPor.remove(tweet);
			}
			basededatos.Tweet[] lRetweeteadoPors = tweet.retweeteadoPor.toArray();
			for(int i = 0; i < lRetweeteadoPors.length; i++) {
				lRetweeteadoPors[i].setRetweeteaA(null);
			}
			basededatos.UsuarioRegistrado[] lMencionaAs = tweet.mencionaA.toArray();
			for(int i = 0; i < lMencionaAs.length; i++) {
				lMencionaAs[i].mencionadoEn.remove(tweet);
			}
			basededatos.UsuarioRegistrado[] lMeGustaPors = tweet.meGustaPor.toArray();
			for(int i = 0; i < lMeGustaPors.length; i++) {
				lMeGustaPors[i].meGusta.remove(tweet);
			}
			if (tweet.getEscritoPor() != null) {
				tweet.getEscritoPor().escribe.remove(tweet);
			}
			
			basededatos.Multimedia[] lContieneMultimedias = tweet.contieneMultimedia.toArray();
			for(int i = 0; i < lContieneMultimedias.length; i++) {
				lContieneMultimedias[i].setPerteneceA(null);
			}
			if (tweet.getContieneTexto() != null) {
				tweet.getContieneTexto().setPerteneceA(null);
			}
			
			return delete(tweet);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(basededatos.Tweet tweet, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (tweet.getRetweeteaA() != null) {
				tweet.getRetweeteaA().retweeteadoPor.remove(tweet);
			}
			
			basededatos.Comentario[] lComentarioss = tweet.comentarios.toArray();
			for(int i = 0; i < lComentarioss.length; i++) {
				lComentarioss[i].setComentadoEn(null);
			}
			basededatos.Hashtag[] lContienes = tweet.contiene.toArray();
			for(int i = 0; i < lContienes.length; i++) {
				lContienes[i].contenidoPor.remove(tweet);
			}
			basededatos.Tweet[] lRetweeteadoPors = tweet.retweeteadoPor.toArray();
			for(int i = 0; i < lRetweeteadoPors.length; i++) {
				lRetweeteadoPors[i].setRetweeteaA(null);
			}
			basededatos.UsuarioRegistrado[] lMencionaAs = tweet.mencionaA.toArray();
			for(int i = 0; i < lMencionaAs.length; i++) {
				lMencionaAs[i].mencionadoEn.remove(tweet);
			}
			basededatos.UsuarioRegistrado[] lMeGustaPors = tweet.meGustaPor.toArray();
			for(int i = 0; i < lMeGustaPors.length; i++) {
				lMeGustaPors[i].meGusta.remove(tweet);
			}
			if (tweet.getEscritoPor() != null) {
				tweet.getEscritoPor().escribe.remove(tweet);
			}
			
			basededatos.Multimedia[] lContieneMultimedias = tweet.contieneMultimedia.toArray();
			for(int i = 0; i < lContieneMultimedias.length; i++) {
				lContieneMultimedias[i].setPerteneceA(null);
			}
			if (tweet.getContieneTexto() != null) {
				tweet.getContieneTexto().setPerteneceA(null);
			}
			
			try {
				session.delete(tweet);
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
	
	public static boolean refresh(basededatos.Tweet tweet) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().refresh(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(basededatos.Tweet tweet) throws PersistentException {
		try {
			MDS12425PFGallardoMartínezPersistentManager.instance().getSession().evict(tweet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tweet loadTweetByCriteria(TweetCriteria tweetCriteria) {
		Tweet[] tweets = listTweetByCriteria(tweetCriteria);
		if(tweets == null || tweets.length == 0) {
			return null;
		}
		return tweets[0];
	}
	
	public static Tweet[] listTweetByCriteria(TweetCriteria tweetCriteria) {
		return tweetCriteria.listTweet();
	}
}
