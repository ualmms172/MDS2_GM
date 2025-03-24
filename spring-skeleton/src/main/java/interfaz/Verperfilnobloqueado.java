package interfaz;

public class Verperfilnobloqueado extends VerperfilgeneralUsuarioRegistrado {
	public Verperfilnobloqueado(interfaz.MostrartweetsUsuarioRegistrado mostrartweetsUsuarioRegistrado) {
		super(mostrartweetsUsuarioRegistrado);
		// TODO Auto-generated constructor stub
	}

	//private event _seguirUsuario;
	//private event _bloquear;
	//private event _dejardeseguirausuario;
	//private event _desbloquear;
	//private Button _seguir;
	//private Button _bloquearB;
	public Verperfilajeno _verperfilajeno;
	
	public Verperfilnobloqueado(Verperfilajeno verperfilajeno) {
		
		_verperfilajeno = verperfilajeno; 
	}
	
	
	

	public void SeguirUsuario() {
		throw new UnsupportedOperationException();
	}

	public void Bloquear() {
		throw new UnsupportedOperationException();
	}

	public void Dejardeseguirausuario() {
		throw new UnsupportedOperationException();
	}

	public void Desbloquear() {
		throw new UnsupportedOperationException();
	}
}