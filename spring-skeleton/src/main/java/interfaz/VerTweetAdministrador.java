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
		this.getImgFotoPerfilTweet().addClickListener(event -> VerPerfilAdministrador()); 
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
		
		VerPerfilAdministrador perfil = new VerPerfilAdministrador(this); 
		
		if(_listaTweetsAdmin != null) {
			
			
			
			if(_listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador != null) {
				
				_listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
				_listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);

				
				
			}
			
			else if(_listaTweetsAdmin._listaTweetsAdmin._administrador != null) {
				
				
				_listaTweetsAdmin._listaTweetsAdmin._administrador.MainView.removeAll();
				_listaTweetsAdmin._listaTweetsAdmin._administrador.MainView.add(perfil);
		
			}
			
			
			else {
				
				_listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
				_listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
			
			}
		
		
	   }
		
		else {
			
			_verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
			_verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);

		}
		
	}
}
	
	