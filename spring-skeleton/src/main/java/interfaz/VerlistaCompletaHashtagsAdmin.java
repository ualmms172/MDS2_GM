package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaVerlistacompletahashtagsadmin;

public class VerlistaCompletaHashtagsAdmin extends VistaVerlistacompletahashtagsadmin {

	public Administrador _administrador;
	public ListaHashtagsAdministrador _listaHashtagsAdministrador;
	
	
	public VerlistaCompletaHashtagsAdmin(Administrador administrador) {
		
		_administrador = administrador; 
		
		ListaHashtagsAdministrador();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_administrador);
			
	});
	}
	
	public void ListaHashtagsAdministrador() {
		_listaHashtagsAdministrador = new ListaHashtagsAdministrador(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listaHashtagsAdministrador);
		
	}
	
	public VerlistaCompletaHashtagsAdmin Recargar(Administrador log) {
		return new VerlistaCompletaHashtagsAdmin(log);
	}
}