package interfaz;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VertweetUsuarioNoRegistrado extends VertweetGeneral {
	public Listatweets_item _listatweets;
	public ListaComentariosUsuarioNoRegistrado _listaComentariosUsuarioNoRegistrado;
	public VerperfilUsuarioNoRegistrado _verperfilUsuarioNoRegistrado;
	
	public VerHashtagUsuarioNoRegistrado _verHashtagUsuarioNoRegistrado;

	public VertweetUsuarioNoRegistrado(Listatweets_item listatweets) {
		super(listatweets);
		_listatweets = listatweets; 
		
		this.getLabelCuerpoTwet().setText(_listatweets.t.getContieneTexto().getTexto());
		//	this.getLabelMeGusta().setText(_listatweets.t.meGustaPor);
			this.getLabelNombreUsuario().setText(_listatweets.t.getEscritoPor().getNick());
			this.getImgFotoPerfilTweet().setSrc(_listatweets.t.getEscritoPor().getFotoPerfil());
			//this.getImgFotoTweet().setSrc(_listatweets.t.contieneMultimedia.ge);
			//this.getDivTweet().sets
		
		this.getButtonBorrar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		this.getButtonComentar().setVisible(false);
		
		this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
		this.getlabelRetweeteadoPor().setVisible(false);
		
		this.ListaComentariosUsuarioNoRegistrado();
		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado(false));
		
		Label labelOriginal = this.getLabelCuerpoTwet();
		if(_listatweets.t.getMencionaA()!=null) {
			Span[] mencion = this.Mencion();
		    Span nuevoSpan = new Span();

		    // Copiar estilos visuales si el Label tiene alguno
		    nuevoSpan.getStyle().set("font-family", labelOriginal.getStyle().get("font-family"));
		    nuevoSpan.getStyle().set("font-size", labelOriginal.getStyle().get("font-size"));
		    nuevoSpan.getStyle().set("font-weight", labelOriginal.getStyle().get("font-weight"));
		    nuevoSpan.getStyle().set("color", labelOriginal.getStyle().get("color"));
		    nuevoSpan.getStyle().set("display", "inline");
		    
		    mencion[1].getStyle().set("color", "blue");
		    mencion[1].getStyle().set("cursor", "pointer");
		    mencion[1].getElement().addEventListener("click", e -> {
		    	 VerperfilUsuarioNoRegistrado(true);
		    });
		    
		    nuevoSpan.add(mencion[0], mencion[1], mencion[2]);
		    
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		    
		}
		if(_listatweets.t.getContiene()!=null) {
			
			Span[] hashtag = this.Hashtag();
		    Span nuevoSpan = new Span();
		    
		    nuevoSpan.getStyle().set("font-family", labelOriginal.getStyle().get("font-family"));
		    nuevoSpan.getStyle().set("font-size", labelOriginal.getStyle().get("font-size"));
		    nuevoSpan.getStyle().set("font-weight", labelOriginal.getStyle().get("font-weight"));
		    nuevoSpan.getStyle().set("color", labelOriginal.getStyle().get("color"));
		    nuevoSpan.getStyle().set("display", "inline");
		    
		    hashtag[1].getStyle().set("color", "blue");
		    hashtag[1].getStyle().set("cursor", "pointer");
		    hashtag[1].getElement().addEventListener("click", e -> {
		    	 this.VerHashtagUsuarioNoRegistrado();
		    });
		    
		    nuevoSpan.add(hashtag[0], hashtag[1], hashtag[2]);
		    
		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		}
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
//			if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//				if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado instanceof ListaHashtagsUsuarioNoRegistrado_item) {
//					ListaHashtagsUsuarioNoRegistrado_item l = (ListaHashtagsUsuarioNoRegistrado_item) this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
//					Pantalla.Anterior = l._listaHashtagsUsuarioNoRegistrado._verlistacompletahashtags;
//				}
//				else {
//					ListahashtagsfamososUsuarioNoRegistrado_item l = (ListahashtagsfamososUsuarioNoRegistrado_item) this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
//					Pantalla.Anterior= l._listahashtagsfamososUsuarioNoRegistrado._usuarioNoRegistrado;
//				}
//			}
			if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
				if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado!=null) {
					if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado instanceof ListaHashtagsUsuarioNoRegistrado_item) {
						ListaHashtagsUsuarioNoRegistrado_item l = (ListaHashtagsUsuarioNoRegistrado_item) this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
						Pantalla.Anterior = l._listaHashtagsUsuarioNoRegistrado._verlistacompletahashtags;
					}
					else {
						ListahashtagsfamososUsuarioNoRegistrado_item l = (ListahashtagsfamososUsuarioNoRegistrado_item) this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
						Pantalla.Anterior= l._listahashtagsfamososUsuarioNoRegistrado._usuarioNoRegistrado;
					}
				}
				else if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._vertweetUsuarioNoRegistrado!=null) {
					Pantalla.Anterior= this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._vertweetUsuarioNoRegistrado;
				}
				else {
					if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verperfilUsuarioNoRegistrado!=null)
						Pantalla.Anterior= this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verperfilUsuarioNoRegistrado;
					else if(this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado!=null)
						Pantalla.Anterior=this._listatweets._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado;
