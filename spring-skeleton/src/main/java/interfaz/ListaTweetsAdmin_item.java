package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class ListaTweetsAdmin_item extends ListaTweetsGeneral_item {
	public ListaTweetsAdmin_item(ListaContenido lista) {
		super(lista);
		
		_listaTweetsAdmin = (ListaTweetsAdmin) _lista; 
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VerTweetAdministrador()); 
		this.getImgFotoPerfilTweet().addClickListener(event -> VerPerfilAdministrador()); 
		this.getButtonBorrar().addClickListener(event -> BorrarTweet()); 
	}

	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin _listaTweetsAdmin;
	public VerTweetAdministrador _verTweetAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void BorrarTweet() {
		this._listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).remove(this);
	}

	public void VerTweetAdministrador() {
		
		_verTweetAdministrador = new VerTweetAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verTweetAdministrador);
		
//		_verTweetAdministrador = new VerTweetAdministrador(this); 
//		
//		if(_listaTweetsAdmin._verHashtagAdministrador != null) {
//			
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetAdministrador);
//
//			
//			
//		}
//		
//		else if(_listaTweetsAdmin._administrador != null) {
//			
//			
//			_listaTweetsAdmin._administrador.MainView.removeAll();
//			_listaTweetsAdmin._administrador.MainView.add(_verTweetAdministrador);
//	
//		}
//		
//		
//		else {
//			
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetAdministrador);
//		
//		}
		
	}

	public void VerPerfilAdministrador() {
		_verPerfilAdministrador = new VerPerfilAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verTweetAdministrador);
		
//		_verPerfilAdministrador = new VerPerfilAdministrador(this);
//		
//		if(_listaTweetsAdmin._verHashtagAdministrador != null) {
//			
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verPerfilAdministrador);
//
//			
//			
//		}
//		
//		else if(_listaTweetsAdmin._administrador != null) {
//			
//			
//			_listaTweetsAdmin._administrador.MainView.removeAll();
//			_listaTweetsAdmin._administrador.MainView.add(_verPerfilAdministrador);
//	
//		}
//		
//		
//		else {
//			
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verPerfilAdministrador);
//		
//		}
	}
}