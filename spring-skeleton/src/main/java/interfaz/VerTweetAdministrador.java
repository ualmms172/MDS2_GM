package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerTweetAdministrador extends VertweetGeneral {
	//private event _borrarTweet;
	//private Button _borrarTweetB;
	public ListaTweetsAdmin_item _listaTweetsAdmin;
	public ListaComentariosAdministrador _listaComentariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	public VerTweetAdministrador(ListaTweetsAdmin_item listaTweetsAdmin) {
		
		_listaTweetsAdmin = listaTweetsAdmin; 
		
		this.getLabelCuerpoTwet().setText(_listaTweetsAdmin.t.getContieneTexto().getTexto());
	//	this.getLabelMeGusta().setText(_listaTweetsAdmin.t.meGustaPor);
		this.getLabelNombreUsuario().setText(_listaTweetsAdmin.t.getEscritoPor().getNick());
		this.getImgFotoPerfilTweet().setSrc(_listaTweetsAdmin.t.getEscritoPor().getFotoPerfil());
		//this.getImgFotoTweet().setSrc(_listaTweetsAdmin.t.contieneMultimedia.ge);
		//this.getDivTweet().sets
		
		this.getButtonComentar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		ListaComentariosAdministrador();
		this.getImgFotoPerfilTweet().addClickListener(event -> VerPerfilAdministrador()); 
		this.getButtonBorrar().addClickListener(event -> BorrarTweet());
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
				if(this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador_item) {
					ListaHashtagsAdministrador_item l = (ListaHashtagsAdministrador_item) this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador;
					Pantalla.Anterior = l._listaHashtagsAdministrador._verlistaCompletaHashtagsAdmin;
				}
				else {
					ListaHashtagsFamososAdministrador_item l = (ListaHashtagsFamososAdministrador_item) this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador;
					Pantalla.Anterior= l._listaHashtagsFamososAdministrador._administrador;
				}
			}
			else if(this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
				VerPerfilAdministrador x = this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
				
				if(x._listaUsuariosGeneralAdministrador!=null) {
					if(x._listaUsuariosGeneralAdministrador instanceof ListaUsuariosAdministrador_item) {
						ListaUsuariosAdministrador_item l = (ListaUsuariosAdministrador_item) x._listaUsuariosGeneralAdministrador;
						Pantalla.Anterior= l._listaUsuariosAdministrador._verListaCompletaUsuariosAdministrador._administrador;
					}
					else {
						ListaUsuariosFamososAdministrador_item l = (ListaUsuariosFamososAdministrador_item) x._listaUsuariosGeneralAdministrador;
						Pantalla.Anterior= l._listaUsuariosFamososAdministrador._administrador;
					}
				}
				
				else if(x._listaTweetsAdmin_item!=null) {
					if(x._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador!=null) {
						Pantalla.Anterior = x._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador;
					}
					else if(x._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador!=null) {
						Pantalla.Anterior = x._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador;
					}
					else {
						Pantalla.Anterior=x._listaTweetsAdmin_item._listaTweetsAdmin._administrador;
					}
				}
				
				else if(x._verTweetAdministrador!=null) {
					Pantalla.Anterior = x._verTweetAdministrador;
//					if(x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
//						Pantalla.Anterior = x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
//					}
//					else if(x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
//						Pantalla.Anterior = x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
//					}
//					else {
//						Pantalla.Anterior = x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
//					}
				}
				
				else {
					Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador;
//					if(x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
//						Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
//					}
//					else if(x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
//						Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
//					}
//					else {
//						Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
//					}
				}
				
				
			}
			
			
	});
	}
	
	public VerTweetAdministrador(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		this.getButtonComentar().setVisible(false);
		this.getButtonMeGusta().setVisible(false);
		this.getButtonRetweet().setVisible(false);
		
		ListaComentariosAdministrador();
		this.getImgFotoPerfilTweet().addClickListener(event -> VerPerfilAdministrador()); 
		this.getButtonBorrar().addClickListener(event -> BorrarTweet());
	}
	
	
	public void BorrarTweet() {
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(Pantalla.Anterior);
		
		if(this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
			if(this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador_item) {
				ListaHashtagsAdministrador_item l = (ListaHashtagsAdministrador_item) this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador;
				Pantalla.Anterior = l._listaHashtagsAdministrador._verlistaCompletaHashtagsAdmin;
			}
			else {
				ListaHashtagsFamososAdministrador_item l = (ListaHashtagsFamososAdministrador_item) this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador;
				Pantalla.Anterior= l._listaHashtagsFamososAdministrador._administrador;
			}
		}
		else if(this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
			VerPerfilAdministrador x = this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
			
			if(x._listaUsuariosGeneralAdministrador!=null) {
				if(x._listaUsuariosGeneralAdministrador instanceof ListaUsuariosAdministrador_item) {
					ListaUsuariosAdministrador_item l = (ListaUsuariosAdministrador_item) x._listaUsuariosGeneralAdministrador;
					Pantalla.Anterior= l._listaUsuariosAdministrador._verListaCompletaUsuariosAdministrador._administrador;
				}
				else {
					ListaUsuariosFamososAdministrador_item l = (ListaUsuariosFamososAdministrador_item) x._listaUsuariosGeneralAdministrador;
					Pantalla.Anterior= l._listaUsuariosFamososAdministrador._administrador;
				}
			}
			
			else if(x._listaTweetsAdmin_item!=null) {
				if(x._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador!=null) {
					Pantalla.Anterior = x._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador;
				}
				else if(x._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador!=null) {
					Pantalla.Anterior = x._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador;
				}
			}
			
			else if(x._verTweetAdministrador!=null) {
				if(x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
					Pantalla.Anterior = x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
				}
				else if(x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
					Pantalla.Anterior = x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
				}
				else {
					Pantalla.Anterior = x._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
				}
			}
			
			else {
				if(x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
					Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
				}
				else if(x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
					Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
				}
				else {
					Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
				}
			}
			
			
		}
			

	}

	public void ListaComentariosAdministrador() {
		_listaComentariosAdministrador = new ListaComentariosAdministrador(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_listaComentariosAdministrador);
		
		ListaComentariosAdministrador_item item_tweets = new ListaComentariosAdministrador_item(_listaComentariosAdministrador,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_listaComentariosAdministrador.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void VerPerfilAdministrador() {
		
		VerPerfilAdministrador perfil = new VerPerfilAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(perfil);
		  
//		VerPerfilAdministrador perfil = new VerPerfilAdministrador(this); 
//		
//		if(_listaTweetsAdmin != null) {
//			
//			
//			
//			if(_listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador != null) {
//				
//				_listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//				_listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
//
//				
//				
//			}
//			
//			else if(_listaTweetsAdmin._listaTweetsAdmin._administrador != null) {
//				
//				
//				_listaTweetsAdmin._listaTweetsAdmin._administrador.MainView.removeAll();
//				_listaTweetsAdmin._listaTweetsAdmin._administrador.MainView.add(perfil);
//		
//			}
//			
//			
//			else {
//				
//				_listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//				_listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
//			
//			}
//		
//		
//	   }
//		
//		else {
//			
//			_verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
//
//		}
		
	}
}
	
	