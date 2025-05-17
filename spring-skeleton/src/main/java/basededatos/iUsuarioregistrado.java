package basededatos;

public interface iUsuarioregistrado extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario);

	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag);

	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado);

	public Comentario[] Cargar_Comentarios(Tweet aTweet);

	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video);

	public UsuarioRegistrado Escribir_Comentario(String aTexto, String aUrl_foto, String aUrl_video);

	public UsuarioRegistrado Escribir_Retweet(String aTexto, String aUrl_foto, String aUrl_video);

	public UsuarioRegistrado Eliminar_Usuario(UsuarioRegistrado aUsuario);

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick);

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido);

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido);

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado);

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado);

	public UsuarioRegistrado DarLikeTweet(Tweet aTweet);

	public UsuarioRegistrado QuitarLikeTweet(Tweet aTweet);

	public UsuarioRegistrado DarLikeComentario(Comentario aComentario);

	public UsuarioRegistrado QuitarLikeComentario(Comentario aComentario);

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr);

	public UsuarioRegistrado BuscarUsuario(String aNick);

	public Hashtag BuscarHashtag(String aHashtag);

	public Hashtag CrearHashtag(String aHashtag);

	public UsuarioRegistrado UsarHashtag(Hashtag aH, Tweet aTweet);
}