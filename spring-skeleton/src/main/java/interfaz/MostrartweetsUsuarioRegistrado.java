package interfaz;

import java.util.Vector;

public class MostrartweetsUsuarioRegistrado extends MostrartweetspropiosUsuarioRegistrado {
	
	public MostrartweetsUsuarioRegistrado(UsuarioRegistrado usuario) {
		super(usuario);

	}
	public MostrartweetsUsuarioRegistrado(VerHashtagUsuarioRegistrado verHashtagUsuarioRegistrado) {
		super(verHashtagUsuarioRegistrado);
		}
	
	public MostrartweetsUsuarioRegistrado(VerperfilgeneralUsuarioRegistrado verperfilgeneralUsuarioRegistrado) {
		super(verperfilgeneralUsuarioRegistrado);
		}
	
	public UsuarioRegistrado _usuarioregistrado; 
	public VerHashtagUsuarioRegistrado _verHashtagUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilgeneralUsuarioRegistrado;
	public Vector<MostrartweetsUsuarioRegistrado_item> _item = new Vector<MostrartweetsUsuarioRegistrado_item>();
}