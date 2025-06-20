package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
import gallardoMartinez.MainView;

public class ListaTweetsAdmin_item extends ListaTweetsGeneral_item {
	public ListaTweetsAdmin_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		
		_listaTweetsAdmin = (ListaTweetsAdmin) _lista; 

		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VerTweetAdministrador()); 
		this.getImgFotoPerfilTweet().addClickListener(event -> VerPerfilAdministrador(false)); 
		this.getButtonBorrar().addClickListener(event -> BorrarTweet()); 
		
		Label labelOriginal = this.getLabelCuerpoTwet();

		Span[] mencion=null;
		if (t.getMencionaA() != null) {
		    mencion = this.Mencion();
		    Span nuevoSpan = new Span();

		    copiarEstilos(labelOriginal, nuevoSpan);

		    mencion[1].getStyle().set("color", "blue");
		    mencion[1].getStyle().set("cursor", "pointer");
		    mencion[1].getElement().addEventListener("click", e -> VerPerfilAdministrador(true));

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
		                span.getElement().addEventListener("click", e -> VerHashtagAdministrador());
		            }
		            // Si tienes una mención y quieres aplicar estilos aquí también:
		            else if (texto.startsWith("@")) {
		                span.getStyle().set("color", "blue");
		                span.getStyle().set("cursor", "pointer");
		                span.getElement().addEventListener("click", e -> VerPerfilAdministrador(true));
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


	public ListaTweetsAdmin _listaTweetsAdmin;
	public VerTweetAdministrador _verTweetAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	public VerHashtagAdministrador _verhashtagadministrador;
	
	public boolean eliminado =false;

	public void BorrarTweet() {

		
		basededatos.Administrador abd=Interfaz.ad._iadministrador.BorrarTweet(t,Interfaz.ad.a);
		Administrador a = new Administrador((MainView)Pantalla.MainView,abd);
		Pantalla.MainView.removeAll();
		
		if(this._listaTweetsAdmin._administrador!=null) {
			Pantalla.MainView.add(a);
		}
		else if(this._listaTweetsAdmin._verHashtagAdministrador!=null){
			Pantalla.MainView.add(this._listaTweetsAdmin._verHashtagAdministrador.Recargar(a));
		}
		else {
			Pantalla.MainView.add(this._listaTweetsAdmin._verPerfilAdministrador.Recargar(a));
		}
		
	}

	public void VerTweetAdministrador() {
		
		_verTweetAdministrador = new VerTweetAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verTweetAdministrador);
		

		
	}
	
	public void VerHashtagAdministrador() {
		_verhashtagadministrador = new VerHashtagAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verhashtagadministrador);
		
	}

	public void VerPerfilAdministrador(boolean mencion) {
		_verPerfilAdministrador = new VerPerfilAdministrador(this,mencion);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verPerfilAdministrador);
		

	}
}