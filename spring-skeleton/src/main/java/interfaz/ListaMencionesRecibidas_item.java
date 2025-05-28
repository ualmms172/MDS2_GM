package interfaz;

import basededatos.Tweet;
import vistas.VistaListamencionesrecibidas_item;

public class ListaMencionesRecibidas_item extends VistaListamencionesrecibidas_item {
	//private Label _informacion;
	public ListaMencionesRecibidas _listaMencionesRecibidas;
	
	public Tweet t;
	
	public ListaMencionesRecibidas_item(ListaMencionesRecibidas lista,Tweet t) {
		
		this.t=t;
		_listaMencionesRecibidas = lista; 
	}
    
}