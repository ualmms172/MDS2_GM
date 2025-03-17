package interfaz;

import java.util.Vector;

public class ListahashtagfamososUsuarioRegistrado extends ListahashtagsgeneralUsuarioRegistrado {
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public Vector<ListahashtagfamososUsuarioRegistrado_item> _item = new Vector<ListahashtagfamososUsuarioRegistrado_item>();
	
	public ListahashtagfamososUsuarioRegistrado(UsuarioRegistrado usuario) {
		
		_usuarioregistrado  = usuario; 
	}
	
}