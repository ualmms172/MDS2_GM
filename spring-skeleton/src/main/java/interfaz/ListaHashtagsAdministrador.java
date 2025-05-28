package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Interfaz;

public class ListaHashtagsAdministrador extends ListaHashtagsgeneralAdministrador {
	public VerlistaCompletaHashtagsAdmin _verlistaCompletaHashtagsAdmin;
	public Vector<ListaHashtagsAdministrador_item> _item = new Vector<ListaHashtagsAdministrador_item>();
	
	public ListaHashtagsAdministrador(VerlistaCompletaHashtagsAdmin lista) {
		
		_verlistaCompletaHashtagsAdmin = lista; 
		
		Hashtag[] hashtags = Interfaz.ad._iadministrador.Cargar_Hashtags();
		
		for(Hashtag has : hashtags) { 
			
			ListaHashtagsAdministrador_item h = new ListaHashtagsAdministrador_item(this,has);
			
			this.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(h);
		}
	}
}