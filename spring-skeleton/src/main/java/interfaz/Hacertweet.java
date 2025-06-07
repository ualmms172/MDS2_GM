package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

import com.vaadin.flow.component.html.Div;
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
		super();
		
		_usuarioregistrado = usuarioregistrado;
		this.getLabelCrearContenido().setText("Crear Tweet");
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioregistrado.MainView.removeAll(); 
		    this._usuarioregistrado.MainView.add(_usuarioregistrado); 
		}); 
		
//		this.getTextFieldUrlFoto().addValueChangeListener(event -> {
//		    String url = event.getValue();
//		    if (url != null && !url.isEmpty()) {
//		        this.getImgImagen().setSrc(url);
//		    } else {
//		    	this.getImgImagen().setSrc(""); // Limpia la imagen si el campo está vacío
//		    }
//		});
//		
//		this.getTextFieldTextoVideo().addValueChangeListener(event -> {
//			String url = event.getValue();
//		    Div videoDiv = this.getImgVideo();
//
//		    if (url != null && !url.isEmpty()) {
//		    	 String videoId = "";
//
//		    	    if (url.contains("watch?v=")) {
//		    	        int index = url.indexOf("watch?v=") + 8;
//		    	        int end = url.indexOf("&", index);
//		    	        if (end == -1) end = url.length();
//		    	        videoId = url.substring(index, end);
//		    	    } else if (url.contains("youtu.be/")) {
//		    	        int index = url.indexOf("youtu.be/") + 9;
//		    	        int end = url.indexOf("?", index);
//		    	        if (end == -1) end = url.length();
//		    	        videoId = url.substring(index, end);
//		    	    }
//		        String embedUrl ="https://www.youtube.com/embed/" + videoId;
//		        String iframe = "<iframe width='560' height='315' src='" + embedUrl + "' " +
//		                        "title='YouTube video player' frameborder='0' " +
//		                        "allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>";
//		        videoDiv.getElement().setProperty("innerHTML", iframe);
//		    } else {
//		        videoDiv.getElement().setProperty("innerHTML", ""); // Limpia el contenido si el campo está vacío
//		    }
//		});
		
	}
	
	
	public Hacertweet(ListahashtagsUsuarioRegistrado_item listahashtagsUsuarioRegistrado) {
		super();
		
		_listahashtagsUsuarioRegistrado = listahashtagsUsuarioRegistrado; 
		this.getTextFieldCampoTexto().setValue(_listahashtagsUsuarioRegistrado.h.getTitulo());
		this.getLabelCrearContenido().setText("Crear Tweet");
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_listahashtagsUsuarioRegistrado._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado);
		}); 
		
//		this.getTextFieldUrlFoto().addValueChangeListener(event -> {
//		    String url = event.getValue();
//		    if (url != null && !url.isEmpty()) {
//		        this.getImgImagen().setSrc(url);
//		    } else {
//		    	this.getImgImagen().setSrc(""); // Limpia la imagen si el campo está vacío
//		    }
//		});
//		
//		this.getTextFieldTextoVideo().addValueChangeListener(event -> {
//		    String url = event.getValue();
//		    Div videoDiv = this.getImgVideo(); // Aunque el nombre "getImgVideo" puede confundir, si devuelve un Div está bien
//
//		    if (url != null && !url.isBlank()) {
//		        String videoId = null;
//
//		        if (url.contains("youtube.com/watch?v=")) {
//		            int index = url.indexOf("watch?v=") + 8;
//		            int end = url.indexOf("&", index);
//		            videoId = (end == -1) ? url.substring(index) : url.substring(index, end);
//		        } else if (url.contains("youtu.be/")) {
//		            int index = url.indexOf("youtu.be/") + 9;
//		            int end = url.indexOf("?", index);
//		            videoId = (end == -1) ? url.substring(index) : url.substring(index, end);
//		        }
//
//		        if (videoId != null && !videoId.isBlank()) {
//		            String embedUrl = "https://www.youtube.com/embed/" + videoId;
//		            String iframe = "<iframe width='560' height='315' src='" + embedUrl + "' " +
//		                            "title='YouTube video player' frameborder='0' " +
//		                            "allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>";
//		            videoDiv.getElement().setProperty("innerHTML", iframe);
//		        } else {
//		            videoDiv.getElement().setProperty("innerHTML", "");
//		        }
//		    } else {
//		        videoDiv.getElement().setProperty("innerHTML", ""); // Limpia el contenido si el campo está vacío
//		    }
//		});

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
		        // Validar y extraer el ID del video de YouTube
		        String videoId = null;

		        if (video.contains("youtube.com/watch?v=")) {
		            int index = video.indexOf("watch?v=") + 8;
		            int end = video.indexOf("&", index);
		            videoId = (end == -1) ? video.substring(index) : video.substring(index, end);
		        } else if (video.contains("youtu.be/")) {
		            int index = video.indexOf("youtu.be/") + 9;
		            int end = video.indexOf("?", index);
		            videoId = (end == -1) ? video.substring(index) : video.substring(index, end);
		        }

		        if (videoId == null || videoId.isBlank()) {
		            Notification.show("El enlace no parece ser un video de YouTube válido.");
		            return;
		        }

		        String embedUrl = "https://www.youtube.com/embed/" + videoId;

		        // Verificar si el video existe haciendo una petición GET al embed
		        URL url = new URL(embedUrl);
		        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		        connection.setRequestMethod("GET"); // HEAD a veces falla con YouTube
		        connection.setConnectTimeout(3000);
		        connection.setReadTimeout(3000);
		        int responseCode = connection.getResponseCode();

		        if (responseCode != 200) {
		            Notification.show("El video de YouTube no se puede cargar o no existe.");
		            return;
		        }

		        // Si llega hasta aquí, el video es válido
		        // Aquí podrías guardar el video o actualizar la vista
		        video = embedUrl;

		    } catch (Exception e) {
		        Notification.show("El enlace debe ser un video de YouTube válido y accesible.");
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