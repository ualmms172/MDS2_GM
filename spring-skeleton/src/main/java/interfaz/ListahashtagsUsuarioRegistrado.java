package interfaz;

import java.util.Vector;

public class ListahashtagsUsuarioRegistrado extends ListahashtagsgeneralUsuarioRegistrado {
	public VerlistacompletahashtagUsuarioRegistrado _verlistacompletahashtagUsuarioRegistrado;
	public Vector<ListahashtagsUsuarioRegistrado_item> _item = new Vector<ListahashtagsUsuarioRegistrado_item>();
	
	public ListahashtagsUsuarioRegistrado(VerlistacompletahashtagUsuarioRegistrado lista) {
		
		_verlistacompletahashtagUsuarioRegistrado = lista; 
	}
}