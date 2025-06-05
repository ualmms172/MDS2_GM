package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;

public class ListaComentariosUsuarioNoRegistrado extends ListaComentariosGeneral {
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public Vector<ListaComentariosUsuarioNoRegistrado_item> _item = new Vector<ListaComentariosUsuarioNoRegistrado_item>();
	
	public ListaComentariosUsuarioNoRegistrado(VertweetUsuarioNoRegistrado tweet) {
		
		_vertweetUsuarioNoRegistrado = tweet; 
		
		Comentario[] comentarios = this._vertweetUsuarioNoRegistrado._listatweets.t.comentarios.toArray();
		for(Comentario com : comentarios) {
			
			if(com.getEscritoPor().getBaneo()!=null && com.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			ListaComentariosUsuarioNoRegistrado_item c = new ListaComentariosUsuarioNoRegistrado_item(this,com);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(c);
		}
	}
	
	
	
}