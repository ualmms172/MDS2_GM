package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import basededatos.Hashtag;
import gallardoMartinez.MainView.Interfaz;

public class ListahashtagfamososUsuarioRegistrado extends ListahashtagsgeneralUsuarioRegistrado {
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public Vector<ListahashtagfamososUsuarioRegistrado_item> _item = new Vector<ListahashtagfamososUsuarioRegistrado_item>();
	
	public ListahashtagfamososUsuarioRegistrado(UsuarioRegistrado usuario) {
		
		_usuarioregistrado  = usuario; 
		
		//Imagino que ya estará ordenado por fama?
		Hashtag[] hashtags = _usuarioregistrado._iUsuarioregistrado.Cargar_Hashtags();
		
		for(int i=0;i<10;i++) { //Como son los famosos solo se muestran los n primeros
			
			Hashtag has = hashtags[i];
			
			ListahashtagfamososUsuarioRegistrado_item h = new ListahashtagfamososUsuarioRegistrado_item(this,has);
			
			this.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(h);
		}
	}
	
}