package interfaz;

import basededatos.Hashtag;

public class ListaHashtagsFamososAdministrador_item extends ListaHashtagsgeneralAdministrador_item {
	public ListaHashtagsFamososAdministrador_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		// TODO Auto-generated constructor stub
		this.getLabelCreador().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		_listaHashtagsFamososAdministrador =(ListaHashtagsFamososAdministrador) lista;
	}

	public ListaHashtagsFamososAdministrador _listaHashtagsFamososAdministrador;
}