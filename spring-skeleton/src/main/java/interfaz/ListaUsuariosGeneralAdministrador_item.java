package interfaz;

public class ListaUsuariosGeneralAdministrador_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralAdministrador_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonSeguir().setVisible(false);
		this.getLabelSeguido_NoSeguido().setVisible(false);
	}

	public ListaUsuariosGeneralAdministrador _listaUsuariosGeneralAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void VerPerfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}