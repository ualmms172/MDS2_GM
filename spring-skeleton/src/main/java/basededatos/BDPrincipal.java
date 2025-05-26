package basededatos;

import org.orm.PersistentException;

public class BDPrincipal implements iUsuarioregistrado, iUsuarioNoRegistrado, iAdministrador, iLogueado {
	public BD_UsuarioRegistrado _bd_usu;
	public BD_Administrador _bd_adm;
	public BD_Tweet _bd_twe;
	public BD_Comentario _bd_com;
	public BD_Hashtag _bd_has;
	public BD_Texto _bd_tex;
	public BD_Multimedia _bd_mul;

	public UsuarioRegistrado[] Cargar_Usuarios() {
		throw new UnsupportedOperationException();
	}

	public Hashtag[] Cargar_Hashtags() {
		throw new UnsupportedOperationException();
	}

//	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario) {
//		throw new UnsupportedOperationException();
//	}
//
//	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag) {
//		throw new UnsupportedOperationException();
//	}
//
//	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado) {
//		throw new UnsupportedOperationException();
//	}
//
//	public Comentario[] Cargar_Comentarios(Tweet aTweet) {
//		throw new UnsupportedOperationException();
//	}

	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
		
		return _bd_twe.Escribir_Tweet(aTexto, aUrl_foto, aUrl_video, aUsuario); 
	}

	public UsuarioRegistrado Escribir_Comentario(Tweet aTweet,String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
	
		return _bd_com.Escribir_Comentario(aTweet, aTexto, aUrl_foto, aUrl_video, aUsuario); 
		
		
	}

	public UsuarioRegistrado Escribir_Retweet(Tweet aTweet,String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
		return _bd_twe.Escribir_Retweet(aTweet, aTexto, aUrl_foto, aUrl_video, aUsuario); 
	}

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario) throws PersistentException {
		
		 Administrador admin = _bd_usu.Eliminar_Usuario(aUsuario); 
	
	}

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) throws PersistentException {
	
		
		return _bd_usu.ModificarCuenta(aUsuario, aDescripcion, aUrl_fondo, aUrl_perfil, aNick); 

	}

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException {
		
		return _bd_usu.Seguir_Usuario(aSeguidor, aSeguido); 
		
	}

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException {
		return _bd_usu.Dejar_Seguir(aSeguidor, aSeguido); 
	}

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException {
		return _bd_usu.Bloquear(aBloqueador, aBloqueado); 
	}

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException {

		return _bd_usu.Desbloquear(aBloqueador, aBloqueado); 
	}

	public UsuarioRegistrado DarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) throws PersistentException {

	    return _bd_twe.DarLikeTweet(aUsuario, aTweet); 
	}

	public UsuarioRegistrado QuitarLikeTweet(UsuarioRegistrado aUsuario,Tweet aTweet) throws PersistentException {
		
		return _bd_twe.QuitarLikeTweet(aUsuario, aTweet);
	}

	public UsuarioRegistrado DarLikeComentario(UsuarioRegistrado aUsuario,Comentario aComentario) throws PersistentException {

	    return this._bd_com.DarLikeComentario(aUsuario, aComentario); 
	}

	public UsuarioRegistrado QuitarLikeComentario(UsuarioRegistrado aUsuario,Comentario aComentario) throws PersistentException {
		
		return this._bd_com.QuitarLikeComentario(aUsuario, aComentario); 
	}

	public UsuarioRegistrado Mencionar(Tweet aTweet, UsuarioRegistrado aUr) throws PersistentException {
		return this._bd_twe.Mencionar(aTweet, aUr); 
	}

	public UsuarioRegistrado BuscarUsuario(String aNick) throws PersistentException {
	    return this._bd_usu.BuscarUsuario(aNick); 
	}

	public Hashtag BuscarHashtag(String aHashtag) throws PersistentException {
        return this._bd_has.BuscarHashtag(aHashtag); 
	
	}

	public Hashtag CrearHashtag(String aHashtag) throws PersistentException {

        return this._bd_has.CrearHashtag(aHashtag); 	
	}

	public UsuarioRegistrado UsarHashtag(Hashtag aH, Tweet aTweet) throws PersistentException {
		return this._bd_twe.UsarHashtag(aH, aTweet); 
	}

	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, Object aUrl_fondo, String aContrasena) throws PersistentException {

	
	    return this._bd_usu.Registrar_Usuario(aNick, aDescripcion, aUrl_perfil, aUrl_perfil, aContrasena); 
	
	
	}

	public Logueado Loguear(String aNick, String aPassword) throws PersistentException {

	
		Logueado log = this._bd_usu.buscar_usuario(aNick, aPassword);
		if(log==null)
			log = this._bd_adm.Buscar_administrador(aNick, aPassword);
		
		return log;
	}

	public UsuarioRegistrado[] Cargar_Baneados() throws PersistentException {
		
		return this._bd_usu.Cargar_Baneados(); 
		
	}

	public Administrador Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) throws PersistentException {

	     return this._bd_adm.Banear(aUsuarioRegistrado, aAdministrador); 
	
	
	
	}

	public Administrador Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) throws PersistentException {
		return this._bd_adm.Desbanear(aUsuarioRegistrado, aAdministrador); 
	}

	public Administrador BorrarTweet(Tweet aTweet) throws PersistentException {
        return this._bd_twe.BorrarTweet(aTweet, get_Administrador()); 
	
	}

	public Administrador BorrarComentario(Comentario aComentario) throws PersistentException {

		return this._bd_com.BorrarComentario(aComentario); 
	
	}

	public UsuarioRegistrado get_Usuarioregistrado() {

		return null; 
	
	
	}

	public Logueado get_Logueado(String aNick, String aPassword) throws PersistentException {
		return null; 
	}

	public Administrador get_Administrador() {
	
	 return null; 
		
	}

	@Override
	public UsuarioRegistrado Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video) throws PersistentException {

	   return this._bd_twe.Escribir_Tweet(aTexto, aUrl_foto, aUrl_video, get_Usuarioregistrado()); 
		
	}

	@Override
	public UsuarioRegistrado Escribir_Comentario(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video) throws PersistentException {
		// TODO Auto-generated method stub
		return this._bd_com.Escribir_Comentario(aTweet, aTexto, aUrl_foto, aUrl_video, get_Usuarioregistrado()); 
	}

	@Override
	public UsuarioRegistrado Escribir_Retweet(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video) throws PersistentException {
		// TODO Auto-generated method stub
	
		return this._bd_twe.Escribir_Retweet(aTweet, aTexto, aUrl_foto, aUrl_video, get_Usuarioregistrado()); 
		
	}
}