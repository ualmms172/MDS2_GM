package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerHashtagUsuarioNoRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioNoRegistrado_item _listahashtagsgeneralUsuarioNoRegistrado;
	public Listatweets _listatweets;
	
	public VerHashtagUsuarioNoRegistrado(ListahashtagsgeneralUsuarioNoRegistrado_item listahashtagsgeneralUsuarioNoRegistrado) {
		
		_listahashtagsgeneralUsuarioNoRegistrado = listahashtagsgeneralUsuarioNoRegistrado;
		
		Listatweets();
		
	}
	
	

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listatweets);
	}
}