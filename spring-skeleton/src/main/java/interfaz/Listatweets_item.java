package interfaz;

public class Listatweets_item extends ListaTweetsGeneral_item {
	public Listatweets_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
	}

	public Listatweets _listatweets;
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VertweetUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}
}