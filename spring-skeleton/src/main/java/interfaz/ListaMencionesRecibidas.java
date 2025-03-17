package interfaz;

import java.util.Vector;

import vistas.VistaListamencionesrecibidas;

public class ListaMencionesRecibidas extends VistaListamencionesrecibidas {
	public Notificaciones _notificaciones;
	public Vector<ListaMencionesRecibidas_item> _item = new Vector<ListaMencionesRecibidas_item>();
	
	public ListaMencionesRecibidas(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
	}
}