package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilUsuarioNoRegistrado extends VerPerfilGeneral {
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public ListaComentariosUsuarioNoRegistrado_item _listaComentariosUsuarioNoRegistrado;
	public ListaUsuariosGeneralUsuarioNoRegistrado_item _listaUsuariosGeneralUsuarioNoRegistrado;
	public Listatweets_item _listatweets_item;
	public Listatweets _listatweets;

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listatweets);
	}
	
	public VerperfilUsuarioNoRegistrado(VertweetUsuarioNoRegistrado vertweetUsuarioNoRegistrado) {
		
		
		_vertweetUsuarioNoRegistrado = vertweetUsuarioNoRegistrado;
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		Listatweets();
	}
	
	
	public VerperfilUsuarioNoRegistrado(ListaComentariosUsuarioNoRegistrado_item listaComentariosUsuarioNoRegistrado) {
	
		_listaComentariosUsuarioNoRegistrado = listaComentariosUsuarioNoRegistrado;
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
	
		Listatweets();
	}
	
	public VerperfilUsuarioNoRegistrado(ListaUsuariosGeneralUsuarioNoRegistrado_item listaUsuariosGeneralUsuarioNoRegistrado) {
		
		_listaUsuariosGeneralUsuarioNoRegistrado = listaUsuariosGeneralUsuarioNoRegistrado; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		Listatweets();
	}
	
	public VerperfilUsuarioNoRegistrado(Listatweets_item listatweets) {
		
		_listatweets_item = listatweets; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		Listatweets();
	}
	
	
	
}