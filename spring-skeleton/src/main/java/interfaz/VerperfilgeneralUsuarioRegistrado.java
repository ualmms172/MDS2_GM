package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerperfilgeneralUsuarioRegistrado extends VerPerfilGeneral {
	
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetsUsuarioRegistrado_item;
	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
	public Comentariospropios_item _comentariosUsuarioRegistrado;
	
	public VerperfilgeneralUsuarioRegistrado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado) {
		
		_mostrartweetsUsuarioRegistrado_item = mostrartweetsUsuarioRegistrado; 
		this.getButtonBanear().setVisible(false);
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				if(this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagsUsuarioRegistrado_item) {
					ListahashtagsUsuarioRegistrado_item l = (ListahashtagsUsuarioRegistrado_item) this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
					Pantalla.Anterior = l._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado;
				}
				else {
					ListahashtagfamososUsuarioRegistrado_item l = (ListahashtagfamososUsuarioRegistrado_item) this._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
					Pantalla.Anterior= l._listahashtagfamososUsuarioRegistrado._usuarioregistrado;
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
	
	public VerperfilgeneralUsuarioRegistrado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado ) {
		
		
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
	
	public VerperfilgeneralUsuarioRegistrado() {
		
	}
	


	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		
		MostrartweetsUsuarioRegistrado_item item_tweets = new MostrartweetsUsuarioRegistrado_item(_mostrartweetsUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_mostrartweetsUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}