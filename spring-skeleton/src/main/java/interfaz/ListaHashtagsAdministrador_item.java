package interfaz;

import basededatos.Hashtag;

public class ListaHashtagsAdministrador_item extends ListaHashtagsgeneralAdministrador_item {
	public ListaHashtagsAdministrador_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		// TODO Auto-generated constructor stub
		_listaHashtagsAdministrador =(ListaHashtagsAdministrador) lista;
	}

	//private Label _numTweets;
	//private Label _usuarioCreador;
	//private Label _fechaPrimerTweet;
	public ListaHashtagsAdministrador _listaHashtagsAdministrador;
}