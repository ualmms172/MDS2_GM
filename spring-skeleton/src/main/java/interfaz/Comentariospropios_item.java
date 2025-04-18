package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class Comentariospropios_item extends ListaComentariosGeneral_item {
	public Comentariospropios_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		_comentariospropios = (Comentariospropios)lista;
		this.getButtonMeGusta().setVisible(false);
		this.getButtonBorrar().setVisible(false);
		
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioRegistrado());
	}


	public Comentariospropios _comentariospropios;
	public Verperfilpropio _verperfilpropio;
	
	public void VerperfilUsuarioRegistrado() {
		_verperfilpropio = new Verperfilpropio(this._comentariospropios._vertweetgeneralUsuarioRegistrado);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilpropio);
	}
}