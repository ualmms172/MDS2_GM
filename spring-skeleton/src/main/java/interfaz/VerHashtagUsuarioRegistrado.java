package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerHashtagUsuarioRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioRegistrado_item _listahashtagsgeneralUsuarioRegistrado;
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;

	public VerHashtagUsuarioRegistrado(ListahashtagsgeneralUsuarioRegistrado_item listahashtagsgeneralUsuarioRegistrado) {
		
		_listahashtagsgeneralUsuarioRegistrado = listahashtagsgeneralUsuarioRegistrado; 
		
		MostrartweetsUsuarioRegistrado();
	}
	

	
	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		
		MostrartweetsUsuarioRegistrado_item item_tweets = new MostrartweetsUsuarioRegistrado_item(_mostrartweetsUsuarioRegistrado);
		_mostrartweetsUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}