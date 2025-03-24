package interfaz;

import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {
	//private Label _titulo;
	//private Label _retweetsRecibidos;
	//private Label _seguidoresObtenidos;
	//private Label _menciones;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListaRetweetsNotificados _listaRetweetsNotificados;
	public ListaNuevosSeguidores _listaNuevosSeguidores;
	public ListaMencionesRecibidas _listaMencionesRecibidas;
	
	
	
	public Notificaciones(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado; 
	}
	
		

	public void ListaRetweetsNotificados() {
		throw new UnsupportedOperationException();
	}

	public void ListaNuevosSeguidores() {
		throw new UnsupportedOperationException();
	}

	public void ListaMencionesRecibidas() {
		throw new UnsupportedOperationException();
	}
}