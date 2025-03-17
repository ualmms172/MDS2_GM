package interfaz;

import java.util.Vector;

import vistas.VistaUsuariosbaneados;

public class UsuariosBaneados extends VistaUsuariosbaneados {
	public Verbaneados _verbaneados;
	public Vector<UsuariosBaneados_item> _item = new Vector<UsuariosBaneados_item>();
	
	public UsuariosBaneados(Verbaneados baneados) {
		
		_verbaneados = baneados; 
	}
	
}