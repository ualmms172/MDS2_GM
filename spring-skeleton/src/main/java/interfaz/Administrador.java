package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;

public class Administrador extends Logueado {
	private int _id_admin;
	public Vector<baneo> _unnamed_baneo_ = new Vector<baneo>();
	//public BD_Administrador _contenedor_Administradores;
	
	public ListaTweetsAdmin _listaTweetsAdmin;
	public ListaUsuariosFamososAdministrador _listaUsuariosFamososAdministrador;
	public ListaHashtagsFamososAdministrador _listaHashtagsFamososAdministrador;
	
	public Administrador(MainView MainView) {
		super(MainView);
		this.getButtonNotificaciones().setVisible(false);
		this.getImgPerfilUsuario().setVisible(false);
		this.getButtonEscribirTweet().setVisible(false);
		this.getButtonVerPerfil().setVisible(false);
		
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
	
}