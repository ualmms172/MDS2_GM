package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerTweetAdministrador extends VertweetGeneral {
	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin_item _listaTweetsAdmin;
	public ListaComentariosAdministrador _listaComentariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	public VerTweetAdministrador(ListaTweetsAdmin_item listaTweetsAdmin) {
		
		_listaTweetsAdmin = listaTweetsAdmin; 
		this.getButtonComentar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		ListaComentariosAdministrador();
	}
	
	public VerTweetAdministrador(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		this.getButtonComentar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		ListaComentariosAdministrador();
	}
	
	
	

	public void BorrarTweet() {
		throw new UnsupportedOperationException();
	}

	public void ListaComentariosAdministrador() {
		_listaComentariosAdministrador = new ListaComentariosAdministrador(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_listaComentariosAdministrador);
		
		ListaComentariosAdministrador_item item_tweets = new ListaComentariosAdministrador_item(_listaComentariosAdministrador);
		_listaComentariosAdministrador.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void VerPerfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}