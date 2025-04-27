package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;

public class Administrador extends Logueado {
	private int _id_admin;
	//public Vector<baneo> _unnamed_baneo_ = new Vector<baneo>();
	//public BD_Administrador _contenedor_Administradores;
	
	public ListaTweetsAdmin _listaTweetsAdmin;
	public ListaUsuariosFamososAdministrador _listaUsuariosFamososAdministrador;
	public ListaHashtagsFamososAdministrador _listaHashtagsFamososAdministrador;
	VerListaCompletaUsuariosAdministrador _VerListaCompletaUsuariosAdministrador;
	VerlistaCompletaHashtagsAdmin _VerlistaCompletaHashtagsAdmin;
	Verbaneados _Verbaneados;



	public basededatos.Administrador a;
	
	public Administrador(MainView MainView, basededatos.Administrador a) {
		super(MainView);
		this.a=a;
		/*
		this.getButtonNotificaciones().setVisible(false);
		this.getImgPerfilUsuario().setVisible(false);
		this.getButtonEscribirTweet().setVisible(false);
		this.getButtonVerPerfil().setVisible(false);
		*/
		//this.getImgPerfilUsuario().setVisible(false);
		
		this.getLabelListaUsuariosMasFamosos().getStyle().set("font-size", "15px");
		this.getButtonEscribirTweet().getStyle().set("visibility", "hidden");
		this.getButtonEscribirTweet().getStyle().set("pointer-events", "none");
		
		this.getButtonNotificaciones().getStyle().set("visibility", "hidden");
		this.getButtonNotificaciones().getStyle().set("pointer-events", "none");
		
		this.getImgPerfilUsuario().getStyle().set("visibility", "hidden");
		this.getImgPerfilUsuario().getStyle().set("pointer-events", "none");
		
		this.getButtonVerPerfil().getStyle().set("visibility", "hidden");
		this.getButtonVerPerfil().getStyle().set("pointer-events", "none");
		
		
		this.getButtonVerMasUsuarios().addClickListener(Event -> VerListaCompletaUsuariosAdministrador()); 
		this.getButtonVerMasHashtags().addClickListener(Event -> VerlistaCompletaHashtagsAdmin()); 
		this.getButtonBaneados().addClickListener(Event -> Verbaneados()); 
		
		ListaTweetsAdmin();
		ListaUsuariosFamososAdministrador();
		ListaHashtagsFamososAdministrador();
		
		}
	
	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listaTweetsAdmin);
		ListaTweetsAdmin_item item_tweets = new ListaTweetsAdmin_item(_listaTweetsAdmin,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public void ListaUsuariosFamososAdministrador() {
		_listaUsuariosFamososAdministrador = new ListaUsuariosFamososAdministrador(this);
		this.getHorizontalLayoutListaUsuariosMasFamosos2().add(_listaUsuariosFamososAdministrador);
  	    ListaUsuariosFamososAdministrador_item listaUsuariosFamososAdministradorItem = new ListaUsuariosFamososAdministrador_item(_listaUsuariosFamososAdministrador,null); //AQUÍ HABRA QUE MODIFICAR EL NULL 
  	    _listaUsuariosFamososAdministrador.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(listaUsuariosFamososAdministradorItem);

	}
	
	public void ListaHashtagsFamososAdministrador() {
		_listaHashtagsFamososAdministrador = new ListaHashtagsFamososAdministrador(this);
		this.getHorizontalLayoutHashtagsMasUsados().add(_listaHashtagsFamososAdministrador);
  	    ListaHashtagsFamososAdministrador_item listaHashtagsFamososAdministradorItem = new ListaHashtagsFamososAdministrador_item(_listaHashtagsFamososAdministrador,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
  	    _listaHashtagsFamososAdministrador.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(listaHashtagsFamososAdministradorItem);

	
	}
	
	public void VerListaCompletaUsuariosAdministrador() {
		// TODO - implement Administrador.VerListaCompletaUsuariosAdministrador
		_VerListaCompletaUsuariosAdministrador = new VerListaCompletaUsuariosAdministrador(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_VerListaCompletaUsuariosAdministrador);
		
		
	}

	public void Verbaneados() {
	   _Verbaneados = new Verbaneados(this); 
	   Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
	   Pantalla.MainView.removeAll();
	   Pantalla.MainView.add(_Verbaneados);
		
		
	}

	public void VerlistaCompletaHashtagsAdmin() {

		_VerlistaCompletaHashtagsAdmin = new VerlistaCompletaHashtagsAdmin (this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_VerlistaCompletaHashtagsAdmin);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}