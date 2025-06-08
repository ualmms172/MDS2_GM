package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.ComentarioDAO;
import basededatos.HashtagDAO;
import basededatos.TweetDAO;
import basededatos.UsuarioRegistradoDAO;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class VerPerfilAdministrador extends VerPerfilGeneral {

	public ListaUsuariosGeneralAdministrador_item _listaUsuariosGeneralAdministrador;
	public ListaTweetsAdmin_item _listaTweetsAdmin_item;
	public ListaTweetsAdmin _listaTweetsAdmin; 
	public VerTweetAdministrador _verTweetAdministrador;
	public ListaComentariosAdministrador_item _listaComentariosAdministrador;
	public BanearUsuario _banearUsuario;
	

	
	public VerPerfilAdministrador(ListaUsuariosGeneralAdministrador_item listaUsuariosGeneralAdministrador) {
		super(listaUsuariosGeneralAdministrador);
		_listaUsuariosGeneralAdministrador = listaUsuariosGeneralAdministrador; 
		

		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador instanceof ListaUsuariosAdministrador) {
				ListaUsuariosAdministrador l = (ListaUsuariosAdministrador) this._listaUsuariosGeneralAdministrador._listaUsuariosGeneralAdministrador;
				Pantalla.Anterior= l._verListaCompletaUsuariosAdministrador._administrador;
			}
			
	});
	}
	
	
	public VerPerfilAdministrador(ListaTweetsAdmin_item listaTweetsAdmin,Boolean mencion ) {
		super(listaTweetsAdmin,mencion);
		_listaTweetsAdmin_item = listaTweetsAdmin; 
		
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
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
	
	public VerPerfilAdministrador(VerTweetAdministrador verTweetAdministrador,Boolean mencion) {
		super(verTweetAdministrador,mencion);
		_verTweetAdministrador = verTweetAdministrador; 
		
		this.mencion=mencion;
		
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
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
	

	public VerPerfilAdministrador(ListaComentariosAdministrador_item listaComentariosAdministrador) {
		super(listaComentariosAdministrador);
		_listaComentariosAdministrador = listaComentariosAdministrador; 
		
		this.getLabelNick().setText(_listaComentariosAdministrador.c.getEscritoPor().getNick());
		this.getLabelDescripcion().setText(_listaComentariosAdministrador.c.getEscritoPor().getDescripcion());
		this.getLabelNumSeguidores().setText("Seguidores : "+String.valueOf(_listaComentariosAdministrador.c.getEscritoPor().seguidoPor.size()));
		this.getLabelNumSeguidos().setText("Seguidos : "+String.valueOf(_listaComentariosAdministrador.c.getEscritoPor().sigueA.size()));
		if(_listaComentariosAdministrador.c.getEscritoPor().getFotoFondo()!=null)
			this.getImgCabecera().setSrc(_listaComentariosAdministrador.c.getEscritoPor().getFotoFondo());
		this.getImgPerfil().setSrc(_listaComentariosAdministrador.c.getEscritoPor().getFotoPerfil());
		
		this.getButtonBloquear().setVisible(false);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		
		ListaTweetsAdmin();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador!=null) {
				Pantalla.Anterior=this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verPerfilAdministrador;
			}
			else if(this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador!=null) {
				Pantalla.Anterior=this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._verHashtagAdministrador;
			}
			else {
				Pantalla.Anterior =this._listaComentariosAdministrador._listaComentariosAdministrador._verTweetAdministrador._listaTweetsAdmin._listaTweetsAdmin._administrador;
			}
			
	});
	}
	

	public void BanearUsuario() {
		_banearUsuario = new BanearUsuario(this);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_banearUsuario);
	}

	public void ListaTweetsAdmin() {
		_listaTweetsAdmin = new ListaTweetsAdmin(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_listaTweetsAdmin);
		

	}
	
	public VerPerfilAdministrador Recargar(Administrador log) {
		VerPerfilAdministrador vista = null;
		if(this._listaUsuariosGeneralAdministrador!=null) {
			basededatos.UsuarioRegistrado u = Interfaz.ad._iadministrador.ObtenerUsuarioId(_listaUsuariosGeneralAdministrador.u);

			if(this._listaUsuariosGeneralAdministrador instanceof ListaUsuariosFamososAdministrador_item) {
				ListaUsuariosFamososAdministrador list = new ListaUsuariosFamososAdministrador(log);
				ListaUsuariosFamososAdministrador_item item = new ListaUsuariosFamososAdministrador_item(list,u);

				vista = new VerPerfilAdministrador(item);
			}
			else {
				ListaUsuariosAdministrador list = new ListaUsuariosAdministrador(((ListaUsuariosAdministrador_item) _listaUsuariosGeneralAdministrador)._listaUsuariosAdministrador._verListaCompletaUsuariosAdministrador.Recargar(log));
				ListaUsuariosAdministrador_item item = new ListaUsuariosAdministrador_item(list,u);

				vista = new VerPerfilAdministrador(item);
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
				_listaTweetsAdmin_item._listaTweetsAdmin=lt;
				vista = new VerPerfilAdministrador(_listaTweetsAdmin_item,mencion);
			}
			else{
				ListaTweetsAdmin_item item = new ListaTweetsAdmin_item(lt,t);
				vista = new VerPerfilAdministrador(item,mencion);
			}
		}
		else if(this._verTweetAdministrador!=null){
			vista= new VerPerfilAdministrador(this._verTweetAdministrador.Recargar(log),mencion); 
		}
		else {
			ListaComentariosAdministrador lt = this._listaComentariosAdministrador._listaComentariosAdministrador;
		//	basededatos.Comentario c = Interfaz.ad._iadministrador.ObtenerComentarioId(_listaComentariosAdministrador.c);
//			if(c==null)¿?
			//ListaComentariosAdministrador_item item = new ListaComentariosAdministrador_item(lt,c);
			lt = new ListaComentariosAdministrador(lt._verTweetAdministrador.Recargar(log));
			ListaComentariosAdministrador_item item = new ListaComentariosAdministrador_item(lt,_listaComentariosAdministrador.c);
			vista= new VerPerfilAdministrador(item);
		}
		return vista;
	}
}