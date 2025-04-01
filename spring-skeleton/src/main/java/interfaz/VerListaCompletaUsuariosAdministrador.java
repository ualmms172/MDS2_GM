package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistacompletausuariosadministrador;

public class VerListaCompletaUsuariosAdministrador extends VistaVerlistacompletausuariosadministrador {
	//private Label _titulo;
	public Administrador _administrador;
	public ListaUsuariosAdministrador _listaUsuariosAdministrador;

	public VerListaCompletaUsuariosAdministrador(Administrador administrador) {
		
		_administrador = administrador; 
		
		ListaUsuariosAdministrador();
	}
	
	
	
	
	public void ListaUsuariosAdministrador() {
		_listaUsuariosAdministrador = new ListaUsuariosAdministrador(this);
		this.getVerticalLayoutListaUsuarios().as(VerticalLayout.class).add(_listaUsuariosAdministrador);
		
		ListaUsuariosAdministrador_item item_tweets = new ListaUsuariosAdministrador_item(_listaUsuariosAdministrador);
		_listaUsuariosAdministrador.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}
}