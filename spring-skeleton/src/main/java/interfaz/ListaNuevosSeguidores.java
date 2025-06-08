package interfaz;

import java.util.Date;
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
			//Si el usuario que nos sigue esta baneado entonces no se muestra
			if(user.getBaneo()!=null && user.getBaneo().after(new Date())) {
				continue;
			}
			
			ListaNuevosSeguidores_item u = new ListaNuevosSeguidores_item(this,user);
			
			this.getVerticalListanuevoseguidores().as(VerticalLayout.class).add(u);
		}
	}
}