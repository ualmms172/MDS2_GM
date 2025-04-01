package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerperfilgeneralUsuarioRegistrado extends VerPerfilGeneral {
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	public VerperfilgeneralUsuarioRegistrado(MostrartweetsUsuarioRegistrado mostrartweetsUsuarioRegistrado) {
		
		_mostrartweetsUsuarioRegistrado = mostrartweetsUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
	}
	
	
	public VerperfilgeneralUsuarioRegistrado (ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		
		_listaUsuariosGeneralUsuarioRegistrado = listaUsuariosGeneralUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
	}
	
	public VerperfilgeneralUsuarioRegistrado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado ) {
		
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
	}
	
	
	public VerperfilgeneralUsuarioRegistrado() {
		
	}
	


	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		
		MostrartweetsUsuarioRegistrado_item item_tweets = new MostrartweetsUsuarioRegistrado_item(_mostrartweetsUsuarioRegistrado);
		_mostrartweetsUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}