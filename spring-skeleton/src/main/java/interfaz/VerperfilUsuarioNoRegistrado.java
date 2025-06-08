package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerperfilUsuarioNoRegistrado extends VerPerfilGeneral {
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	public ListaComentariosUsuarioNoRegistrado_item _listaComentariosUsuarioNoRegistrado;
	public ListaUsuariosGeneralUsuarioNoRegistrado_item _listaUsuariosGeneralUsuarioNoRegistrado;
	public Listatweets_item _listatweets_item;
	public Listatweets _listatweets;
	

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listatweets);
	}
	
	public VerperfilUsuarioNoRegistrado(VertweetUsuarioNoRegistrado vertweetUsuarioNoRegistrado,Boolean mencion) {
		super(vertweetUsuarioNoRegistrado,mencion);
		
		_vertweetUsuarioNoRegistrado = vertweetUsuarioNoRegistrado;
		

		
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
			
	});
	}
	
	
	public VerperfilUsuarioNoRegistrado(ListaComentariosUsuarioNoRegistrado_item listaComentariosUsuarioNoRegistrado) {
		super(listaComentariosUsuarioNoRegistrado);
		_listaComentariosUsuarioNoRegistrado = listaComentariosUsuarioNoRegistrado;
		
		
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
			
	});
	}
	
	public VerperfilUsuarioNoRegistrado(ListaUsuariosGeneralUsuarioNoRegistrado_item listaUsuariosGeneralUsuarioNoRegistrado) {
		super(listaUsuariosGeneralUsuarioNoRegistrado);
		_listaUsuariosGeneralUsuarioNoRegistrado = listaUsuariosGeneralUsuarioNoRegistrado; 
		
		
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
		super(listatweets,mencion);
		_listatweets_item = listatweets; 
		

		
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

				}
				
				else {
					Pantalla.Anterior = x._listaComentariosUsuarioNoRegistrado._listaComentariosUsuarioNoRegistrado._vertweetUsuarioNoRegistrado;

				}
				
				
			}
			
			
	});
	}
	
	
	
}