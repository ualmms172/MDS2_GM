package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerbaneados;

public class Verbaneados extends VistaVerbaneados {
	//private Label _titulo;
	public Administrador _administrador;
	public UsuariosBaneados _usuariosBaneados;
	
	
	public Verbaneados(Administrador administrador) {
		
		_administrador = administrador; 
		
		UsuariosBaneados();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_administrador);
			
	});
	}
	
	

	public void UsuariosBaneados() {
		_usuariosBaneados = new UsuariosBaneados(this);
		this.getVerticalLayoutLista().as(VerticalLayout.class).add(_usuariosBaneados);
		UsuariosBaneados_item item_tweets = new UsuariosBaneados_item(_usuariosBaneados);
		_usuariosBaneados.getVerticalListausuariosbaneados().as(VerticalLayout.class).add(item_tweets);
	}
}