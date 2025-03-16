package interfaz;

public class ListaUsuariosGeneralUsuarioNoRegistrado_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralUsuarioNoRegistrado_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonSeguir().setVisible(false);
		this.getLabelSeguido_NoSeguido().setVisible(false);
		this.getButtonBanear().setVisible(false);
	}

	public ListaUsuariosGeneralUsuarioNoRegistrado _listaUsuariosGeneralUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VerperfilUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}
}