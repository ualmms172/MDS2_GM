package interfaz;

public class VerperfilgeneralUsuarioRegistrado extends VerPerfilGeneral {
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	public VerperfilgeneralUsuarioRegistrado(MostrartweetsUsuarioRegistrado mostrartweetsUsuarioRegistrado) {
		
		_mostrartweetsUsuarioRegistrado = mostrartweetsUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
	}
	
	
	public VerperfilgeneralUsuarioRegistrado (ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		
		_listaUsuariosGeneralUsuarioRegistrado = listaUsuariosGeneralUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
	}
	
	public VerperfilgeneralUsuarioRegistrado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado ) {
		
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
	}
	
	
	public VerperfilgeneralUsuarioRegistrado() {
		
	}
	


	public void MostrartweetsUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}
}