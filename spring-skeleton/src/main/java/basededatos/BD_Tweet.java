package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Tweet;

public class BD_Tweet {
	public BDPrincipal _bd_prin_twe;
	public Vector<Tweet> _contiene_Tweets = new Vector<Tweet>();


	public Tweet Escribir_Tweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado, UsuarioRegistrado aUsuario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
	    Tweet tweet = null;

	    try {
	        UsuarioRegistrado autor = aUsuario;

	     // Crear el nuevo tweet
	        tweet = TweetDAO.createTweet();
	        tweet.setEscritoPor(autor);

	        // Asociar el hashtag si no es null
	        if (aHashtag != null) {
	            tweet.setContiene(aHashtag);
	            aHashtag.setNumTweets(aHashtag.getNumTweets()+1);
	            HashtagDAO.save(aHashtag);
	        }

	        if (aUsuarioMencionado != null) {
	            tweet.setMencionaA(aUsuarioMencionado);
	        }

	        // Guarda el tweet primero para evitar TransientPropertyValueException
	        TweetDAO.save(tweet);


	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }

	    return TweetDAO.loadTweetByORMID(tweet.getORMID());
	}

		
		

	public Tweet Escribir_Retweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado, Tweet aTweet, UsuarioRegistrado aUsuario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
//	    UsuarioRegistrado autor = null;
	    Tweet retweet=null;

	    try {
	        UsuarioRegistrado autor = aUsuario;

	        // Crear retweet
	        retweet = TweetDAO.createTweet();
	        retweet.setEscritoPor(autor);
	        retweet.setRetweeteaA(aTweet);


	        // Asociar hashtag si no es null
	        if (aHashtag != null) {
	            retweet.setContiene(aHashtag);
	            aHashtag.setNumTweets(aHashtag.getNumTweets()+1);
	            HashtagDAO.save(aHashtag);
	        }

	        // Mencionar usuario si no es null
	        if (aUsuarioMencionado != null) {
	            retweet.setMencionaA(aUsuarioMencionado);
	        }

	        // Guardar el retweet y el autor
	        TweetDAO.save(retweet);
	        UsuarioRegistradoDAO.save(autor);

	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }

	    return TweetDAO.loadTweetByORMID(retweet.getORMID());
	}


	public Administrador BorrarTweet(Tweet aTweet,Administrador aAdministrador) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			

			TweetDAO.deleteAndDissociate(aTweet);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return AdministradorDAO.loadAdministradorByORMID(aAdministrador.getID());
			
	}

	public UsuarioRegistrado DarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) throws PersistentException {

		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			
			// Carga los objetos desde la sesión actual para evitar objetos duplicados
	        UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
	        Tweet tweet = TweetDAO.loadTweetByORMID(aTweet.getORMID());

	        // Establece la relación
	        tweet.meGustaPor.add(usuario);
	        usuario.meGusta.add(tweet);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
	
	}

	public UsuarioRegistrado QuitarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) throws PersistentException {
	
		 PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		    try {
		        UsuarioRegistrado usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
		        Tweet tweet = TweetDAO.loadTweetByORMID(aTweet.getORMID());

		        tweet.meGustaPor.remove(usuario);
		        usuario.meGusta.remove(tweet);

		        TweetDAO.save(tweet);
		        UsuarioRegistradoDAO.save(usuario);

		        t.commit();
		        return usuario;
		    } catch (Exception e) {
		        t.rollback();
		        throw new PersistentException(e);
		    } finally {
		        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		    }
	}
		
		

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr) throws PersistentException {
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aTweet.setMencionaA(aUr); // Relación @ManyToOne
			TweetDAO.save(aTweet);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUr.getID());
	}
	
	public Tweet ObtenerTweetId (Tweet aTweet) throws PersistentException {
		Tweet twe = null;
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			twe = TweetDAO.loadTweetByORMID(aTweet.getORMID());
					
		} catch (Exception e) {
			t.rollback();
		}

		return twe;
	}




}