package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletahashtags;

public class Verlistacompletahashtags extends VistaVerlistacompletahashtags{
	//private Label _titulo;
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public ListaHashtagsUsuarioNoRegistrado _listaHashtagsUsuarioNoRegistrado;

	
	public Verlistacompletahashtags (UsuarioNoRegistrado usuarioNoRegistrado) {
		
		_usuarioNoRegistrado = usuarioNoRegistrado; 
		
		ListaHashtagsUsuarioNoRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_usuarioNoRegistrado);
			
	});
		
		
	}
	
	
	
	public void ListaHashtagsUsuarioNoRegistrado() {
		_listaHashtagsUsuarioNoRegistrado = new ListaHashtagsUsuarioNoRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listaHashtagsUsuarioNoRegistrado);
		
		ListaHashtagsUsuarioNoRegistrado_item item_tweets = new ListaHashtagsUsuarioNoRegistrado_item(_listaHashtagsUsuarioNoRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_listaHashtagsUsuarioNoRegistrado.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(item_tweets);
	}
	
	
	
	
	
	
}