package interfaz;

import vistas.VistaLogueado;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;

public class Logueado extends VistaLogueado{
	private String _nick;
	private String _contrasena;
	
	MainView MainView;
	public Logueado(MainView MainView) {
		
	this.MainView = MainView;
	
	this.getButtonCerrarSesion().addClickListener(event -> Cerrarsesin()); 
	
	
	}
	
	
	public void Cerrarsesin() {
		
		Interfaz.ad=null;
		Interfaz.ur=null;
		
		UsuarioNoRegistrado usuario =  new UsuarioNoRegistrado(MainView); 
		usuario.MainView.removeAll();
		usuario.MainView.add(usuario);
		
	}

	
}