package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosGeneralAdministrador_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralAdministrador_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		// TODO Auto-generated constructor stub
		this.getButtonSeguir().setVisible(false);
		this.getLabelSeguido_NoSeguido().setVisible(false);
		this.getHorizontalListausuariosgeneral_item().addClickListener(event -> VerPerfilAdministrador());
	}

	public ListaUsuariosGeneralAdministrador _listaUsuariosGeneralAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void VerPerfilAdministrador() {
		_verPerfilAdministrador = new VerPerfilAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verPerfilAdministrador);
	}
}