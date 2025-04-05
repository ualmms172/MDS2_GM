package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaEliminarpropiacuenta;

public class Eliminarpropiacuenta extends VistaEliminarpropiacuenta  {
	//private event _eliminacuenta;
	//private Label _titulo;
	//private Label _motivo;
	//private TextField _motivoTF;
	//private Button _atras;
	//private Button _eliminar;
	public Verperfilpropio _verperfilpropio;
	
	public Eliminarpropiacuenta(Verperfilpropio verperfilpropio) {
		
		_verperfilpropio = verperfilpropio; 
		
		
		this.getButtonAtras().addClickListener(event -> {
			
		
        UsuarioRegistrado usuario = _verperfilpropio._usuarioregistrado; 
			
			
	    Verperfilpropio perfil = new Verperfilpropio(usuario); 		
			
		this._verperfilpropio.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 	
		this._verperfilpropio.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil); 	
			
			
			
		}); 
	}
	
	
	

	public void Eliminacuenta() {
		throw new UnsupportedOperationException();
	}
	
	
	
	
	
}