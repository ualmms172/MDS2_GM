package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class MostrartweetspropiosUsuarioRegistrado_item extends ListaTweetsGeneral_item {
	public MostrartweetspropiosUsuarioRegistrado_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		_mostrartweetspropiosUsuarioRegistrado = (MostrartweetspropiosUsuarioRegistrado) _lista;
		
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		
		
		this.getButtonRetweet().addClickListener(Event -> Retweetear());
		this.getVaadinHorizontalLayout().addClickListener(Event -> VerTweetUsuarioRegistrado());
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioRegistrado(false));
		
		
		Label labelOriginal = this.getLabelCuerpoTwet();

		Span[] mencion=null;
		if (t.getMencionaA() != null) {
		    mencion = this.Mencion();
		    Span nuevoSpan = new Span();

		    copiarEstilos(labelOriginal, nuevoSpan);

		    mencion[1].getStyle().set("color", "blue");
		    mencion[1].getStyle().set("cursor", "pointer");
		    mencion[1].getElement().addEventListener("click", e -> VerperfilUsuarioRegistrado(true));

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
		                span.getElement().addEventListener("click", e -> VerHashtagUsuarioRegistrado());
		            }
		            // Si tienes una mención y quieres aplicar estilos aquí también:
		            else if (texto.startsWith("@")) {
		                span.getStyle().set("color", "blue");
		                span.getStyle().set("cursor", "pointer");
		                span.getElement().addEventListener("click", e -> VerperfilUsuarioRegistrado(true));
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

	//private Button _retweetear;
	public MostrartweetspropiosUsuarioRegistrado _mostrartweetspropiosUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _verTweetUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public Retweetear _retweetear;
	
	public VerHashtagUsuarioRegistrado _verHashtagUsuarioRegistrado;

	public void Retweetear() {
		_retweetear = new Retweetear(this);

		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_retweetear);
	}

	public void VerTweetUsuarioRegistrado() {
		
		if(t.getEscritoPor().getID()==Interfaz.ur.u.getID())
			_verTweetUsuarioRegistrado = new Vertweetpropio(this); 
		else
			_verTweetUsuarioRegistrado = new Vertweetajeno(this); 
		
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verTweetUsuarioRegistrado);
		

	}
	
	public void VerHashtagUsuarioRegistrado() {
		_verHashtagUsuarioRegistrado= new VerHashtagUsuarioRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagUsuarioRegistrado);
	}

	public void VerperfilUsuarioRegistrado(boolean mencion) {
		
		basededatos.UsuarioRegistrado user = null;
		if(mencion) 
			user= t.getMencionaA();
		else
			user = t.getEscritoPor();
		
		if(user.getID()==Interfaz.ur.u.getID())
			_verperfilUsuarioRegistrado = new Verperfilpropio(this,mencion); 
		else {
			boolean bloqueado=false;
			for(basededatos.UsuarioRegistrado usu:  user.bloqueaA.toArray()){
				if(usu.getID()==Interfaz.ur.u.getID()) {
					bloqueado=true;
					break;
				}
			}
			if(!bloqueado)
				_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this,mencion); 
			else
				_verperfilUsuarioRegistrado = new Verperfilbloqueado(this,mencion); 
		}
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
		

	}
}