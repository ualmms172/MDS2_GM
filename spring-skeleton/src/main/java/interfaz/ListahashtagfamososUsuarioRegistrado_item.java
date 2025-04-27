package interfaz;

import basededatos.Hashtag;

public class ListahashtagfamososUsuarioRegistrado_item extends ListahashtagsgeneralUsuarioRegistrado_item {
	public ListahashtagfamososUsuarioRegistrado_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		// TODO Auto-generated constructor stub
		this.getButtonEscribirTweet().setVisible(false);
		this.getLabelCreador().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		_listahashtagfamososUsuarioRegistrado = (ListahashtagfamososUsuarioRegistrado) lista;
	}

	public ListahashtagfamososUsuarioRegistrado _listahashtagfamososUsuarioRegistrado;
}