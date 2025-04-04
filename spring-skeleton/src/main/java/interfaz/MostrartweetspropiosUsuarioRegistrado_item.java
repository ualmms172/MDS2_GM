package interfaz;

public class MostrartweetspropiosUsuarioRegistrado_item extends ListaTweetsGeneral_item {
	public MostrartweetspropiosUsuarioRegistrado_item(ListaContenido lista) {
		super(lista);
		_mostrartweetspropiosUsuarioRegistrado = (MostrartweetspropiosUsuarioRegistrado) _lista;
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
	}

	//private Button _retweetear;
	public MostrartweetspropiosUsuarioRegistrado _mostrartweetspropiosUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _verTweetUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;

	public void Retweetear() {
		throw new UnsupportedOperationException();
	}

	public void VerTweetUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}
}