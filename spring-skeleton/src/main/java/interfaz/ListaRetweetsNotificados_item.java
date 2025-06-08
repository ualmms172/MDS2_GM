package interfaz;

import basededatos.Tweet;
import vistas.VistaListaretweetsnotificados_item;

public class ListaRetweetsNotificados_item extends VistaListaretweetsnotificados_item {
	
	public ListaRetweetsNotificados _listaRetweetsNotificados;
	public Tweet t;
	
	public ListaRetweetsNotificados_item (ListaRetweetsNotificados lista,Tweet t) {
		
		_listaRetweetsNotificados = lista; 
		this.t=t;
		
		this.getLabelTextoRetweetNotificado().setText("El usuario " + t.getEscritoPor().getNick() + " ha retweeteado\"" +  t.getRetweeteaA().getContieneTexto()!=null? t.getRetweeteaA().getContieneTexto().getTexto():"[Tweet sin texto]" +"\"");
	}
}