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
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VerTweetAdministrador()); 
		this.getImgFotoPerfilTweet().addClickListener(event -> VerPerfilAdministrador(false)); 
		this.getButtonBorrar().addClickListener(event -> BorrarTweet()); 
		
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
		    	VerPerfilAdministrador(true);
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
		    	 this.VerHashtagAdministrador();
		    });
		    
		    nuevoSpan.add(hashtag[0], hashtag[1], hashtag[2]);
		    
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		}
	}

	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin _listaTweetsAdmin;
	public VerTweetAdministrador _verTweetAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	public VerHashtagAdministrador _verhashtagadministrador;
	
	public boolean eliminado =false;

	public void BorrarTweet() {
//		this._listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).remove(this);
		
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
		
//		_verTweetAdministrador = new VerTweetAdministrador(this); 
//		
//		if(_listaTweetsAdmin._verHashtagAdministrador != null) {
//			
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetAdministrador);
//
//			
//			
//		}
//		
//		else if(_listaTweetsAdmin._administrador != null) {
//			
//			
//			_listaTweetsAdmin._administrador.MainView.removeAll();
//			_listaTweetsAdmin._administrador.MainView.add(_verTweetAdministrador);
//	
//		}
//		
//		
//		else {
//			
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verTweetAdministrador);
//		
//		}
		
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
		
//		_verPerfilAdministrador = new VerPerfilAdministrador(this);
//		
//		if(_listaTweetsAdmin._verHashtagAdministrador != null) {
//			
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verPerfilAdministrador);
//
//			
//			
//		}
//		
//		else if(_listaTweetsAdmin._administrador != null) {
//			
//			
//			_listaTweetsAdmin._administrador.MainView.removeAll();
//			_listaTweetsAdmin._administrador.MainView.add(_verPerfilAdministrador);
//	
//		}
//		
//		
//		else {
//			
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verPerfilAdministrador);
//		
//		}
	}
}