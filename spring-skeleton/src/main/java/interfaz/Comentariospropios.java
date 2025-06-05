package interfaz;

import java.util.Date;
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
			
			//Si el comentario pertenece a alguien que te ha bloqueado no sale
			boolean bloqueado=false;
			for(basededatos.UsuarioRegistrado user : Interfaz.ur.u.bloqueadoPor.toArray()) {
				if(user.getID()==com.getEscritoPor().getID()) {
					bloqueado=true;
					break;
				}
			}
			if(bloqueado) continue;
			
			if(com.getEscritoPor().getBaneo()!=null && com.getEscritoPor().getBaneo().after(new Date())) continue;
			
			
			Comentariospropios_item c = null;
			if(com.getEscritoPor().getID()==Interfaz.ur.u.getID())
				c = new Comentariospropios_item(this,com);
			else
				c = new ComentariosUsuarioRegistrado_item(this,com);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(c);
		}
	}
}