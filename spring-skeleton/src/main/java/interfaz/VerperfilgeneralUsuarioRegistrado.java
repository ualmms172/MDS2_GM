package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerperfilgeneralUsuarioRegistrado extends VerPerfilGeneral {
	
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetsUsuarioRegistrado_item;
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	public Comentariospropios_item _comentariosUsuarioRegistrado;
	
	public boolean mencion;
	
	public VerperfilgeneralUsuarioRegistrado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,Boolean mencion) {
		
		_mostrartweetsUsuarioRegistrado_item = mostrartweetsUsuarioRegistrado; 
		
		basededatos.UsuarioRegistrado user =null;
		this.mencion=mencion;
		
		if(mencion) {
			 user = _mostrartweetsUsuarioRegistrado_item.t.getMencionaA();
		}
		else {
			user = _mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
		}
		
		this.getLabelNick().setText(user.getNick());
		this.getLabelDescripcion().setText(user.getDescripcion());
		this.getLabelNumSeguidores().setText(String.valueOf(user.seguidoPor.size()));
		this.getLabelNumSeguidos().setText(String.valueOf(user.sigueA.size()));
		
		
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado!=null) {
					if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagsUsuarioRegistrado_item) {
						ListahashtagsUsuarioRegistrado_item l = (ListahashtagsUsuarioRegistrado_item) this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
						Pantalla.Anterior = l._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado;
					}
					else {
						ListahashtagfamososUsuarioRegistrado_item l = (ListahashtagfamososUsuarioRegistrado_item) this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
						Pantalla.Anterior= l._listahashtagfamososUsuarioRegistrado._usuarioregistrado;
					}
				}
				else if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado!=null) {
					Pantalla.Anterior= this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado;
				}
				else {
					if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null)
						Pantalla.Anterior= this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					else if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null)
						Pantalla.Anterior=this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					else {
						Pantalla.Anterior=this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
					}
				}
			}
			else if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				VerperfilgeneralUsuarioRegistrado x = this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
				
				if(x._listaUsuariosGeneralUsuarioRegistrado!=null) {
					if(x._listaUsuariosGeneralUsuarioRegistrado instanceof ListausuariosUsuarioRegistrado_item) {
						ListausuariosUsuarioRegistrado_item l = (ListausuariosUsuarioRegistrado_item) x._listaUsuariosGeneralUsuarioRegistrado;
						Pantalla.Anterior= l._listausuariosUsuarioRegistrado._verlistacompletausuariosUsuarioRegistrado._usuarioregistrado;
					}
					else {
						ListausuariosfamososUsuarioRegistrado_item l = (ListausuariosfamososUsuarioRegistrado_item) x._listaUsuariosGeneralUsuarioRegistrado;
						Pantalla.Anterior= l._listausuariosfamososUsuarioRegistrado._usuarioregistrado;
					}
				}
				
				else if(x._mostrartweetsUsuarioRegistrado_item!=null) {
					if(x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					}
					else if(x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					}
					else {
						Pantalla.Anterior = x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
					}
				}
				
				else if(x._vertweetgeneralUsuarioRegistrado!=null) {
					Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado;
//					if(x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
//						Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
//					}
//					else if(x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
//						Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
//					}
//					else {
//						Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
//					}
				}
				
				else if(x._comentariosUsuarioRegistrado!=null){
					Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado;
//					if(x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
//						Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
//					}
//					else if(x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
//						Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
//					}
//					else {
//						Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
//					}
				}
				else {
					Verperfilpropio l = (Verperfilpropio) x;
					Pantalla.Anterior= l._usuarioregistrado;
				}
				
				
			}
			
			
	});
	}
	
	
	public VerperfilgeneralUsuarioRegistrado (ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		
		_listaUsuariosGeneralUsuarioRegistrado = listaUsuariosGeneralUsuarioRegistrado; 
		
		this.getLabelNick().setText(_listaUsuariosGeneralUsuarioRegistrado.u.getNick());
		this.getLabelDescripcion().setText(_listaUsuariosGeneralUsuarioRegistrado.u.getDescripcion());
//		this.getLabelNumSeguidores().setText(listaUsuariosGeneralUsuarioRegistrado.u.);
//		this.getLabelNumSeguidos().setText(listaUsuariosGeneralUsuarioRegistrado.u.);
		
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaUsuariosGeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado instanceof ListausuariosUsuarioRegistrado) {
				ListausuariosUsuarioRegistrado l = (ListausuariosUsuarioRegistrado) this._listaUsuariosGeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado;
				Pantalla.Anterior= l._verlistacompletausuariosUsuarioRegistrado._usuarioregistrado;
			}
			
	});
	}
	
	public VerperfilgeneralUsuarioRegistrado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado,Boolean mencion) {
		
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		this.mencion=mencion;
		
		basededatos.UsuarioRegistrado user =null;
		
		if(mencion) {
			 user = _vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
		}
		else {
			user = _vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
		}
		
		this.getLabelNick().setText(user.getNick());
		this.getLabelDescripcion().setText(user.getDescripcion());
		this.getLabelNumSeguidores().setText(String.valueOf(user.seguidoPor.size()));
		this.getLabelNumSeguidos().setText(String.valueOf(user.sigueA.size()));
		
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				Pantalla.Anterior=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
			}
			else if(this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				Pantalla.Anterior=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
			}
			else {
				Pantalla.Anterior = this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
			}
			
	});
	}
	
	public VerperfilgeneralUsuarioRegistrado(Comentariospropios_item comentariosUsuarioRegistrado ) {
		
		
		_comentariosUsuarioRegistrado = comentariosUsuarioRegistrado; 
		
		this.getLabelNick().setText(_comentariosUsuarioRegistrado.c.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(_comentariosUsuarioRegistrado.c.getEscritoPor().getDescripcion());
//		this.getLabelNumSeguidores().setText(_comentariosUsuarioRegistrado.c.getEscritoPor().);
//		this.getLabelNumSeguidos().setText(_comentariosUsuarioRegistrado.c.getEscritoPor().);
		
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			
			if(this._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				Pantalla.Anterior=this._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
			}
			else if(this._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				Pantalla.Anterior=this._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
			}
			else {
				Pantalla.Anterior = this._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
			}
			
	});
	}
	
	public VerperfilgeneralUsuarioRegistrado() {
		
	}
	


	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		
