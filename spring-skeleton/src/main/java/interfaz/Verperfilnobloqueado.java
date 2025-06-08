package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Verperfilnobloqueado extends VerperfilgeneralUsuarioRegistrado {


	public boolean seguido=false;
	public boolean bloqueado=false;
	
	

	public Verperfilnobloqueado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		basededatos.UsuarioRegistrado user= mencion?mostrartweetsUsuarioRegistrado.t.getMencionaA():mostrartweetsUsuarioRegistrado.t.getEscritoPor();
		
		for(basededatos.UsuarioRegistrado usu : user.seguidoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				seguido=true;
				break;
			}
		}
		
		for(basededatos.UsuarioRegistrado usu : user.bloqueadoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				bloqueado=true;
				break;
			}
		}
		
		
		if(seguido) {
			this.getButtonSeguir().getStyle().set("color", "red");
			this.getButtonSeguir().setText("Dejar de seguir");
		}
		else {
			this.getButtonSeguir().getStyle().set("color", "gray");
			this.getButtonSeguir().setText("Seguir");
		}
		
		if(bloqueado) {
			this.getButtonBloquear().getStyle().set("color", "red");
			this.getButtonBloquear().setText("Desbloquear");
		}
		else {
			this.getButtonBloquear().getStyle().set("color", "gray");
			this.getButtonBloquear().setText("Bloquear");
		}
		
		this.getButtonBloquear().addClickListener(event ->{
			if(bloqueado)
				Desbloquear();
			else
				Bloquear();
		});
		this.getButtonSeguir().addClickListener(event ->{
			if(seguido)
				Dejardeseguirausuario();
			else
				SeguirUsuario();
		});
	}
	
	
	public Verperfilnobloqueado(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);

		basededatos.UsuarioRegistrado user= listaUsuariosGeneralUsuarioRegistrado.u;
		for(basededatos.UsuarioRegistrado usu : user.seguidoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				seguido=true;
				break;
			}
		}
		
		for(basededatos.UsuarioRegistrado usu : user.bloqueadoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				bloqueado=true;
				break;
			}
		}
		
		if(seguido) {
			this.getButtonSeguir().getStyle().set("color", "red");
			this.getButtonSeguir().setText("Dejar de seguir");
		}
		else {
			this.getButtonSeguir().getStyle().set("color", "gray");
			this.getButtonSeguir().setText("Seguir");
		}
		
		if(bloqueado) {
			this.getButtonBloquear().getStyle().set("color", "red");
			this.getButtonBloquear().setText("Desbloquear");
		}
		else {
			this.getButtonBloquear().getStyle().set("color", "gray");
			this.getButtonBloquear().setText("Bloquear");
		}
		this.getButtonBloquear().addClickListener(event ->{
			if(bloqueado)
				Desbloquear();
			else
				Bloquear();
		});
		this.getButtonSeguir().addClickListener(event ->{
			if(seguido)
				Dejardeseguirausuario();
			else
				SeguirUsuario();
		});
	}
	
	public Verperfilnobloqueado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado,boolean mencion) {
		super(vertweetgeneralUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);

		basededatos.UsuarioRegistrado user= mencion?vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA():vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();

		for(basededatos.UsuarioRegistrado usu : user.seguidoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				seguido=true;
				break;
			}
		}


		for(basededatos.UsuarioRegistrado usu : user.bloqueadoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				bloqueado=true;
				break;
			}
		}
		
		if(seguido) {
			this.getButtonSeguir().getStyle().set("color", "red");
			this.getButtonSeguir().setText("Dejar de seguir");
		}
		else {
			this.getButtonSeguir().getStyle().set("color", "gray");
			this.getButtonSeguir().setText("Seguir");
		}
		
		if(bloqueado) {
			this.getButtonBloquear().getStyle().set("color", "red");
			this.getButtonBloquear().setText("Desbloquear");
		}
		else {
			this.getButtonBloquear().getStyle().set("color", "gray");
			this.getButtonBloquear().setText("Bloquear");
		}
		this.getButtonBloquear().addClickListener(event ->{
			if(bloqueado)
				Desbloquear();
			else
				Bloquear();
		});
		this.getButtonSeguir().addClickListener(event ->{
			if(seguido)
				Dejardeseguirausuario();
			else
				SeguirUsuario();
		});
	}
	
	public Verperfilnobloqueado(ComentariosUsuarioRegistrado_item _comentariosUsuarioRegistrado) {
		super(_comentariosUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);

		basededatos.UsuarioRegistrado user= _comentariosUsuarioRegistrado.c.getEscritoPor();
		for(basededatos.UsuarioRegistrado usu : user.seguidoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				seguido=true;
				break;
			}
		}
		
		for(basededatos.UsuarioRegistrado usu : user.bloqueadoPor.toArray()){
			if(usu.getID()==Interfaz.ur.u.getID()) {
				bloqueado=true;
				break;
			}
		}
		
		if(seguido) {
			this.getButtonSeguir().getStyle().set("color", "red");
			this.getButtonSeguir().setText("Dejar de seguir");
		}
		else {
			this.getButtonSeguir().getStyle().set("color", "gray");
			this.getButtonSeguir().setText("Seguir");
		}
		
		if(bloqueado) {
			this.getButtonBloquear().getStyle().set("color", "red");
			this.getButtonBloquear().setText("Desbloquear");
		}
		else {
			this.getButtonBloquear().getStyle().set("color", "gray");
			this.getButtonBloquear().setText("Bloquear");
		}
		this.getButtonBloquear().addClickListener(event ->{
			if(bloqueado)
				Desbloquear();
			else
				Bloquear();
		});
		this.getButtonSeguir().addClickListener(event ->{
			if(seguido)
				Dejardeseguirausuario();
			else
				SeguirUsuario();
		});
	}
	
	
	
	
	

	public void SeguirUsuario() {
		
		basededatos.UsuarioRegistrado user = null;
		if(this._mostrartweetsUsuarioRegistrado_item!=null) {
			if(mencion) {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getMencionaA();
			}
			else {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
			}
		}
		else if(this._vertweetgeneralUsuarioRegistrado!=null) {
			if(mencion) {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
			}
			else {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
			}
		}
		else if(this._comentariosUsuarioRegistrado!=null) {
			user = this._comentariosUsuarioRegistrado.c.getEscritoPor();
		}
		else if(this._listaUsuariosGeneralUsuarioRegistrado!=null) {
			user = this._listaUsuariosGeneralUsuarioRegistrado.u;
		}
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Seguir_Usuario(Interfaz.ur.u, user);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this.Recargar(u));

	}

	public void Bloquear() {
		basededatos.UsuarioRegistrado user = null;
		if(this._mostrartweetsUsuarioRegistrado_item!=null) {
			if(mencion) {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getMencionaA();
			}
			else {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
			}
		}
		else if(this._vertweetgeneralUsuarioRegistrado!=null) {
			if(mencion) {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
			}
			else {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
			}
		}
		else if(this._comentariosUsuarioRegistrado!=null) {
			user = this._comentariosUsuarioRegistrado.c.getEscritoPor();
		}
		else if(this._listaUsuariosGeneralUsuarioRegistrado!=null) {
			user = this._listaUsuariosGeneralUsuarioRegistrado.u;
		}
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Bloquear(Interfaz.ur.u, user);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this.Recargar(u));
		
	}

	public void Dejardeseguirausuario() {
		
		basededatos.UsuarioRegistrado user = null;
		if(this._mostrartweetsUsuarioRegistrado_item!=null) {
			if(mencion) {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getMencionaA();
			}
			else {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
			}
		}
		else if(this._vertweetgeneralUsuarioRegistrado!=null) {
			if(mencion) {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
			}
			else {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
			}
		}
		else if(this._comentariosUsuarioRegistrado!=null) {
			user = this._comentariosUsuarioRegistrado.c.getEscritoPor();
		}
		else if(this._listaUsuariosGeneralUsuarioRegistrado!=null) {
			user = this._listaUsuariosGeneralUsuarioRegistrado.u;
		}
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Dejar_Seguir(Interfaz.ur.u, user);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this.Recargar(u));
	}

	public void Desbloquear() {
		
		basededatos.UsuarioRegistrado user = null;
		if(this._mostrartweetsUsuarioRegistrado_item!=null) {
			if(mencion) {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getMencionaA();
			}
			else {
				user=this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
			}
		}
		else if(this._vertweetgeneralUsuarioRegistrado!=null) {
			if(mencion) {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getMencionaA();
			}
			else {
				user=this._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
			}
		}
		else if(this._comentariosUsuarioRegistrado!=null) {
			user = this._comentariosUsuarioRegistrado.c.getEscritoPor();
		}
		else if(this._listaUsuariosGeneralUsuarioRegistrado!=null) {
			user = this._listaUsuariosGeneralUsuarioRegistrado.u;
		}
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Desbloquear(Interfaz.ur.u, user);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this.Recargar(u));
		
	}
	
}