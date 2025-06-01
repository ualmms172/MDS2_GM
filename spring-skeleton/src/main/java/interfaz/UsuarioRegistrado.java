package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.BDPrincipal;
import basededatos.iUsuarioregistrado;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class UsuarioRegistrado extends Logueado {
	private int _id_user;
	private String _descripcion;
	private String _fotoPerfil;
	private String _fotoFondo;
	public Vector<UsuarioRegistrado> _bloqueadoPor = new Vector<UsuarioRegistrado>();
	public Vector<UsuarioRegistrado> _bloqueaA = new Vector<UsuarioRegistrado>();
	public Vector<UsuarioRegistrado> _seguidoPor = new Vector<UsuarioRegistrado>();
	public Vector<UsuarioRegistrado> _sigueA = new Vector<UsuarioRegistrado>();
	//public BD_UsuarioRegistrado _contenedor_UsuariosRegistrados;
//	public Vector<Tweet> _mencionadoEn = new Vector<Tweet>();
//	public baneo _unnamed_baneo_;
//	public Vector<Contenido> _meGusta = new Vector<Contenido>();
//	public Vector<Hashtag> _creaHashtag = new Vector<Hashtag>();
//	public Vector<Contenido> _escribe = new Vector<Contenido>();
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
//		MostrartweetspropiosUsuarioRegistrado_item item_tweets = new MostrartweetspropiosUsuarioRegistrado_item(_mostrartweetspropiosUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_mostrartweetspropiosUsuarioRegistrado.getVerticalListacontenido().as(VerticalLayout.class).add(item_tweets);
		
	}
	
	public void ListausuariosfamososUsuarioRegistrado() {
		_listausuariosfamososUsuarioRegistrado = new ListausuariosfamososUsuarioRegistrado(this);
		this.getHorizontalLayoutListaUsuariosMasFamosos2().add(_listausuariosfamososUsuarioRegistrado);
//		ListausuariosfamososUsuarioRegistrado_item item_tweets = new ListausuariosfamososUsuarioRegistrado_item(_listausuariosfamososUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_listausuariosfamososUsuarioRegistrado.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(item_tweets);
	}
	
	public void ListahashtagfamososUsuarioRegistrado() {
		_listahashtagfamososUsuarioRegistrado = new ListahashtagfamososUsuarioRegistrado(this);
		this.getHorizontalLayoutHashtagsMasUsados().add(_listahashtagfamososUsuarioRegistrado);
//		ListahashtagfamososUsuarioRegistrado_item item_tweets = new ListahashtagfamososUsuarioRegistrado_item(_listahashtagfamososUsuarioRegistrado,null); //AQUÍ HABRA QUE MODIFICAR EL NULL
//		_listahashtagfamososUsuarioRegistrado.getVerticalListahastagsgeneral().as(VerticalLayout.class).add(item_tweets);
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
		//Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		MainView.removeAll();
		MainView.add(_Hacertweet);
		
		
	}

	public void VerlistacompletausuariosUsuarioRegistrado() {
		// TODO - implement Usuarioregistrado.VerlistacompletausuariosUsuarioRegistrado
		
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