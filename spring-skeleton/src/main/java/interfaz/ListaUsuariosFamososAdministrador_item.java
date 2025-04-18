package interfaz;

public class ListaUsuariosFamososAdministrador_item extends ListaUsuariosGeneralAdministrador_item {
	public ListaUsuariosFamososAdministrador_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		this.getButtonBanear().setVisible(false);
		_listaUsuariosFamososAdministrador = (ListaUsuariosFamososAdministrador) lista;
	}

	public ListaUsuariosFamososAdministrador _listaUsuariosFamososAdministrador;
}