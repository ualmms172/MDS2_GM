package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

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
	
	public Verperfilnobloqueado(ComentariosUsuarioRegistrado_item _comentariosUsuarioRegistrado) {
		super(_comentariosUsuarioRegistrado);
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
		this.getButtonSeguir().getStyle().set("color", "red");
		this.getButtonSeguir().setText("Dejar de seguir");

		Verperfilnobloqueado x = null;
		if(_listaUsuariosGeneralUsuarioRegistrado!=null) 
			 x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_vertweetgeneralUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_mostrartweetspropiosUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado);
		else
			x = new Verperfilnobloqueado(_comentariosUsuarioRegistrado);
		
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(x);
	}

	public void Bloquear() {
		this.getButtonBloquear().getStyle().set("color", "red");
		this.getButtonBloquear().setText("Bloquear");
		
		Verperfilnobloqueado x = null;
		if(_listaUsuariosGeneralUsuarioRegistrado!=null) 
			 x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_vertweetgeneralUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_mostrartweetspropiosUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado);
		else
			x = new Verperfilnobloqueado(_comentariosUsuarioRegistrado);
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(x);
	}

	public void Dejardeseguirausuario() {
		this.getButtonSeguir().getStyle().set("color", "gray");
		this.getButtonSeguir().setText("Seguir");
		
		Verperfilnobloqueado x = null;
		if(_listaUsuariosGeneralUsuarioRegistrado!=null) 
			 x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_vertweetgeneralUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_mostrartweetspropiosUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado);
		else
			x = new Verperfilnobloqueado(_comentariosUsuarioRegistrado);
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(x);
	}

	public void Desbloquear() {
		this.getButtonBloquear().getStyle().set("color", "gray");
		this.getButtonBloquear().setText("Desbloquear");
		
		Verperfilnobloqueado x = null;
		if(_listaUsuariosGeneralUsuarioRegistrado!=null) 
			 x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_vertweetgeneralUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
		else if(_mostrartweetspropiosUsuarioRegistrado!=null)
			x = new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado);
		else
			x = new Verperfilnobloqueado(_comentariosUsuarioRegistrado);
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(x);
	}
	
}