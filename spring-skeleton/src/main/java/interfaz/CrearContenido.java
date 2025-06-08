package interfaz;

import com.vaadin.flow.component.html.Div;

import vistas.VistaCrearcontenido;

public class CrearContenido extends VistaCrearcontenido {
	
	public CrearContenido() {
		
		this.getImgImagen().setHeight("200px");
		this.getImgImagen().setWidth("200px");
		
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
		    Div videoDiv = this.getImgVideo(); 

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
}