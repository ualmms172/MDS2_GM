package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class Vertweetajeno extends VertweetgeneralUsuarioRegistrado {
	


	//private event _darlikeatweet;
	//private Button _meGusta;
	//public VerTweetUsuarioRegistrado _verTweetUsuarioRegistrado;
	public boolean dado;
	
	public Vertweetajeno(MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado_item) {
		super(mostrartweetspropiosUsuarioRegistrado_item);
//		dado = mostrartweetspropiosUsuarioRegistrado_item.t.meGustaPor.contains(Interfaz.ur.u);
		for(basededatos.UsuarioRegistrado usu : mostrartweetspropiosUsuarioRegistrado_item.t.meGustaPor.toArray()) {
			if(usu.getID()==Interfaz.ur.u.getID()) {
				dado=true;
				break;
			}
		}
		
		if(dado) {
			this.getButtonMeGusta().getStyle().set("color", "red");
			this.getButtonMeGusta().setText("Quitar");
		}
		else {
			this.getButtonMeGusta().getStyle().set("color", "gray");
			this.getButtonMeGusta().setText("Dar me gusta");
		}
		this.getButtonMeGusta().addClickListener(event -> Darlikeatweet());
		// TODO Auto-generated constructor stub
	}
	
//    public Vertweetajeno (VerperfilgeneralUsuarioRegistrado verperfilUsuarioRegistrado ) {
//		
//       super(verperfilUsuarioRegistrado); 
//       this.getButtonMeGusta().addClickListener(event -> Darlikeatweet());
//}	

	public void Darlikeatweet() {

		if(!dado) {
//			this.getButtonMeGusta().getStyle().set("color", "red");
//			this.getButtonMeGusta().setText("Quitar");
//			Vertweetajeno  x = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
//			Pantalla.MainView.removeAll();
//			Pantalla.MainView.add(x);
//			dado=true;
			basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.DarLikeTweet(Interfaz.ur.u, this._mostrartweetspropiosUsuarioRegistrado.t);
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(this.Recargar(u));
			}
			
		else {
//			this.getButtonMeGusta().getStyle().set("color", "gray");
//			this.getButtonMeGusta().setText("Dar me gusta");
//			Vertweetajeno  x = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
//			Pantalla.MainView.removeAll();
//			Pantalla.MainView.add(x);
//			dado=false;
			
			basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.QuitarLikeTweet(Interfaz.ur.u, this._mostrartweetspropiosUsuarioRegistrado.t);
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(this.Recargar(u));
			}
	}
}