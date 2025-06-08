package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosAdministrador_item extends ListaUsuariosGeneralAdministrador_item {
	public ListaUsuariosAdministrador_item(ListaUsuariosAdministrador lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);

		
		
		
		this.getButtonBanear().addClickListener(event -> BanearUsuario()); 
		_listaUsuariosAdministrador = (ListaUsuariosAdministrador) lista;
	    
	}


	public ListaUsuariosAdministrador _listaUsuariosAdministrador;
	public BanearUsuario _banearUsuario;

	public void BanearUsuario() {
		
		 _banearUsuario = new BanearUsuario(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_banearUsuario);
		
	
	}
}