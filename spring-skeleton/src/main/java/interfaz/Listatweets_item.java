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
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		_listatweets = (Listatweets) _lista;
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VertweetUsuarioNoRegistrado()); 
		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado(false));
		
		Label labelOriginal = this.getLabelCuerpoTwet();
		if(t.getMencionaA()!=null) {
			Span[] mencion = this.Mencion();
		    Span nuevoSpan = new Span();

		    // Copiar estilos visuales si el Label tiene alguno
		    nuevoSpan.getStyle().set("font-family", labelOriginal.getStyle().get("font-family"));
		    nuevoSpan.getStyle().set("font-size", labelOriginal.getStyle().get("font-size"));
		    nuevoSpan.getStyle().set("font-weight", labelOriginal.getStyle().get("font-weight"));
		    nuevoSpan.getStyle().set("color", labelOriginal.getStyle().get("color"));
		    nuevoSpan.getStyle().set("display", "inline");
		    
		    mencion[1].getStyle().set("color", "blue");
		    mencion[1].getStyle().set("cursor", "pointer");
		    mencion[1].getElement().addEventListener("click", e -> {
		    	 VerperfilUsuarioNoRegistrado(true);
		    });
		    
		    nuevoSpan.add(mencion[0], mencion[1], mencion[2]);
		    
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		    
		}
		if(t.getContiene()!=null) {
			
			Span[] hashtag = this.Hashtag();
		    Span nuevoSpan = new Span();
		    
		    nuevoSpan.getStyle().set("font-family", labelOriginal.getStyle().get("font-family"));
		    nuevoSpan.getStyle().set("font-size", labelOriginal.getStyle().get("font-size"));
		    nuevoSpan.getStyle().set("font-weight", labelOriginal.getStyle().get("font-weight"));
		    nuevoSpan.getStyle().set("color", labelOriginal.getStyle().get("color"));
		    nuevoSpan.getStyle().set("display", "inline");
		    
		    hashtag[1].getStyle().set("color", "blue");
		    hashtag[1].getStyle().set("cursor", "pointer");
		    hashtag[1].getElement().addEventListener("click", e -> {
		    	 this.VerHashtagUsuarioNoRegistrado();
		    });
		    
		    nuevoSpan.add(hashtag[0], hashtag[1], hashtag[2]);
		    
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
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
//		_vertweetUsuarioNoRegistrado = new VertweetUsuarioNoRegistrado(this);
//		if(this._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_vertweetUsuarioNoRegistrado);
//		}
//		else {
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_vertweetUsuarioNoRegistrado);
//		}
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
//		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
//		if(this._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioNoRegistrado);
//		}
//		else {
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioNoRegistrado);
//		}
	}
}