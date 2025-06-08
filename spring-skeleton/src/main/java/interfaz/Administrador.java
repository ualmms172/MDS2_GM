package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iAdministrador;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Administrador extends Logueado {
		
	public ListaTweetsAdmin _listaTweetsAdmin;
	public ListaUsuariosFamososAdministrador _listaUsuariosFamososAdministrador;
	public ListaHashtagsFamososAdministrador _listaHashtagsFamososAdministrador;
	VerListaCompletaUsuariosAdministrador _VerListaCompletaUsuariosAdministrador;
	VerlistaCompletaHashtagsAdmin _VerlistaCompletaHashtagsAdmin;
	Verbaneados _Verbaneados;


	public iAdministrador _iadministrador = new BDPrincipal();
	public basededatos.Administrador a;
	
	public Administrador(MainView MainView, basededatos.Administrador a) {
		super(MainView);
		this.a=a;
		
		//Metemos a la clase interfaz el admin que se esta usando.
		Interfaz.ad=this;
		
		
		//Para que la estetica sea similar a la de usuario registrado, en lugar de que no esten se ponen "invisibles"
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
	}
	
	public void ListaUsuariosFamososAdministrador() {
		_listaUsuariosFamososAdministrador = new ListaUsuariosFamososAdministrador(this);
		this.getHorizontalLayoutListaUsuariosMasFamosos2().add(_listaUsuariosFamososAdministrador);

	}
	
	public void ListaHashtagsFamososAdministrador() {
		_listaHashtagsFamososAdministrador = new ListaHashtagsFamososAdministrador(this);
		this.getHorizontalLayoutHashtagsMasUsados().add(_listaHashtagsFamososAdministrador);

	
	}
	
	public void VerListaCompletaUsuariosAdministrador() {
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