package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import gallardoMartinez.MainView.Pantalla;

public class ComentariosUsuarioRegistrado_item extends Comentariospropios_item {
	public ComentariosUsuarioRegistrado_item(ListaContenido lista,Comentario c) {
		super(lista,c);
		this._comentariosUsuarioRegistrado=(ComentariosUsuarioRegistrado)lista;
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(true);
		
		this.getButtonMeGusta().addClickListener(Event -> Darlikeacomentario());
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioRegistrado());
	}

	//private event _darlikeacomentario;
	//private Button _meGusta;
	public ComentariosUsuarioRegistrado _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public boolean dado=false;

	public void Darlikeacomentario() {
		
		if(!dado) {
		this.getButtonMeGusta().getStyle().set("color", "red");
		this.getButtonMeGusta().setText("Quitar");
		Comentariospropios la = (Comentariospropios) _lista;
		la._item.add(this);
		dado=true;
		}
		
		else {
			this.getButtonMeGusta().getStyle().set("color", "gray");
			this.getButtonMeGusta().setText("Dar me gusta");
			Comentariospropios la = (Comentariospropios) _lista;
			la._item.add(this);
			dado=false;
			}
	}

	public void VerperfilUsuarioRegistrado() {
		_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this._comentariosUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}
}