package interfaz;

public class Retweetear extends CrearContenido {
	//private event _publicarretweet;
	//private event _mencionar;
	//private event _usarHashtag;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	
	
	public Retweetear (MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado) {
		
		_mostrartweetspropiosUsuarioRegistrado = mostrartweetspropiosUsuarioRegistrado; 
		
	}
	
	public Retweetear (VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado) {
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		
	}
	
	
	
	
	
	

	public void Publicarretweet() {
		throw new UnsupportedOperationException();
	}

	public void Mencionar() {
		throw new UnsupportedOperationException();
	}

	public void UsarHashtag() {
		throw new UnsupportedOperationException();
	}
}