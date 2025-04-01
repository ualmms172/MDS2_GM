package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistacompletahashtagusuarioregistrado;

public class VerlistacompletahashtagUsuarioRegistrado extends VistaVerlistacompletahashtagusuarioregistrado {
	//private Label _titulo;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListahashtagsUsuarioRegistrado _listahashtagsUsuarioRegistrado;
	
	public VerlistacompletahashtagUsuarioRegistrado(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado; 
		
		ListahashtagsUsuarioRegistrado();
	}
	

	public void ListahashtagsUsuarioRegistrado() {
		_listahashtagsUsuarioRegistrado = new ListahashtagsUsuarioRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listahashtagsUsuarioRegistrado);
		
		ListahashtagsUsuarioRegistrado_item item_tweets = new ListahashtagsUsuarioRegistrado_item(_listahashtagsUsuarioRegistrado);
		_listahashtagsUsuarioRegistrado.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(item_tweets);
	}
}