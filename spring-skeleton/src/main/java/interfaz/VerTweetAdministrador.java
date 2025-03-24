package interfaz;

public class VerTweetAdministrador extends VertweetGeneral {
	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin_item _listaTweetsAdmin;
	public ListaComentariosAdministrador _listaComentariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	public VerTweetAdministrador(ListaTweetsAdmin_item listaTweetsAdmin) {
		
		_listaTweetsAdmin = listaTweetsAdmin; 
		this.getButtonComentar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
	}
	
	public VerTweetAdministrador(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		this.getButtonComentar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
	}
	
	
	

	public void BorrarTweet() {
		throw new UnsupportedOperationException();
	}

	public void ListaComentariosAdministrador() {
		throw new UnsupportedOperationException();
	}

	public void VerPerfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}