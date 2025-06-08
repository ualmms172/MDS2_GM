package interfaz;

import basededatos.Hashtag;

public class ListaHashtagsUsuarioNoRegistrado_item extends ListahashtagsgeneralUsuarioNoRegistrado_item {
	public ListaHashtagsUsuarioNoRegistrado_item(ListaHashtagsGeneral lista,Hashtag h) {
		super(lista,h);

		_listaHashtagsUsuarioNoRegistrado = (ListaHashtagsUsuarioNoRegistrado) lista;
	}


	public ListaHashtagsUsuarioNoRegistrado _listaHashtagsUsuarioNoRegistrado;
}