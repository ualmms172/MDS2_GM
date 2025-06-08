package interfaz;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Pantalla;

public class ListahashtagsUsuarioRegistrado_item extends ListahashtagsgeneralUsuarioRegistrado_item {
	public ListahashtagsUsuarioRegistrado_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		_listahashtagsUsuarioRegistrado = (ListahashtagsUsuarioRegistrado) lista;
		this.getButtonEscribirTweet().addClickListener(Event -> Hacertweet());

		
	}

	public ListahashtagsUsuarioRegistrado _listahashtagsUsuarioRegistrado;
	public Hacertweet _hacertweet;

	public void Hacertweet() {
		_hacertweet = new Hacertweet(this);

		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_hacertweet);
	}
}