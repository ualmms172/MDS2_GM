package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import gallardoMartinez.MainView.Interfaz;


public class Comentariospropios extends ListaComentariosGeneral {
	public Vector<Comentariospropios_item> _item = new Vector<Comentariospropios_item>();
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	public Comentariospropios(VertweetgeneralUsuarioRegistrado tweet) {
		
		_vertweetgeneralUsuarioRegistrado = tweet; 
		
		
		Comentario[] comentarios = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.comentarios.toArray();
		for(Comentario com : comentarios) {
			
			Comentariospropios_item c = null;
			if(com.getEscritoPor().equals(Interfaz.ur.u))
				c = new Comentariospropios_item(this,com);
			else
				c = new ComentariosUsuarioRegistrado_item(this,com);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(c);
		}
	}
}