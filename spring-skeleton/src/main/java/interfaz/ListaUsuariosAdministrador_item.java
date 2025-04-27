package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosAdministrador_item extends ListaUsuariosGeneralAdministrador_item {
	public ListaUsuariosAdministrador_item(ListaUsuariosAdministrador lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		// TODO Auto-generated constructor stub
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		_listaUsuariosAdministrador = (ListaUsuariosAdministrador) lista;
	    
	}

	//private Label _numSeguidores;
	//private Label _numSeguidos;
	//private Label _numTweets;
	//private Button _banearB;
	public ListaUsuariosAdministrador _listaUsuariosAdministrador;
	public BanearUsuario _banearUsuario;

	public void BanearUsuario() {
		
		 _banearUsuario = new BanearUsuario(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_banearUsuario);
		
//		ListaUsuariosAdministrador l = (ListaUsuariosAdministrador) this._listaUsuariosGeneral;   
//
//        l._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//        _banearUsuario = new BanearUsuario(this); 
//        l._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_banearUsuario);
		
	
	}
}