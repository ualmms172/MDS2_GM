package interfaz;

public class ListaComentariosAdministrador_item extends ListaComentariosGeneral_item {
	public ListaComentariosAdministrador_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
	}

	//private event _borrarComentario;
	//private Button _borrarComentarioB;
	public ListaComentariosAdministrador _listaComentariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void BorrarComentario() {
		throw new UnsupportedOperationException();
	}

	public void VerPerfilAdministrador() {
		throw new UnsupportedOperationException();
	}
}