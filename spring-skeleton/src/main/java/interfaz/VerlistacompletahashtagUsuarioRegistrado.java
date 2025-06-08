package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletahashtagusuarioregistrado;

public class VerlistacompletahashtagUsuarioRegistrado extends VistaVerlistacompletahashtagusuarioregistrado {

	public UsuarioRegistrado _usuarioregistrado; 
	public ListahashtagsUsuarioRegistrado _listahashtagsUsuarioRegistrado;
	
	public VerlistacompletahashtagUsuarioRegistrado(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado; 
		
		ListahashtagsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_usuarioregistrado);
			
	});
	}
	

	public void ListahashtagsUsuarioRegistrado() {
		_listahashtagsUsuarioRegistrado = new ListahashtagsUsuarioRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listahashtagsUsuarioRegistrado);
		
	}
	
	public VerlistacompletahashtagUsuarioRegistrado Recargar(UsuarioRegistrado log) {
		return new VerlistacompletahashtagUsuarioRegistrado(log);
	}
}