package interfaz;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletausuariosusuarioregistrado;

public class VerlistacompletausuariosUsuarioRegistrado extends VistaVerlistacompletausuariosusuarioregistrado {
	//private Label _titulo;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
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
		
//		ListausuariosUsuarioRegistrado_item item_tweets = new ListausuariosUsuarioRegistrado_item(_listausuariosUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_listausuariosUsuarioRegistrado.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}
	
	public VerlistacompletausuariosUsuarioRegistrado Recargar(UsuarioRegistrado log) {
		return new VerlistacompletausuariosUsuarioRegistrado(log);
	}
	
//	@Override
//	protected void onAttach(AttachEvent attachEvent) {
//	    super.onAttach(attachEvent);
//	    
//	    UI.getCurrent().getPage().executeJs(
//	        "document.addEventListener('click', function(e) { e.stopPropagation(); }, true);"
//	    );
//	}

}