package basededatos;

import java.time.LocalDate;
import java.util.Date;

import org.orm.PersistentException;

public interface iAdministrador extends iLogueado {

	public UsuarioRegistrado[] Cargar_Usuarios();

	public Hashtag[] Cargar_Hashtags();

	public UsuarioRegistrado[] Cargar_Baneados() ;

	public Administrador Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador,Date aFecha) ;

	public Administrador Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) ;

	public Administrador BorrarTweet(Tweet aTweet,Administrador aAdministrador) ;

	public Administrador BorrarComentario(Comentario aComentario,Administrador aAdministrador);
	
//	public void BorrarComentarios(Tweet aTweet);
	
//	public void BorrarTexto(Contenido aContenido);
//	
//	public void BorrarMultimedia(Contenido aContenido);
	
	public Administrador ObtenerAdminId(Administrador aAdministrador);
	
	public Tweet ObtenerTweetId (Tweet aTweet);
	
	public UsuarioRegistrado ObtenerUsuarioId(UsuarioRegistrado aUsuario);
	
	public Hashtag ObtenerHashtagId(Hashtag aHashtag);
}