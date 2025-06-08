package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletausuariosadministrador;

public class VerListaCompletaUsuariosAdministrador extends VistaVerlistacompletausuariosadministrador {
	//private Label _titulo;
	public Administrador _administrador;
	public ListaUsuariosAdministrador _listaUsuariosAdministrador;

	public VerListaCompletaUsuariosAdministrador(Administrador administrador) {
		
		_administrador = administrador; 
		
		ListaUsuariosAdministrador();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_administrador);
			
	});
	}
	
	
	public void ListaUsuariosAdministrador() {
		_listaUsuariosAdministrador = new ListaUsuariosAdministrador(this);
		this.getVerticalLayoutListaUsuarios().as(VerticalLayout.class).add(_listaUsuariosAdministrador);
		
		
		
		
	}
	
	public VerListaCompletaUsuariosAdministrador Recargar(Administrador log) {
		return new VerListaCompletaUsuariosAdministrador(log);
	}
}