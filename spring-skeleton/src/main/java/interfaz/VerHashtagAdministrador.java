package interfaz;

public class VerHashtagAdministrador extends VerHashtagGeneral {
	public ListaHashtagsgeneralAdministrador_item _listaHashtagsgeneralAdministrador;
	public ListaTweetsAdmin _listaTweetsAdmin;

	public void ListaTweetsAdmin() {
		throw new UnsupportedOperationException();
	}
	
	public VerHashtagAdministrador(ListaHashtagsgeneralAdministrador_item listaHashtagsgeneralAdministrador) {
		_listaHashtagsgeneralAdministrador = listaHashtagsgeneralAdministrador;
	}
}