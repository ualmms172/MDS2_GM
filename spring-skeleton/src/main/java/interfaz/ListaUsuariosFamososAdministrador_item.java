package interfaz;

public class ListaUsuariosFamososAdministrador_item extends ListaUsuariosGeneralAdministrador_item {
	public ListaUsuariosFamososAdministrador_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		


		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		this.getButtonBanear().setVisible(false);
		
		this.getImgPerfilUsuario().setHeight("30px");
		this.getImgPerfilUsuario().setWidth("10px");
		
		_listaUsuariosFamososAdministrador = (ListaUsuariosFamososAdministrador) lista;
	}

	public ListaUsuariosFamososAdministrador _listaUsuariosFamososAdministrador;
}