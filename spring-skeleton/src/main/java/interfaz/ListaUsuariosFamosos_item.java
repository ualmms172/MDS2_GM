package interfaz;

public class ListaUsuariosFamosos_item extends ListaUsuariosGeneralUsuarioNoRegistrado_item {
	public ListaUsuariosFamosos_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
	}

	public ListaUsuariosFamosos _listaUsuariosFamosos;
}