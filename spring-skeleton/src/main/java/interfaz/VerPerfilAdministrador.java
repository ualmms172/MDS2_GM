package interfaz;

public class VerPerfilAdministrador extends VerPerfilGeneral {
	//private Button _banear;
	public ListaUsuariosGeneralAdministrador_item _listaUsuariosGeneralAdministrador;
	public ListaTweetsAdmin_item _listaTweetsAdmin;
	public VerTweetAdministrador _verTweetAdministrador;
	public ListaComentariosAdministrador_item _listaComentariosAdministrador;
	public BanearUsuario _banearUsuario;
	
	public VerPerfilAdministrador(ListaUsuariosGeneralAdministrador_item listaUsuariosGeneralAdministrador) {
		_listaUsuariosGeneralAdministrador = listaUsuariosGeneralAdministrador; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
	}
	
	public VerPerfilAdministrador(ListaTweetsAdmin_item listaTweetsAdmin ) {
		
		_listaTweetsAdmin = listaTweetsAdmin; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
	}
	
	public VerPerfilAdministrador(VerTweetAdministrador verTweetAdministrador) {
		
		_verTweetAdministrador = verTweetAdministrador; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
	}
	

	public VerPerfilAdministrador(ListaComentariosAdministrador_item listaComentariosAdministrador) {
		
		_listaComentariosAdministrador = listaComentariosAdministrador; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
	}
	
	
	
	
	
	
	
	
	

	public void BanearUsuario() {
		throw new UnsupportedOperationException();
	}

	public void ListaTweetsAdmin() {
		throw new UnsupportedOperationException();
	}
}