package interfaz;

import java.util.Vector;

public class MostrartweetspropiosUsuarioRegistrado extends ListaTweetsGeneral {
	public Vector<MostrartweetspropiosUsuarioRegistrado_item> _item = new Vector<MostrartweetspropiosUsuarioRegistrado_item>();
	
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public VerHashtagUsuarioRegistrado _verHashtagUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilgeneralUsuarioRegistrado;
	
	public MostrartweetspropiosUsuarioRegistrado(UsuarioRegistrado usuario) {
		
		_usuarioregistrado = usuario; 
	}
	
	public MostrartweetspropiosUsuarioRegistrado(VerHashtagUsuarioRegistrado verHashtagUsuarioRegistrado) {
		
	_verHashtagUsuarioRegistrado = verHashtagUsuarioRegistrado; 
	}
	
	public MostrartweetspropiosUsuarioRegistrado(VerperfilgeneralUsuarioRegistrado verperfilgeneralUsuarioRegistrado) {
		
		_verperfilgeneralUsuarioRegistrado = verperfilgeneralUsuarioRegistrado; 
		}
}