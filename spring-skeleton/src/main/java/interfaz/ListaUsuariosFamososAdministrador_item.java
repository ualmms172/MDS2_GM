package interfaz;

public class ListaUsuariosFamososAdministrador_item extends ListaUsuariosGeneralAdministrador_item {
	public ListaUsuariosFamososAdministrador_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		


		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		this.getButtonBanear().setVisible(false);
		
		this.getImgPerfilUsuario().setHeight("10%");
		this.getImgPerfilUsuario().setWidth("1%");
		
		_listaUsuariosFamososAdministrador = (ListaUsuariosFamososAdministrador) lista;
	}

	public ListaUsuariosFamososAdministrador _listaUsuariosFamososAdministrador;
}