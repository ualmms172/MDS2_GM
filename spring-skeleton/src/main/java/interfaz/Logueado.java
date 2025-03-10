package interfaz;

import vistas.VistaLogueado;

import gallardoMartinez.MainView;

public class Logueado extends VistaLogueado{
	private String _nick;
	private String _contrasena;
	
	MainView MainView;
	Logueado(MainView MainView) {
	this.MainView = MainView;
	}
	
}