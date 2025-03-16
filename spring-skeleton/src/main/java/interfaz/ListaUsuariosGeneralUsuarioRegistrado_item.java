package interfaz;

public class ListaUsuariosGeneralUsuarioRegistrado_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralUsuarioRegistrado_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonBanear().setVisible(false);
	}

	public ListaUsuariosGeneralUsuarioRegistrado _listaUsuariosGeneralUsuarioRegistrado;
	public VerperfilUsuarioRegistrado _verperfilUsuarioRegistrado;

	public void VerperfilUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}
}