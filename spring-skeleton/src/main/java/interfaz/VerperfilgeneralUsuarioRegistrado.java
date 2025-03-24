package interfaz;

public class VerperfilgeneralUsuarioRegistrado extends VerPerfilGeneral {
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	public VerperfilgeneralUsuarioRegistrado(MostrartweetsUsuarioRegistrado mostrartweetsUsuarioRegistrado) {
		
		_mostrartweetsUsuarioRegistrado = mostrartweetsUsuarioRegistrado; 
	}
	
	
	public VerperfilgeneralUsuarioRegistrado (ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		
		_listaUsuariosGeneralUsuarioRegistrado = listaUsuariosGeneralUsuarioRegistrado; 
	}
	
	public VerperfilgeneralUsuarioRegistrado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado ) {
		
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
	}
	
	
	public VerperfilgeneralUsuarioRegistrado() {
		
	}
	


	public void MostrartweetsUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}
}