package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Hashtag;

public class ListahashtagsfamososUsuarioNoRegistrado extends ListahashtagsgeneralUsuarioNoRegistrado {
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public Vector<ListahashtagsfamososUsuarioNoRegistrado_item> _item = new Vector<ListahashtagsfamososUsuarioNoRegistrado_item>();
	
	public ListahashtagsfamososUsuarioNoRegistrado(UsuarioNoRegistrado usuario) {
		
		_usuarioNoRegistrado = usuario; 
		
		//Imagino que ya estará ordenado por fama?
		Hashtag[] hashtags = _usuarioNoRegistrado._iUsuarioNoRegistrado.Cargar_Hashtags();
						
		for(int i=0;i<10;i++) { //Como son los famosos solo se muestran los n primeros
							
			Hashtag has = hashtags[i];
							
			ListahashtagsfamososUsuarioNoRegistrado_item h = new ListahashtagsfamososUsuarioNoRegistrado_item(this,has);
							
			this.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(h);
		}
	}
	
}