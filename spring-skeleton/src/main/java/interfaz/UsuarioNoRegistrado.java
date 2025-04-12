package interfaz;

import vistas.VistaUsuarionoregistrado;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;

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
	this.getButtonIniciarSesion().addClickListener(event -> IniciarSesin()); 
	this.getButtonRegistrarse().addClickListener(event -> Registrar()); 
	this.getButtonVerMasHashtags().addClickListener(event -> Verlistacompletahashtags()); 
	this.getButtonVerMasUsuarios().addClickListener(event -> VerListaCompletaUsuariosUsuarioNoRegistrado()); 
	
	
	
	
	}

	public void IniciarSesin() {
		
		_iniciarSesin = new IniciarSesin(this); 
		MainView.removeAll();
		MainView.add(_iniciarSesin); 

	}

	public void Verlistacompletahashtags() {
		_verlistacompletahashtags = new Verlistacompletahashtags(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_verlistacompletahashtags);
		
	}

	public void ListaUsuariosFamosos() {
		_listaUsuariosFamosos = new ListaUsuariosFamosos(this);
		this.getHorizontalLayoutListaUsuariosFamosos().add(_listaUsuariosFamosos);
		
		ListaUsuariosFamosos_item item_tweets = new ListaUsuariosFamosos_item(_listaUsuariosFamosos);
		_listaUsuariosFamosos.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}

	public void VerListaCompletaUsuariosUsuarioNoRegistrado() {

		_verListaCompletaUsuariosUsuarioNoRegistrado = new VerListaCompletaUsuariosUsuarioNoRegistrado(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_verListaCompletaUsuariosUsuarioNoRegistrado);
	
	}

	public void Registrar() {
		
		_registrar = new Registrar(this); 
		MainView.removeAll();
		MainView.add(_registrar);
		
	}

	public void ListahashtagsfamososUsuarioNoRegistrado() {
		_listahashtagsfamososUsuarioNoRegistrado = new ListahashtagsfamososUsuarioNoRegistrado(this);
		this.getHorizontallayoutListaDeHashtagMasUsados().add(_listahashtagsfamososUsuarioNoRegistrado);
		
		ListahashtagsfamososUsuarioNoRegistrado_item item_tweets = new ListahashtagsfamososUsuarioNoRegistrado_item(_listahashtagsfamososUsuarioNoRegistrado);
		_listahashtagsfamososUsuarioNoRegistrado.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(item_tweets);
	}
}