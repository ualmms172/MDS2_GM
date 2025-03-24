package interfaz;

import vistas.VistaIniciarsesin;

public class IniciarSesin extends VistaIniciarsesin {
	//private event _autentificarse;
	//private Button _iniciarConGoogle;
	//private Button _recuperarContrase�a;
	//private Button _atras;
	//private Button _continuar;
	//private Label _titulo;
	//private Label _textoAyudaContrase�a;
	//private TextField _correoNick;
	//private TextField _contrasena;
	//private Image _iconoGoogle;
	//private Label _correoNickT;
	//private Label _contrasenaT;
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public Gestordecorreo _gestordecorreo;
	public APIDeGoogle _aPIDeGoogle;
	public IniciarsesinconGoogle _iniciarsesinconGoogle;

	public IniciarSesin(UsuarioNoRegistrado usuarioNoRegistrado) {
		
		usuarioNoRegistrado = usuarioNoRegistrado;
	}
	
	public IniciarSesin(Gestordecorreo gestordecorreo) {
		
		_gestordecorreo = gestordecorreo; 
	}
	
	public IniciarSesin(APIDeGoogle aPIDeGoogle) {
		
		_aPIDeGoogle = aPIDeGoogle; 
	}
	
	public IniciarSesin (IniciarsesinconGoogle iniciarsesinconGoogle) {
		
		_iniciarsesinconGoogle = iniciarsesinconGoogle; 
	}
	

	public void Validardatos() {
		throw new UnsupportedOperationException();
	}

	public void Recuperarlacontrasea() {
		throw new UnsupportedOperationException();
	}

	public void IniciarsesinconGoogle() {
		throw new UnsupportedOperationException();
	}

	public void Autentificarse() {
		throw new UnsupportedOperationException();
	}
}