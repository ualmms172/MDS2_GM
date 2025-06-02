package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Tweet;

public class BD_Tweet {
	public BDPrincipal _bd_prin_twe;
	public Vector<Tweet> _contiene_Tweets = new Vector<Tweet>();


	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
		
		  PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		    UsuarioRegistrado autor = null;

		    try {
		        // Suponiendo que tienes una forma de obtener el usuario actual
		        autor = aUsuario; // ⚠️ Sustituye por el ID correcto

		        // Crear el contenido base
		        Tweet tweet = TweetDAO.createTweet();
		        tweet.setEscritoPor(autor);

		        // Asociar texto si hay
		        if (aTexto != null && !aTexto.isEmpty()) {
		            Texto texto = TextoDAO.createTexto();
		            texto.setTexto(aTexto);
		            texto.setPerteneceA(tweet);
		            tweet.setContieneTexto(texto);
		            TextoDAO.save(texto);
		        }

		        // Asociar multimedia si hay URL
		        if (aUrl_foto != null && !aUrl_foto.isEmpty()) {
		            Multimedia foto = MultimediaDAO.createMultimedia();
		            foto.setUrl(aUrl_foto);
		            foto.setFoto(true);
		            foto.setPerteneceA(tweet);
		            MultimediaDAO.save(foto);
		        }

		        if (aUrl_video != null && !aUrl_video.isEmpty()) {
		            Multimedia video = MultimediaDAO.createMultimedia();
		            video.setUrl(aUrl_video);
		            video.setFoto(false);
		            video.setPerteneceA(tweet);
		            MultimediaDAO.save(video);
		        }

		        TweetDAO.save(tweet);
		        t.commit();
		    } catch (Exception e) {
		        t.rollback();
		        e.printStackTrace();
		    }

		    MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		    return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
		}
		
		

	public UsuarioRegistrado Escribir_Retweet(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado autor = null;

		try {
			Tweet retweet = TweetDAO.createTweet();
			retweet.setRetweeteaA(aTweet);

			autor = aUsuario;  
			retweet.setEscritoPor(autor);

			if (aTexto != null && !aTexto.isEmpty()) {
				Texto texto = TextoDAO.createTexto();
				texto.setTexto(aTexto);
				texto.setPerteneceA(retweet);
				TextoDAO.save(texto);
				retweet.setContieneTexto(texto);
			}

			TweetDAO.save(retweet);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
		
	
	}

	public Administrador BorrarTweet(Tweet aTweet,Administrador aAdministrador) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			TweetDAO.delete(aTweet);
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
			aTweet.meGustaPor.add(aUsuario);
			aUsuario.meGusta.add(aTweet);
			TweetDAO.save(aTweet);
			UsuarioRegistradoDAO.save(aUsuario);
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
			aTweet.meGustaPor.remove(aUsuario);
			aUsuario.meGusta.remove(aTweet);
			TweetDAO.save(aTweet);
			UsuarioRegistradoDAO.save(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
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


	public UsuarioRegistrado UsarHashtag(Hashtag aH, Tweet aTweet) throws PersistentException {
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado autor = null;

		try {
			aTweet.setContiene(aH); // Relación @ManyToOne con Hashtag
			autor = aTweet.getEscritoPor();

			if (autor != null && !autor.creaHashtag.contains(aH)) {
				autor.creaHashtag.add(aH);
			}

			TweetDAO.save(aTweet);
			HashtagDAO.save(aH);
			if (autor != null) {
				UsuarioRegistradoDAO.save(autor);
			}

			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return  UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(autor.getID());
	}

}