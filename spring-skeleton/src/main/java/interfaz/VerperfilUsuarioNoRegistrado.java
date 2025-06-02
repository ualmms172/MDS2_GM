package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerperfilUsuarioNoRegistrado extends VerPerfilGeneral {
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public ListaComentariosUsuarioNoRegistrado_item _listaComentariosUsuarioNoRegistrado;
	public ListaUsuariosGeneralUsuarioNoRegistrado_item _listaUsuariosGeneralUsuarioNoRegistrado;
	public Listatweets_item _listatweets_item;
	public Listatweets _listatweets;
	
	public boolean mencion;

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listatweets);
		
//		Listatweets_item item_tweets = new Listatweets_item(_listatweets,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_listatweets.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public VerperfilUsuarioNoRegistrado(VertweetUsuarioNoRegistrado vertweetUsuarioNoRegistrado,Boolean mencion) {
		super();
		
		_vertweetUsuarioNoRegistrado = vertweetUsuarioNoRegistrado;
		this.mencion=mencion;
		basededatos.UsuarioRegistrado user =null;
		
		if(mencion) {
			 user = _vertweetUsuarioNoRegistrado._listatweets.t.getMencionaA();
		}
		else {
			user = _vertweetUsuarioNoRegistrado._listatweets.t.getEscritoPor();
		}
		
		this.getLabelNick().setText(user.getNick());
		this.getLabelDescripcion().setText(user.getDescripcion());
		this.getLabelNumSeguidores().setText(String.valueOf(user.seguidoPor.size()));
		this.getLabelNumSeguidos().setText(String.valueOf(user.sigueA.size()));
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		Listatweets();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
				Pantalla.Anterior=this._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado;
			}
			else if(this._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
				Pantalla.Anterior=this._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado;
			}
//			else {
//				Pantalla.Anterior=this._vertweetUsuarioNoRegistrado._listatweets._listatweets._usuarioNoRegistrado;
//			}
			
	});
	}
	
	
	public VerperfilUsuarioNoRegistrado(ListaComentariosUsuarioNoRegistrado_item listaComentariosUsuarioNoRegistrado) {
		super();
		_listaComentariosUsuarioNoRegistrado = listaComentariosUsuarioNoRegistrado;
		
		this.getLabelNick().setText(_listaComentariosUsuarioNoRegistrado.c.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(_listaComentariosUsuarioNoRegistrado.c.getEscritoPor().getDescripcion());
//		this.getLabelNumSeguidores().setText(_listaComentariosUsuarioNoRegistrado.c.getEscritoPor().);
//		this.getLabelNumSeguidos().setText(_listaComentariosUsuarioNoRegistrado.c.getEscritoPor().);
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
	
		Listatweets();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado!=null) {
				Pantalla.Anterior=this._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verperfilUsuarioNoRegistrado;
			}
			else if(this._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado!=null) {
				Pantalla.Anterior=this._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._verHashtagUsuarioNoRegistrado;
			}
//			else {
//				Pantalla.Anterior =this._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado._listatweets._listatweets._usuarioNoRegistrado;
//			}
			
	});
	}
	
	public VerperfilUsuarioNoRegistrado(ListaUsuariosGeneralUsuarioNoRegistrado_item listaUsuariosGeneralUsuarioNoRegistrado) {
		super();
		_listaUsuariosGeneralUsuarioNoRegistrado = listaUsuariosGeneralUsuarioNoRegistrado; 
		
		this.getLabelNick().setText(_listaUsuariosGeneralUsuarioNoRegistrado.u.getNick());
		this.getLabelDescripcion().setText(_listaUsuariosGeneralUsuarioNoRegistrado.u.getDescripcion());
//		this.getLabelNumSeguidores().setText(_listaUsuariosGeneralUsuarioNoRegistrado.u.);
//		this.getLabelNumSeguidos().setText(_listaUsuariosGeneralUsuarioNoRegistrado.u.);
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		Listatweets();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaUsuariosGeneralUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado instanceof ListaUsuariosUsuarionoRegistrado) {
				ListaUsuariosUsuarionoRegistrado l = (ListaUsuariosUsuarionoRegistrado) this._listaUsuariosGeneralUsuarioNoRegistrado._listaUsuariosGeneralUsuarioNoRegistrado;
				Pantalla.Anterior= l._verListaCompletaUsuariosUsuarioNoRegistrado._usuarioNoRegistrado;
			}
			
	});
	}
	
	public VerperfilUsuarioNoRegistrado(Listatweets_item listatweets,Boolean mencion) {
		super();
		_listatweets_item = listatweets; 
		this.mencion=mencion;
		
		basededatos.UsuarioRegistrado user =null;
		
		if(mencion) {
			 user = _listatweets_item.t.getMencionaA();
		}
		else {
			user = _listatweets_item.t.getEscritoPor();
		}
		
		this.getLabelNick().setText(user.getNick());
		this.getLabelDescripcion().setText(user.getDescripcion());
		this.getLabelNumSeguidores().setText(String.valueOf(user.seguidoPor.size()));
		this.getLabelNumSeguidos().setText(String.valueOf(user.sigueA.size()));
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getButtonBanear().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		Listatweets();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado!=null) {
				if(this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado!=null) {
					if(this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado instanceof ListaHashtagsUsuarioNoRegistrado_item) {
						ListaHashtagsUsuarioNoRegistrado_item l = (ListaHashtagsUsuarioNoRegistrado_item) this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
						Pantalla.Anterior = l._listaHashtagsUsuarioNoRegistrado._verlistacompletahashtags;
					}
					else {
						ListahashtagsfamososUsuarioNoRegistrado_item l = (ListahashtagsfamososUsuarioNoRegistrado_item) this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
						Pantalla.Anterior= l._listahashtagsfamososUsuarioNoRegistrado._usuarioNoRegistrado;
					}
				}
				else if(this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._vertweetUsuarioNoRegistrado!=null) {
					Pantalla.Anterior= this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._vertweetUsuarioNoRegistrado;
				}
				else {
					if(this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verperfilUsuarioNoRegistrado!=null)
						Pantalla.Anterior= this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verperfilUsuarioNoRegistrado;
					else if(this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado!=null)
						Pantalla.Anterior=this._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado._listatweets_item._listatweets._verHashtagUsuarioNoRegistrado;
//					else {
//						Pantalla.Anterior=this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
//					}
				}
			}
			else if(this._listatweets_item._listatweets._verperfilUsuarioNoRegistrado!=null) {
				VerperfilUsuarioNoRegistrado x = this._listatweets_item._listatweets._verperfilUsuarioNoRegistrado;
				
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
	
	
	
}