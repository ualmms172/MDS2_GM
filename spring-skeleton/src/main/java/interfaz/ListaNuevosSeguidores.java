package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;
import vistas.VistaListanuevosseguidores;

public class ListaNuevosSeguidores extends VistaListanuevosseguidores {
	public Notificaciones _notificaciones;
	public Vector<ListaNuevosSeguidores_item> _item = new Vector<ListaNuevosSeguidores_item>();
	
	public ListaNuevosSeguidores(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.ur.u.seguidoPor.toArray();
		
		for(basededatos.UsuarioRegistrado user : usuarios) {
			
			ListaNuevosSeguidores_item u = new ListaNuevosSeguidores_item(this,user);
			
			this.getVerticalListanuevoseguidores().as(VerticalLayout.class).add(u);
		}
	}
}