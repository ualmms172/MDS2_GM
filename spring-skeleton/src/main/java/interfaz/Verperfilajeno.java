package interfaz;

import vistas.VistaVerperfilajeno;

public class Verperfilajeno extends VistaVerperfilajeno {
	public VerperfilUsuarioRegistrado _verperfilUsuarioRegistrado;
	public Verperfilnobloqueado _verperfilnobloqueado;
	public Verperfilbloqueado _verperfilbloqueado;
	
	public Verperfilajeno(VerperfilUsuarioRegistrado verperfilUsuarioRegistrado) {
		_verperfilUsuarioRegistrado= verperfilUsuarioRegistrado;
		
	}
	
	public void Verperfilnobloqueado() {
		throw new UnsupportedOperationException();
	}

	public void Verperfilbloqueado() {
		throw new UnsupportedOperationException();
	}
}