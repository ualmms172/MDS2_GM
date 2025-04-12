package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VertweetUsuarioNoRegistrado extends VertweetGeneral {
	public Listatweets_item _listatweets;
	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public VertweetUsuarioNoRegistrado(Listatweets_item listatweets) {
		
		_listatweets = listatweets; 
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
		
		this.ListaComentariosUsuarioNoRegistrado();
	}
	
	
	public VertweetUsuarioNoRegistrado(VerperfilUsuarioNoRegistrado verperfilUsuarioNoRegistrado) {
		
		_verperfilUsuarioNoRegistrado = verperfilUsuarioNoRegistrado; 
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
		
		this.ListaComentariosUsuarioNoRegistrado();
	}
	

	
	public void ListaComentariosUsuarioNoRegistrado() {
		_listaComentariosUsuarioNoRegistrado = new ListaComentariosUsuarioNoRegistrado(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_listaComentariosUsuarioNoRegistrado);
		
		ListaComentariosUsuarioNoRegistrado_item item_tweets = new ListaComentariosUsuarioNoRegistrado_item(_listaComentariosUsuarioNoRegistrado);
		_listaComentariosUsuarioNoRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void VerperfilUsuarioNoRegistrado() {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);
	}
}