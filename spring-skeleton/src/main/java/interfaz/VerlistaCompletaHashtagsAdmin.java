package interfaz;

import vistas.VistaVerlistacompletahashtagsadmin;

public class VerlistaCompletaHashtagsAdmin extends VistaVerlistacompletahashtagsadmin {
	//private Label _titulo;
	public Administrador _administrador;
	public ListaHashtagsAdministrador _listaHashtagsAdministrador;
	
	
	public VerlistaCompletaHashtagsAdmin(Administrador administrador) {
		
		_administrador = administrador; 
	}
	
	public void ListaHashtagsAdministrador() {
		throw new UnsupportedOperationException();
	}
}