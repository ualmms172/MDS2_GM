package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

import com.vaadin.flow.component.notification.Notification;

import basededatos.Hashtag;
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
		
		this.getTextFieldUrlFoto().addValueChangeListener(event -> {
		    String url = event.getValue();
		    if (url != null && !url.isEmpty()) {
		        this.getImgImagen().setSrc(url);
		    } else {
		    	this.getImgImagen().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
		});
		
		this.getTextFieldTextoVideo().addValueChangeListener(event -> {
		    String url = event.getValue();
		    if (url != null && !url.isEmpty()) {
		        this.getImgVideo().setSrc(url);
		    } else {
		    	this.getImgVideo().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
		});
		
	}
	
	
	public Hacertweet(ListahashtagsUsuarioRegistrado_item listahashtagsUsuarioRegistrado) {
		
		_listahashtagsUsuarioRegistrado = listahashtagsUsuarioRegistrado; 
		this.getTextFieldCampoTexto().setValue(_listahashtagsUsuarioRegistrado.h.getTitulo());
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_listahashtagsUsuarioRegistrado._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado);
		}); 
		
		this.getTextFieldUrlFoto().addValueChangeListener(event -> {
		    String url = event.getValue();
		    if (url != null && !url.isEmpty()) {
		        this.getImgImagen().setSrc(url);
		    } else {
		    	this.getImgImagen().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
		});
		
		this.getTextFieldTextoVideo().addValueChangeListener(event -> {
		    String url = event.getValue();
		    if (url != null && !url.isEmpty()) {
		        this.getImgVideo().setSrc(url);
		    } else {
		    	this.getImgVideo().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
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
		
		// Comprobamos que la foto lo sea realmente
		if (!foto.isBlank()) {
			try {
				URL url = new URL(foto);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("HEAD");
				connection.setConnectTimeout(3000);
				connection.setReadTimeout(3000);
				connection.connect();

				String contentType = connection.getContentType();
				if (contentType == null || !contentType.startsWith("image/")) {
					Notification.show("Si se rellena el campo foto debe contener un enlace a una foto.");
					return;
				}
			} catch (Exception e) {
				Notification.show("Si se rellena el campo foto debe contener un enlace a una foto.");
				return;
			}
		}

		// Comprobamos que el video lo sea realmente
		if (!video.isBlank()) {
			try {
				URL url = new URL(video);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("HEAD");
				connection.setConnectTimeout(3000);
				connection.setReadTimeout(3000);
				connection.connect();

				String contentType = connection.getContentType();
				if (contentType == null || !contentType.startsWith("video/")) {
					Notification.show("Si se rellena el campo video debe contener un enlace a una video.");
					return;
				}
			} catch (Exception e) {
				Notification.show("Si se rellena el campo video debe contener un enlace a una video.");
				return;
			}
		}
		
		
		basededatos.UsuarioRegistrado ubd = null;
		Hashtag hash=null;
		basededatos.UsuarioRegistrado mencionado = null;
		
		if (texto.contains("#")) {
			hash= this.UsarHashtag(texto);
		}
		if(texto.contains("@")) {
			mencionado = this.Mencionar(texto);
		}
		
		ubd=Interfaz.ur._iUsuarioregistrado.Escribir_Tweet(hash,mencionado,texto, foto, video, Interfaz.ur.u);
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
	
	public basededatos.UsuarioRegistrado Mencionar(String texto) {
		
		int inicio = texto.indexOf("@");
		if (inicio != -1) {
		    int fin = texto.indexOf(" ", inicio);
		    if (fin == -1) {
		        fin = texto.length(); 
		    }
		    if(inicio<texto.length()) inicio++;
		    else return null;
		    String mencion = texto.substring(inicio, fin);
		    basededatos.UsuarioRegistrado mencionado = Interfaz.ur._iUsuarioregistrado.BuscarUsuario(mencion);
		    return mencionado;
		}
		return null;
		
	}
	
	public Hashtag UsarHashtag(String texto) {
		
		int start = texto.indexOf("#");
		int end = texto.indexOf(" ", start);
		String hashtag = (end == -1) ? texto.substring(start) : texto.substring(start, end);
		Hashtag hash = Interfaz.ur._iUsuarioregistrado.BuscarHashtag(hashtag);
		if(hash==null) {
			hash = Interfaz.ur._iUsuarioregistrado.CrearHashtag(hashtag, Interfaz.ur.u);
		}
		return hash;
		
	}
	
	
	public Hacertweet Recargar(UsuarioRegistrado log) {
		return new Hacertweet(log);
	}

}