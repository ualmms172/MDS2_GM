package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;

public class VerPerfilAdministrador extends VerPerfilGeneral {
	//private Button _banear;
	public ListaUsuariosGeneralAdministrador_item _listaUsuariosGeneralAdministrador;
	public ListaTweetsAdmin_item _listaTweetsAdmin_item;
	public ListaTweetsAdmin _listaTweetsAdmin; //Creado por Miguel
	public VerTweetAdministrador _verTweetAdministrador;
	public ListaComentariosAdministrador_item _listaComentariosAdministrador;
	public BanearUsuario _banearUsuario;
	
	public VerPerfilAdministrador(ListaUsuariosGeneralAdministrador_item listaUsuariosGeneralAdministrador) {
		_listaUsuariosGeneralAdministrador = listaUsuariosGeneralAdministrador; 
		
		this.getLabelNick().setText(_listaUsuariosGeneralAdministrador.u.getNick());
		this.getLabelDescripcion().setText(_listaUsuariosGeneralAdministrador.u.getDescripcion());
//		this.getLabelNumSeguidores().setText(_listaUsuariosGeneralAdministrador.u.);
//		this.getLabelNumSeguidos().setText(_listaUsuariosGeneralAdministrador.u.);
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador instanceof ListaUsuariosAdministrador) {
				ListaUsuariosAdministrador l = (ListaUsuariosAdministrador) this._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador;
				Pantalla.Anterior= l._verListaCompletaUsuariosAdministrador._administrador;
			}
			
	});
	}
	
	
	public VerPerfilAdministrador(ListaTweetsAdmin_item listaTweetsAdmin ) {
		
		_listaTweetsAdmin_item = listaTweetsAdmin; 
		
		this.getLabelNick().setText(_listaTweetsAdmin_item.t.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(_listaTweetsAdmin_item.t.getEscritoPor().getDescripcion());
//		this.getLabelNumSeguidores().setText(_listaTweetsAdmin_item.t.getEscritoPor().);
//		this.getLabelNumSeguidos().setText(_listaTweetsAdmin_item.t.getEscritoPor().);
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
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
	
	public VerPerfilAdministrador(VerTweetAdministrador verTweetAdministrador) {
		
		_verTweetAdministrador = verTweetAdministrador; 
		
		this.getLabelNick().setText(_verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(_verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor().getDescripcion());
//		this.getLabelNumSeguidores().setText(_verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor().);
//		this.getLabelNumSeguidos().setText(_verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor().);
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
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
	

	public VerPerfilAdministrador(ListaComentariosAdministrador_item listaComentariosAdministrador) {
		
		_listaComentariosAdministrador = listaComentariosAdministrador; 
		
		this.getLabelNick().setText(_listaComentariosAdministrador.c.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(_listaComentariosAdministrador.c.getEscritoPor().getDescripcion());
//		this.getLabelNumSeguidores().setText(_listaComentariosAdministrador.c.getEscritoPor().);
//		this.getLabelNumSeguidos().setText(_listaComentariosAdministrador.c.getEscritoPor().);
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
				Pantalla.Anterior=this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
			}
			else if(this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
				Pantalla.Anterior=this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
			}
			else {
				Pantalla.Anterior =this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
			}
			
	});
	}
	

	public void BanearUsuario() {
		_banearUsuario = new BanearUsuario(this);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_banearUsuario);
	}

	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listaTweetsAdmin);
		
		ListaTweetsAdmin_item item_tweets = new ListaTweetsAdmin_item(_listaTweetsAdmin,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_listaTweetsAdmin.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public VerPerfilAdministrador Recargar(Administrador log) {
		VerPerfilAdministrador vista = null;
		if(this._listaUsuariosGeneralAdministrador!=null) {
			if(this._listaUsuariosGeneralAdministrador instanceof ListaUsuariosFamososAdministrador_item) {
				ListaUsuariosFamososAdministrador list = new ListaUsuariosFamososAdministrador(log);
				((ListaUsuariosFamososAdministrador_item) _listaUsuariosGeneralAdministrador)._listaUsuariosFamososAdministrador =list;
				vista = new VerPerfilAdministrador(_listaUsuariosGeneralAdministrador);
			}
			else {
				ListaUsuariosAdministrador list = new ListaUsuariosAdministrador(((ListaUsuariosAdministrador_item) _listaUsuariosGeneralAdministrador)._listaUsuariosAdministrador._verListaCompletaUsuariosAdministrador.Recargar(log));
				((ListaUsuariosAdministrador_item) _listaUsuariosGeneralAdministrador)._listaUsuariosAdministrador=list;
				vista = new VerPerfilAdministrador(_listaUsuariosGeneralAdministrador);
			}
		}
		else if(this._listaTweetsAdmin_item!=null){
			ListaTweetsAdmin lt = _listaTweetsAdmin_item._listaTweetsAdmin;
			if(lt._verPerfilAdministrador!=null) {
				lt = new ListaTweetsAdmin(lt._verPerfilAdministrador.Recargar(log));
				vista= new VerPerfilAdministrador(_listaTweetsAdmin_item);
			}
			else if(lt._verHashtagAdministrador!=null) {
				lt = new ListaTweetsAdmin(lt._verHashtagAdministrador.Recargar(log));
				vista= new VerPerfilAdministrador(_listaTweetsAdmin_item); 
				}
			else {
				lt = new ListaTweetsAdmin(log);
				new VerPerfilAdministrador(_listaTweetsAdmin_item);
			}
		}
		else if(this._verTweetAdministrador!=null){
			vista= new VerPerfilAdministrador(this._verTweetAdministrador.Recargar(log)); 
		}
		else {
			ListaComentariosAdministrador lt = this._listaComentariosAdministrador._listaComentariosAdministrador;
			lt = new ListaComentariosAdministrador(lt._verTweetAdministrador.Recargar(log));
			vista= new VerPerfilAdministrador(_listaComentariosAdministrador);
		}
		return vista;
	}
}