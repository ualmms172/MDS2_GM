package interfaz;

import vistas.VistaUsuarionoregistrado;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuarioNoRegistrado;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

//import basededatos.iUsuarioNoRegistrado;

public class UsuarioNoRegistrado extends VistaUsuarionoregistrado{

	public IniciarSesin _iniciarSesin;
	public Verlistacompletahashtags _verlistacompletahashtags;
	public ListaUsuariosFamosos _listaUsuariosFamosos;
	public VerListaCompletaUsuariosUsuarioNoRegistrado _verListaCompletaUsuariosUsuarioNoRegistrado;
	public Registrar _registrar;
	public ListahashtagsfamososUsuarioNoRegistrado _listahashtagsfamososUsuarioNoRegistrado;
	
	MainView MainView;
	
	public iUsuarioNoRegistrado _iUsuarioNoRegistrado = new BDPrincipal();
	
	public UsuarioNoRegistrado(MainView MainView) {
	this.MainView = MainView;
	Interfaz.nr=this;
	
	this.getImageIconoTwitter().setSrc("https://www.lowi.es/blog/wp-content/uploads/2023/10/twitter-X-1000x625.jpeg");
	
	
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

	}
}