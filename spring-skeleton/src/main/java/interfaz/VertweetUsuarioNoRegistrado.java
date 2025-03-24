package interfaz;

public class VertweetUsuarioNoRegistrado extends VertweetGeneral {
	public Listatweets_item _listatweets;
	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public VertweetUsuarioNoRegistrado(Listatweets_item listatweets) {
		
		_listatweets = listatweets; 
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
	}
	
	
	public VertweetUsuarioNoRegistrado(VerperfilUsuarioNoRegistrado verperfilUsuarioNoRegistrado) {
		
		_verperfilUsuarioNoRegistrado = verperfilUsuarioNoRegistrado; 
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
	}
	

	
	public void ListaComentariosUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}
}