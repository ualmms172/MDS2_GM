package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class VerHashtagUsuarioRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioRegistrado_item _listahashtagsgeneralUsuarioRegistrado;
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;

	public VerHashtagUsuarioRegistrado(ListahashtagsgeneralUsuarioRegistrado_item listahashtagsgeneralUsuarioRegistrado) {
		
		_listahashtagsgeneralUsuarioRegistrado = listahashtagsgeneralUsuarioRegistrado; 
		
		MostrartweetsUsuarioRegistrado();
	}
	

	
	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
	}
}