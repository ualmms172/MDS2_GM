package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerHashtagUsuarioNoRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioNoRegistrado_item _listahashtagsgeneralUsuarioNoRegistrado;
	public Listatweets _listatweets;
	
	public VerHashtagUsuarioNoRegistrado(ListahashtagsgeneralUsuarioNoRegistrado_item listahashtagsgeneralUsuarioNoRegistrado) {
		
		_listahashtagsgeneralUsuarioNoRegistrado = listahashtagsgeneralUsuarioNoRegistrado;
		
		Listatweets();
		
	}
	
	

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listatweets);
		
		Listatweets_item item_tweets = new Listatweets_item(_listatweets);
		_listatweets.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}