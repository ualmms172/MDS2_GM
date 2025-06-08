package interfaz;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletausuariosusuarioregistrado;

public class VerlistacompletausuariosUsuarioRegistrado extends VistaVerlistacompletausuariosusuarioregistrado {
	
	public UsuarioRegistrado _usuarioregistrado; 
	public ListausuariosUsuarioRegistrado _listausuariosUsuarioRegistrado;

	
	public VerlistacompletausuariosUsuarioRegistrado(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado; 
		
		ListausuariosUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_usuarioregistrado);
			
	});
	}
	
	
	
	public void ListausuariosUsuarioRegistrado() {
		_listausuariosUsuarioRegistrado = new ListausuariosUsuarioRegistrado(this);
		this.getVerticalLayoutListaUsuarios().as(VerticalLayout.class).add(_listausuariosUsuarioRegistrado);
		
	}
	
	public VerlistacompletausuariosUsuarioRegistrado Recargar(UsuarioRegistrado log) {
		return new VerlistacompletausuariosUsuarioRegistrado(log);
	}
	

}