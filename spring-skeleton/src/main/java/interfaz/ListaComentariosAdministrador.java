package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import gallardoMartinez.MainView.Interfaz;

public class ListaComentariosAdministrador extends ListaComentariosGeneral {
	public VerTweetAdministrador _verTweetAdministrador;
	public Vector<ListaComentariosAdministrador_item> _item = new Vector<ListaComentariosAdministrador_item>();
	 
	
    public ListaComentariosAdministrador(VerTweetAdministrador tweet) {
    	
    	_verTweetAdministrador = tweet; 
    	
    	Comentario[] comentarios = this._verTweetAdministrador._listaTweetsAdmin.t.comentarios.toArray();
		for(Comentario com : comentarios) {
			
			if(com.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			ListaComentariosAdministrador_item c = new ListaComentariosAdministrador_item(this,com);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(c);
		}
    }

}