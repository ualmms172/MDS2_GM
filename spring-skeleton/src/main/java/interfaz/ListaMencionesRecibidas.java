package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;
import vistas.VistaListamencionesrecibidas;

public class ListaMencionesRecibidas extends VistaListamencionesrecibidas {
	public Notificaciones _notificaciones;
	public Vector<ListaMencionesRecibidas_item> _item = new Vector<ListaMencionesRecibidas_item>();
	
	public ListaMencionesRecibidas(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
		
		Tweet[] tweets = Interfaz.ur.u.mencionadoEn.toArray();
		for(Tweet twe : tweets) {
			
			if(twe.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			ListaMencionesRecibidas_item t = new ListaMencionesRecibidas_item(this,twe);
			
			this.getVerticalListamencionesrecibidas().as(VerticalLayout.class).add(t);
		}
	}
}