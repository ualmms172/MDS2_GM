package basededatos;

import org.orm.PersistentException;

public interface iUsuarioregistrado extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

//	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario);
//
//	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag);
//
//	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado);

//	public Comentario[] Cargar_Comentarios(Tweet aTweet);

	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) ;

	public UsuarioRegistrado Escribir_Comentario(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) ; 

	public UsuarioRegistrado Escribir_Retweet(Tweet aTweet,String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) ;

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario);

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) ;

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) ;

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) ;

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) ;

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) ;

	public UsuarioRegistrado DarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) ;

	public UsuarioRegistrado QuitarLikeTweet(UsuarioRegistrado aUsuario, Tweet aTweet) ;

	public UsuarioRegistrado DarLikeComentario(UsuarioRegistrado aUsuario, Comentario aComentario) ;

	public UsuarioRegistrado QuitarLikeComentario(UsuarioRegistrado aUsuario, Comentario aComentario) ;

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr) ;

	public UsuarioRegistrado BuscarUsuario(String aNick) ;

	public Hashtag BuscarHashtag(String aHashtag) ;

	public Hashtag CrearHashtag(String aHashtag) ;

	public UsuarioRegistrado UsarHashtag(Hashtag aH, Tweet aTweet) ;
}