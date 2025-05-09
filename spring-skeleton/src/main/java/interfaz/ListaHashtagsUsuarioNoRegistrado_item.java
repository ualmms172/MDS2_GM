package interfaz;

import basededatos.Hashtag;

public class ListaHashtagsUsuarioNoRegistrado_item extends ListahashtagsgeneralUsuarioNoRegistrado_item {
	public ListaHashtagsUsuarioNoRegistrado_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		// TODO Auto-generated constructor stub
		_listaHashtagsUsuarioNoRegistrado = (ListaHashtagsUsuarioNoRegistrado) lista;
	}

	//private Label _numTweets;
	//private Label _usuarioCreador;
	//private Label _fechaPrimerTweet;
	public ListaHashtagsUsuarioNoRegistrado _listaHashtagsUsuarioNoRegistrado;
}