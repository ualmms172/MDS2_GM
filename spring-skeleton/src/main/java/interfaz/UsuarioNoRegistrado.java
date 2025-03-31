package interfaz;

import vistas.VistaUsuarionoregistrado;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

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
	
	
	public UsuarioNoRegistrado(MainView MainView) {
	this.MainView = MainView;
	
	ListahashtagsfamososUsuarioNoRegistrado();
	ListaUsuariosFamosos();
	}

	public void IniciarSesin() {
		throw new UnsupportedOperationException();
	}

	public void Verlistacompletahashtags() {
		throw new UnsupportedOperationException();
	}

	public void ListaUsuariosFamosos() {
		_listaUsuariosFamosos = new ListaUsuariosFamosos(this);
		this.getHorizontalLayoutListaUsuariosFamosos().add(_listaUsuariosFamosos);
	}

	public void VerListaCompletaUsuariosUsuarioNoRegistrado() {
		throw new UnsupportedOperationException();
	}

	public void Registrar() {
		throw new UnsupportedOperationException();
	}

	public void ListahashtagsfamososUsuarioNoRegistrado() {
		_listahashtagsfamososUsuarioNoRegistrado = new ListahashtagsfamososUsuarioNoRegistrado(this);
		this.getHorizontallayoutListaDeHashtagMasUsados().add(_listahashtagsfamososUsuarioNoRegistrado);
	}
}