package interfaz;

public class ListaHashtagsFamososAdministrador_item extends ListaHashtagsgeneralAdministrador_item {
	public ListaHashtagsFamososAdministrador_item(ListaHashtagsGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getLabelCreador().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
	}

	public ListaHashtagsFamososAdministrador _listaHashtagsFamososAdministrador;
}