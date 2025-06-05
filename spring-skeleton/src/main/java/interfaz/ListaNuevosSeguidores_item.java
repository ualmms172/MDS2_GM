package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
import vistas.VistaListanuevosseguidores_item;

public class ListaNuevosSeguidores_item extends VistaListanuevosseguidores_item {
	//private event _seguirUsuario;
	//private event _dejardeseguirausuario;
	//private Label _informacion;
	//private Button _seguir;
	public ListaNuevosSeguidores _listaNuevosSeguidores;
	private boolean dado =false;
	public basededatos.UsuarioRegistrado u;
	
	public ListaNuevosSeguidores_item (ListaNuevosSeguidores lista,basededatos.UsuarioRegistrado u) {
		this.u=u;
		_listaNuevosSeguidores = lista; 
		String text = u.getNick() + "ha empezado a seguirte";
		this.getLabelTextoSeguir().removeAll();
		this.getLabelTextoSeguir().add(text);
		
		//dado = u.seguidoPor.contains(Interfaz.ur.u);
		for(basededatos.UsuarioRegistrado usu : u.seguidoPor.toArray()) {
			if(usu.getID()==Interfaz.ur.u.getID()) {
				dado=true;
				break;
			}
		}
		
		if(dado) {
			this.getButtonSeguir_NoSeguir().getStyle().set("color", "red");
			this.getButtonSeguir_NoSeguir().setText("Dejar de seguir");
		}
		
		this.getButtonSeguir_NoSeguir().addClickListener(Event -> {
			if(!dado) {
				SeguirUsuario();
				dado=true;
			}
			else {
				Dejardeseguirausuario();
				dado=false;
			}
		});
	}
	
	

	public void SeguirUsuario() {
//			this.getButtonSeguir_NoSeguir().getStyle().set("color", "red");
//			this.getButtonSeguir_NoSeguir().setText("Dejar de seguir");
//			ListaNuevosSeguidores la =  _listaNuevosSeguidores;
//			la._item.add(this);
			
			basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Seguir_Usuario(Interfaz.ur.u, u);
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(new Notificaciones(u));
			
	}

	public void Dejardeseguirausuario() {
//		this.getButtonSeguir_NoSeguir().getStyle().set("color", "gray");
//		this.getButtonSeguir_NoSeguir().setText("Seguir");
//		ListaNuevosSeguidores la =  _listaNuevosSeguidores;
//		la._item.add(this);
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Dejar_Seguir(Interfaz.ur.u, u);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(new Notificaciones(u));
	}
}