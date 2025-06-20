package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.TweetDAO;
import basededatos.UsuarioRegistradoDAO;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class VerperfilgeneralUsuarioRegistrado extends VerPerfilGeneral {
	
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetsUsuarioRegistrado_item;
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	public Comentariospropios_item _comentariosUsuarioRegistrado;
	
	
	public VerperfilgeneralUsuarioRegistrado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,Boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		_mostrartweetsUsuarioRegistrado_item = mostrartweetsUsuarioRegistrado; 
		
		
		
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

				}
				
				else if(x._comentariosUsuarioRegistrado!=null){
					Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado;

				}
				else {
					Verperfilpropio l = (Verperfilpropio) x;
					Pantalla.Anterior= l._usuarioregistrado;
				}
				
				
			}
			
			
	});
	}
	
	
	public VerperfilgeneralUsuarioRegistrado (ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		_listaUsuariosGeneralUsuarioRegistrado = listaUsuariosGeneralUsuarioRegistrado; 
		

		
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
		super(vertweetgeneralUsuarioRegistrado,mencion);
		
		_vertweetgeneralUsuarioRegistrado = vertweetgeneralUsuarioRegistrado; 
		
		
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
		super(comentariosUsuarioRegistrado);
		
		_comentariosUsuarioRegistrado = comentariosUsuarioRegistrado; 
		
		
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
	
	public VerperfilgeneralUsuarioRegistrado(UsuarioRegistrado usuarioregistrado) {
		super(usuarioregistrado); //Es llamado desde VerperfilPropio(UsuarioRegistrado)
	}
	


	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		

	}
	
	public VerperfilgeneralUsuarioRegistrado Recargar(UsuarioRegistrado log) {
	    VerperfilgeneralUsuarioRegistrado vista = null;

	    if (this._listaUsuariosGeneralUsuarioRegistrado != null) {
	    	basededatos.UsuarioRegistrado u = Interfaz.ur._iUsuarioregistrado.ObtenerUsuarioId(_listaUsuariosGeneralUsuarioRegistrado.u);

	        if (this._listaUsuariosGeneralUsuarioRegistrado instanceof ListausuariosfamososUsuarioRegistrado_item) {
	            ListausuariosfamososUsuarioRegistrado list = new ListausuariosfamososUsuarioRegistrado(log);
	            ListausuariosfamososUsuarioRegistrado_item item = new ListausuariosfamososUsuarioRegistrado_item(list,u);
	            
	            if (this instanceof Verperfilpropio) {
	                vista = new Verperfilpropio(item);
	            } else if (this instanceof Verperfilbloqueado) {
	                vista = new Verperfilbloqueado(item);
	            } else if (this instanceof Verperfilnobloqueado) {
	                vista = new Verperfilnobloqueado(item);
	            } else {
	                vista = new VerperfilgeneralUsuarioRegistrado(item); //Aunque este no se deberia hace nunca
	            }
	        } else {
	            ListausuariosUsuarioRegistrado list = new ListausuariosUsuarioRegistrado(
	                ((ListausuariosUsuarioRegistrado_item) _listaUsuariosGeneralUsuarioRegistrado)._listausuariosUsuarioRegistrado._verlistacompletausuariosUsuarioRegistrado.Recargar(log)
	            );
	            ListausuariosUsuarioRegistrado_item item = new ListausuariosUsuarioRegistrado_item(list,u);
	            
	            if (this instanceof Verperfilpropio) {
	                vista = new Verperfilpropio(item);
	            } else if (this instanceof Verperfilbloqueado) {
	                vista = new Verperfilbloqueado(item);
	            } else if (this instanceof Verperfilnobloqueado) {
	                vista = new Verperfilnobloqueado(item);
	            } else {
	                vista = new VerperfilgeneralUsuarioRegistrado(item);//Aunque este no se deberia hace nunca
	            }
	        }
	    } else if (this._mostrartweetsUsuarioRegistrado_item != null) {
	        MostrartweetspropiosUsuarioRegistrado lt = _mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado;
	        basededatos.Tweet t = Interfaz.ur._iUsuarioregistrado.ObtenerTweetId(_mostrartweetsUsuarioRegistrado_item.t);

	        if (lt._verperfilgeneralUsuarioRegistrado != null) {
	            lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
	        } else if (lt._verHashtagUsuarioRegistrado != null) {
	            lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
	        } else {
	            lt = new MostrartweetspropiosUsuarioRegistrado(log);
	        }

	        MostrartweetspropiosUsuarioRegistrado_item item = new MostrartweetspropiosUsuarioRegistrado_item(lt,t);


	        if (this instanceof Verperfilpropio) {
	            vista = new Verperfilpropio(item,mencion);
	        } else if (this instanceof Verperfilbloqueado) {
	            vista = new Verperfilbloqueado(item,mencion);
	        } else if (this instanceof Verperfilnobloqueado) {
	            vista = new Verperfilnobloqueado(item,mencion);
	        } else {
	            vista = new VerperfilgeneralUsuarioRegistrado(item,mencion);
	        }
	    } else if(_vertweetgeneralUsuarioRegistrado!=null){
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
	    else if(this._comentariosUsuarioRegistrado!=null) {
	    	
	    	Comentariospropios lt = _comentariosUsuarioRegistrado._comentariospropios;
	    	
	    	lt = new Comentariospropios(lt._vertweetgeneralUsuarioRegistrado.Recargar(log));
	    	
	    	if(_comentariosUsuarioRegistrado instanceof ComentariosUsuarioRegistrado_item) {
	    		ComentariosUsuarioRegistrado_item item = new ComentariosUsuarioRegistrado_item(lt,_comentariosUsuarioRegistrado.c);
	    		vista = new Verperfilnobloqueado(item);
	    	}
	    	else {
	    		Comentariospropios_item item = new Comentariospropios_item(lt,_comentariosUsuarioRegistrado.c);
	    		vista = new Verperfilpropio(item);
	    	}
	    }
	    else {
	    	vista = new Verperfilpropio(log);
	    }

	    return vista;
	}

}