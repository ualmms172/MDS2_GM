package interfaz;

import vistas.VistaVerbaneados;

public class Verbaneados extends VistaVerbaneados {
	//private Label _titulo;
	public Administrador _administrador;
	public UsuariosBaneados _usuariosBaneados;
	
	
	public Verbaneados(Administrador administrador) {
		
		_administrador = administrador; 
	}
	
	

	public void UsuariosBaneados() {
		throw new UnsupportedOperationException();
	}
}