package interfaz;

import java.util.Vector;

public class ListaTweetsAdmin extends ListaTweetsGeneral {
	
	public Administrador _administrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	public VerHashtagAdministrador _verHashtagAdministrador;
	public Vector<ListaTweetsAdmin_item> _item = new Vector<ListaTweetsAdmin_item>();
	
	public ListaTweetsAdmin(Administrador admin) {
		
		_administrador = admin; 
	}
	
	
	public ListaTweetsAdmin(VerPerfilAdministrador perfil) {
		
		_verPerfilAdministrador = perfil; 
	}
	
	public ListaTweetsAdmin(VerHashtagAdministrador hashtag) {
		
		_verHashtagAdministrador = hashtag; 
	}
	
	
}