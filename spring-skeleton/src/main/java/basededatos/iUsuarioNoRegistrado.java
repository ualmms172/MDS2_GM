package basededatos;

import org.orm.PersistentException;

public interface iUsuarioNoRegistrado {

	public Hashtag[] Cargar_Hashtags();

	public UsuarioRegistrado[] Cargar_Usuarios();

//	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario);
//
//	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag);
//
//	public Comentario[] Cargar_Comentarios(Tweet aTweet);

	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, Object aUrl_fondo, String aContrasena) throws PersistentException;

	public Logueado Loguear(String aNick, String aContrasena) throws PersistentException;
}