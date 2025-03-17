package interfaz;

import java.util.Vector;

import vistas.VistaListanuevosseguidores;

public class ListaNuevosSeguidores extends VistaListanuevosseguidores {
	public Notificaciones _notificaciones;
	public Vector<ListaNuevosSeguidores_item> _item = new Vector<ListaNuevosSeguidores_item>();
	
	public ListaNuevosSeguidores(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
	}
}