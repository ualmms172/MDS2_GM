package interfaz;

import java.util.ArrayList;
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
			ListaTweetsAdmin_item t = new ListaTweetsAdmin_item(this,twe);
			
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
		else {
			u= _verPerfilAdministrador._listaTweetsAdmin_item.t.getEscritoPor();
		}
		
		ArrayList<Tweet> tweets = new ArrayList<Tweet>();
		
		for(Contenido c :u.escribe.toArray()) {
			if(c instanceof Tweet) {
				tweets.add((Tweet)c);
			}
		}
		
		for(Tweet twe : tweets) {
			ListaTweetsAdmin_item t = new ListaTweetsAdmin_item(this,twe);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	public ListaTweetsAdmin(VerHashtagAdministrador hashtag) {
		
		_verHashtagAdministrador = hashtag; 
		
		Hashtag hash =null;
		if(_verHashtagAdministrador._verTweetAdministrador!=null) {
			hash= _verHashtagAdministrador._verTweetAdministrador._listaTweetsAdmin.t.contiene.toArray()[0];
		}
		else if(_verHashtagAdministrador._listaTweetsAdmin_item!=null) {
			hash=_verHashtagAdministrador._listaTweetsAdmin_item.t.contiene.toArray()[0];
		}
		else {
			hash=_verHashtagAdministrador._listaHashtagsgeneralAdministrador.h;
		}
		Tweet[] tweets = hash.contenidoPor.toArray();
		
		for(Tweet twe : tweets) {
			ListaTweetsAdmin_item t = new ListaTweetsAdmin_item(this,twe);
			
			this.getVerticalListacontenido().as(VerticalLayout.class).add(t);
		}
	}
	
	
}