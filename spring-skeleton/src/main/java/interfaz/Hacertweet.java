package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;

public class Hacertweet extends CrearContenido {
	//private event _publicartweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public ListahashtagsUsuarioRegistrado_item _listahashtagsUsuarioRegistrado;
	
	public Hacertweet(UsuarioRegistrado usuarioregistrado) {
		
		_usuarioregistrado = usuarioregistrado;
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioregistrado.MainView.removeAll(); 
		    this._usuarioregistrado.MainView.add(_usuarioregistrado); 
		}); 
		
	}
	
	
	public Hacertweet(ListahashtagsUsuarioRegistrado_item listahashtagsUsuarioRegistrado) {
		
		_listahashtagsUsuarioRegistrado = listahashtagsUsuarioRegistrado; 
		this.getButtonPublicar().addClickListener(Event -> Publicartweet());
		this.getButtonAtras().addClickListener(event -> {
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_listahashtagsUsuarioRegistrado._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado);
		}); 
	}
	
	
	public void Publicartweet() {
//		UsuarioRegistrado user = new UsuarioRegistrado(this._usuarioregistrado.MainView);
//		this._usuarioregistrado.MainView.removeAll();
//		this._usuarioregistrado.MainView.add(user);
		UsuarioRegistrado vista = new UsuarioRegistrado((MainView)Pantalla.MainView);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
	}

	public void Mencionar() {
		throw new UnsupportedOperationException();
	}

	public void UsarHashtag() {
		throw new UnsupportedOperationException();
	}
}