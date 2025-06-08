package interfaz;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView.Pantalla;

public class Listatweets_item extends ListaTweetsGeneral_item {
	public Listatweets_item(ListaContenido lista,Tweet t) {
		super(lista,t);

		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		_listatweets = (Listatweets) _lista;
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VertweetUsuarioNoRegistrado()); 
		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado(false));
		
		Label labelOriginal = this.getLabelCuerpoTwet();

		Span[] mencion=null;
		if (t.getMencionaA() != null) {
		    mencion = this.Mencion();
		    Span nuevoSpan = new Span();

		    copiarEstilos(labelOriginal, nuevoSpan);

		    mencion[1].getStyle().set("color", "blue");
		    mencion[1].getStyle().set("cursor", "pointer");
		    mencion[1].getElement().addEventListener("click", e -> VerperfilUsuarioNoRegistrado(true));

		    nuevoSpan.add(mencion[0], mencion[1], mencion[2]);

		    nuevoSpan.getElement().getStyle().set("margin-top", "15px");
		    nuevoSpan.getElement().getStyle().set("margin-left", "15px");
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		}

		if (t.getContiene() != null) {
		    Span[] hashtag = this.Hashtag(mencion);
		    
		    if (hashtag != null) {
		        Span nuevoSpan = new Span();
		        copiarEstilos(labelOriginal, nuevoSpan);

		        // Recorremos todos los spans para aplicar estilos y listeners al hashtag y mención
		        for (Span span : hashtag) {
		            String texto = span.getText();
		            if (texto.startsWith("#")) {
		                span.getStyle().set("color", "blue");
		                span.getStyle().set("cursor", "pointer");
		                span.getElement().addEventListener("click", e -> VerHashtagUsuarioNoRegistrado());
		            }
		            // Si tienes una mención y quieres aplicar estilos aquí también:
		            else if (texto.startsWith("@")) {
		                span.getStyle().set("color", "blue");
		                span.getStyle().set("cursor", "pointer");
		                span.getElement().addEventListener("click", e -> VerperfilUsuarioNoRegistrado(true));
		            }
		        }

		        // Añadimos todos los spans en orden
		        nuevoSpan.add(hashtag);

		        
		        nuevoSpan.getElement().getStyle().set("margin-top", "15px");
			    nuevoSpan.getElement().getStyle().set("margin-left", "15px");
		        this.getHorizontalLayoutCuerpoTweet().removeAll();
		        this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		    }
		}
	}

	public Listatweets _listatweets;
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;
	
	public VerHashtagUsuarioNoRegistrado _verHashtagUsuarioNoRegistrado;

	public void VertweetUsuarioNoRegistrado() {
		_vertweetUsuarioNoRegistrado = new VertweetUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_vertweetUsuarioNoRegistrado);

	}
	
	public void VerHashtagUsuarioNoRegistrado() {
		_verHashtagUsuarioNoRegistrado = new VerHashtagUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagUsuarioNoRegistrado);
	}

	public void VerperfilUsuarioNoRegistrado(boolean mencion) {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this,mencion);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);

	}
}