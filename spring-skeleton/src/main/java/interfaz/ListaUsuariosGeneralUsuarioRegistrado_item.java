package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosGeneralUsuarioRegistrado_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralUsuarioRegistrado_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonBanear().setVisible(false);
	}

	public ListaUsuariosGeneralUsuarioRegistrado _listaUsuariosGeneralUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;

	public void VerperfilUsuarioRegistrado() {
		_verperfilUsuarioRegistrado = new VerperfilgeneralUsuarioRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}
}