package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListahashtagsUsuarioRegistrado_item extends ListahashtagsgeneralUsuarioRegistrado_item {
	public ListahashtagsUsuarioRegistrado_item(ListaHashtagsGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
	}

	//private Label _numTweets;
	//private Label _usuarioCreador;
	//private Label _fechaOrigen;
	//private Button _escribirTweet;
	public ListahashtagsUsuarioRegistrado _listahashtagsUsuarioRegistrado;
	public Hacertweet _hacertweet;

	public void Hacertweet() {
		_hacertweet = new Hacertweet(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_hacertweet);
	}
}