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
		
		
		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}
	
	
	
	public Verperfilpropio(UsuarioRegistrado usuarioregistrado) {
		 
		_usuarioregistrado  = usuarioregistrado; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		

		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}
	
	public Verperfilpropio(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		// TODO Auto-generated constructor stub
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		

		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
		
	}
	
	public Verperfilpropio(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		super(vertweetgeneralUsuarioRegistrado);
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		// TODO Auto-generated constructor stub
		

		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
		
		
		
		
	}


	
	public void Eliminarpropiacuenta() {
		
		_eliminarpropiacuenta  = new Eliminarpropiacuenta(this); 
		this.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
		this.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_eliminarpropiacuenta);


	}

	public void Modificardatoscuenta() {

		_modificardatoscuenta = new Modificardatoscuenta(this); 
		this.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
		this.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_modificardatoscuenta);

	
	
	
	
	
	}
	
	
}