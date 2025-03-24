package interfaz;

public class VerperfilUsuarioNoRegistrado extends VerPerfilGeneral {
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public ListaComentariosUsuarioNoRegistrado_item _listaComentariosUsuarioNoRegistrado;
	public ListaUsuariosGeneralUsuarioNoRegistrado_item _listaUsuariosGeneralUsuarioNoRegistrado;
	public Listatweets_item _listatweets;

	public void Listatweets() {
		throw new UnsupportedOperationException();
	}
	
	public VerperfilUsuarioNoRegistrado(VertweetUsuarioNoRegistrado vertweetUsuarioNoRegistrado) {
		
		
		_vertweetUsuarioNoRegistrado = vertweetUsuarioNoRegistrado;
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
	}
	
	public VerperfilUsuarioNoRegistrado(ListaComentariosUsuarioNoRegistrado_item listaComentariosUsuarioNoRegistrado) {
	
	_listaComentariosUsuarioNoRegistrado = listaComentariosUsuarioNoRegistrado;
	this.getButtonBloquear().setVisible(false);
	this.getButtonEliminarCuenta().setVisible(false);
	this.getButtonModidicarDatos().setVisible(false);
	this.getButtonSeguir().setVisible(false);
	this.getLabelAvisoBloqueo().setVisible(false);
	this.getButtonBanear().setVisible(false);
	}
	
	public VerperfilUsuarioNoRegistrado(ListaUsuariosGeneralUsuarioNoRegistrado_item listaUsuariosGeneralUsuarioNoRegistrado) {
		
		_listaUsuariosGeneralUsuarioNoRegistrado = listaUsuariosGeneralUsuarioNoRegistrado; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
	}
	
	public VerperfilUsuarioNoRegistrado(Listatweets_item listatweets) {
		
		_listatweets = listatweets; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
	}
	
	
	
}