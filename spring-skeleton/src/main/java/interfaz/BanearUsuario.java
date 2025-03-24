package interfaz;

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
	}
	
	public BanearUsuario(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
	}
	
	
	
	

	public void BanearTemporalmente() {
		throw new UnsupportedOperationException();
	}

	public void BanearIndefinidamente() {
		throw new UnsupportedOperationException();
	}
}