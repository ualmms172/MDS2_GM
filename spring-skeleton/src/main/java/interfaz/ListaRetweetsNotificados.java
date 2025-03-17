package interfaz;

import java.util.Vector;

import vistas.VistaListaretweetsnotificados;

public class ListaRetweetsNotificados extends VistaListaretweetsnotificados {
	public Notificaciones _notificaciones;
	public Vector<ListaRetweetsNotificados_item> _item = new Vector<ListaRetweetsNotificados_item>();
	
	public ListaRetweetsNotificados(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
	}
}