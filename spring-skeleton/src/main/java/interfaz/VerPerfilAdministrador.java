package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;

public class VerPerfilAdministrador extends VerPerfilGeneral {
	//private Button _banear;
	public ListaUsuariosGeneralAdministrador_item _listaUsuariosGeneralAdministrador;
	public ListaTweetsAdmin_item _listaTweetsAdmin_item;
	public ListaTweetsAdmin _listaTweetsAdmin; //Creado por Miguel
	public VerTweetAdministrador _verTweetAdministrador;
	public ListaComentariosAdministrador_item _listaComentariosAdministrador;
	public BanearUsuario _banearUsuario;
	
	public VerPerfilAdministrador(ListaUsuariosGeneralAdministrador_item listaUsuariosGeneralAdministrador) {
		_listaUsuariosGeneralAdministrador = listaUsuariosGeneralAdministrador; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
	}
	
	
	public VerPerfilAdministrador(ListaTweetsAdmin_item listaTweetsAdmin ) {
		
		_listaTweetsAdmin_item = listaTweetsAdmin; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
	}
	
	public VerPerfilAdministrador(VerTweetAdministrador verTweetAdministrador) {
		
		_verTweetAdministrador = verTweetAdministrador; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
	}
	

	public VerPerfilAdministrador(ListaComentariosAdministrador_item listaComentariosAdministrador) {
		
		_listaComentariosAdministrador = listaComentariosAdministrador; 
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
	}
	

	public void BanearUsuario() {
		_banearUsuario = new BanearUsuario(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_banearUsuario);
	}

	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listaTweetsAdmin);
		
		ListaTweetsAdmin_item item_tweets = new ListaTweetsAdmin_item(_listaTweetsAdmin);
		_listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}