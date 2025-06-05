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

	public UsuarioRegistrado Escribir_Tweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado, String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
	    UsuarioRegistrado autor = null;

	    try {
	        autor = aUsuario;

	        // Crear el nuevo tweet
	        Tweet tweet = TweetDAO.createTweet();
	        tweet.setEscritoPor(autor);

	        // Asociar texto si lo hay
	        if (aTexto != null && !aTexto.isEmpty()) {
	            Texto texto = TextoDAO.createTexto();
	            texto.setTexto(aTexto);
	            texto.setPerteneceA(tweet);
	            tweet.setContieneTexto(texto);
	            TextoDAO.save(texto);
	        }

	        // Asociar foto si la hay
	        if (aUrl_foto != null && !aUrl_foto.isEmpty()) {
	            Multimedia foto = MultimediaDAO.createMultimedia();
	            foto.setUrl(aUrl_foto);
	            foto.setFoto(true);
	            foto.setPerteneceA(tweet);
	            MultimediaDAO.save(foto);
	        }

	        // Asociar video si lo hay
	        if (aUrl_video != null && !aUrl_video.isEmpty()) {
	            Multimedia video = MultimediaDAO.createMultimedia();
	            video.setUrl(aUrl_video);
	            video.setFoto(false);
	            video.setPerteneceA(tweet);
	            MultimediaDAO.save(video);
	        }

	        // Asociar el hashtag si no es null
	        if (aHashtag != null) {
	            tweet.setContiene(aHashtag);
	            aHashtag.setNumTweets(aHashtag.getNumTweets()+1);
	            HashtagDAO.save(aHashtag);
	        }

	        if (aUsuarioMencionado != null) {
	            tweet.setMencionaA(aUsuarioMencionado);
	        }

	        // Guardar el tweet y el autor
	        TweetDAO.save(tweet);
	        UsuarioRegistradoDAO.save(autor);

	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }

	    return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(autor.getID());
	}

		
		

	public UsuarioRegistrado Escribir_Retweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado, Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
	    UsuarioRegistrado autor = null;

	    try {
	        autor = aUsuario;

	        // Crear retweet
	        Tweet retweet = TweetDAO.createTweet();
	        retweet.setEscritoPor(autor);
	        retweet.setRetweeteaA(aTweet);

	        // Agregar texto si lo hay
	        if (aTexto != null && !aTexto.isEmpty()) {
	            Texto texto = TextoDAO.createTexto();
	            texto.setTexto(aTexto);
	            texto.setPerteneceA(retweet);
	            retweet.setContieneTexto(texto);
	            TextoDAO.save(texto);
	        }

	        // Agregar foto si la hay
	        if (aUrl_foto != null && !aUrl_foto.isEmpty()) {
	            Multimedia foto = MultimediaDAO.createMultimedia();
	            foto.setUrl(aUrl_foto);
	            foto.setFoto(true);
	            foto.setPerteneceA(retweet);
	            MultimediaDAO.save(foto);
	        }

	        // Agregar video si lo hay
	        if (aUrl_video != null && !aUrl_video.isEmpty()) {
	            Multimedia video = MultimediaDAO.createMultimedia();
	            video.setUrl(aUrl_video);
	            video.setFoto(false);
	            video.setPerteneceA(retweet);
	            MultimediaDAO.save(video);
	        }

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

	    return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(autor.getID());
	}


	public Administrador BorrarTweet(Tweet aTweet,Administrador aAdministrador) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			
			if(aTweet.getContiene()!=null) {
				aTweet.getContiene().setNumTweets(aTweet.getContiene().getNumTweets()-1);
			}
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

/*
	public UsuarioRegistrado UsarHashtag(Hashtag h, String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
	    UsuarioRegistrado autor = null;

	    try {
	        autor = aUsuario;

	        // Crear nuevo tweet
	        Tweet tweet = TweetDAO.createTweet();
	        tweet.setEscritoPor(autor);

	        // Asignar texto si lo hay
	        if (aTexto != null && !aTexto.isEmpty()) {
	            Texto texto = TextoDAO.createTexto();
	            texto.setTexto(aTexto);
	            texto.setPerteneceA(tweet);
	            tweet.setContieneTexto(texto);
	            TextoDAO.save(texto);
	        }

	        // Asignar multimedia si lo hay
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

	        // Asociar el hashtag al tweet
	        tweet.setContiene(h);

	        // Guardar todo
	        TweetDAO.save(tweet);
	        HashtagDAO.save(h);
	        UsuarioRegistradoDAO.save(autor);

	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }

	    return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(autor.getID());
	}
	*/


}