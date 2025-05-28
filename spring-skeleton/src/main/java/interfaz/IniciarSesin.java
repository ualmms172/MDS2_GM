package interfaz;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaIniciarsesin;
import gallardoMartinez.MainView;

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
		
		_usuarioNoRegistrado = usuarioNoRegistrado;
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioNoRegistrado.MainView.removeAll(); 
			this._usuarioNoRegistrado.MainView.add(this._usuarioNoRegistrado);
		});
		
		this.getButtonContinuar().addClickListener(event -> Autentificarse()); 
		
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
		
		String nick = this.getTextFieldCorreo().getValue();
		String pass = this.getTextFieldContraseña().getValue();
		basededatos.Logueado log = this._usuarioNoRegistrado._iUsuarioNoRegistrado.Loguear(nick, pass);
		if(log==null) 
			return;
		
		this._usuarioNoRegistrado.MainView.removeAll();
		if(log instanceof basededatos.Administrador) {
			Administrador a = new Administrador((MainView)Pantalla.MainView,(basededatos.Administrador)log);
			this._usuarioNoRegistrado.MainView.add(a);
		}
		else {
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,(basededatos.UsuarioRegistrado)log);
			this._usuarioNoRegistrado.MainView.add(u);
		}
		
		
		
		//Autentificación Administrador
		
	     
		/*this._usuarioNoRegistrado.MainView.removeAll();
		Administrador admin = new Administrador(this._usuarioNoRegistrado.MainView); 
		this._usuarioNoRegistrado.MainView.add(admin);
	    */
		
		
		
	}
}