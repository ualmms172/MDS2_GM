package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ListaUsuariosAdministrador_item extends ListaUsuariosGeneralAdministrador_item {
	public ListaUsuariosAdministrador_item(ListaUsuariosAdministrador lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
	    
	}

	//private Label _numSeguidores;
	//private Label _numSeguidos;
	//private Label _numTweets;
	//private Button _banearB;
	public ListaUsuariosAdministrador _listaUsuariosAdministrador;
	public BanearUsuario _banearUsuario;

	public void BanearUsuario() {
		
		ListaUsuariosAdministrador l = (ListaUsuariosAdministrador) this._listaUsuariosGeneral;   

        l._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
        _banearUsuario = new BanearUsuario(this); 
        l._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(_banearUsuario);
		
	
	}
}