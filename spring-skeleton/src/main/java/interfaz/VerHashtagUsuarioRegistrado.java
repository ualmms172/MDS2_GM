package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class VerHashtagUsuarioRegistrado extends VerHashtagGeneral {
	public ListahashtagsgeneralUsuarioRegistrado_item _listahashtagsgeneralUsuarioRegistrado;
	public MostrartweetsUsuarioRegistrado _mostrartweetsUsuarioRegistrado;

	public VerHashtagUsuarioRegistrado(ListahashtagsgeneralUsuarioRegistrado_item listahashtagsgeneralUsuarioRegistrado) {
		
		_listahashtagsgeneralUsuarioRegistrado = listahashtagsgeneralUsuarioRegistrado; 
		this.getLabelHashtag().setText(_listahashtagsgeneralUsuarioRegistrado.h.getTitulo());
		
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
	

	
	public void MostrartweetsUsuarioRegistrado() {
		_mostrartweetsUsuarioRegistrado = new MostrartweetsUsuarioRegistrado(this);
		this.getVerticalLayoutListaHashtags().as(VerticalLayout.class).add(_mostrartweetsUsuarioRegistrado);
		
		MostrartweetsUsuarioRegistrado_item item_tweets = new MostrartweetsUsuarioRegistrado_item(_mostrartweetsUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		_mostrartweetsUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
	}
}