package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

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
		    if (url != null && !url.isEmpty()) {
		        this.getImgVideo().setSrc(url);
		    } else {
		    	this.getImgVideo().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
		});
		
	}
	
	
	public void Publicarcomentario() {
		
		if (this.getTextFieldCampoTexto().isEmpty() && this.getTextFieldTextoVideo().isEmpty() && this.getTextFieldUrlFoto().isEmpty()) {
            Notification.show("Se debe rellenar al menos un campo para poder comentar.");
            return;
        }
		
		
		
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
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Escribir_Comentario(verTweet._mostrartweetspropiosUsuarioRegistrado.t, texto, foto,video, Interfaz.ur.u);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		
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