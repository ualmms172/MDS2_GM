package interfaz;

import java.util.Vector;

public class Listatweets extends ListaTweetsGeneral {
	public VerHashtagUsuarioNoRegistrado _verHashtagUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;
	public Vector<Listatweets_item> _item = new Vector<Listatweets_item>();
	
	public Listatweets(VerperfilUsuarioNoRegistrado perfil) {
		
		_verperfilUsuarioNoRegistrado = perfil; 
	}
	
	public Listatweets(VerHashtagUsuarioNoRegistrado hashtag) {
		
		_verHashtagUsuarioNoRegistrado = hashtag; 
	}
	
	
	
	
	
	
	
}