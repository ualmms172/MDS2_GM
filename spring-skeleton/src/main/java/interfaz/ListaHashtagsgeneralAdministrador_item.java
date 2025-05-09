package interfaz;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Pantalla;

public class ListaHashtagsgeneralAdministrador_item extends ListaHashtagsGeneral_item {
	public ListaHashtagsgeneralAdministrador_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);
		// TODO Auto-generated constructor stub
		this.getButtonEscribirTweet().setVisible(false);
		this.getHorizontalListahashtagsgeneral_item().addClickListener(Event -> VerHashtagAdministrador());
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