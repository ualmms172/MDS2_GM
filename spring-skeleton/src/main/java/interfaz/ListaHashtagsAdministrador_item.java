package interfaz;

import basededatos.Hashtag;

public class ListaHashtagsAdministrador_item extends ListaHashtagsgeneralAdministrador_item {
	public ListaHashtagsAdministrador_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);

		_listaHashtagsAdministrador =(ListaHashtagsAdministrador) lista;
	}

	
	public ListaHashtagsAdministrador _listaHashtagsAdministrador;
}