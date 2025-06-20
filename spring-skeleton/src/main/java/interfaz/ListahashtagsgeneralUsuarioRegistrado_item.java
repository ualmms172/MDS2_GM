package interfaz;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Pantalla;

public class ListahashtagsgeneralUsuarioRegistrado_item extends ListaHashtagsGeneral_item {
	public ListahashtagsgeneralUsuarioRegistrado_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);

		this.getHorizontalListahashtagsgeneral_item().addClickListener(Event -> VerHashtagUsuarioRegistrado());
	}

	public ListahashtagsgeneralUsuarioRegistrado _listahashtagsgeneralUsuarioRegistrado;
	public VerHashtagUsuarioRegistrado _verHashtagUsuarioRegistrado;

	public void VerHashtagUsuarioRegistrado() {
		_verHashtagUsuarioRegistrado = new VerHashtagUsuarioRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagUsuarioRegistrado);
	}
}