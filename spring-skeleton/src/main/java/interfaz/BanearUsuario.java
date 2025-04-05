package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import interfaz.ListaUsuariosAdministrador_item;
import interfaz.VerPerfilAdministrador;
import vistas.VistaBanearusuario;

public class BanearUsuario extends VistaBanearusuario{
	//private event _banearTemportalmente;
	//private event _banearIndefinidamente;
	//private Label _titulo;
	//private Label _solicitudFecha;
	//private TextField _fecha;
	//private Button _atras;
	//private Button _indefinido;
	//private Button _temporal;
	//private Label _texto;
	public ListaUsuariosAdministrador_item _listaUsuariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	
	public BanearUsuario(ListaUsuariosAdministrador_item listaUsuariosAdministrador) {
		
		_listaUsuariosAdministrador = listaUsuariosAdministrador;
		
		this.getButtonAtras().addClickListener(event -> {
			
			ListaUsuariosAdministrador lu = (ListaUsuariosAdministrador) _listaUsuariosAdministrador._listaUsuariosGeneral;
			
			VerListaCompletaUsuariosAdministrador vista= new VerListaCompletaUsuariosAdministrador(lu._verListaCompletaUsuariosAdministrador._administrador); 
			
			
			lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 
			
			
	        lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(vista);
			
			
				
		});
		
		
		
		
		
		
	}
	
	public BanearUsuario(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		
		this.getButtonAtras().addClickListener(event -> {
			
			//ListaUsuariosAdministrador lu = (ListaUsuariosAdministrador) _listaUsuariosAdministrador._listaUsuariosGeneral;
			
			//VerListaCompletaUsuariosAdministrador vista= new VerListaCompletaUsuariosAdministrador(lu._verListaCompletaUsuariosAdministrador._administrador); 
			
			VerPerfilAdministrador perfil = new VerPerfilAdministrador(this._verPerfilAdministrador._verTweetAdministrador); 
			_verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
			_verPerfilAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil); 

			
			//lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 
			
			
	        //lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(vista);
	
	});
		
	
	}
	
	
	
	

	public void BanearTemporalmente() {
		throw new UnsupportedOperationException();
	}

	public void BanearIndefinidamente() {
		throw new UnsupportedOperationException();
	}
}