package interfaz;

import java.util.Vector;

public class ListahashtagsfamososUsuarioNoRegistrado extends ListahashtagsgeneralUsuarioNoRegistrado {
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public Vector<ListahashtagsfamososUsuarioNoRegistrado_item> _item = new Vector<ListahashtagsfamososUsuarioNoRegistrado_item>();
	
	public ListahashtagsfamososUsuarioNoRegistrado(UsuarioNoRegistrado usuario) {
		
		_usuarioNoRegistrado = usuario; 
	}
	
}