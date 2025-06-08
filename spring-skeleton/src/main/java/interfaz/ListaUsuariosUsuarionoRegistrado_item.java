package interfaz;

public class ListaUsuariosUsuarionoRegistrado_item extends ListaUsuariosGeneralUsuarioNoRegistrado_item {
	public ListaUsuariosUsuarionoRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);

		_listaUsuariosUsuarionoRegistrado = (ListaUsuariosUsuarionoRegistrado) lista;
	}


	public ListaUsuariosUsuarionoRegistrado _listaUsuariosUsuarionoRegistrado;
}