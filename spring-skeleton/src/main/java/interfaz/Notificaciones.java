package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
		
		this.ListaMencionesRecibidas();
		this.ListaRetweetsNotificados();
		this.ListaNuevosSeguidores();
	}
	
		

	public void ListaRetweetsNotificados() {
		_listaRetweetsNotificados = new ListaRetweetsNotificados(this);
		this.getVerticalLayoutRetweetsRecibidos1().as(VerticalLayout.class).add(_listaRetweetsNotificados);
		
		ListaRetweetsNotificados_item item_tweets = new ListaRetweetsNotificados_item(_listaRetweetsNotificados);
		_listaRetweetsNotificados.getVerticalListaretweetsnotificados().as(VerticalLayout.class).add(item_tweets);
	}

	public void ListaNuevosSeguidores() {
		_listaNuevosSeguidores = new ListaNuevosSeguidores(this);
		this.getVerticalLayoutCajaSeguidoresObtenidos().as(VerticalLayout.class).add(_listaNuevosSeguidores);
		
		ListaNuevosSeguidores_item item_tweets = new ListaNuevosSeguidores_item(_listaNuevosSeguidores);
		_listaNuevosSeguidores.getVerticalListanuevoseguidores().as(VerticalLayout.class).add(item_tweets);
	}

	public void ListaMencionesRecibidas() {
		_listaMencionesRecibidas = new ListaMencionesRecibidas(this);
		this.getVerticalLayoutCajaMenciones().as(VerticalLayout.class).add(_listaMencionesRecibidas);
		
		ListaMencionesRecibidas_item item_tweets = new ListaMencionesRecibidas_item(_listaMencionesRecibidas);
		_listaMencionesRecibidas.getVerticalListamencionesrecibidas().as(VerticalLayout.class).add(item_tweets);
	}
}