package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaComentariosAdministrador_item extends ListaComentariosGeneral_item {
	public ListaComentariosAdministrador_item(ListaContenido lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getButtonMeGusta().setVisible(false);
		
		this.getButtonBorrar().addClickListener(Event -> BorrarComentario());
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerPerfilAdministrador());
	}

	//private event _borrarComentario;
	//private Button _borrarComentarioB;
	public ListaComentariosAdministrador _listaComentariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void BorrarComentario() {
		
		VerTweetAdministrador tweet = new VerTweetAdministrador(this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin);
		
		if(this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador!=null) {
			this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador.MainView.removeAll();
			this._listaComentariosAdministrador._verTweetAdministrador = tweet;
			this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador.MainView.add(tweet);
		}
		else if(this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
			this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
			this._listaComentariosAdministrador._verTweetAdministrador = tweet;
			this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(tweet);
		}
		else {
			this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
			this._listaComentariosAdministrador._verTweetAdministrador = tweet;
			this._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(tweet);
		}
	}

	public void VerPerfilAdministrador() {
		_verPerfilAdministrador = new VerPerfilAdministrador(this);
		this._listaComentariosAdministrador._verTweetAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
		this._listaComentariosAdministrador._verTweetAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_verPerfilAdministrador);
	}
}