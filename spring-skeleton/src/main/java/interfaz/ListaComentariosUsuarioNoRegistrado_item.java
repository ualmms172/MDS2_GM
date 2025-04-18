package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class ListaComentariosUsuarioNoRegistrado_item extends ListaComentariosGeneral_item {
	
	
	public ListaComentariosUsuarioNoRegistrado_item(ListaContenido lista) {
		super(lista);
		
		_listaComentariosUsuarioNoRegistrado = (ListaComentariosUsuarioNoRegistrado)lista;
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		this.getButtonBorrar().setVisible(false);
		
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioNoRegistrado());
	}

	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VerperfilUsuarioNoRegistrado() {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);
	}
}