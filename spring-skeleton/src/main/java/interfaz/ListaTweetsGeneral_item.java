package interfaz;

import basededatos.Tweet;

public class ListaTweetsGeneral_item extends ListaContenido_item {
	ListaTweetsGeneral_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		this.t=t;
		
		
		// TODO Auto-generated constructor stub
	}

	//private Button _accederATweet;
	public Tweet t;
	public ListaTweetsGeneral _listaTweetsGeneral;
}