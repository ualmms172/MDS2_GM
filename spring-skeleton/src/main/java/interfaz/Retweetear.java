package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;

import basededatos.Contenido;
import basededatos.Hashtag;
import basededatos.Tweet;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Retweetear extends CrearContenido {
	//private event _publicarretweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	
	public Retweetear (MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado) {
		super();
		
		this.getLabelCrearContenido().setText("Crear Retweet");
		
		_mostrartweetspropiosUsuarioRegistrado = mostrartweetspropiosUsuarioRegistrado; 
		this.getButtonPublicar().addClickListener(event->Publicarretweet());
		this.getButtonAtras().addClickListener(event->{
			
			Pantalla.MainView.removeAll();
			VerperfilgeneralUsuarioRegistrado v;
			 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 
						 Pantalla.MainView.add(v);
					 }
					 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 Pantalla.MainView.add(v);
					 }
					 else {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 Pantalla.MainView.add(v);
					 }
				 }
					 
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
					 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
					 Pantalla.MainView.add(y);
				 }
				 else {
					 //UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
					 Pantalla.MainView.add(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado);
				 }
			 }
			 else {
				 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado); 
			 }
			
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
	
	public Retweetear (VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		super();
		
		this.getLabelCrearContenido().setText("Crear Retweet");
		
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		this.getButtonPublicar().addClickListener(event->Publicarretweet());
		this.getButtonAtras().addClickListener(event->{
			
			Pantalla.MainView.removeAll();
			VerperfilgeneralUsuarioRegistrado v;
			 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 Pantalla.MainView.add(v);
					 }
					 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
						 }
						 Pantalla.MainView.add(v);
					 }
					 else {
						 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
							 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 else {
							 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
						 }
						 Pantalla.MainView.add(v);
					 }
				 }
					 
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
					 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
					 Pantalla.MainView.add(y);
				 }
				 else {
					 UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
					 Pantalla.MainView.add(y);
				 }
			 }
			 else {
				 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado); 
			 }
			
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
	
	
	
	
	
	

	public void Publicarretweet() { //No se si es del todo correcto, he añadido solo el recargar a los MainView existentes (ademas de lo inicial claro)
		
		basededatos.Tweet t = null;
		if(_mostrartweetspropiosUsuarioRegistrado!=null) t = _mostrartweetspropiosUsuarioRegistrado.t;
		else t=_vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t;
		
		boolean hecho=false;
		
		for(Contenido cont : Interfaz.ur.u.escribe.toArray()) {
			if(!(cont instanceof Tweet)) continue;
			Tweet tweet = (Tweet)cont;
			if(tweet.getRetweeteaA()!=null)
				if(tweet.getRetweeteaA().getORMID()==t.getORMID()) {
					hecho=true;
					break;
				}
		}
		
		if (hecho && this.getTextFieldCampoTexto().isEmpty() && this.getTextFieldTextoVideo().isEmpty() && this.getTextFieldUrlFoto().isEmpty() ) {
            Notification.show("Ya has hecho un retweet vacio de este tweet. Para uno nuevo rellena algún campo.");
            return;
        }
		
		String texto = this.getTextFieldCampoTexto().getValue();
		String foto = this.getTextFieldUrlFoto().getValue();
		String video = this.getTextFieldTextoVideo().getValue();
		
		//Comprobamos que la foto lo sea realmente
		if(!foto.isBlank()) {
			try {
		        URL url = new URL(foto);
		        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		        connection.setRequestMethod("HEAD");
		        connection.setConnectTimeout(3000);
		        connection.setReadTimeout(3000);
		        connection.connect();

		        String contentType = connection.getContentType();
		        if( contentType == null || !contentType.startsWith("image/")) {
		        	Notification.show("Si se rellena el campo foto debe contener un enlace a una foto.");
		            return;
		        }
		    } catch (Exception e) {
		    	Notification.show("Si se rellena el campo foto debe contener un enlace a una foto.");
	            return;
		    }
		}
		
		//Comprobamos que el video lo sea realmente
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
				
				
				
				Hashtag hash=null;
				basededatos.UsuarioRegistrado mencionado = null;
				
				if (texto.contains("#")) {
					hash= this.UsarHashtag(texto);
				}
				if(texto.contains("@")) {
					mencionado = this.Mencionar(texto);
				}
				
		
		basededatos.UsuarioRegistrado ubd=Interfaz.ur._iUsuarioregistrado.Escribir_Retweet(hash,mencionado,t, texto, foto, video, Interfaz.ur.u);
	
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		
		 Pantalla.MainView.removeAll();
		 VerperfilgeneralUsuarioRegistrado v;
		 
		 if(_mostrartweetspropiosUsuarioRegistrado!=null) {
			 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._mostrartweetsUsuarioRegistrado_item, _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 Pantalla.MainView.add(v.Recargar(u)); 
				 }
				 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado!=null) {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado);
					 }
					 Pantalla.MainView.add(v.Recargar(u));
				 }
				 else {
					 if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado instanceof Verperfilpropio) {
						 v = new Verperfilpropio(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 else {
						 v =  new Verperfilnobloqueado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado._vertweetgeneralUsuarioRegistrado,_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.mencion);
					 }
					 Pantalla.MainView.add(v.Recargar(u));
				 }
			 }
				 
			 else if(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				 VerHashtagUsuarioRegistrado y = new VerHashtagUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado);
				 Pantalla.MainView.add(y.Recargar(u));
			 }
			 else {
				 //UsuarioRegistrado y = new UsuarioRegistrado((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
				 Pantalla.MainView.add(u);
			 }
		 }
		 else {
			 Pantalla.MainView.add(_vertweetgeneralUsuarioRegistrado.Recargar(u)); 
		 }
	}
	
	
	public basededatos.UsuarioRegistrado Mencionar(String texto) {

		int inicio = texto.indexOf("@");

		if (inicio != -1) {
			int fin = texto.indexOf(" ", inicio);
			if (fin == -1) {
				fin = texto.length();
			}
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
		if (hash == null) {
			hash = Interfaz.ur._iUsuarioregistrado.CrearHashtag(hashtag, Interfaz.ur.u);
		}
		return hash;

	}
	
	public Retweetear Recargar(UsuarioRegistrado log) {
		Retweetear vista = null;
		if(this._vertweetgeneralUsuarioRegistrado!=null) {
			vista = new Retweetear(_vertweetgeneralUsuarioRegistrado.Recargar(log));
		}
		else {
			MostrartweetspropiosUsuarioRegistrado lt = this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado;
			if(lt._verperfilgeneralUsuarioRegistrado!=null) {
				lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
				vista= new Retweetear(_mostrartweetspropiosUsuarioRegistrado);
			}
			else if(lt._verHashtagUsuarioRegistrado!=null) {
				lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
				vista= new Retweetear(_mostrartweetspropiosUsuarioRegistrado); 
				}
			else {
				lt = new MostrartweetspropiosUsuarioRegistrado(log);
				vista = new Retweetear(_mostrartweetspropiosUsuarioRegistrado);
			}
		}
		return vista;
	}

}