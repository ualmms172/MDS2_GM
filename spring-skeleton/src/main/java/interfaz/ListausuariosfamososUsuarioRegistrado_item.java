package interfaz;

public class ListausuariosfamososUsuarioRegistrado_item extends ListaUsuariosGeneralUsuarioRegistrado_item {
	public ListausuariosfamososUsuarioRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		// TODO Auto-generated constructor stub
		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelSeguido_NoSeguido().setVisible(false);
		
		this.getImgPerfilUsuario().setHeight("10%");
		this.getImgPerfilUsuario().setWidth("1%");
		
		_listausuariosfamososUsuarioRegistrado = (ListausuariosfamososUsuarioRegistrado) lista;
	}

	public ListausuariosfamososUsuarioRegistrado _listausuariosfamososUsuarioRegistrado;
}