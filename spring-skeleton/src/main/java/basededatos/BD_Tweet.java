package basededatos;

import java.util.Vector;
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

	public void Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public void Escribir_Retweet(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public void BorrarTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void DarLikeTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void QuitarLikeTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void Mencionar(Tweet aTweet, UsuarioRegistrado aUr) {
		throw new UnsupportedOperationException();
	}

	public void UsarHashtag(Hashtag aH, Tweet aTweet) {
		throw new UnsupportedOperationException();
	}
}