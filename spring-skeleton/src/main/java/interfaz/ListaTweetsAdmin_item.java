package interfaz;

public class ListaTweetsAdmin_item extends ListaTweetsGeneral_item {
	public ListaTweetsAdmin_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
	}

	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin _listaTweetsAdmin;
	public VerTweetAdministrador _verTweetAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void BorrarTweet() {
		throw new UnsupportedOperationException();
	}

	public void VerTweetAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void VerPerfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}