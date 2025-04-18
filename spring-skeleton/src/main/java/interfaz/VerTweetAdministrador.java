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
				if(this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador) {
					ListaHashtagsAdministrador l = (ListaHashtagsAdministrador) this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador;
					Pantalla.Anterior = l._verlistaCompletaHashtagsAdmin;
				}
			}
			else if(this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
				VerPerfilAdministrador x = this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
				
				if(x._listaUsuariosGeneralAdministrador!=null) {
					if(x._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador instanceof ListaUsuariosAdministrador) {
						ListaUsuariosAdministrador l = (ListaUsuariosAdministrador) x._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador;
						Pantalla.Anterior= l._verListaCompletaUsuariosAdministrador._administrador;
					}
					else {
						ListaUsuariosFamososAdministrador l = (ListaUsuariosFamososAdministrador) x._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador;
						Pantalla.Anterior= l._administrador;
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
			if(this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador) {
				ListaHashtagsAdministrador l = (ListaHashtagsAdministrador) this._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador;
				Pantalla.Anterior = l._verlistaCompletaHashtagsAdmin;
			}
		}
		else if(this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
			VerPerfilAdministrador x = this._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
			
			if(x._listaUsuariosGeneralAdministrador!=null) {
				if(x._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador instanceof ListaUsuariosAdministrador) {
					ListaUsuariosAdministrador l = (ListaUsuariosAdministrador) x._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador;
					Pantalla.Anterior= l._verListaCompletaUsuariosAdministrador._administrador;
				}
				else {
					ListaUsuariosFamososAdministrador l = (ListaUsuariosFamososAdministrador) x._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador;
					Pantalla.Anterior= l._administrador;
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
		
		ListaComentariosAdministrador_item item_tweets = new ListaComentariosAdministrador_item(_listaComentariosAdministrador);
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
	
	