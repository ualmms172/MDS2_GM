package interfaz;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;
import vistas.VistaListaretweetsnotificados;

public class ListaRetweetsNotificados extends VistaListaretweetsnotificados {
	public Notificaciones _notificaciones;
	public Vector<ListaRetweetsNotificados_item> _item = new Vector<ListaRetweetsNotificados_item>();
	
	public ListaRetweetsNotificados(Notificaciones notificacion) {
		
		_notificaciones = notificacion; 
		
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		//Para cada tweet que haya escrito se muestra todos los retweets
		for(Contenido c :Interfaz.ur.u.escribe.toArray()) {
			if(c instanceof Tweet) {
				for(Tweet twe : ((Tweet)c).retweeteadoPor.toArray())
					tweets.add(twe);
			}
		}
		
		for(Tweet twe : tweets) {
			
			if(twe.getEscritoPor().getBaneo()!=null && twe.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			ListaRetweetsNotificados_item t = new ListaRetweetsNotificados_item(this,twe);
			
			this.getVerticalListaretweetsnotificados().as(VerticalLayout.class).add(t);
		}
	}
}