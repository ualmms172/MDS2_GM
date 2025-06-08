package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class ComentariosUsuarioRegistrado_item extends Comentariospropios_item {
	public ComentariosUsuarioRegistrado_item(ListaContenido lista,Comentario c) {
		super(lista,c);
		this._comentariosUsuarioRegistrado= (Comentariospropios) lista;
		
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(true);
		
		this.getButtonMeGusta().addClickListener(Event -> Darlikeacomentario());
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerperfilUsuarioRegistrado());
		
		for(basededatos.UsuarioRegistrado usu : c.meGustaPor.toArray()) {
			if(usu.getID()==Interfaz.ur.u.getID()) {
				dado=true;
				break;
			}
		}
		if(dado) {
			this.getButtonMeGusta().getStyle().set("color", "red");
			this.getButtonMeGusta().setText("Quitar");
		}
	}

	//private event _darlikeacomentario;
	//private Button _meGusta;
	public Comentariospropios _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public boolean dado=false;

	public void Darlikeacomentario() {
		
		if(!dado) {

			basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.DarLikeComentario(Interfaz.ur.u, c);
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_comentariosUsuarioRegistrado._vertweetgeneralUsuarioRegistrado.Recargar(u));
		}
		
		else {

				basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.QuitarLikeComentario(Interfaz.ur.u, c);
				UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_comentariosUsuarioRegistrado._vertweetgeneralUsuarioRegistrado.Recargar(u));
			}
	}

	public void VerperfilUsuarioRegistrado() {
		_verperfilUsuarioRegistrado = new Verperfilnobloqueado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}
}