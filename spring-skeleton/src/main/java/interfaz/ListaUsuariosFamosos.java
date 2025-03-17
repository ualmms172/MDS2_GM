package interfaz;

import java.util.Vector;

public class ListaUsuariosFamosos extends ListaUsuariosGeneralUsuarioNoRegistrado {
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public Vector<ListaUsuariosFamosos_item> _item = new Vector<ListaUsuariosFamosos_item>();
	
	public ListaUsuariosFamosos(UsuarioNoRegistrado usuario) {
		
		_usuarioNoRegistrado =  usuario; 
	}
	
}