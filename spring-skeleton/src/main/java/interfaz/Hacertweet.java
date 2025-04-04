package interfaz;

public class Hacertweet extends CrearContenido {
	//private event _publicartweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListahashtagsUsuarioRegistrado_item _listahashtagsUsuarioRegistrado;
	
	public Hacertweet(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado;
		
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioregistrado.MainView.removeAll(); 
		    this._usuarioregistrado.MainView.add(_usuarioregistrado); 
		}); 
		
	}
	
	
	public Hacertweet(ListahashtagsUsuarioRegistrado_item listahashtagsUsuarioRegistrado) {
		
		_listahashtagsUsuarioRegistrado = listahashtagsUsuarioRegistrado; 
	}
	
	
	public void Publicartweet() {
		UsuarioRegistrado user = new UsuarioRegistrado(this._usuarioregistrado.MainView);
		this._usuarioregistrado.MainView.removeAll();
		this._usuarioregistrado.MainView.add(user);
	}

	public void Mencionar() {
		throw new UnsupportedOperationException();
	}

	public void UsarHashtag() {
		throw new UnsupportedOperationException();
	}
}