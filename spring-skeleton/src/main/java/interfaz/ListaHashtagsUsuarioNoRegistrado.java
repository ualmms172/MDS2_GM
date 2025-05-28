package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Interfaz;

public class ListaHashtagsUsuarioNoRegistrado extends ListahashtagsgeneralUsuarioNoRegistrado {
	public Verlistacompletahashtags _verlistacompletahashtags;
	public Vector<ListaHashtagsUsuarioNoRegistrado_item> _item = new Vector<ListaHashtagsUsuarioNoRegistrado_item>();
	
	public ListaHashtagsUsuarioNoRegistrado(Verlistacompletahashtags listacompletahashtags) {
		
		_verlistacompletahashtags  = listacompletahashtags; 
		
		Hashtag[] hashtags = Interfaz.nr._iUsuarioNoRegistrado.Cargar_Hashtags();
		
		for(Hashtag has : hashtags) { 
			
			ListaHashtagsUsuarioNoRegistrado_item h = new ListaHashtagsUsuarioNoRegistrado_item(this,has);
			
			this.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(h);
		}
		
	}
	
}