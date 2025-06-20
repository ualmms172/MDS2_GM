package basededatos;

import org.orm.PersistentException;

public interface iUsuarioregistrado extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

	public Tweet Escribir_Tweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado, UsuarioRegistrado aUsuario) ;

	public Comentario Escribir_Comentario(Tweet aTweet, UsuarioRegistrado aUsuario) ; 

	public Tweet Escribir_Retweet(Hashtag aHashtag, UsuarioRegistrado aUsuarioMencionado,Tweet aTweet, UsuarioRegistrado aUsuario) ;

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

	public Hashtag CrearHashtag(String aHashtag,UsuarioRegistrado aUsuario) ;
	
	public UsuarioRegistrado ObtenerUsuarioId(UsuarioRegistrado aUsuario);
	
	public Tweet ObtenerTweetId (Tweet aTweet);
	
	public Hashtag ObtenerHashtagId(Hashtag aHashtag);
	
	public UsuarioRegistrado Escribir_Texto(String aTexto, Contenido aContenido);
	
	public UsuarioRegistrado Escribir_Multimedia(String aUrl_foto, String aUrl_video,Contenido aContenido);

	
}