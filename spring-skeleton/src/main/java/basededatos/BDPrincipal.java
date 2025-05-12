package basededatos;

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

	public Tweet[] Cargar_TweetsUsuario(UsuarioRegistrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] Cargar_TweetsHashtag(Hashtag aHashtag) {
		throw new UnsupportedOperationException();
	}

	public Tweet[] Cargar_TweetsPrincipales(Logueado aLogueado) {
		throw new UnsupportedOperationException();
	}

	public Comentario[] Cargar_Comentarios(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void Escribir_Tweet(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public void Escribir_Comentario(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public void Escribir_Retweet(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public void ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) {
		throw new UnsupportedOperationException();
	}

	public void Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) {
		throw new UnsupportedOperationException();
	}

	public void Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) {
		throw new UnsupportedOperationException();
	}

	public void Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) {
		throw new UnsupportedOperationException();
	}

	public void Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) {
		throw new UnsupportedOperationException();
	}

	public void DarLikeTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void QuitarLikeTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void DarLikeComentario(Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public void QuitarLikeComentario(Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public void Mencionar(Tweet aTweet, UsuarioRegistrado aUr) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado BuscarUsuario(String aNick) {
		throw new UnsupportedOperationException();
	}

	public Hashtag BuscarHashtag(String aHashtag) {
		throw new UnsupportedOperationException();
	}

	public Hashtag CrearHashtag(String aHashtag) {
		throw new UnsupportedOperationException();
	}

	public void UsarHashtag(Hashtag aH, Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, Object aUrl_fondo, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public Logueado Loguear(String aNick, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado[] Cargar_Baneados() {
		throw new UnsupportedOperationException();
	}

	public void Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) {
		throw new UnsupportedOperationException();
	}

	public void Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) {
		throw new UnsupportedOperationException();
	}

	public void BorrarTweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void BorrarComentario(Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado get_Usuarioregistrado() {
		throw new UnsupportedOperationException();
	}

	public Logueado get_Logueado() {
		throw new UnsupportedOperationException();
	}



	public Administrador get_Administrador() {
		throw new UnsupportedOperationException();
	}
}