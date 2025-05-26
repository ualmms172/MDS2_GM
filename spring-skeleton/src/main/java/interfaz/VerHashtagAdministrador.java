package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerHashtagAdministrador extends VerHashtagGeneral {
	public ListaHashtagsgeneralAdministrador_item _listaHashtagsgeneralAdministrador;
	public ListaTweetsAdmin _listaTweetsAdmin;
	
	public ListaTweetsAdmin_item _listaTweetsAdmin_item;
	public VerTweetAdministrador _verTweetAdministrador;

	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listaTweetsAdmin);
		
		ListaTweetsAdmin_item item_tweets = new ListaTweetsAdmin_item(_listaTweetsAdmin,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public VerHashtagAdministrador(ListaHashtagsgeneralAdministrador_item listaHashtagsgeneralAdministrador) {
		_listaHashtagsgeneralAdministrador = listaHashtagsgeneralAdministrador;
		this.getLabelHashtag().setText(_listaHashtagsgeneralAdministrador.h.getTitulo());
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador) {
				ListaHashtagsAdministrador l = (ListaHashtagsAdministrador) this._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador;
				Pantalla.Anterior = l._verlistaCompletaHashtagsAdmin._administrador;
			}
	});
	}
	
	public VerHashtagAdministrador(ListaTweetsAdmin_item listaTweetsAdmin_item) {
		_listaTweetsAdmin_item = listaTweetsAdmin_item;
		this.getLabelHashtag().setText(_listaHashtagsgeneralAdministrador.h.getTitulo());
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador!=null) {
				if(this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador!=null) {
					if(this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador_item) {
						ListaHashtagsAdministrador_item l = (ListaHashtagsAdministrador_item) this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador;
						Pantalla.Anterior = l._listaHashtagsAdministrador._verlistaCompletaHashtagsAdmin;
					}
					else {
						ListaHashtagsFamososAdministrador_item l = (ListaHashtagsFamososAdministrador_item) this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaHashtagsgeneralAdministrador;
						Pantalla.Anterior= l._listaHashtagsFamososAdministrador._administrador;
					}
				}
				else if(this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._verTweetAdministrador!=null) {
					Pantalla.Anterior= this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._verTweetAdministrador;
				}
				else {
					if(this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador!=null)
						Pantalla.Anterior= this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador;
					else if(this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador!=null)
						Pantalla.Anterior=this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador;
					else {
						Pantalla.Anterior=this._listaTweetsAdmin_item._listaTweetsAdmin._verHashtagAdministrador._listaTweetsAdmin_item._listaTweetsAdmin._administrador;
					}
				}
			}
			else if(this._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador!=null) {
				VerPerfilAdministrador x = this._listaTweetsAdmin_item._listaTweetsAdmin._verPerfilAdministrador;
				
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
	
	public VerHashtagAdministrador(VerTweetAdministrador verTweetAdministrador) {
		_verTweetAdministrador = verTweetAdministrador;
		this.getLabelHashtag().setText(_listaHashtagsgeneralAdministrador.h.getTitulo());
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
				Pantalla.Anterior=this._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
			}
			else if(this._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
				Pantalla.Anterior=this._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
			}
			else {
				Pantalla.Anterior=this._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
			}
			
	});
	}
	
	public VerHashtagAdministrador Recargar(Administrador log) {
		VerHashtagAdministrador vista = null;
		if(this._listaHashtagsgeneralAdministrador!=null) {
			if(this._listaHashtagsgeneralAdministrador instanceof ListaHashtagsFamososAdministrador_item) {
				ListaHashtagsFamososAdministrador list = new ListaHashtagsFamososAdministrador(log);
				((ListaHashtagsFamososAdministrador_item) _listaHashtagsgeneralAdministrador)._listaHashtagsFamososAdministrador =list;
				vista = new VerHashtagAdministrador(_listaHashtagsgeneralAdministrador);
			}
			else {
				ListaHashtagsAdministrador list = new ListaHashtagsAdministrador(((ListaHashtagsAdministrador_item) _listaHashtagsgeneralAdministrador)._listaHashtagsAdministrador._verlistaCompletaHashtagsAdmin.Recargar(log));
				((ListaHashtagsAdministrador_item) _listaHashtagsgeneralAdministrador)._listaHashtagsAdministrador=list;
				vista = new VerHashtagAdministrador(_listaHashtagsgeneralAdministrador);
			}
		}
		else if(this._listaTweetsAdmin_item!=null){
			ListaTweetsAdmin lt = _listaTweetsAdmin_item._listaTweetsAdmin;
			if(lt._verPerfilAdministrador!=null) {
				lt = new ListaTweetsAdmin(lt._verPerfilAdministrador.Recargar(log));
				vista= new VerHashtagAdministrador(_listaTweetsAdmin_item);
			}
			else if(lt._verHashtagAdministrador!=null) {
				lt = new ListaTweetsAdmin(lt._verHashtagAdministrador.Recargar(log));
				vista= new VerHashtagAdministrador(_listaTweetsAdmin_item); 
				}
			else {
				lt = new ListaTweetsAdmin(log);
				vista =new VerHashtagAdministrador(_listaTweetsAdmin_item);
			}
		}
		else {
			vista= new VerHashtagAdministrador(this._verTweetAdministrador.Recargar(log)); 
		}
		return vista;
	}
}