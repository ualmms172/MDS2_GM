package interfaz;

import java.util.Vector;

public class ListaRetweetsNotificados {
	public Notificaciones _notificaciones;
	public Vector<ListaRetweetsNotificados_item> _item = new Vector<ListaRetweetsNotificados_item>();
	
	public ListaRetweetsNotificados(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
	}
}