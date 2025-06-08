package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerHashtagUsuarioNoRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioNoRegistrado_item _listahashtagsgeneralUsuarioNoRegistrado;
	public Listatweets _listatweets;
	
	public Listatweets_item _listatweets_item;
	public VertweetUsuarioNoRegistrado _vertweetUsuarioNoRegistrado;
	
	public VerHashtagUsuarioNoRegistrado(ListahashtagsgeneralUsuarioNoRegistrado_item listahashtagsgeneralUsuarioNoRegistrado) {
		super(listahashtagsgeneralUsuarioNoRegistrado);
		_listahashtagsgeneralUsuarioNoRegistrado = listahashtagsgeneralUsuarioNoRegistrado;
		
		Listatweets();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listahashtagsgeneralUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado instanceof ListaHashtagsUsuarioNoRegistrado) {
				ListaHashtagsUsuarioNoRegistrado l = (ListaHashtagsUsuarioNoRegistrado) this._listahashtagsgeneralUsuarioNoRegistrado._listahashtagsgeneralUsuarioNoRegistrado;
				Pantalla.Anterior = l._verlistacompletahashtags._usuarioNoRegistrado;
			}
	});
		
	}
	
	public VerHashtagUsuarioNoRegistrado(Listatweets_item listatweets_item) {
		super(listatweets_item);
		
		_listatweets_item = listatweets_item;

		
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
	
	public VerHashtagUsuarioNoRegistrado(VertweetUsuarioNoRegistrado vertweetUsuarioNoRegistrado) {
		super(vertweetUsuarioNoRegistrado);
		
		_vertweetUsuarioNoRegistrado = vertweetUsuarioNoRegistrado;
		
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
	
	

	public void Listatweets() {
		_listatweets = new Listatweets(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listatweets);
		

	}
}