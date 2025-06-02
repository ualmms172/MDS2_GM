package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class MostrartweetspropiosUsuarioRegistrado_item extends ListaTweetsGeneral_item {
	public MostrartweetspropiosUsuarioRegistrado_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		_mostrartweetspropiosUsuarioRegistrado = (MostrartweetspropiosUsuarioRegistrado) _lista;
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		
		this.getButtonRetweet().addClickListener(Event -> Retweetear());
		this.getVaadinHorizontalLayout().addClickListener(Event -> VerTweetUsuarioRegistrado());
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioRegistrado(false));
		
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
		    	VerperfilUsuarioRegistrado(true);
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
		    	 VerHashtagUsuarioRegistrado();
		    });
		    
		    nuevoSpan.add(hashtag[0], hashtag[1], hashtag[2]);
		    
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
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
	//	Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
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
		
//		if(true)
//			_verTweetUsuarioRegistrado = new Vertweetpropio(this); 
//		else
//			_verTweetUsuarioRegistrado = new Vertweetajeno(this); 
//		
//		if(_mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado != null) {
//			
//			_mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetUsuarioRegistrado);
//
//			
//			
//		}
//		
//		else if(_mostrartweetspropiosUsuarioRegistrado._usuarioregistrado != null) {
//			
//			
//			_mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.removeAll();
//			_mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.add(_verTweetUsuarioRegistrado);
//	
//		}
//		
//		
//		else {
//			
//			_mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetUsuarioRegistrado);
//		
//		}
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
		else if(!user.bloqueaA.contains(Interfaz.ur.u))
			_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this,mencion); 
		else
			_verperfilUsuarioRegistrado = new Verperfilbloqueado(this,mencion); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
		
//		if(true)
//			_verperfilUsuarioRegistrado = new Verperfilpropio(this); 
//		else if(true)
//			_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this); 
//		else
//			_verperfilUsuarioRegistrado = new Verperfilbloqueado(this); 
		
//		if(_mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado != null) {
//			
//			_mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioRegistrado);			
//		}
//		
//		else if(_mostrartweetspropiosUsuarioRegistrado._usuarioregistrado != null) {
//			
//			
//			_mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.removeAll();
//			_mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.add(_verperfilUsuarioRegistrado);
//	
//		}
//		
//		
//		else {
//			
//			_mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioRegistrado);
//		
//		}
	}
}