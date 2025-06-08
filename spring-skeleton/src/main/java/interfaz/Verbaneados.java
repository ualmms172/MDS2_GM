package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerbaneados;

public class Verbaneados extends VistaVerbaneados {

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

	}
	
	public Verbaneados Recargar(Administrador log) {
		Verbaneados vista = new Verbaneados (log);
		return vista;
		
	}
}