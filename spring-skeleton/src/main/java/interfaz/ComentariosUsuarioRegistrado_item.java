package interfaz;

public class ComentariosUsuarioRegistrado_item extends Comentariospropios_item {
	public ComentariosUsuarioRegistrado_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(true);
	}

	//private event _darlikeacomentario;
	//private Button _meGusta;
	public ComentariosUsuarioRegistrado _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;

	public void Darlikeacomentario() {
		throw new UnsupportedOperationException();
	}

	public void VerperfilUsuarioRegistrado() {
		throw new UnsupportedOperationException();
	}
}