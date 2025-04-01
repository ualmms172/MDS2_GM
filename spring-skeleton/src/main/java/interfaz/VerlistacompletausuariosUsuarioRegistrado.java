package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistacompletausuariosusuarioregistrado;

public class VerlistacompletausuariosUsuarioRegistrado extends VistaVerlistacompletausuariosusuarioregistrado {
	//private Label _titulo;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListausuariosUsuarioRegistrado _listausuariosUsuarioRegistrado;

	
	public VerlistacompletausuariosUsuarioRegistrado(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado; 
		
		ListausuariosUsuarioRegistrado();
	}
	
	
	
	public void ListausuariosUsuarioRegistrado() {
		_listausuariosUsuarioRegistrado = new ListausuariosUsuarioRegistrado(this);
		this.getVerticalLayoutListaUsuarios().as(VerticalLayout.class).add(_listausuariosUsuarioRegistrado);
		
		ListausuariosUsuarioRegistrado_item item_tweets = new ListausuariosUsuarioRegistrado_item(_listausuariosUsuarioRegistrado);
		_listausuariosUsuarioRegistrado.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}
}