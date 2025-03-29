package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaVerlistacompletahashtagsadmin;

public class VerlistaCompletaHashtagsAdmin extends VistaVerlistacompletahashtagsadmin {
	//private Label _titulo;
	public Administrador _administrador;
	public ListaHashtagsAdministrador _listaHashtagsAdministrador;
	
	
	public VerlistaCompletaHashtagsAdmin(Administrador administrador) {
		
		_administrador = administrador; 
		
		ListaHashtagsAdministrador();
	}
	
	public void ListaHashtagsAdministrador() {
		_listaHashtagsAdministrador = new ListaHashtagsAdministrador(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listaHashtagsAdministrador);
	}
}