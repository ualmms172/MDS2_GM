package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class Verperfilpropio extends VerperfilgeneralUsuarioRegistrado {
	

	//private Button _eliminarCuenta;
	//private Button _modificarDatos;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public Comentariospropios_item _comentariospropios;
	public Eliminarpropiacuenta _eliminarpropiacuenta;
	public Modificardatoscuenta _modificardatoscuenta;
	
	
	
	public Verperfilpropio(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		// TODO Auto-generated constructor stub
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		
		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}
	
	
	
	public Verperfilpropio(UsuarioRegistrado usuarioregistrado) {
		super();
		//Esta parte no esta en los demas ya que se incluye en el (super)
		this.getButtonBanear().setVisible(false);
		MostrartweetsUsuarioRegistrado();
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);});
		//
		
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
	
	public Verperfilpropio(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado,boolean mencion) {
		super(vertweetgeneralUsuarioRegistrado,mencion);
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		// TODO Auto-generated constructor stub
		

		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}

	public Verperfilpropio(Comentariospropios_item _comentariospropios) {
		super(_comentariospropios);
		// TODO Auto-generated constructor stub
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		
		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}

	
	public void Eliminarpropiacuenta() {
		
		_eliminarpropiacuenta  = new Eliminarpropiacuenta(this); 
		//Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_eliminarpropiacuenta);


	}

	public void Modificardatoscuenta() {

		_modificardatoscuenta = new Modificardatoscuenta(this); 
	//	Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_modificardatoscuenta);

	
	
	
	
	
	}
	
	
}