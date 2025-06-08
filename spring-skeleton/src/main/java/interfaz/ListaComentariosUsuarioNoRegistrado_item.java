package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import gallardoMartinez.MainView.Pantalla;

public class ListaComentariosUsuarioNoRegistrado_item extends ListaComentariosGeneral_item {
	
	
	public ListaComentariosUsuarioNoRegistrado_item(ListaContenido lista,Comentario c) {
		super(lista,c);
		
		_listaComentariosUsuarioNoRegistrado = (ListaComentariosUsuarioNoRegistrado)lista;
		
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