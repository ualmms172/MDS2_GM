package interfaz;

public class ListahashtagsfamososUsuarioNoRegistrado_item extends ListahashtagsgeneralUsuarioNoRegistrado_item {
	public ListahashtagsfamososUsuarioNoRegistrado_item(ListaHashtagsGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getLabelCreador().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		
		_listahashtagsfamososUsuarioNoRegistrado = (ListahashtagsfamososUsuarioNoRegistrado) lista;
	}

	public ListahashtagsfamososUsuarioNoRegistrado _listahashtagsfamososUsuarioNoRegistrado;
}