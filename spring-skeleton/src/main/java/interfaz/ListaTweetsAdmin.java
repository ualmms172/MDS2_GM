package interfaz;

import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Hashtag;
import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;

public class ListaTweetsAdmin extends ListaTweetsGeneral {
	
	public Administrador _administrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	public VerHashtagAdministrador _verHashtagAdministrador;
	public Vector<ListaTweetsAdmin_item> _item = new Vector<ListaTweetsAdmin_item>();
	
	public ListaTweetsAdmin(Administrador admin) {
		
		_administrador = admin; 
		
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		for(basededatos.UsuarioRegistrado usuario : _administrador._iadministrador.Cargar_Usuarios()) {
			for(Contenido contenido : usuario.escribe.toArray()) {
				if(contenido instanceof Tweet)
					tweets.add((Tweet)contenido);
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
			ListaTweetsAdmin_item t = new ListaTweetsAdmin_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			//Si hay retweet con texto y/o multimedia
			else if(twe.getRetweeteaA()!=null) { 
				
				Tweet retwe = tweet.getRetweeteaA();
				ListaTweetsAdmin_item retweet = new ListaTweetsAdmin_item(this,retwe);
				
				//Se cambia el color para que se note más el tweet retweeteado
				retweet.getVaadinHorizontalLayout().getStyle().set("background-color", "#e0e0e0");
				
				retweet.getButtonMeGusta().getStyle().set("visibility", "hidden");
				retweet.getButtonMeGusta().getStyle().set("pointer-events", "none");
				
				
				
				retweet.getButtonMeGusta().getStyle().set("visibility", "hidden");
				retweet.getButtonMeGusta().getStyle().set("pointer-events", "none");
				
				retweet.getImgFotoTweet().getStyle().set("visibility", "hidden");
				retweet.getImgFotoTweet().getStyle().set("pointer-events", "none");
				
				retweet.getDivTweet().getStyle().set("visibility", "hidden");
				retweet.getDivTweet().getStyle().set("pointer-events", "none");
				
				retweet.getLabelMeGusta().getStyle().set("visibility", "hidden");
				retweet.getLabelMeGusta().getStyle().set("pointer-events", "none");
			
//				if(retwe.contieneMultimedia!=null) {
//					retweet.getHorizontalLayoutMultimedia().setVisible(false);
//					retweet.getHorizontalMultimedia().setVisible(false);
//				}
				
				retweet.getElement().getStyle().set("margin-left", "50px");
				t.getVerticalLayoutRetweetBorrar().as(VerticalLayout.class).setMaxWidth("50px");
				t.getVerticalLayoutEspacioBotones().as(VerticalLayout.class).setMaxWidth("250px");
				t.getVerticalLayoutEspacioBotones().as(VerticalLayout.class).setMaxHeight("100px");
				t.getVerticalLayoutEspacioBotones().as(VerticalLayout.class).add(retweet);
			}
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	
	public ListaTweetsAdmin(VerPerfilAdministrador perfil) {
		
		_verPerfilAdministrador = perfil; 
		
		basededatos.UsuarioRegistrado u = null;
		if(_verPerfilAdministrador._listaComentariosAdministrador!=null) {
			u=_verPerfilAdministrador._listaComentariosAdministrador.c.getEscritoPor();
		}
		else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
			u= _verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
		}
		else if(_verPerfilAdministrador._verTweetAdministrador!=null) {
			if(_verPerfilAdministrador.mencion)
				u= _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getMencionaA();
			else
				u= _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor();
		}
		else {
			if(_verPerfilAdministrador.mencion)
				u= _verPerfilAdministrador._listaTweetsAdmin_item.t.getMencionaA();
			else
				u= _verPerfilAdministrador._listaTweetsAdmin_item.t.getEscritoPor();
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
			ListaTweetsAdmin_item t = new ListaTweetsAdmin_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			//Si hay retweet con texto y/o multimedia
			else if(twe.getRetweeteaA()!=null) { 
				
				Tweet retwe = tweet.getRetweeteaA();
				ListaTweetsAdmin_item retweet = new ListaTweetsAdmin_item(this,retwe);
				
				//Se cambia el color para que se note más el tweet retweeteado
				retweet.getVaadinHorizontalLayout().getStyle().set("background-color", "#e0e0e0");
				
				retweet.getButtonMeGusta().getStyle().set("visibility", "hidden");
				retweet.getButtonMeGusta().getStyle().set("pointer-events", "none");
				
				
				
				retweet.getButtonMeGusta().getStyle().set("visibility", "hidden");
				retweet.getButtonMeGusta().getStyle().set("pointer-events", "none");
				
				retweet.getImgFotoTweet().getStyle().set("visibility", "hidden");
				retweet.getImgFotoTweet().getStyle().set("pointer-events", "none");
				
				retweet.getDivTweet().getStyle().set("visibility", "hidden");
				retweet.getDivTweet().getStyle().set("pointer-events", "none");
				
				retweet.getLabelMeGusta().getStyle().set("visibility", "hidden");
				retweet.getLabelMeGusta().getStyle().set("pointer-events", "none");
			
//				if(retwe.contieneMultimedia!=null) {
//					retweet.getHorizontalLayoutMultimedia().setVisible(false);
//					retweet.getHorizontalMultimedia().setVisible(false);
//				}
				t.getVerticalLayoutEspacioBotones().as(VerticalLayout.class).add(retweet);
			}
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	public ListaTweetsAdmin(VerHashtagAdministrador hashtag) {
		
		_verHashtagAdministrador = hashtag; 
		
		Hashtag hash =null;
		if(_verHashtagAdministrador._verTweetAdministrador!=null) {
			hash= _verHashtagAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getContiene();
		}
		else if(_verHashtagAdministrador._listaTweetsAdmin_item!=null) {
			hash=_verHashtagAdministrador._listaTweetsAdmin_item.t.getContiene();
		}
		else {
			hash=_verHashtagAdministrador._listaHashtagsgeneralAdministrador.h;
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
			ListaTweetsAdmin_item t = new ListaTweetsAdmin_item(this,tweet);
			
			if(ret) {
				t.getHorizontalLayoutRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setVisible(true);
				t.getlabelRetweeteadoPor().setText("Retweeteado por " + twe.getEscritoPor().getNick());
			}
			//Si hay retweet con texto y/o multimedia
			else if(twe.getRetweeteaA()!=null) { 
				
				Tweet retwe = tweet.getRetweeteaA();
				ListaTweetsAdmin_item retweet = new ListaTweetsAdmin_item(this,retwe);
				
				//Se cambia el color para que se note más el tweet retweeteado
				retweet.getVaadinHorizontalLayout().getStyle().set("background-color", "#e0e0e0");
				
				retweet.getButtonMeGusta().getStyle().set("visibility", "hidden");
				retweet.getButtonMeGusta().getStyle().set("pointer-events", "none");
				
				
				
				retweet.getButtonMeGusta().getStyle().set("visibility", "hidden");
				retweet.getButtonMeGusta().getStyle().set("pointer-events", "none");
				
				retweet.getImgFotoTweet().getStyle().set("visibility", "hidden");
				retweet.getImgFotoTweet().getStyle().set("pointer-events", "none");
				
				retweet.getDivTweet().getStyle().set("visibility", "hidden");
				retweet.getDivTweet().getStyle().set("pointer-events", "none");
				
				retweet.getLabelMeGusta().getStyle().set("visibility", "hidden");
				retweet.getLabelMeGusta().getStyle().set("pointer-events", "none");
			
//				if(retwe.contieneMultimedia!=null) {
//					retweet.getHorizontalLayoutMultimedia().setVisible(false);
//					retweet.getHorizontalMultimedia().setVisible(false);
//				}
				t.getVerticalLayoutEspacioBotones().as(VerticalLayout.class).add(retweet);
			}
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	
}