package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Verperfilbloqueado extends VerperfilgeneralUsuarioRegistrado {
	//private event _desbloquear;
	//private event _bloquear;
	//private Label _bloqueo;
	//private Button _bloquearB;
	//public Verperfilajeno _verperfilajeno;
	
	//public Verperfilbloqueado(Verperfilajeno verperfilajeno) {
		
		//_verperfilajeno = verperfilajeno; 
	//}
	

	
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public boolean bloqueado=false;
	
	public Verperfilbloqueado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		
//		bloqueado = this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor().bloqueadoPor.contains(Interfaz.ur.u);
		for(basededatos.UsuarioRegistrado usu : mencion?this._mostrartweetsUsuarioRegistrado_item.t.getMencionaA().bloqueadoPor.toArray():this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor().bloqueadoPor.toArray()) {
			if(usu.getID()==Interfaz.ur.u.getID()) {
				bloqueado=true;
				break;
			}
		}
		if(bloqueado) {
			this.getButtonBloquear().getStyle().set("color", "gray");
			this.getButtonBloquear().setText("Desbloquear");
		}
		else {
			this.getButtonBloquear().getStyle().set("color", "red");
			this.getButtonBloquear().setText("Bloquear");
		}
		
		this.getButtonBloquear().addClickListener(event->{
			
			if(bloqueado) {
				Desbloquear();
				
			}
			else {
				Bloquear();
				
			}
		});
		
		// TODO Auto-generated constructor stub
	}
	
	public Verperfilbloqueado(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		// TODO Auto-generated constructor stub
		
		
		this.getButtonBloquear().addClickListener(event->{
			
			if(bloqueado) {
				Desbloquear();
				
			}
			else {
				Bloquear();
				
			}
		});
	}
	
	public Verperfilbloqueado(VertweetgeneralUsuarioRegistrado vertweetgeneralUsuarioRegistrado,boolean mencion) {
		super(vertweetgeneralUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		// TODO Auto-generated constructor stub
		this.getButtonBloquear().addClickListener(event->{
			
			if(bloqueado) {
				Desbloquear();
				
			}
			else {
				Bloquear();
				
			}
		});
	}
	
	
	
	//Hacer constructores: 

	public void Desbloquear() {
		
//			this.getButtonBloquear().getStyle().set("color", "red");
//			this.getButtonBloquear().setText("Bloquear");
//			bloqueado=true;
//			
//			Verperfilbloqueado x = new Verperfilbloqueado(_mostrartweetspropiosUsuarioRegistrado);
//			Pantalla.MainView.removeAll();
//			Pantalla.MainView.add(x);
			basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Desbloquear(Interfaz.ur.u, this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor());
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(this.Recargar(u));
	}

	public void Bloquear() {
		
//		this.getButtonBloquear().getStyle().set("color", "gray");
//		this.getButtonBloquear().setText("Desbloquear");
//		bloqueado=false;
//		
//		Verperfilbloqueado x = new Verperfilbloqueado(_mostrartweetspropiosUsuarioRegistrado);
//		Pantalla.MainView.removeAll();
//		Pantalla.MainView.add(x);
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Bloquear(Interfaz.ur.u, this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor());
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this.Recargar(u));
	}
}