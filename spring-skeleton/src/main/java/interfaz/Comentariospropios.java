package interfaz;

import java.util.Vector;

public class Comentariospropios extends ListaComentariosGeneral {
	public Vector<Comentariospropios_item> _item = new Vector<Comentariospropios_item>();
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	public Comentariospropios(VertweetgeneralUsuarioRegistrado tweet) {
		
		_vertweetgeneralUsuarioRegistrado = tweet; 
	}
}