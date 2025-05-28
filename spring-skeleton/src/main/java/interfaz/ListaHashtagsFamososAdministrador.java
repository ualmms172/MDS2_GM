package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Hashtag;

public class ListaHashtagsFamososAdministrador extends ListaHashtagsgeneralAdministrador {
	public Administrador _administrador;
	public Vector<ListaHashtagsFamososAdministrador_item> _item = new Vector<ListaHashtagsFamososAdministrador_item>();
	
	public ListaHashtagsFamososAdministrador(Administrador administrador) {
		
		_administrador = administrador; 
		
		//Imagino que ya estará ordenado por fama?
		Hashtag[] hashtags = _administrador._iadministrador.Cargar_Hashtags();
				
		for(int i=0;i<10;i++) { //Como son los famosos solo se muestran los n primeros
					
			Hashtag has = hashtags[i];
					
			ListaHashtagsFamososAdministrador_item h = new ListaHashtagsFamososAdministrador_item(this,has);
					
			this.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(h);
		}
	}
	}