//					else {
//						Pantalla.Anterior=this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
//					}
				}
			}
			else if(this._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
				VerperfilUsuarioNoRegistrado x = this._listatweets._listatweets._verperfilUsuarioNoRegistrado;
				
				if(x._listaUsuariosGeneralUsuarioNoRegistrado!=null) {
					if(x._listaUsuariosGeneralUsuarioNoRegistrado instanceof ListaUsuariosUsuarionoRegistrado_item) {
						ListaUsuariosUsuarionoRegistrado_item l = (ListaUsuariosUsuarionoRegistrado_item) x._listaUsuariosGeneralUsuarioNoRegistrado;
						Pantalla.Anterior= l._listaUsuariosUsuarionoRegistrado._verListaCompletaUsuariosUsuarioNoRegistrado._usuarioNoRegistrado;
					}
					else {
						ListaUsuariosFamosos_item l = (ListaUsuariosFamosos_item) x._listaUsuariosGeneralUsuarioNoRegistrado;
						Pantalla.Anterior= l._listaUsuariosFamosos._usuarioNoRegistrado;
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
					Pantalla.Anterior = x._vertweetUsuarioNoRegistrado;
//					if(x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//						Pantalla.Anterior = x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado;
//					}
//					else if(x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
//						Pantalla.Anterior = x._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado;
//					}
//					else {
//						Pantalla.Anterior = x._vertweetUsuarioNoRegistrado._listatweets._listatweets._usuarioNoRegistrado;
//					}
				}
				
				else {
					Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado;
//					if(x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
//						Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado;
//					}
//					else if(x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
//						Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado;
//					}
//					else {
//						Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._usuarioNoRegistrado;
//					}
				}
				
				
			}
			
			
	});
	}
	
	
//	public VertweetUsuarioNoRegistrado(VerperfilUsuarioNoRegistrado verperfilUsuarioNoRegistrado) {
//		
//		_verperfilUsuarioNoRegistrado = verperfilUsuarioNoRegistrado; 
//		this.getButtonBorrar().setVisible(false);
//		this.getButtonMeGusta().setVisible(false);
//		this.getButtonRetweet().setVisible(false);
//		this.getButtonComentar().setVisible(false);
//		
//		this.ListaComentariosUsuarioNoRegistrado();
//		this.getImgFotoPerfilTweet().addClickListener(event -> VerperfilUsuarioNoRegistrado());
//	}
	

	
	public void ListaComentariosUsuarioNoRegistrado() {
		_listaComentariosUsuarioNoRegistrado = new ListaComentariosUsuarioNoRegistrado(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_listaComentariosUsuarioNoRegistrado);
		
		ListaComentariosUsuarioNoRegistrado_item item_tweets = new ListaComentariosUsuarioNoRegistrado_item(_listaComentariosUsuarioNoRegistrado,null);//AQUÍ HABRA QUE MODIFICAR EL NULL
		_listaComentariosUsuarioNoRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public void VerHashtagUsuarioNoRegistrado() {
		_verHashtagUsuarioNoRegistrado = new VerHashtagUsuarioNoRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagUsuarioNoRegistrado);
	}

	public void VerperfilUsuarioNoRegistrado(boolean mencion) {
		_verperfilUsuarioNoRegistrado = new VerperfilUsuarioNoRegistrado(this,mencion);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioNoRegistrado);
	}
}