package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class Comentar extends CrearContenido {
	//private event _publicarcomentario;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;

	public Comentar(VertweetgeneralUsuarioRegistrado  vertweetgeneralUsuarioRegistrado) {
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		
		this.getButtonPublicar().addClickListener(Event -> Publicarcomentario());
		
	}
	
	
	public void Publicarcomentario() {
		
		VertweetgeneralUsuarioRegistrado verTweet = null;
		if(false) 
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
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(verTweet);
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
}