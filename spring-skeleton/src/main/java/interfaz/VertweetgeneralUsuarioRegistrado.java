package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VertweetgeneralUsuarioRegistrado extends VertweetGeneral {
	//private Button _comentar;
	//private Button _retweetear;
	public ComentariosUsuarioRegistrado _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
    
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
	}

	public void Comentar() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}

	public void Retweetear() {
		throw new UnsupportedOperationException();
	}
}