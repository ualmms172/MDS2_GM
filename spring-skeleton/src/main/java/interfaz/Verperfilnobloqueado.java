package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Tweet;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Verperfilnobloqueado extends VerperfilgeneralUsuarioRegistrado {
	
//	public ListaUsuariosGeneralUsuarioRegistrado_item _listaUsuariosGeneralUsuarioRegistrado;
//	public VertweetgeneralUsuarioRegistrado _vertweetgeneralUsuarioRegistrado;
//	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
//	public ComentariosUsuarioRegistrado_item _comentariosUsuarioRegistrado;
	public boolean seguido=false;
	public boolean bloqueado=false;
	
	

	public Verperfilnobloqueado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);
		
		basededatos.UsuarioRegistrado user= mostrartweetsUsuarioRegistrado.t.getEscritoPor();
		seguido= user.seguidoPor.contains(Interfaz.ur.u);
		bloqueado = user.bloqueadoPor.contains(Interfaz.ur.u);
		
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
		// TODO Auto-generated constructor stub
	}
	
	
	public Verperfilnobloqueado(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);

		basededatos.UsuarioRegistrado user= listaUsuariosGeneralUsuarioRegistrado.u;
		seguido= user.seguidoPor.contains(Interfaz.ur.u);
		bloqueado = user.bloqueadoPor.contains(Interfaz.ur.u);
		
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
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilnobloqueado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado,boolean mencion) {
		super(vertweetgeneralUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);

		basededatos.UsuarioRegistrado user= vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
		seguido= user.seguidoPor.contains(Interfaz.ur.u);
		bloqueado = user.bloqueadoPor.contains(Interfaz.ur.u);
		
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
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilnobloqueado(ComentariosUsuarioRegistrado_item _comentariosUsuarioRegistrado) {
		super(_comentariosUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getLabelAvisoBloqueo().setVisible(false);
		this.getVerticalLayoutEstarBloqueado().setVisible(false);

		basededatos.UsuarioRegistrado user= _comentariosUsuarioRegistrado.c.getEscritoPor();
		seguido= user.seguidoPor.contains(Interfaz.ur.u);
		bloqueado = user.bloqueadoPor.contains(Interfaz.ur.u);
		
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
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	//private event _seguirUsuario;
	//private event _bloquear;
	//private event _dejardeseguirausuario;
	//private event _desbloquear;
	//private Button _seguir;
	//private Button _bloquearB;

	//public VerperfilUsuarioRegistrado _verperfilUsuarioRegistrado;
	

	public void SeguirUsuario() {
//		this.getButtonSeguir().getStyle().set("color", "red");
//		this.getButtonSeguir().setText("Dejar de seguir");
//		seguido=true;
		
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
//		this.getButtonBloquear().getStyle().set("color", "red");
//		this.getButtonBloquear().setText("Desbloquear");
//		bloqueado=true;
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
//		this.getButtonSeguir().getStyle().set("color", "gray");
//		this.getButtonSeguir().setText("Seguir");
//		seguido=false;
		
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
//		this.getButtonBloquear().getStyle().set("color", "gray");
//		this.getButtonBloquear().setText("Bloquear");
//		bloqueado=false;
		
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