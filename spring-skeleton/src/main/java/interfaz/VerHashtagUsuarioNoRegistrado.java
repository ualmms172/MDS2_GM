package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerHashtagUsuarioNoRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioNoRegistrado_item _listahashtagsgeneralUsuarioNoRegistrado;
	public Listatweets _listatweets;
	
	public VerHashtagUsuarioNoRegistrado(ListahashtagsgeneralUsuarioNoRegistrado_item listahashtagsgeneralUsuarioNoRegistrado) {
		
		_listahashtagsgeneralUsuarioNoRegistrado = listahashtagsgeneralUsuarioNoRegistrado;
		
		Listatweets();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listahashtagsgeneralUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado instanceof ListaHashtagsUsuarioNoRegistrado) {
				ListaHashtagsUsuarioNoRegistrado l = (ListaHashtagsUsuarioNoRegistrado) this._listahashtagsgeneralUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
				Pantalla.Anterior = l._verlistacompletahashtags._usuarioNoRegistrado;
			}
	});
		
	}
	
	

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listatweets);
		
		Listatweets_item item_tweets = new Listatweets_item(_listatweets,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_listatweets.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}