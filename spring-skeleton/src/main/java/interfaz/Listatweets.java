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
		else if(_verperfilUsuarioNoRegistrado._vertweetUsuarioNoRegistrado!=null) {
			if(_verperfilUsuarioNoRegistrado.mencion)
			u= _verperfilUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets.t.getMencionaA();
		else
			u= _verperfilUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets.t.getEscritoPor();
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
			
			if(twe.getEscritoPor().getBaneo()!=null && twe.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			Tweet tweet=twe;
			boolean ret=twe.getRetweeteaA()!=null && twe.getContieneTexto()==null && twe.contieneMultimedia.isEmpty();
			if(ret) {
				tweet=twe.getRetweeteaA();
			}
			
			Listatweets_item t = new Listatweets_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			//Si hay retweet con texto y/o multimedia
			else if(twe.getRetweeteaA()!=null) { 
				
				Tweet retwe = tweet.getRetweeteaA();
				Listatweets_item retweet = new Listatweets_item(this,retwe);
				//Se cambia el color para que se note más el tweet retweeteado
				retweet.getVaadinHorizontalLayout().getStyle().set("background-color", "#e0e0e0");
			
				retweet.getHorizontalLayoutOpciones().setVisible(false);
				if(retwe.contieneMultimedia!=null) {
					retweet.getHorizontalLayoutMultimedia().setVisible(false);
					retweet.getHorizontalMultimedia().setVisible(false);
				}
				t.getVerticalLayoutEspacioBotones().as(VerticalLayout.class).add(retweet);
			}
			
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
			
			if(twe.getEscritoPor().getBaneo()!=null && twe.getEscritoPor().getBaneo().after(new Date())) {
				continue;
			}
			
			Tweet tweet=twe;
			boolean ret=twe.getRetweeteaA()!=null && twe.getContieneTexto()==null && twe.contieneMultimedia.isEmpty();
			if(ret) {
				tweet=twe.getRetweeteaA();
			}
			Listatweets_item t = new Listatweets_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	
	
	
	
	
	
}