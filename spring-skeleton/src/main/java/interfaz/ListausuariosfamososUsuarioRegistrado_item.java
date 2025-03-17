package interfaz;

public class ListausuariosfamososUsuarioRegistrado_item extends ListaUsuariosGeneralUsuarioRegistrado_item {
	public ListausuariosfamososUsuarioRegistrado_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelSeguido_NoSeguido().setVisible(false);
	}

	public ListausuariosfamososUsuarioRegistrado _listausuariosfamososUsuarioRegistrado;
}