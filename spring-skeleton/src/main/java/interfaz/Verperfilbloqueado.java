package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Verperfilbloqueado extends VerperfilgeneralUsuarioRegistrado {
	
	public MostrartweetspropiosUsuarioRegistrado_item _mostrartweetspropiosUsuarioRegistrado;
	public boolean bloqueado=false;
	
	public Verperfilbloqueado(MostrartweetspropiosUsuarioRegistrado_item mostrartweetsUsuarioRegistrado,boolean mencion) {
		super(mostrartweetsUsuarioRegistrado,mencion);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		
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
		
	}
	
	public Verperfilbloqueado(ListaUsuariosGeneralUsuarioRegistrado_item listaUsuariosGeneralUsuarioRegistrado) {
		super(listaUsuariosGeneralUsuarioRegistrado);
		this.getButtonEliminarCuenta().setVisible(false);
		this.getButtonModidicarDatos().setVisible(false);
		this.getButtonSeguir().setVisible(false);
		this.getVerticalLayoutInferior().setVisible(false);
		
		this.MostrartweetsUsuarioRegistrado();
		
		
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

		this.getButtonBloquear().addClickListener(event->{
			
			if(bloqueado) {
				Desbloquear();
				
			}
			else {
				Bloquear();
				
			}
		});
	}
	
	
	

	public void Desbloquear() {

			basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Desbloquear(Interfaz.ur.u, this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor());
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(this.Recargar(u));
	}

	public void Bloquear() {
		
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Bloquear(Interfaz.ur.u, this._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor());
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this.Recargar(u));
	}
}