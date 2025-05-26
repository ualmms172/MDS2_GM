package basededatos;

import org.orm.PersistentException;

public interface iAdministrador extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

//	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario);
//
//	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag);
//
//	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado);
//
//	public Comentario[] Cargar_Comentarios(Tweet aTweet);

	public UsuarioRegistrado[] Cargar_Baneados() throws PersistentException;

	public Administrador Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) throws PersistentException;

	public Administrador Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) throws PersistentException;

	public Administrador BorrarTweet(Tweet aTweet) throws PersistentException;

	public Administrador BorrarComentario(Comentario aComentario) throws PersistentException;
}