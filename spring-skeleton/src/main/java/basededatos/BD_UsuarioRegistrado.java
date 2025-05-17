package basededatos;

import java.util.Vector;
import basededatos.UsuarioRegistrado;

public class BD_UsuarioRegistrado {
	public BDPrincipal _bd_prin_usu;
	public Vector<UsuarioRegistrado> _contiene_UsuariosRegistrados = new Vector<UsuarioRegistrado>();

	public UsuarioRegistrado buscar_usuario(String aNick, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Cargar_Usuarios() {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado[] Cargar_Baneados() {
		throw new UnsupportedOperationException();
	}

	public Administrador Eliminar_Usuario(UsuarioRegistrado aUsuario) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, String aUrl_fondo, String aContrasena) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado DarLikeATweet(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public UsuarioRegistrado BuscarUsuario(String aNick) {
		throw new UnsupportedOperationException();
	}
}