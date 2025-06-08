package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosGeneralUsuarioNoRegistrado_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralUsuarioNoRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);

		this.getButtonSeguir().setVisible(false);
		this.getLabelSeguido_NoSeguido().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getHorizontalListausuariosgeneral_item().addClickListener(event -> VerperfilUsuarioNoRegistrado());
	}

	public ListaUsuariosGeneralUsuarioNoRegistrado _listaUsuariosGeneralUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VerperfilUsuarioNoRegistrado() {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);
	}
}