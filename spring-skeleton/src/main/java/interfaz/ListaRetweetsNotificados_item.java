package interfaz;

import basededatos.Tweet;
import vistas.VistaListaretweetsnotificados_item;

public class ListaRetweetsNotificados_item extends VistaListaretweetsnotificados_item {
	//private Label _informacion;
	public ListaRetweetsNotificados _listaRetweetsNotificados;
	public Tweet t;
	
	public ListaRetweetsNotificados_item (ListaRetweetsNotificados lista,Tweet t) {
		
		_listaRetweetsNotificados = lista; 
		this.t=t;
	}
}