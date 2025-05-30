package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
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
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			
	});
		}
	
		

	public void ListaRetweetsNotificados() {
		_listaRetweetsNotificados = new ListaRetweetsNotificados(this);
		this.getVerticalLayoutRetweetsRecibidos1().as(VerticalLayout.class).add(_listaRetweetsNotificados);
		
		ListaRetweetsNotificados_item item_tweets = new ListaRetweetsNotificados_item(_listaRetweetsNotificados,null);
		_listaRetweetsNotificados.getVerticalListaretweetsnotificados().as(VerticalLayout.class).add(item_tweets);
	}

	public void ListaNuevosSeguidores() {
		_listaNuevosSeguidores = new ListaNuevosSeguidores(this);
		this.getVerticalLayoutCajaSeguidoresObtenidos().as(VerticalLayout.class).add(_listaNuevosSeguidores);
		
		ListaNuevosSeguidores_item item_tweets = new ListaNuevosSeguidores_item(_listaNuevosSeguidores,null);
		_listaNuevosSeguidores.getVerticalListanuevoseguidores().as(VerticalLayout.class).add(item_tweets);
	}

	public void ListaMencionesRecibidas() {
		_listaMencionesRecibidas = new ListaMencionesRecibidas(this);
		this.getVerticalLayoutCajaMenciones().as(VerticalLayout.class).add(_listaMencionesRecibidas);
		
		ListaMencionesRecibidas_item item_tweets = new ListaMencionesRecibidas_item(_listaMencionesRecibidas,null);
		_listaMencionesRecibidas.getVerticalListamencionesrecibidas().as(VerticalLayout.class).add(item_tweets);
	}
	
	public Notificaciones Recargar(UsuarioRegistrado log) {
		return new Notificaciones(log);
	}
}