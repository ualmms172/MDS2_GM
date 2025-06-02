package interfaz;

import com.vaadin.flow.component.notification.Notification;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Hacertweet extends CrearContenido {
	//private event _publicartweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListahashtagsUsuarioRegistrado_item _listahashtagsUsuarioRegistrado;
	
	public Hacertweet(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado;
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioregistrado.MainView.removeAll(); 
		    this._usuarioregistrado.MainView.add(_usuarioregistrado); 
		}); 
		
	}
	
	
	public Hacertweet(ListahashtagsUsuarioRegistrado_item listahashtagsUsuarioRegistrado) {
		
		_listahashtagsUsuarioRegistrado = listahashtagsUsuarioRegistrado; 
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_listahashtagsUsuarioRegistrado._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado);
		}); 
	}
	
	
	public void Publicartweet() {
//		UsuarioRegistrado user = new UsuarioRegistrado(this._usuarioregistrado.MainView);
//		this._usuarioregistrado.MainView.removeAll();
//		this._usuarioregistrado.MainView.add(user);
		
		if (this.getTextFieldCampoTexto().isEmpty() && this.getTextFieldTextoVideo().isEmpty() && this.getTextFieldUrlFoto().isEmpty()) {
            Notification.show("Se debe rellenar al menos un campo para poder tweetear.");
            return;
        }
		
		UsuarioRegistrado u=null;
		VerlistacompletahashtagUsuarioRegistrado l = null;
		String texto = this.getTextFieldCampoTexto().getValue();
		String foto = this.getTextFieldUrlFoto().getValue();
		String video= this.getTextFieldTextoVideo().getValue();
		
		if(texto.isBlank() && foto.isBlank() && video.isBlank())
			return;
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Escribir_Tweet(texto, foto, video, Interfaz.ur.u);
		u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		
		Pantalla.MainView.removeAll();
		if(_usuarioregistrado!=null) {
			Pantalla.MainView.add(u);
		}
		else {
			l = new VerlistacompletahashtagUsuarioRegistrado(u);
			Pantalla.MainView.add(l);
		}
			
		//Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		
		
	}
	
	public void Mencionar() {
		String texto = this.getTextFieldCampoTexto().getValue();
		
		int inicio = texto.indexOf("@");
		if (inicio != -1) {
		    int fin = texto.indexOf(" ", inicio);
		    if (fin == -1) {
		        fin = texto.length(); 
		    }
		    String mencion = texto.substring(inicio, fin);
		}
		
	}
	
	public void UsarHashtag() {
		String texto = this.getTextFieldCampoTexto().getValue();
		
		int inicio = texto.indexOf("#");
		if (inicio != -1) {
		    int fin = texto.indexOf(" ", inicio);
		    if (fin == -1) {
		        fin = texto.length(); 
		    }
		    String hashtag = texto.substring(inicio, fin);
		}
		
	}
	
	
	public Hacertweet Recargar(UsuarioRegistrado log) {
		return new Hacertweet(log);
	}

}