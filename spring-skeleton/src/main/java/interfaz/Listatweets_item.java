package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView.Pantalla;

public class Listatweets_item extends ListaTweetsGeneral_item {
	public Listatweets_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		// TODO Auto-generated constructor stub
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		_listatweets = (Listatweets) _lista;
		
		this.getVaadinHorizontalLayout().addClickListener(event -> VertweetUsuarioNoRegistrado()); 
		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado()); 
	}

	public Listatweets _listatweets;
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public void VertweetUsuarioNoRegistrado() {
		_vertweetUsuarioNoRegistrado = new VertweetUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_vertweetUsuarioNoRegistrado);
//		_vertweetUsuarioNoRegistrado = new VertweetUsuarioNoRegistrado(this);
//		if(this._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_vertweetUsuarioNoRegistrado);
//		}
//		else {
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_vertweetUsuarioNoRegistrado);
//		}
	}

	public void VerperfilUsuarioNoRegistrado() {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);
//		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
//		if(this._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verHashtagUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioNoRegistrado);
//		}
//		else {
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			this._listatweets._verperfilUsuarioNoRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verperfilUsuarioNoRegistrado);
//		}
	}
}