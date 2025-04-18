package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VertweetUsuarioNoRegistrado extends VertweetGeneral {
	public Listatweets_item _listatweets;
	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;

	public VertweetUsuarioNoRegistrado(Listatweets_item listatweets) {
		
		_listatweets = listatweets; 
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
		
		this.ListaComentariosUsuarioNoRegistrado();
		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado());
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
				if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado instanceof ListaHashtagsUsuarioNoRegistrado) {
					ListaHashtagsUsuarioNoRegistrado l = (ListaHashtagsUsuarioNoRegistrado) this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
					Pantalla.Anterior = l._verlistacompletahashtags;
				}
			}
			else if(this._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
				VerperfilUsuarioNoRegistrado x = this._listatweets._listatweets._verperfilUsuarioNoRegistrado;
				
				if(x._listaUsuariosGeneralUsuarioNoRegistrado!=null) {
					if(x._listaUsuariosGeneralUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado instanceof ListaUsuariosUsuarionoRegistrado) {
						ListaUsuariosUsuarionoRegistrado l = (ListaUsuariosUsuarionoRegistrado) x._listaUsuariosGeneralUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado;
						Pantalla.Anterior= l._verListaCompletaUsuariosUsuarioNoRegistrado._usuarioNoRegistrado;
					}
					else {
						ListaUsuariosFamosos l = (ListaUsuariosFamosos) x._listaUsuariosGeneralUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado;
						Pantalla.Anterior= l._usuarioNoRegistrado;
					}
				}
				
				else if(x._listatweets_item!=null) {
					if(x._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado!=null) {
						Pantalla.Anterior = x._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado;
					}
					else if(x._listatweets_item._listatweets._verperfilUsuarioNoRegistrado!=null) {
						Pantalla.Anterior = x._listatweets_item._listatweets._verperfilUsuarioNoRegistrado;
					}
				}
				
				else if(x._vertweetUsuarioNoRegistrado!=null) {
					if(x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
						Pantalla.Anterior = x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado;
					}
					else if(x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
						Pantalla.Anterior = x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado;
					}
//					else {
//						Pantalla.Anterior = x._vertweetUsuarioNoRegistrado._listatweets._listatweets._usuarioNoRegistrado;
//					}
				}
				
				else {
					if(x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
						Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado;
					}
					else if(x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
						Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado;
					}
//					else {
//						Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._usuarioNoRegistrado;
//					}
				}
				
				
			}
			
			
	});
	}
	
	
	public VertweetUsuarioNoRegistrado(VerperfilUsuarioNoRegistrado verperfilUsuarioNoRegistrado) {
		
		_verperfilUsuarioNoRegistrado = verperfilUsuarioNoRegistrado; 
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
		
		this.ListaComentariosUsuarioNoRegistrado();
		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado());
	}
	

	
	public void ListaComentariosUsuarioNoRegistrado() {
		_listaComentariosUsuarioNoRegistrado = new ListaComentariosUsuarioNoRegistrado(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_listaComentariosUsuarioNoRegistrado);
		
		ListaComentariosUsuarioNoRegistrado_item item_tweets = new ListaComentariosUsuarioNoRegistrado_item(_listaComentariosUsuarioNoRegistrado);
		_listaComentariosUsuarioNoRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void VerperfilUsuarioNoRegistrado() {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);
	}
}