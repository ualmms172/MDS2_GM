package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Comentar extends CrearContenido {
	//private event _publicarcomentario;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;

	public Comentar(VertweetgeneralUsuarioRegistrado  vertweetgeneralUsuarioRegistrado) {
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		
		this.getButtonPublicar().addClickListener(Event -> Publicarcomentario());
		
		this.getButtonAtras().addClickListener(event -> {
			
			VertweetgeneralUsuarioRegistrado verTweet = null;
			if(_vertweetgeneralUsuarioRegistrado instanceof Vertweetpropio) 
				verTweet = new Vertweetpropio(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado);
			else
				verTweet = new Vertweetajeno(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado);
			
			if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado !=null) {
				Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
			}
			else if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado !=null) {
				Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
			}
			else {
				Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
			}
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(verTweet);
				
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
		    Div videoDiv = this.getImgVideo(); // Aunque el nombre "getImgVideo" puede confundir, si devuelve un Div está bien

		    if (url != null && !url.isBlank()) {
		        String videoId = null;

		        if (url.contains("youtube.com/watch?v=")) {
		            int index = url.indexOf("watch?v=") + 8;
		            int end = url.indexOf("&", index);
		            videoId = (end == -1) ? url.substring(index) : url.substring(index, end);
		        } else if (url.contains("youtu.be/")) {
		            int index = url.indexOf("youtu.be/") + 9;
		            int end = url.indexOf("?", index);
		            videoId = (end == -1) ? url.substring(index) : url.substring(index, end);
		        }

		        if (videoId != null && !videoId.isBlank()) {
		            String embedUrl = "https://www.youtube.com/embed/" + videoId;
		            String iframe = "<iframe width='560' height='315' src='" + embedUrl + "' " +
		                            "title='YouTube video player' frameborder='0' " +
		                            "allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>";
		            videoDiv.getElement().setProperty("innerHTML", iframe);
		        } else {
		            videoDiv.getElement().setProperty("innerHTML", "");
		        }
		    } else {
		        videoDiv.getElement().setProperty("innerHTML", ""); // Limpia el contenido si el campo está vacío
		    }
		});

		
	}
	
	
	public void Publicarcomentario() {
		
		if (this.getTextFieldCampoTexto().isEmpty() && this.getTextFieldTextoVideo().isEmpty() && this.getTextFieldUrlFoto().isEmpty()) {
            Notification.show("Se debe rellenar al menos un campo para poder comentar.");
            return;
        }
		
		
		
		//Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		
		String texto = this.getTextFieldCampoTexto().getValue();
		String foto = this.getTextFieldUrlFoto().getValue();
		String video = this.getTextFieldTextoVideo().getValue();
		
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
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Escribir_Comentario(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t, texto, foto,video, Interfaz.ur.u);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		
		
		VertweetgeneralUsuarioRegistrado verTweet = null;
		if(_vertweetgeneralUsuarioRegistrado instanceof Vertweetpropio) 
			verTweet = new Vertweetpropio(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado);
		else
			verTweet = new Vertweetajeno(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado);
		
		if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado !=null) {
			Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
		}
		else if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado !=null) {
			Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
		}
		else {
			Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
		}
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(verTweet.Recargar(u));
//		ComentariosUsuarioRegistrado _comentariosUsuarioRegistrado = _vertweetgeneralUsuarioRegistrado._comentariosUsuarioRegistrado;
//		VertweetgeneralUsuarioRegistrado verTweet = null;
//		if(false) 
//			verTweet = new Vertweetpropio(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado);
//		else
//			verTweet = new Vertweetajeno(_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado);
//			
//		if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado !=null) {
//			this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.removeAll();
//			this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.add(verTweet);
//		}
//		else if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado !=null) {
//			this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(verTweet);
//		}
//		else {
//			this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(verTweet);
//		}
//		
//		ComentariosUsuarioRegistrado_item item_tweets = new ComentariosUsuarioRegistrado_item(_comentariosUsuarioRegistrado);
//		_comentariosUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public Comentar Recargar(UsuarioRegistrado log) {
		return new Comentar(_vertweetgeneralUsuarioRegistrado.Recargar(log));
	}
}