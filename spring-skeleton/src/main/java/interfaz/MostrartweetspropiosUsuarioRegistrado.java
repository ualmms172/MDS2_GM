package interfaz;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Hashtag;
import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;

public class MostrartweetspropiosUsuarioRegistrado extends ListaTweetsGeneral {
	public Vector<MostrartweetspropiosUsuarioRegistrado_item> _item = new Vector<MostrartweetspropiosUsuarioRegistrado_item>();
	
	public UsuarioRegistrado _usuarioregistrado; 
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
			
			//Si el usuario esta actualmente baneado se ignora
			if(twe.getEscritoPor().getBaneo()!=null && twe.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			Tweet tweet=twe;
			//Se comprueba si es el caso de un retweet sin texto ni multimedia
			boolean ret=twe.getRetweeteaA()!=null && twe.getContieneTexto()==null && twe.contieneMultimedia.isEmpty();
			if(ret) {
				tweet=twe.getRetweeteaA();
			}
			
			//Si el tweet pertenece a alguien que te ha bloqueado no sale
			boolean bloqueado=false;
			for(basededatos.UsuarioRegistrado user : Interfaz.ur.u.bloqueadoPor.toArray()) {
				if(user.getID()==tweet.getEscritoPor().getID()) {
					bloqueado=true;
					break;
				}
			}
			if(bloqueado) continue;
			
			MostrartweetspropiosUsuarioRegistrado_item t =null;
			if(tweet.getEscritoPor().getID()==Interfaz.ur.u.getID()) 
				t = new MostrartweetspropiosUsuarioRegistrado_item(this,tweet);
			else
				t= new MostrartweetsUsuarioRegistrado_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			
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
		
		if(twe.getEscritoPor().getBaneo()!=null && twe.getEscritoPor().getBaneo().after(new Date())) {
			continue;
		}
		
		Tweet tweet=twe;
		boolean ret=twe.getRetweeteaA()!=null && twe.getContieneTexto()==null && twe.contieneMultimedia.isEmpty();
		if(ret) {
			tweet=twe.getRetweeteaA();
		}
		
		//Si el tweet pertenece a alguien que te ha bloqueado no sale
		boolean bloqueado=false;
		for(basededatos.UsuarioRegistrado user : Interfaz.ur.u.bloqueadoPor.toArray()) {
			if(user.getID()==tweet.getEscritoPor().getID()) {
				bloqueado=true;
				break;
			}
		}
		if(bloqueado) continue;
		
		MostrartweetspropiosUsuarioRegistrado_item t =null;
		if(tweet.getEscritoPor().getID()==Interfaz.ur.u.getID()) 
			t = new MostrartweetspropiosUsuarioRegistrado_item(this,tweet);
		else
			t= new MostrartweetsUsuarioRegistrado_item(this,tweet);
		
		if(ret) {
			t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
			t.getlabelRetweeteadoPor().setVisible(true);
			t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
		}
		
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
		else if(_verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
			u=Interfaz.ur.u;
		}
		else if(_verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado!=null) {
			if(_verperfilgeneralUsuarioRegistrado.mencion)
				u=_verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
			else
				u= _verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
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
			
			if(twe.getEscritoPor().getBaneo()!=null && twe.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			Tweet tweet=twe;
			boolean ret=twe.getRetweeteaA()!=null && twe.getContieneTexto()==null && twe.contieneMultimedia.isEmpty();
			if(ret) {
				tweet=twe.getRetweeteaA();
			}
			
			//Si el tweet pertenece a alguien que te ha bloqueado no sale
			boolean bloqueado=false;
			for(basededatos.UsuarioRegistrado user : Interfaz.ur.u.bloqueadoPor.toArray()) {
				if(user.getID()==tweet.getEscritoPor().getID()) {
					bloqueado=true;
					break;
				}
			}
			if(bloqueado) continue;
			
			MostrartweetspropiosUsuarioRegistrado_item t =null;
			if(tweet.getEscritoPor().getID()==Interfaz.ur.u.getID()) 
				t = new MostrartweetspropiosUsuarioRegistrado_item(this,tweet);
			else
				t= new MostrartweetsUsuarioRegistrado_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
			
		}
		}
}