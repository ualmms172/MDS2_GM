package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListahashtagsgeneralUsuarioNoRegistrado_item extends ListaHashtagsGeneral_item {
	public ListahashtagsgeneralUsuarioNoRegistrado_item(ListaHashtagsGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonEscribirTweet().setVisible(false);
		this.getHorizontalListahashtagsgeneral_item().addClickListener(Event -> VerHashtagUsuarioNoRegistrado());
	}

	public ListahashtagsgeneralUsuarioNoRegistrado _listahashtagsgeneralUsuarioNoRegistrado;
	public VerHashtagUsuarioNoRegistrado _verHashtagUsuarioNoRegistrado;

	public void VerHashtagUsuarioNoRegistrado() {
		_verHashtagUsuarioNoRegistrado = new VerHashtagUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagUsuarioNoRegistrado);
	}
}