package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerHashtagAdministrador extends VerHashtagGeneral {
	public ListaHashtagsgeneralAdministrador_item _listaHashtagsgeneralAdministrador;
	public ListaTweetsAdmin _listaTweetsAdmin;

	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listaTweetsAdmin);
		
		ListaTweetsAdmin_item item_tweets = new ListaTweetsAdmin_item(_listaTweetsAdmin);
		_listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public VerHashtagAdministrador(ListaHashtagsgeneralAdministrador_item listaHashtagsgeneralAdministrador) {
		_listaHashtagsgeneralAdministrador = listaHashtagsgeneralAdministrador;
		
		ListaTweetsAdmin();
	}
}