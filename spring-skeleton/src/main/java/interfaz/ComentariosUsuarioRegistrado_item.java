package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ComentariosUsuarioRegistrado_item extends Comentariospropios_item {
	public ComentariosUsuarioRegistrado_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(true);
		
		this.getButtonMeGusta().addClickListener(Event -> Darlikeacomentario());
		this.getImgFotoPerfilTweet().addClickListener(Event -> Darlikeacomentario());
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
		}
		
		else {
			this.getButtonMeGusta().getStyle().set("color", "gray");
			this.getButtonMeGusta().setText("Dar me gusta");
			Comentariospropios la = (Comentariospropios) _lista;
			la._item.add(this);
			}
	}

	public void VerperfilUsuarioRegistrado() {
		_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this._comentariosUsuarioRegistrado._vertweetgeneralUsuarioRegistrado);
		this._comentariosUsuarioRegistrado._vertweetgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
		this._comentariosUsuarioRegistrado._vertweetgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioRegistrado);
	}
}