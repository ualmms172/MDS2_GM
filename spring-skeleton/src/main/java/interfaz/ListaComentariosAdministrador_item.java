package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Comentario;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class ListaComentariosAdministrador_item extends ListaComentariosGeneral_item {
	public ListaComentariosAdministrador_item(ListaContenido lista,Comentario c) {
		super(lista,c);
		_listaComentariosAdministrador= (ListaComentariosAdministrador)lista;
		
		this.getButtonMeGusta().setVisible(false);
		
		this.getButtonBorrar().addClickListener(Event -> BorrarComentario());
		this.getImgFotoPerfilTweet().addClickListener(Event -> VerPerfilAdministrador());
	}

	
	public ListaComentariosAdministrador _listaComentariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;

	public void BorrarComentario() {
		


		basededatos.Administrador abd=Interfaz.ad._iadministrador.BorrarComentario(c,Interfaz.ad.a);
		
		Administrador a = new Administrador((MainView)Pantalla.MainView,abd);
		
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_listaComentariosAdministrador._verTweetAdministrador.Recargar(a));
		

	}

	public void VerPerfilAdministrador() {
		_verPerfilAdministrador = new VerPerfilAdministrador(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verPerfilAdministrador);
	}
}