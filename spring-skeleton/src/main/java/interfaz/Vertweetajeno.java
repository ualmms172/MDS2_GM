package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class Vertweetajeno extends VertweetgeneralUsuarioRegistrado {
	


	//private event _darlikeatweet;
	//private Button _meGusta;
	//public VerTweetUsuarioRegistrado _verTweetUsuarioRegistrado;
	public boolean dado;
	
	public Vertweetajeno(MostrartweetspropiosUsuarioRegistrado_item mostrartweetspropiosUsuarioRegistrado_item) {
		super(mostrartweetspropiosUsuarioRegistrado_item);
		// TODO Auto-generated constructor stub
	}
	
    public Vertweetajeno (VerperfilgeneralUsuarioRegistrado verperfilUsuarioRegistrado ) {
		
       super(verperfilUsuarioRegistrado); 
}	

	public void Darlikeatweet() {

		if(!dado) {
			this.getButtonMeGusta().getStyle().set("color", "red");
			this.getButtonMeGusta().setText("Quitar");
			Vertweetajeno  x = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(x);
			}
			
		else {
			this.getButtonMeGusta().getStyle().set("color", "gray");
			this.getButtonMeGusta().setText("Dar me gusta");
			Vertweetajeno  x = new Vertweetajeno(_mostrartweetspropiosUsuarioRegistrado);
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(x);
			}
	}
}