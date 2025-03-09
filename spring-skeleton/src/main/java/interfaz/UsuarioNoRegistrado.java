package interfaz;

import vistas.VistaUsuarionoregistrado;
import gallardoMartinez.MainView;

//import basededatos.iUsuarioNoRegistrado;

public class UsuarioNoRegistrado extends VistaUsuarionoregistrado{
	//private Label _listaUsuarios;
	//private Label _litaHashtags;
	//private Image _fotoAplicacion;
	//private Button _iniciarSesion;
	//private Button _registrarse;
	//private Button _verMasUsuarios;
	//private Button _verMasHashtags;
	//public iUsuarioNoRegistrado _iUsuarioNoRegistrado;
	public IniciarSesin _iniciarSesin;
	public Verlistacompletahashtags _verlistacompletahashtags;
	public ListaUsuariosFamosos _listaUsuariosFamosos;
	public VerListaCompletaUsuariosUsuarioNoRegistrado _verListaCompletaUsuariosUsuarioNoRegistrado;
	public Registrar _registrar;
	public ListahashtagsfamososUsuarioNoRegistrado _listahashtagsfamososUsuarioNoRegistrado;
	
	MainView MainView;
	UsuarioNoRegistrado(MainView MainView) {
	this.MainView = MainView;
	}

	public void IniciarSesin() {
		throw new UnsupportedOperationException();
	}

	public void Verlistacompletahashtags() {
		throw new UnsupportedOperationException();
	}

	public void ListaUsuariosFamosos() {
		throw new UnsupportedOperationException();
	}

	public void VerListaCompletaUsuariosUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public void Registrar() {
		throw new UnsupportedOperationException();
	}

	public void ListahashtagsfamososUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}
}