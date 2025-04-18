package interfaz;

public class ListaUsuariosUsuarionoRegistrado_item extends ListaUsuariosGeneralUsuarioNoRegistrado_item {
	public ListaUsuariosUsuarionoRegistrado_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		_listaUsuariosUsuarionoRegistrado = (ListaUsuariosUsuarionoRegistrado) lista;
	}

	//private Label _numSeguidores;
	//private Label _numSeguidos;
	//private Label _numTweets;
	public ListaUsuariosUsuarionoRegistrado _listaUsuariosUsuarionoRegistrado;
}