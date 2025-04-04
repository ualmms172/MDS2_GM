package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaTweetsAdmin_item extends ListaTweetsGeneral_item {
	public ListaTweetsAdmin_item(ListaContenido lista) {
		super(lista);
		
		_listaTweetsAdmin = (ListaTweetsAdmin) _lista; 
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VerTweetAdministrador()); 
	}

	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin _listaTweetsAdmin;
	public VerTweetAdministrador _verTweetAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void BorrarTweet() {
		throw new UnsupportedOperationException();
	}

	public void VerTweetAdministrador() {
		
		_verTweetAdministrador = new VerTweetAdministrador(this); 
		
		if(_listaTweetsAdmin._verHashtagAdministrador != null) {
			
			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetAdministrador);

			
			
		}
		
		else if(_listaTweetsAdmin._administrador != null) {
			
			
			_listaTweetsAdmin._administrador.MainView.removeAll();
			_listaTweetsAdmin._administrador.MainView.add(_verTweetAdministrador);
	
		}
		
		
		else {
			
			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetAdministrador);
		
		}
		
		
		
		
		
	}

	public void VerPerfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}