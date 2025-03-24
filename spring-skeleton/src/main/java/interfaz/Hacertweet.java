package interfaz;

public class Hacertweet extends CrearContenido {
	//private event _publicartweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListahashtagsUsuarioRegistrado_item _listahashtagsUsuarioRegistrado;
	
	public Hacertweet(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado; 
		
	}
	
	
	public Hacertweet(ListahashtagsUsuarioRegistrado_item listahashtagsUsuarioRegistrado) {
		
		_listahashtagsUsuarioRegistrado = listahashtagsUsuarioRegistrado; 
	}
	
	
	
	

	public void Publicartweet() {
		throw new UnsupportedOperationException();
	}

	public void Mencionar() {
		throw new UnsupportedOperationException();
	}

	public void UsarHashtag() {
		throw new UnsupportedOperationException();
	}
}