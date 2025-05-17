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

	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Escribir_Retweet(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public Administrador BorrarTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado DarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado QuitarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado UsarHashtag(Hashtag aH, Tweet aTweet) {
		throw new UnsupportedOperationException();
	}
}