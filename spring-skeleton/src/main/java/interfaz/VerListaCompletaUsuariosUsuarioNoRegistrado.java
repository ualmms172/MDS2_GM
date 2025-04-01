package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistacompletausuariosusuarionoregistrado;

public class VerListaCompletaUsuariosUsuarioNoRegistrado extends VistaVerlistacompletausuariosusuarionoregistrado {
	//private Label _titulo;
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public ListaUsuariosUsuarionoRegistrado _listaUsuariosUsuarionoRegistrado;

	public VerListaCompletaUsuariosUsuarioNoRegistrado(UsuarioNoRegistrado usuarioNoRegistrado) {
		
		_usuarioNoRegistrado = usuarioNoRegistrado; 
		
		ListaUsuariosUsuarionoRegistrado();
	}
	
	
	
	
	
	public void ListaUsuariosUsuarionoRegistrado() {
		_listaUsuariosUsuarionoRegistrado = new ListaUsuariosUsuarionoRegistrado(this);
		this.getVerticalLayoutListaUsuarios().as(VerticalLayout.class).add(_listaUsuariosUsuarionoRegistrado);
		
		ListaUsuariosUsuarionoRegistrado_item item_tweets = new ListaUsuariosUsuarionoRegistrado_item(_listaUsuariosUsuarionoRegistrado);
		_listaUsuariosUsuarionoRegistrado.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}
}