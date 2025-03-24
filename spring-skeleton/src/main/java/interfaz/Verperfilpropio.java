package interfaz;

public class Verperfilpropio extends VerperfilgeneralUsuarioRegistrado {
	

	//private Button _eliminarCuenta;
	//private Button _modificarDatos;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public Eliminarpropiacuenta _eliminarpropiacuenta;
	public Modificardatoscuenta _modificardatoscuenta;
	
	
	public Verperfilpropio(MostrartweetsUsuarioRegistrado mostrartweetsUsuarioRegistrado) {
		super(mostrartweetsUsuarioRegistrado);
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilpropio(UsuarioRegistrado usuarioregistrado) {
		 
		_usuarioregistrado  = usuarioregistrado; 	
	}
	
	public Verperfilpropio(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilpropio(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		super(vertweetgeneralUsuarioRegistrado);
		// TODO Auto-generated constructor stub
	}

	
	public void Eliminarpropiacuenta() {
		throw new UnsupportedOperationException();
	}

	public void Modificardatoscuenta() {
		throw new UnsupportedOperationException();
	}
}