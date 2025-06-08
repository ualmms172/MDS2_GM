package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuarioregistrado;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class UsuarioRegistrado extends Logueado {

	Notificaciones _Notificaciones;
	VerlistacompletahashtagUsuarioRegistrado _VerlistacompletahashtagUsuarioRegistrado;
	Hacertweet _Hacertweet;
	public MostrartweetspropiosUsuarioRegistrado _mostrartweetspropiosUsuarioRegistrado;
	public ListausuariosfamososUsuarioRegistrado _listausuariosfamososUsuarioRegistrado;
	public ListahashtagfamososUsuarioRegistrado _listahashtagfamososUsuarioRegistrado;
	VerlistacompletausuariosUsuarioRegistrado _VerlistacompletausuariosUsuarioRegistrado;
	Verperfilpropio _Verperfilpropio;

	public iUsuarioregistrado _iUsuarioregistrado = new BDPrincipal();
	public basededatos.UsuarioRegistrado u;
	
	public UsuarioRegistrado(MainView MainView, basededatos.UsuarioRegistrado u) {
		super(MainView);
		this.u=u;
		Interfaz.ur=this;
		
		this.getImgPerfilUsuario().setSrc(u.getFotoPerfil());

		this.getImgPerfilUsuario().setHeight("100%");
		this.getImgPerfilUsuario().setWidth("50%");
		
		this.getButtonBaneados().setVisible(false);
		this.getButtonNotificaciones().addClickListener(event -> Notificaciones()); 
		this.getButtonVerMasHashtags().addClickListener(event -> VerlistacompletahashtagUsuarioRegistrado());
		this.getButtonEscribirTweet().addClickListener(event -> Hacertweet()); 
		this.getButtonVerMasUsuarios().addClickListener(event -> VerlistacompletausuariosUsuarioRegistrado()); 
		this.getButtonVerPerfil().addClickListener(event -> Verperfilpropio()); 
		
		MostrartweetspropiosUsuarioRegistrado();
		ListausuariosfamososUsuarioRegistrado();
		ListahashtagfamososUsuarioRegistrado();
		
		
		}
	
	public void MostrartweetspropiosUsuarioRegistrado() {

		_mostrartweetspropiosUsuarioRegistrado = new MostrartweetspropiosUsuarioRegistrado(this);
		this.getVerticalLayoutInferior().as(VerticalLayout.class).add(_mostrartweetspropiosUsuarioRegistrado);

		
	}
	
	public void ListausuariosfamososUsuarioRegistrado() {
		_listausuariosfamososUsuarioRegistrado = new ListausuariosfamososUsuarioRegistrado(this);
		this.getHorizontalLayoutListaUsuariosMasFamosos2().add(_listausuariosfamososUsuarioRegistrado);

	}
	
	public void ListahashtagfamososUsuarioRegistrado() {
		_listahashtagfamososUsuarioRegistrado = new ListahashtagfamososUsuarioRegistrado(this);
		this.getHorizontalLayoutHashtagsMasUsados().add(_listahashtagfamososUsuarioRegistrado);

	}
	
	public void Notificaciones() {
		
		_Notificaciones = new Notificaciones(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_Notificaciones);
		
	}

	public void VerlistacompletahashtagUsuarioRegistrado() {
		
		_VerlistacompletahashtagUsuarioRegistrado = new VerlistacompletahashtagUsuarioRegistrado(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_VerlistacompletahashtagUsuarioRegistrado);
		
	}

	public void Hacertweet() {
		
		_Hacertweet = new Hacertweet(this); 

		MainView.removeAll();
		MainView.add(_Hacertweet);
		
		
	}

	public void VerlistacompletausuariosUsuarioRegistrado() {

		
		_VerlistacompletausuariosUsuarioRegistrado = new VerlistacompletausuariosUsuarioRegistrado(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_VerlistacompletausuariosUsuarioRegistrado);
		
	}
	

	public void Verperfilpropio() {
		_Verperfilpropio = new Verperfilpropio(this); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_Verperfilpropio);
		
	}

	
	
	
	
	
}