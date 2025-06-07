package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Contenido;
import basededatos.Tweet;
import basededatos.TweetDAO;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class VertweetgeneralUsuarioRegistrado extends VertweetGeneral {
	//private Button _comentar;
	//private Button _retweetear;
	public Comentariospropios _comentariosUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public Comentar _comentar;
	public Retweetear _retweetear;
	
	public VerHashtagUsuarioRegistrado _verHashtagUsuarioRegistrado;
    
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
		this.getImgFotoPerfilTweet().addClickListener(event ->VerperfilUsuarioRegistrado(false));
		
		Label labelOriginal = this.getLabelCuerpoTwet();

		Span[] mencion=null;
		if (_mostrartweetspropiosUsuarioRegistrado.t.getMencionaA() != null) {
		    mencion = this.Mencion();
		    Span nuevoSpan = new Span();

		    copiarEstilos(labelOriginal, nuevoSpan);

		    mencion[1].getStyle().set("color", "blue");
		    mencion[1].getStyle().set("cursor", "pointer");
		    mencion[1].getElement().addEventListener("click", e -> VerperfilUsuarioRegistrado(true));

		    nuevoSpan.add(mencion[0], mencion[1], mencion[2]);

		    this.getHorizontalLayoutCuerpoTweet().removeAll();
		    this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		}

		if (_mostrartweetspropiosUsuarioRegistrado.t.getContiene() != null) {
		    Span[] hashtag = this.Hashtag(mencion);
		    
		    if (hashtag != null) {
		        Span nuevoSpan = new Span();
		        copiarEstilos(labelOriginal, nuevoSpan);

		        // Recorremos todos los spans para aplicar estilos y listeners al hashtag y mención
		        for (Span span : hashtag) {
		            String texto = span.getText();
		            if (texto.startsWith("#")) {
		                span.getStyle().set("color", "blue");
		                span.getStyle().set("cursor", "pointer");
		                span.getElement().addEventListener("click", e -> VerHashtagUsuarioRegistrado());
		            }
		            // Si tienes una mención y quieres aplicar estilos aquí también:
		            else if (texto.startsWith("@")) {
		                span.getStyle().set("color", "blue");
		                span.getStyle().set("cursor", "pointer");
		                span.getElement().addEventListener("click", e -> VerperfilUsuarioRegistrado(true));
		            }
		        }

		        // Añadimos todos los spans en orden
		        nuevoSpan.add(hashtag);

		        this.getHorizontalLayoutCuerpoTweet().removeAll();
		        this.getHorizontalLayoutCuerpoTweet().add(nuevoSpan);
		    }
		}
		
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
		
//		Comentariospropios_item item_tweets = new Comentariospropios_item(_comentariosUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_comentariosUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void Comentar() {
		
		_comentar = new Comentar(this);
	//	Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_comentar);
	}
	
	public void VerHashtagUsuarioRegistrado() {
		_verHashtagUsuarioRegistrado= new VerHashtagUsuarioRegistrado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verHashtagUsuarioRegistrado);
	}

	public void VerperfilUsuarioRegistrado(boolean mencion) {
		basededatos.UsuarioRegistrado user = null;
		if(mencion)
			user = this._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
		else
			user = this._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
		
		if(user.getID()==Interfaz.ur.u.getID())
			_verperfilUsuarioRegistrado = new Verperfilpropio(this,mencion);
		else {
			boolean bloqueado=false;
			for(basededatos.UsuarioRegistrado usu : user.bloqueaA.toArray()) {
				if(usu.getID()==Interfaz.ur.u.getID()) {
					bloqueado = true;
					break;
				}
			}
			if(!bloqueado)
				_verperfilUsuarioRegistrado= new Verperfilnobloqueado(this,mencion);
			else
				_verperfilUsuarioRegistrado= new Verperfilbloqueado(this,mencion);
		}
		
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
	    
	    basededatos.Tweet t = Interfaz.ur._iUsuarioregistrado.ObtenerTweetId(_mostrartweetspropiosUsuarioRegistrado.t);
//		try {
//			t = TweetDAO.loadTweetByORMID(_mostrartweetspropiosUsuarioRegistrado.t.getORMID());
//		} catch (PersistentException e) {
//			e.printStackTrace(); 
//		}

	    if (lt._verperfilgeneralUsuarioRegistrado != null) {
	        lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
	        
	        //_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado = lt;

	    } else if (lt._verHashtagUsuarioRegistrado != null) {
	        lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
	        //_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado = lt;

	       
	    } else {
	        lt = new MostrartweetspropiosUsuarioRegistrado(log);
	        //_mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado = lt;

	        
	    }
	    
	    MostrartweetspropiosUsuarioRegistrado_item item = new MostrartweetspropiosUsuarioRegistrado_item(lt,t);
	    
	    if (this instanceof Vertweetpropio) {
            vista = new Vertweetpropio(item);
        } else if (this instanceof Vertweetajeno) {
            vista = new Vertweetajeno(item);
        } else {
            vista = new VertweetgeneralUsuarioRegistrado(item);
        }

	    return vista;
	}

}