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
    
	public VertweetgeneralUsuarioRegistrado (VerperfilgeneralUsuarioRegistrado verperfilUsuarioRegistrado ) {
		
		_verperfilUsuarioRegistrado = verperfilUsuarioRegistrado; 
		this.getButtonBorrar().setVisible(false);
		
		ComentariosUsuarioRegistrado();
		this.getButtonComentar().addClickListener(event -> Comentar());
		this.getButtonRetweet().addClickListener(event -> Retweetear());
		this.getImgFotoPerfilTweet().addClickListener(event ->VerperfilUsuarioRegistrado());
	}
	
	
	public VertweetgeneralUsuarioRegistrado (MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado_item ) {
		
		_mostrartweetspropiosUsuarioRegistrado = mostrartweetspropiosUsuarioRegistrado_item; 
		this.getButtonBorrar().setVisible(false);
	
		ComentariosUsuarioRegistrado();
		this.getButtonComentar().addClickListener(event -> Comentar());
		this.getButtonRetweet().addClickListener(event -> Retweetear());
		this.getImgFotoPerfilTweet().addClickListener(event ->VerperfilUsuarioRegistrado());
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagsUsuarioRegistrado) {
					ListahashtagsUsuarioRegistrado l = (ListahashtagsUsuarioRegistrado) this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
					Pantalla.Anterior = l._verlistacompletahashtagUsuarioRegistrado;
				}
			}
			else if(this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				VerperfilgeneralUsuarioRegistrado x = this._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
				
				if(x._listaUsuariosGeneralUsuarioRegistrado!=null) {
					if(x._listaUsuariosGeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado instanceof ListausuariosUsuarioRegistrado) {
						ListausuariosUsuarioRegistrado l = (ListausuariosUsuarioRegistrado) x._listaUsuariosGeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado;
						Pantalla.Anterior= l._verlistacompletausuariosUsuarioRegistrado._usuarioregistrado;
					}
					else {
						ListausuariosfamososUsuarioRegistrado l = (ListausuariosfamososUsuarioRegistrado) x._listaUsuariosGeneralUsuarioRegistrado._listaUsuariosGeneralUsuarioRegistrado;
						Pantalla.Anterior= l._usuarioregistrado;
					}
				}
				
				else if(x._mostrartweetsUsuarioRegistrado_item!=null) {
					if(x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					}
					else if(x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					}
				}
				
				else if(x._vertweetgeneralUsuarioRegistrado!=null) {
					if(x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					}
					else if(x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					}
					else {
						Pantalla.Anterior = x._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
					}
				}
				
				else {
					if(x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					}
					else if(x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
						Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					}
					else {
						Pantalla.Anterior = x._comentariosUsuarioRegistrado._comentariospropios._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
					}
				}
				
				
			}
			
			
	});
	}
	

	public void ComentariosUsuarioRegistrado() {
		_comentariosUsuarioRegistrado = new Comentariospropios(this);
		this.getVaadinVerticalLayout().as(VerticalLayout.class).add(_comentariosUsuarioRegistrado);
		
		Comentariospropios_item item_tweets = new Comentariospropios_item(_comentariosUsuarioRegistrado);
		_comentariosUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}

	public void Comentar() {
		
		_comentar = new Comentar(this);
	//	Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_comentar);
	}

	public void VerperfilUsuarioRegistrado() {
		_verperfilUsuarioRegistrado = new VerperfilgeneralUsuarioRegistrado(this);
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
}