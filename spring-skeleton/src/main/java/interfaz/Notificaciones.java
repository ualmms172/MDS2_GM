package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaNotificaciones;

public class Notificaciones extends VistaNotificaciones {

	public UsuarioRegistrado _usuarioregistrado; 
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


	}

	public void ListaNuevosSeguidores() {
		_listaNuevosSeguidores = new ListaNuevosSeguidores(this);
		this.getVerticalLayoutCajaSeguidoresObtenidos().as(VerticalLayout.class).add(_listaNuevosSeguidores);

	}

	public void ListaMencionesRecibidas() {
		_listaMencionesRecibidas = new ListaMencionesRecibidas(this);
		this.getVerticalLayoutCajaMenciones().as(VerticalLayout.class).add(_listaMencionesRecibidas);

	}
	
	public Notificaciones Recargar(UsuarioRegistrado log) {
		return new Notificaciones(log);
	}
}