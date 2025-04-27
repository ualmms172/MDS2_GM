package interfaz;

import basededatos.Hashtag;

public class ListahashtagsfamososUsuarioNoRegistrado_item extends ListahashtagsgeneralUsuarioNoRegistrado_item {
	public ListahashtagsfamososUsuarioNoRegistrado_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		// TODO Auto-generated constructor stub
		this.getLabelCreador().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		
		_listahashtagsfamososUsuarioNoRegistrado = (ListahashtagsfamososUsuarioNoRegistrado) lista;
	}

	public ListahashtagsfamososUsuarioNoRegistrado _listahashtagsfamososUsuarioNoRegistrado;
}