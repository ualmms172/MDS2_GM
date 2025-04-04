package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaComentariosUsuarioNoRegistrado_item extends ListaComentariosGeneral_item {
	
	
	public ListaComentariosUsuarioNoRegistrado_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonBorrar().setVisible(false);
	}

	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VerperfilUsuarioNoRegistrado() {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
		this._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
		this._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioNoRegistrado);
	}
}