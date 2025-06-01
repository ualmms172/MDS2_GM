package interfaz;

import java.util.ArrayList;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Hashtag;
import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;

public class MostrartweetspropiosUsuarioRegistrado extends ListaTweetsGeneral {
	public Vector<MostrartweetspropiosUsuarioRegistrado_item> _item = new Vector<MostrartweetspropiosUsuarioRegistrado_item>();
	
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public VerHashtagUsuarioRegistrado _verHashtagUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilgeneralUsuarioRegistrado;
	
	public MostrartweetspropiosUsuarioRegistrado(UsuarioRegistrado usuario) {
		
		_usuarioregistrado = usuario; 
		
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		for(basededatos.UsuarioRegistrado user : _usuarioregistrado.u.sigueA.toArray()) {
			for(Contenido contenido : user.escribe.toArray()) {
				if(contenido instanceof Tweet)
					tweets.add((Tweet)contenido);
			}
		}
		
		for(Tweet twe : tweets) {
			MostrartweetspropiosUsuarioRegistrado_item t = new MostrartweetspropiosUsuarioRegistrado_item(this,twe);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	public MostrartweetspropiosUsuarioRegistrado(VerHashtagUsuarioRegistrado verHashtagUsuarioRegistrado) {
		
	_verHashtagUsuarioRegistrado = verHashtagUsuarioRegistrado; 
	
	Hashtag hash =null;
	if(_verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado!=null) {
		hash= _verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado._mostrartweetspropiosUsuarioRegistrado.t.getContiene();
	}
	else if(_verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado!=null) {
		hash=_verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado.t.getContiene();
	}
	else {
		hash=_verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado.h;
	}
	Tweet[] tweets = hash.contenidoPor.toArray();
	
	for(Tweet twe : tweets) {
		MostrartweetspropiosUsuarioRegistrado_item t = new MostrartweetspropiosUsuarioRegistrado_item(this,twe);
		
		this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
	}
	}
	
	public MostrartweetspropiosUsuarioRegistrado(VerperfilgeneralUsuarioRegistrado verperfilgeneralUsuarioRegistrado) {
		
		_verperfilgeneralUsuarioRegistrado = verperfilgeneralUsuarioRegistrado; 
		
		basededatos.UsuarioRegistrado u = null;
		if(_verperfilgeneralUsuarioRegistrado._comentariosUsuarioRegistrado!=null) {
			u=_verperfilgeneralUsuarioRegistrado._comentariosUsuarioRegistrado.c.getEscritoPor();
		}
		else if(_verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
			u= _verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado.u;
		}
		else {
			if(_verperfilgeneralUsuarioRegistrado.mencion)
				u=_verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item.t.getMencionaA();
			else
				u= _verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
		}
		
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		for(Contenido c :u.escribe.toArray()) {
			if(c instanceof Tweet) {
				tweets.add((Tweet)c);
			}
		}
		
		for(Tweet twe : tweets) {
			MostrartweetspropiosUsuarioRegistrado_item t = new MostrartweetspropiosUsuarioRegistrado_item(this,twe);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
		}
}