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

	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video) throws PersistentException;

	public UsuarioRegistrado Escribir_Comentario(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video) throws PersistentException; 

	public UsuarioRegistrado Escribir_Retweet(Tweet aTweet,String aTexto, String aUrl_foto, String aUrl_video) throws PersistentException;

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario) throws PersistentException;

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) throws PersistentException;

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException;

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException;

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException;

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException;

	public UsuarioRegistrado DarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) throws PersistentException;

	public UsuarioRegistrado QuitarLikeTweet(UsuarioRegistrado aUsuario, Tweet aTweet) throws PersistentException;

	public UsuarioRegistrado DarLikeComentario(UsuarioRegistrado aUsuario, Comentario aComentario) throws PersistentException;

	public UsuarioRegistrado QuitarLikeComentario(UsuarioRegistrado aUsuario, Comentario aComentario) throws PersistentException;

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr) throws PersistentException;

	public UsuarioRegistrado BuscarUsuario(String aNick) throws PersistentException;

	public Hashtag BuscarHashtag(String aHashtag) throws PersistentException;

	public Hashtag CrearHashtag(String aHashtag) throws PersistentException;

	public UsuarioRegistrado UsarHashtag(Hashtag aH, Tweet aTweet) throws PersistentException;
}