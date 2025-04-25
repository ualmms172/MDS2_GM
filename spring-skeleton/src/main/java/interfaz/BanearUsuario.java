package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;
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
			
			if(this._listaUsuariosAdministrador!=null) {
				
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_listaUsuariosAdministrador);
			}
			else {
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_verPerfilAdministrador);
			}
			
			
				
		});
		
		this.getButtonTemporal().addClickListener(event -> BanearTemporalmente());
		this.getButtonIndefinido().addClickListener(event -> BanearTemporalmente());
		
		
		
		
		
		
	}
	
	public BanearUsuario(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		
		this.getButtonAtras().addClickListener(event -> {
			
			//ListaUsuariosAdministrador lu = (ListaUsuariosAdministrador) _listaUsuariosAdministrador._listaUsuariosGeneral;
			
			//VerListaCompletaUsuariosAdministrador vista= new VerListaCompletaUsuariosAdministrador(lu._verListaCompletaUsuariosAdministrador._administrador); 
			
			if(this._listaUsuariosAdministrador!=null) {
				
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_listaUsuariosAdministrador);
			}
			else {
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_verPerfilAdministrador);
			}

			
			//lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 
			
			
	        //lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(vista);
	
	});
		
		this.getButtonTemporal().addClickListener(event -> BanearTemporalmente());
		this.getButtonIndefinido().addClickListener(event -> BanearTemporalmente());		
	
	}
	
	
	
	

	public void BanearTemporalmente() {
		Administrador ad = new Administrador((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		Verbaneados vb = new Verbaneados(ad);
		Pantalla.Anterior = ad;
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vb);
	}

	public void BanearIndefinidamente() {
		Administrador ad = new Administrador((MainView)Pantalla.MainView,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
		Verbaneados vb = new Verbaneados(ad);
		Pantalla.Anterior = ad;
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vb);
	}
}