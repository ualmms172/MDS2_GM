package interfaz;

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
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioRegistrado());
		
		
		
	}

	//private Button _retweetear;
	public MostrartweetspropiosUsuarioRegistrado _mostrartweetspropiosUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _verTweetUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public Retweetear _retweetear;
	
	

	public void Retweetear() {
		_retweetear = new Retweetear(this);
	//	Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_retweetear);
	}

	public void VerTweetUsuarioRegistrado() {
		
		if(t.getEscritoPor().equals(Interfaz.ur.u))
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

	public void VerperfilUsuarioRegistrado() {
		
		if(t.getEscritoPor().equals(Interfaz.ur.u))
			_verperfilUsuarioRegistrado = new Verperfilpropio(this); 
		else if(!t.getEscritoPor().bloqueaA.contains(Interfaz.ur.u))
			_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this); 
		else
			_verperfilUsuarioRegistrado = new Verperfilbloqueado(this); 
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