//		MostrartweetsUsuarioRegistrado_item item_tweets = new MostrartweetsUsuarioRegistrado_item(_mostrartweetsUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_mostrartweetsUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
	
	public VerperfilgeneralUsuarioRegistrado Recargar(UsuarioRegistrado log) {
	    VerperfilgeneralUsuarioRegistrado vista = null;

	    if (this._listaUsuariosGeneralUsuarioRegistrado != null) {
	        if (this._listaUsuariosGeneralUsuarioRegistrado instanceof ListausuariosfamososUsuarioRegistrado_item) {
	            ListausuariosfamososUsuarioRegistrado list = new ListausuariosfamososUsuarioRegistrado(log);
	            ((ListausuariosfamososUsuarioRegistrado_item) _listaUsuariosGeneralUsuarioRegistrado)._listausuariosfamososUsuarioRegistrado = list;
	            
	            if (this instanceof Verperfilpropio) {
	                vista = new Verperfilpropio(_listaUsuariosGeneralUsuarioRegistrado);
	            } else if (this instanceof Verperfilbloqueado) {
	                vista = new Verperfilbloqueado(_listaUsuariosGeneralUsuarioRegistrado);
	            } else if (this instanceof Verperfilnobloqueado) {
	                vista = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
	            } else {
	                vista = new VerperfilgeneralUsuarioRegistrado(_listaUsuariosGeneralUsuarioRegistrado);
	            }
	        } else {
	            ListausuariosUsuarioRegistrado list = new ListausuariosUsuarioRegistrado(
	                ((ListausuariosUsuarioRegistrado_item) _listaUsuariosGeneralUsuarioRegistrado)._listausuariosUsuarioRegistrado._verlistacompletausuariosUsuarioRegistrado.Recargar(log)
	            );
	            ((ListausuariosUsuarioRegistrado_item) _listaUsuariosGeneralUsuarioRegistrado)._listausuariosUsuarioRegistrado = list;
	            
	            if (this instanceof Verperfilpropio) {
	                vista = new Verperfilpropio(_listaUsuariosGeneralUsuarioRegistrado);
	            } else if (this instanceof Verperfilbloqueado) {
	                vista = new Verperfilbloqueado(_listaUsuariosGeneralUsuarioRegistrado);
	            } else if (this instanceof Verperfilnobloqueado) {
	                vista = new Verperfilnobloqueado(_listaUsuariosGeneralUsuarioRegistrado);
	            } else {
	                vista = new VerperfilgeneralUsuarioRegistrado(_listaUsuariosGeneralUsuarioRegistrado);
	            }
	        }
	    } else if (this._mostrartweetsUsuarioRegistrado_item != null) {
	        MostrartweetspropiosUsuarioRegistrado lt = _mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado;
	        
	        if (lt._verperfilgeneralUsuarioRegistrado != null) {
	            lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
	        } else if (lt._verHashtagUsuarioRegistrado != null) {
	            lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
	        } else {
	            lt = new MostrartweetspropiosUsuarioRegistrado(log);
	        }

	        _mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado = lt;

	        if (this instanceof Verperfilpropio) {
	            vista = new Verperfilpropio(_mostrartweetsUsuarioRegistrado_item,mencion);
	        } else if (this instanceof Verperfilbloqueado) {
	            vista = new Verperfilbloqueado(_mostrartweetsUsuarioRegistrado_item,mencion);
	        } else if (this instanceof Verperfilnobloqueado) {
	            vista = new Verperfilnobloqueado(_mostrartweetsUsuarioRegistrado_item,mencion);
	        } else {
	            vista = new VerperfilgeneralUsuarioRegistrado(_mostrartweetsUsuarioRegistrado_item,mencion);
	        }
	    } else {
	        VertweetgeneralUsuarioRegistrado recargado = this._vertweetgeneralUsuarioRegistrado.Recargar(log);

	        if (this instanceof Verperfilpropio) {
	            vista = new Verperfilpropio(recargado,mencion);
	        } else if (this instanceof Verperfilbloqueado) {
	            vista = new Verperfilbloqueado(recargado,mencion);
	        } else if (this instanceof Verperfilnobloqueado) {
	            vista = new Verperfilnobloqueado(recargado,mencion);
	        } else {
	            vista = new VerperfilgeneralUsuarioRegistrado(recargado,mencion);
	        }
	    }

	    return vista;
	}

}