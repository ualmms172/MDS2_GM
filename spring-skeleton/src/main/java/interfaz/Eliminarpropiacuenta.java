package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;


import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;
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
			
			
//	        UsuarioRegistrado usuario = _verperfilpropio._usuarioregistrado; 
//				
//				
//		    Verperfilpropio perfil = new Verperfilpropio(usuario); 		
//				
//			this._verperfilpropio.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 	
//			this._verperfilpropio.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil); 	
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_verperfilpropio);
			
				
				
			}); 
		
		
		
		this.getButtonEliminar().addClickListener(event -> Eliminacuenta()); 
	}
	
	
	

	public void Eliminacuenta() {
		
		
		
		
		
//		    MainView usuario = _verperfilpropio._usuarioregistrado.MainView; 
//			
//			
//		    UsuarioNoRegistrado usuarioNoRegistrado = new UsuarioNoRegistrado(usuario); 		
//				
//			this._verperfilpropio._usuarioregistrado.MainView.removeAll(); 	
//			this._verperfilpropio._usuarioregistrado.MainView.add(usuarioNoRegistrado); 	
		UsuarioNoRegistrado vista = new UsuarioNoRegistrado((MainView)Pantalla.MainView);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
			
			
		

	     /* MainView usuario2 = _verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView;  
				
				
			    UsuarioNoRegistrado usuarioNoRegistrado2 = new UsuarioNoRegistrado(usuario2); 		
					
				this._verperfilpropio._usuarioregistrado.MainView.removeAll(); 	
				this._verperfilpropio._usuarioregistrado.MainView.add(usuarioNoRegistrado); 	
		*/		
				
			
			
			
			
			
			
			
	}
	
	
	
	
	
}