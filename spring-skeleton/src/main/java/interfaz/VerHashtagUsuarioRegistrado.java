package interfaz;

import org.orm.PersistentException;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.HashtagDAO;
import basededatos.TweetDAO;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class VerHashtagUsuarioRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioRegistrado_item _listahashtagsgeneralUsuarioRegistrado;
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosusuarioregistrado;
	public VertweetgeneralUsuarioRegistrado _vertweetgeneralusarioregistrado;

	public VerHashtagUsuarioRegistrado(ListahashtagsgeneralUsuarioRegistrado_item listahashtagsgeneralUsuarioRegistrado) {
		super(listahashtagsgeneralUsuarioRegistrado);
		
		_listahashtagsgeneralUsuarioRegistrado = listahashtagsgeneralUsuarioRegistrado; 
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._listahashtagsgeneralUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagsUsuarioRegistrado) {
				ListahashtagsUsuarioRegistrado l = (ListahashtagsUsuarioRegistrado) this._listahashtagsgeneralUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
				Pantalla.Anterior = l._verlistacompletahashtagUsuarioRegistrado._usuarioregistrado;
			}
	});
	}
	
	public VerHashtagUsuarioRegistrado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosusuarioregistrado) {
		super(mostrartweetspropiosusuarioregistrado);
		_mostrartweetspropiosusuarioregistrado = mostrartweetspropiosusuarioregistrado; 
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado!=null) {
					if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagsUsuarioRegistrado_item) {
						ListahashtagsUsuarioRegistrado_item l = (ListahashtagsUsuarioRegistrado_item) this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
						Pantalla.Anterior = l._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado;
					}
					else {
						ListahashtagfamososUsuarioRegistrado_item l = (ListahashtagfamososUsuarioRegistrado_item) this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._listahashtagsgeneralUsuarioRegistrado;
						Pantalla.Anterior= l._listahashtagfamososUsuarioRegistrado._usuarioregistrado;
					}
				}
				else if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado!=null) {
					Pantalla.Anterior= this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._vertweetgeneralusarioregistrado;
				}
				else {
					if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null)
						Pantalla.Anterior= this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
					else if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null)
						Pantalla.Anterior=this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
					else {
						Pantalla.Anterior=this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
					}
				}
			}
			else if(this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				VerperfilgeneralUsuarioRegistrado x = this._mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
				
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
	
	public VerHashtagUsuarioRegistrado(VertweetgeneralUsuarioRegistrado vertweetgeneralusarioregistrado) {
		super(vertweetgeneralusarioregistrado);
		
		_vertweetgeneralusarioregistrado = vertweetgeneralusarioregistrado; 
		
		MostrartweetsUsuarioRegistrado();
		
		this.getButtonAtras().addClickListener(event -> {
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
			if(this._vertweetgeneralusarioregistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado!=null) {
				Pantalla.Anterior=this._vertweetgeneralusarioregistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado;
			}
			else if(this._vertweetgeneralusarioregistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				Pantalla.Anterior=this._vertweetgeneralusarioregistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado;
			}
			else {
				Pantalla.Anterior = this._vertweetgeneralusarioregistrado._mostrartweetspropiosUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado;
			}
			
	});
	}
	

	
	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		
	}
	
	public VerHashtagUsuarioRegistrado Recargar(UsuarioRegistrado log) {
		VerHashtagUsuarioRegistrado vista = null;
		if(this._listahashtagsgeneralUsuarioRegistrado!=null) {
			basededatos.Hashtag h = Interfaz.ur._iUsuarioregistrado.ObtenerHashtagId(_listahashtagsgeneralUsuarioRegistrado.h);

			if(this._listahashtagsgeneralUsuarioRegistrado instanceof ListahashtagfamososUsuarioRegistrado_item) {
				ListahashtagfamososUsuarioRegistrado list = new ListahashtagfamososUsuarioRegistrado(log);
				ListahashtagfamososUsuarioRegistrado_item item = new ListahashtagfamososUsuarioRegistrado_item(list,h);
				vista = new VerHashtagUsuarioRegistrado(item);
			}
			else {
				ListahashtagsUsuarioRegistrado list = new ListahashtagsUsuarioRegistrado(((ListahashtagsUsuarioRegistrado_item) _listahashtagsgeneralUsuarioRegistrado)._listahashtagsUsuarioRegistrado._verlistacompletahashtagUsuarioRegistrado.Recargar(log));
				ListahashtagsUsuarioRegistrado_item item = new ListahashtagsUsuarioRegistrado_item(list,h);
				vista = new VerHashtagUsuarioRegistrado(item);
			}
		}
		else if(this._mostrartweetspropiosusuarioregistrado!=null){
			
			MostrartweetspropiosUsuarioRegistrado lt = _mostrartweetspropiosusuarioregistrado._mostrartweetspropiosUsuarioRegistrado;
			basededatos.Tweet t = Interfaz.ur._iUsuarioregistrado.ObtenerTweetId(_mostrartweetspropiosusuarioregistrado.t);

			if(lt._verperfilgeneralUsuarioRegistrado!=null) {
				lt = new MostrartweetspropiosUsuarioRegistrado(lt._verperfilgeneralUsuarioRegistrado.Recargar(log));
				MostrartweetspropiosUsuarioRegistrado_item item = new MostrartweetspropiosUsuarioRegistrado_item(lt,t);
				vista= new VerHashtagUsuarioRegistrado(item);
			}
			else if(lt._verHashtagUsuarioRegistrado!=null) {
				lt = new MostrartweetspropiosUsuarioRegistrado(lt._verHashtagUsuarioRegistrado.Recargar(log));
				MostrartweetspropiosUsuarioRegistrado_item item = new MostrartweetspropiosUsuarioRegistrado_item(lt,t);
				vista= new VerHashtagUsuarioRegistrado(item); 
				}
			else {
				lt = new MostrartweetspropiosUsuarioRegistrado(log);
				MostrartweetspropiosUsuarioRegistrado_item item = new MostrartweetspropiosUsuarioRegistrado_item(lt,t);
				vista =new VerHashtagUsuarioRegistrado(item);
			}
		}
		else {
			vista= new VerHashtagUsuarioRegistrado(this._vertweetgeneralusarioregistrado.Recargar(log)); 
		}
		return vista;
	}
}