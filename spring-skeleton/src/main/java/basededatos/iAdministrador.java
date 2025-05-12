package basededatos;

public interface iAdministrador extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario);

	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag);

	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado);

	public Comentario[] Cargar_Comentarios(Tweet aTweet);

	public UsuarioRegistrado[] Cargar_Baneados();

	public void Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador);

	public void Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador);

	public void BorrarTweet(Tweet aTweet);

	public void BorrarComentario(Comentario aComentario);
}