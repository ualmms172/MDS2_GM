package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;

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
	public Vector<Tweet> _mencionadoEn = new Vector<Tweet>();
	public baneo _unnamed_baneo_;
	public Vector<Contenido> _meGusta = new Vector<Contenido>();
	public Vector<Hashtag> _creaHashtag = new Vector<Hashtag>();
	public Vector<Contenido> _escribe = new Vector<Contenido>();
	Notificaciones _Notificaciones;
	VerlistacompletahashtagUsuarioRegistrado _VerlistacompletahashtagUsuarioRegistrado;
	Hacertweet _Hacertweet;
	public MostrartweetspropiosUsuarioRegistrado _mostrartweetspropiosUsuarioRegistrado;
	public ListausuariosfamososUsuarioRegistrado _listausuariosfamososUsuarioRegistrado;
	public ListahashtagfamososUsuarioRegistrado _listahashtagfamososUsuarioRegistrado;
	VerlistacompletausuariosUsuarioRegistrado _VerlistacompletausuariosUsuarioRegistrado;
	Verperfilpropio _Verperfilpropio;


	
	public UsuarioRegistrado(MainView MainView) {
		super(MainView);
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
		MainView.removeAll();
		MainView.add(_Notificaciones);
		
	}

	public void VerlistacompletahashtagUsuarioRegistrado() {
		
		_VerlistacompletahashtagUsuarioRegistrado = new VerlistacompletahashtagUsuarioRegistrado(this); 
		MainView.removeAll();
		MainView.add(_VerlistacompletahashtagUsuarioRegistrado);
		
	}

	public void Hacertweet() {
		
		_Hacertweet = new Hacertweet(this); 
		MainView.removeAll();
		MainView.add(_Hacertweet);
		
		
	}

	public void VerlistacompletausuariosUsuarioRegistrado() {
		// TODO - implement Usuarioregistrado.VerlistacompletausuariosUsuarioRegistrado
		
		_VerlistacompletausuariosUsuarioRegistrado = new VerlistacompletausuariosUsuarioRegistrado(this); 
		MainView.removeAll();
		MainView.add(_VerlistacompletausuariosUsuarioRegistrado);
		
	}
	

	public void Verperfilpropio() {
		_Verperfilpropio = new Verperfilpropio(this); 
		MainView.removeAll();
		MainView.add(_Verperfilpropio);
		
	}

	
	
	
	
	
}