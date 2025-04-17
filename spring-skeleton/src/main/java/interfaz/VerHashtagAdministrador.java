package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

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
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador) {
				ListaHashtagsAdministrador l = (ListaHashtagsAdministrador) this._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador;
				Pantalla.Anterior = l._verlistaCompletaHashtagsAdmin._administrador;
			}
	});
	}
}