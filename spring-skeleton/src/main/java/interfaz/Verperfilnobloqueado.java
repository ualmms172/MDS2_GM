package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class Verperfilnobloqueado extends VerperfilgeneralUsuarioRegistrado {
	
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public ComentariosUsuarioRegistrado_item _comentariosUsuarioRegistrado;
	
	

	public Verperfilnobloqueado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado) {
		super(mostrartweetsUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		// TODO Auto-generated constructor stub
	}
	
	
	public Verperfilnobloqueado(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilnobloqueado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		super(vertweetgeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

	//private event _seguirUsuario;
	//private event _bloquear;
	//private event _dejardeseguirausuario;
	//private event _desbloquear;
	//private Button _seguir;
	//private Button _bloquearB;

	//public VerperfilUsuarioRegistrado _verperfilUsuarioRegistrado;
	

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