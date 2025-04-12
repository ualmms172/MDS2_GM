package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VertweetgeneralUsuarioRegistrado extends VertweetGeneral {
	//private Button _comentar;
	//private Button _retweetear;
	public ComentariosUsuarioRegistrado _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public Comentar _comentar;
	public Retweetear _retweetear;
    
	public VertweetgeneralUsuarioRegistrado (VerperfilgeneralUsuarioRegistrado verperfilUsuarioRegistrado ) {
		
		_verperfilUsuarioRegistrado = verperfilUsuarioRegistrado; 
		this.getButtonBorrar().setVisible(false);
		
		ComentariosUsuarioRegistrado();
	}
	
	
	public VertweetgeneralUsuarioRegistrado (MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado_item ) {
		
		_mostrartweetspropiosUsuarioRegistrado = mostrartweetspropiosUsuarioRegistrado_item; 
		this.getButtonBorrar().setVisible(false);
	
		ComentariosUsuarioRegistrado();
	}
	

	public void ComentariosUsuarioRegistrado() {
		_comentariosUsuarioRegistrado = new ComentariosUsuarioRegistrado(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_comentariosUsuarioRegistrado);
		
		ComentariosUsuarioRegistrado_item item_tweets = new ComentariosUsuarioRegistrado_item(_comentariosUsuarioRegistrado);
		_comentariosUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void Comentar() {
		
		_comentar = new Comentar(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_comentar);
	}

	public void VerperfilUsuarioRegistrado() {
		_verperfilUsuarioRegistrado = new VerperfilgeneralUsuarioRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}

	public void Retweetear() {
		_retweetear = new Retweetear(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_retweetear);
	}
}