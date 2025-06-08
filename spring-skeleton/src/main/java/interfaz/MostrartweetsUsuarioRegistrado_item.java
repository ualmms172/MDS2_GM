package interfaz;

import com.vaadin.flow.component.AttachEvent;

import basededatos.Tweet;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class MostrartweetsUsuarioRegistrado_item extends MostrartweetspropiosUsuarioRegistrado_item {
	MostrartweetsUsuarioRegistrado_item(ListaContenido lista,Tweet t) {
		super(lista,t);
		
		_mostrartweetsUsuarioRegistrado = (MostrartweetspropiosUsuarioRegistrado)lista;
		
		dado=false;
		for(basededatos.UsuarioRegistrado usu : t.meGustaPor.toArray()) {
			if(usu.getID()==Interfaz.ur.u.getID()) {
				dado=true;
				break;
			}
		}
		if(dado) {
			this.getButtonMeGusta().getStyle().set("color", "red");
			this.getButtonMeGusta().setText("Quitar");
		}

		this.getButtonMeGusta().setVisible(true);
		
		this.getButtonMeGusta().addClickListener(event-> Darlikeatweet());
		this.getButtonMeGusta().getElement()
	    .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");

	}


	public MostrartweetspropiosUsuarioRegistrado _mostrartweetsUsuarioRegistrado;
	
	public Boolean dado;
	
	public void Darlikeatweet() {
		
		if(!dado) {

			basededatos.UsuarioRegistrado ubd= Interfaz.ur._iUsuarioregistrado.DarLikeTweet(Interfaz.ur.u, t);
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
			Pantalla.MainView.removeAll();
			if(this._mostrartweetsUsuarioRegistrado._usuarioregistrado!=null) {
				Pantalla.MainView.add(u);
			}
			else if(this._mostrartweetsUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
				Pantalla.MainView.add(this._mostrartweetsUsuarioRegistrado._verHashtagUsuarioRegistrado.Recargar(u));
			}
			else {
				Pantalla.MainView.add(this._mostrartweetsUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.Recargar(u));
			}
			}
			
			else {

				
				basededatos.UsuarioRegistrado ubd= Interfaz.ur._iUsuarioregistrado.QuitarLikeTweet(Interfaz.ur.u, t);
				UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
				Pantalla.MainView.removeAll();
				if(this._mostrartweetsUsuarioRegistrado._usuarioregistrado!=null) {
					Pantalla.MainView.add(u);
				}
				else if(this._mostrartweetsUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
					Pantalla.MainView.add(this._mostrartweetsUsuarioRegistrado._verHashtagUsuarioRegistrado.Recargar(u));
				}
				else {
					Pantalla.MainView.add(this._mostrartweetsUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.Recargar(u));
				}
				}
	}
	
	@Override
	protected void onAttach(AttachEvent attachEvent) {
	    super.onAttach(attachEvent);


	    this.getButtonMeGusta().getElement()
	        .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");
	}
}