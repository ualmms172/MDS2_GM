package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.HashtagDAO;
import basededatos.TweetDAO;
import basededatos.UsuarioRegistradoDAO;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class VerHashtagAdministrador extends VerHashtagGeneral {
	public ListaHashtagsgeneralAdministrador_item _listaHashtagsgeneralAdministrador;
	public ListaTweetsAdmin _listaTweetsAdmin;
	
	public ListaTweetsAdmin_item _listaTweetsAdmin_item;
	public VerTweetAdministrador _verTweetAdministrador;

	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_listaTweetsAdmin);

	}
	
	public VerHashtagAdministrador(ListaHashtagsgeneralAdministrador_item listaHashtagsgeneralAdministrador) {
		super(listaHashtagsgeneralAdministrador);
		_listaHashtagsgeneralAdministrador = listaHashtagsgeneralAdministrador;
		
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador instanceof ListaHashtagsAdministrador) {
				ListaHashtagsAdministrador l = (ListaHashtagsAdministrador) this._listaHashtagsgeneralAdministrador._listaHashtagsgeneralAdministrador;
				Pantalla.Anterior = l._verlistaCompletaHashtagsAdmin._administrador;
			}
	});
	}
	
	public VerHashtagAdministrador(ListaTweetsAdmin_item listaTweetsAdmin_item) {
		super(listaTweetsAdmin_item);
		_listaTweetsAdmin_item = listaTweetsAdmin_item;
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

				}
				
				else {
					Pantalla.Anterior = x._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador;

				}
				
				
			}
			
			
	});
	}
	
	public VerHashtagAdministrador(VerTweetAdministrador verTweetAdministrador) {
		super(verTweetAdministrador);
		_verTweetAdministrador = verTweetAdministrador;
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
	
	public VerHashtagAdministrador Recargar(Administrador log) {
		VerHashtagAdministrador vista = null;
		
		if(this._listaHashtagsgeneralAdministrador!=null) {
			basededatos.Hashtag h = Interfaz.ad._iadministrador.ObtenerHashtagId(_listaHashtagsgeneralAdministrador.h);

			
			if(this._listaHashtagsgeneralAdministrador instanceof ListaHashtagsFamososAdministrador_item) {
				ListaHashtagsFamososAdministrador list = new ListaHashtagsFamososAdministrador(log);
				
				ListaHashtagsFamososAdministrador_item item = new ListaHashtagsFamososAdministrador_item(list,h);
				vista = new VerHashtagAdministrador(item);
			}
			else {
				ListaHashtagsAdministrador list = new ListaHashtagsAdministrador(((ListaHashtagsAdministrador_item) _listaHashtagsgeneralAdministrador)._listaHashtagsAdministrador._verlistaCompletaHashtagsAdmin.Recargar(log));
				ListaHashtagsFamososAdministrador_item item = new ListaHashtagsFamososAdministrador_item(list,h);
				vista = new VerHashtagAdministrador(item);
			}
		}
		else if(this._listaTweetsAdmin_item!=null){
			ListaTweetsAdmin lt = _listaTweetsAdmin_item._listaTweetsAdmin;
			basededatos.Tweet t = Interfaz.ad._iadministrador.ObtenerTweetId(_listaTweetsAdmin_item.t);
			if(t==null) _listaTweetsAdmin_item.eliminado=true;
			
			if(lt._verPerfilAdministrador!=null) {
				lt = new ListaTweetsAdmin(lt._verPerfilAdministrador.Recargar(log));
			}
			else if(lt._verHashtagAdministrador!=null) {
				lt = new ListaTweetsAdmin(lt._verHashtagAdministrador.Recargar(log));
				}
			else {
				lt = new ListaTweetsAdmin(log);
			}
			if(_listaTweetsAdmin_item.eliminado) {
				_listaTweetsAdmin_item._listaTweetsAdmin=lt; //En caso de que el tweet original se haya eliminado usamos el mismo item para poder seguir haciendo las referencias a donde estemos
				vista =new VerHashtagAdministrador(_listaTweetsAdmin_item);
			}
			else {
				ListaTweetsAdmin_item item = new ListaTweetsAdmin_item(lt,t);
				vista =new VerHashtagAdministrador(item);
			}
			
		}
		else {
			vista= new VerHashtagAdministrador(this._verTweetAdministrador.Recargar(log)); 
		}
		return vista;
	}
}