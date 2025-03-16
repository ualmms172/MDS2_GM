package interfaz;

public class ListahashtagfamososUsuarioRegistrado_item extends ListahashtagsgeneralUsuarioRegistrado_item {
	public ListahashtagfamososUsuarioRegistrado_item(ListaHashtagsGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonEscribirTweet().setVisible(false);
		this.getLabelCreador().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
	}

	public ListahashtagfamososUsuarioRegistrado _listahashtagfamososUsuarioRegistrado;
}