package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VertweetgeneralUsuarioRegistrado extends VertweetGeneral {
	//private Button _comentar;
	//private Button _retweetear;
	public Comentariospropios _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public Comentar _comentar;
	public Retweetear _retweetear;
    
//	public VertweetgeneralUsuarioRegistrado (VerperfilgeneralUsuarioRegistrado verperfilUsuarioRegistrado ) {
//		super(null);
//		_verperfilUsuarioRegistrado = verperfilUsuarioRegistrado; 
//		this.getButtonBorrar().setVisible(false);
//		
//		this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
//		this.getlabelRetweeteadoPor().setVisible(false);
//		
//		
//		ComentariosUsuarioRegistrado();
//		this.getButtonComentar().addClickListener(event -> Comentar());
//		this.getButtonRetweet().addClickListener(event -> Retweetear());
//		this.getImgFotoPerfilTweet().addClickListener(event ->VerperfilUsuarioRegistrado());
//	}
	
	
	public VertweetgeneralUsuarioRegistrado (MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado_item ) {
		super(mostrartweetspropiosUsuarioRegistrado_item);
		
		_mostrartweetspropiosUsuarioRegistrado = mostrartweetspropiosUsuarioRegistrado_item; 
		
		
		this.getButtonBorrar().setVisible(false);
		
		this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
		this.getlabelRetweeteadoPor().setVisible(false);
	
		ComentariosUsuarioRegistrado();
		this.getButtonComentar().addClickListener(event -> Comentar());
		this.getButtonRetweet().addClickListener(event -> Retweetear());
		this.getImgFotoPerfilTweet().addClickListener(event ->VerperfilUsuarioRegistrado());
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado!=null) {
					if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagsUsuarioRegistrado_item) {
						ListahashtagsUsuarioRegistrado_item l = (ListahashtagsUsuarioRegistrado_item) this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
						Pantalla.Anterior = l._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado;
					}
					else {
						ListahashtagfamososUsuarioRegistrado_item l = (ListahashtagfamososUsuarioRegistrado_item) this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
						Pantalla.Anterior= l._listahashtagfamososUsuarioRegistrado._usuarioregistrado;
					}
				}
				else if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado!=null) {
					Pantalla.Anterior= this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado;
				}
				else {
					if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null)
						Pantalla.Anterior= this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					else if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null)
						Pantalla.Anterior=this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					else {
						Pantalla.Anterior=this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
					}
				}
			}
			else if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				VerperfilgeneralUsuarioRegistrado x = this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
				
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
				
				else if(x._comentariosUsuarioRegistrado!=null) {
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
	

	public void ComentariosUsuarioRegistrado() {
		_comentariosUsuarioRegistrado = new Comentariospropios(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_comentariosUsuarioRegistrado);
		
		Comentariospropios_item item_tweets = new Comentariospropios_item(_comentariosUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_comentariosUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void Comentar() {
		
		_comentar = new Comentar(this);
	//	Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_comentar);
	}

	public void VerperfilUsuarioRegistrado() {
		//_verperfilUsuarioRegistrado = new VerperfilgeneralUsuarioRegistrado(this);
		if(true) _verperfilUsuarioRegistrado = new Verperfilnobloqueado(this);
		else _verperfilUsuarioRegistrado= new Verperfilpropio(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}

	public void Retweetear() {
		_retweetear = new Retweetear(this);
		//Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_retweetear);
	}
	
	public VertweetgeneralUsuarioRegistrado Recargar(UsuarioRegistrado log) {
	    VertweetgeneralUsuarioRegistrado vista = null;
	    MostrartweetspropiosUsuarioRegistrado lt = this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado;

	    if (lt._verperfilgeneralUsuarioRegistrado != null) {
	        lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
	        _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado = lt;

	        if (this instanceof Vertweetpropio) {
	            vista = new Vertweetpropio(_mostrartweetspropiosUsuarioRegistrado);
	        } else if (this instanceof Vertweetajeno) {
	            vista = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
	        } else {
	            vista = new VertweetgeneralUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado);
	        }
	    } else if (lt._verHashtagUsuarioRegistrado != null) {
	        lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
	        _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado = lt;

	        if (this instanceof Vertweetpropio) {
	            vista = new Vertweetpropio(_mostrartweetspropiosUsuarioRegistrado);
	        } else if (this instanceof Vertweetajeno) {
	            vista = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
	        } else {
	            vista = new VertweetgeneralUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado);
	        }
	    } else {
	        lt = new MostrartweetspropiosUsuarioRegistrado(log);
	        _mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado = lt;

	        if (this instanceof Vertweetpropio) {
	            vista = new Vertweetpropio(_mostrartweetspropiosUsuarioRegistrado);
	        } else if (this instanceof Vertweetajeno) {
	            vista = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
	        } else {
	            vista = new VertweetgeneralUsuarioRegistrado(_mostrartweetspropiosUsuarioRegistrado);
	        }
	    }

	    return vista;
	}

}