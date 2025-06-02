package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Hashtag;
import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;

public class Listatweets extends ListaTweetsGeneral {
	public VerHashtagUsuarioNoRegistrado _verHashtagUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;
	public Vector<Listatweets_item> _item = new Vector<Listatweets_item>();
	
	public Listatweets(VerperfilUsuarioNoRegistrado perfil) {
		
		_verperfilUsuarioNoRegistrado = perfil; 
		
		basededatos.UsuarioRegistrado u = null;
		if(_verperfilUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado!=null) {
			u=_verperfilUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado.c.getEscritoPor();
		}
		else if(_verperfilUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado!=null) {
			u= _verperfilUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado.u;
		}
		else {
			if(_verperfilUsuarioNoRegistrado.mencion)
				u= _verperfilUsuarioNoRegistrado._listatweets_item.t.getMencionaA();
			else
				u= _verperfilUsuarioNoRegistrado._listatweets_item.t.getEscritoPor();
		}
		
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		for(Contenido c :u.escribe.toArray()) {
			if(c instanceof Tweet) {
				tweets.add((Tweet)c);
			}
		}
		
		for(Tweet twe : tweets) {
			Listatweets_item t = new Listatweets_item(this,twe);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
		
	}
	
	public Listatweets(VerHashtagUsuarioNoRegistrado hashtag) {
		
		_verHashtagUsuarioNoRegistrado = hashtag; 
		
		Hashtag hash =null;
		if(_verHashtagUsuarioNoRegistrado._vertweetUsuarioNoRegistrado!=null) {
			hash= _verHashtagUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets.t.getContiene();
		}
		else if(_verHashtagUsuarioNoRegistrado._listatweets_item!=null) {
			hash=_verHashtagUsuarioNoRegistrado._listatweets_item.t.getContiene();
		}
		else {
			hash=_verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado.h;
		}
		Tweet[] tweets = hash.contenidoPor.toArray();
		
		for(Tweet twe : tweets) {
			Listatweets_item t = new Listatweets_item(this,twe);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	
	
	
	
	
	
}