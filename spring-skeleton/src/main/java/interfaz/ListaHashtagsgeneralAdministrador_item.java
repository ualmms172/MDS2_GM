package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaHashtagsgeneralAdministrador_item extends ListaHashtagsGeneral_item {
	public ListaHashtagsgeneralAdministrador_item(ListaHashtagsGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonEscribirTweet().setVisible(false);
	}

	public ListaHashtagsgeneralAdministrador _listaHashtagsgeneralAdministrador;
	public VerHashtagAdministrador _verHashtagAdministrador;

	public void VerHashtagAdministrador() {
		_verHashtagAdministrador = new VerHashtagAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagAdministrador);
	}
}