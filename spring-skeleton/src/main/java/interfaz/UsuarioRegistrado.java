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
	
	
	public MostrartweetspropiosUsuarioRegistrado _mostrartweetspropiosUsuarioRegistrado;
	public ListausuariosfamososUsuarioRegistrado _listausuariosfamososUsuarioRegistrado;
	public ListahashtagfamososUsuarioRegistrado _listahashtagfamososUsuarioRegistrado;
	
	public UsuarioRegistrado(MainView MainView) {
		super(MainView);
		this.getButtonBaneados().setVisible(false);
		
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
}