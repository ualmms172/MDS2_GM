package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class Verperfilpropio extends VerperfilgeneralUsuarioRegistrado {
	

	public UsuarioRegistrado _usuarioregistrado; 
	public Comentariospropios_item _comentariospropios;
	public Eliminarpropiacuenta _eliminarpropiacuenta;
	public Modificardatoscuenta _modificardatoscuenta;
	
	
	
	public Verperfilpropio(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		
		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}
	
	
	
	public Verperfilpropio(UsuarioRegistrado usuarioregistrado) {
		super(usuarioregistrado);
		this.getButtonBanear().setVisible(false);
		MostrartweetsUsuarioRegistrado();
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);});
		
		
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
		

		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}

	public Verperfilpropio(Comentariospropios_item _comentariospropios) {
		super(_comentariospropios);

		this.getButtonBloquear().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		
		this.getButtonEliminarCuenta().addClickListener(event -> Eliminarpropiacuenta()); 
		this.getButtonModidicarDatos().addClickListener(event -> Modificardatoscuenta()); 

		
	}

	
	public void Eliminarpropiacuenta() {
		
		_eliminarpropiacuenta  = new Eliminarpropiacuenta(this); 

		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_eliminarpropiacuenta);


	}

	public void Modificardatoscuenta() {

		_modificardatoscuenta = new Modificardatoscuenta(this); 

		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_modificardatoscuenta);

	
	
	
	
	
	}
	
	
}