package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verperfilpropio extends VerperfilgeneralUsuarioRegistrado {
	

	//private Button _eliminarCuenta;
	//private Button _modificarDatos;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public Eliminarpropiacuenta _eliminarpropiacuenta;
	public Modificardatoscuenta _modificardatoscuenta;
	
	
	
	public Verperfilpropio(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado) {
		super(mostrartweetsUsuarioRegistrado);
		// TODO Auto-generated constructor stub
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
	}
	
	
	
	public Verperfilpropio(UsuarioRegistrado usuarioregistrado) {
		 
		_usuarioregistrado  = usuarioregistrado; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
	}
	
	public Verperfilpropio(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		// TODO Auto-generated constructor stub
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
	}
	
	public Verperfilpropio(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		super(vertweetgeneralUsuarioRegistrado);
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		// TODO Auto-generated constructor stub
	}


	
	public void Eliminarpropiacuenta() {
		throw new UnsupportedOperationException();
	}

	public void Modificardatoscuenta() {
		throw new UnsupportedOperationException();
	}
	
	
}