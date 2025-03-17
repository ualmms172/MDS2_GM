package interfaz;

import java.util.Vector;

public class ListaUsuariosUsuarionoRegistrado extends ListaUsuariosGeneralUsuarioNoRegistrado {
	public VerListaCompletaUsuariosUsuarioNoRegistrado _verListaCompletaUsuariosUsuarioNoRegistrado;
	public Vector<ListaUsuariosUsuarionoRegistrado_item> _item = new Vector<ListaUsuariosUsuarionoRegistrado_item>();
	
	public ListaUsuariosUsuarionoRegistrado(VerListaCompletaUsuariosUsuarioNoRegistrado lista) {
		
		_verListaCompletaUsuariosUsuarioNoRegistrado = lista; 
	}
}