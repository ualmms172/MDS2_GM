package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Interfaz;

public class ListahashtagsUsuarioRegistrado extends ListahashtagsgeneralUsuarioRegistrado {
	public VerlistacompletahashtagUsuarioRegistrado _verlistacompletahashtagUsuarioRegistrado;
	public Vector<ListahashtagsUsuarioRegistrado_item> _item = new Vector<ListahashtagsUsuarioRegistrado_item>();
	
	public ListahashtagsUsuarioRegistrado(VerlistacompletahashtagUsuarioRegistrado lista) {
		
		_verlistacompletahashtagUsuarioRegistrado = lista; 
		
		Hashtag[] hashtags = Interfaz.ur._iUsuarioregistrado.Cargar_Hashtags();
		
		for(Hashtag has : hashtags) { 
			
			ListahashtagsUsuarioRegistrado_item h = new ListahashtagsUsuarioRegistrado_item(this,has);
			
			this.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(h);
		}
	}
}