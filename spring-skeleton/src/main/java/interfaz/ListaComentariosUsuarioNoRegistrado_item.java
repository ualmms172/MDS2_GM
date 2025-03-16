package interfaz;

public class ListaComentariosUsuarioNoRegistrado_item extends ListaComentariosGeneral_item {
	ListaComentariosUsuarioNoRegistrado_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonBorrar().setVisible(false);
	}

	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VerperfilUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}
}