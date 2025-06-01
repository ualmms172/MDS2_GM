package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletausuariosusuarionoregistrado;

public class VerListaCompletaUsuariosUsuarioNoRegistrado extends VistaVerlistacompletausuariosusuarionoregistrado {
	//private Label _titulo;
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public ListaUsuariosUsuarionoRegistrado _listaUsuariosUsuarionoRegistrado;

	public VerListaCompletaUsuariosUsuarioNoRegistrado(UsuarioNoRegistrado usuarioNoRegistrado) {
		
		_usuarioNoRegistrado = usuarioNoRegistrado; 
		
		ListaUsuariosUsuarionoRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_usuarioNoRegistrado);
			
	});
	}
	
	
	public void ListaUsuariosUsuarionoRegistrado() {
		_listaUsuariosUsuarionoRegistrado = new ListaUsuariosUsuarionoRegistrado(this);
		this.getVerticalLayoutListaUsuarios().as(VerticalLayout.class).add(_listaUsuariosUsuarionoRegistrado);
		
//		ListaUsuariosUsuarionoRegistrado_item item_tweets = new ListaUsuariosUsuarionoRegistrado_item(_listaUsuariosUsuarionoRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_listaUsuariosUsuarionoRegistrado.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}
}