package basededatos;

public interface iUsuarioregistrado extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario);

	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag);

	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado);

	public Comentario[] Cargar_Comentarios(Tweet aTweet);

	public void Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video);

	public void Escribir_Comentario(String aTexto, String aUrl_foto, String aUrl_video);

	public void Escribir_Retweet(String aTexto, String aUrl_foto, String aUrl_video);

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario);

	public void ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick);

	public void Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido);

	public void Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido);

	public void Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado);

	public void Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado);

	public void DarLikeTweet(Tweet aTweet);

	public void QuitarLikeTweet(Tweet aTweet);

	public void DarLikeComentario(Comentario aComentario);

	public void QuitarLikeComentario(Comentario aComentario);

	public void Mencionar(Tweet aTweet, UsuarioRegistrado aUr);

	public UsuarioRegistrado BuscarUsuario(String aNick);

	public Hashtag BuscarHashtag(String aHashtag);

	public Hashtag CrearHashtag(String aHashtag);

	public void UsarHashtag(Hashtag aH, Tweet aTweet);
}