package interfaz;

import java.util.Vector;

public class ListaHashtagsFamososAdministrador extends ListaHashtagsgeneralAdministrador {
	public Administrador _administrador;
	public Vector<ListaHashtagsFamososAdministrador_item> _item = new Vector<ListaHashtagsFamososAdministrador_item>();
	
	public ListaHashtagsFamososAdministrador(Administrador administrador) {
		
		_administrador = administrador; 
	}
	}