package interfaz;

import java.util.Vector;

public class ComentariosUsuarioRegistrado extends Comentariospropios {
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	public Vector<ComentariosUsuarioRegistrado_item> _item = new Vector<ComentariosUsuarioRegistrado_item>();
	
	public ComentariosUsuarioRegistrado(VertweetgeneralUsuarioRegistrado tweet) {
		
		_vertweetgeneralUsuarioRegistrado = tweet; 
	}
	
	
}