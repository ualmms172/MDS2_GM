package interfaz;

import vistas.VistaListausuariosgeneral_item;

public class ListaUsuariosGeneral_item extends VistaListausuariosgeneral_item{
	//private Label _nombreUsuario;
	//private Image _fotoPerfil;
	//private Button _accederPerfil;
	public ListaUsuariosGeneral _listaUsuariosGeneral;
	public basededatos.UsuarioRegistrado u;
	
	public ListaUsuariosGeneral_item (ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		this.u=u;
		_listaUsuariosGeneral  = lista; 
		this.getLabelNick().setText(u.getNick());
		this.getLabelNumSeguidores().setText(String.valueOf(u.seguidoPor.size()) + " Seguidores" );
		this.getLabelNumSeguidos().setText(String.valueOf(u.sigueA.size()) + " Seguidos" );
		this.getImgPerfilUsuario().setSrc(u.getFotoPerfil());
		this.getLabelNumTweets().setText(String.valueOf(u.escribe.size()) +" Contenido escrito" );
		
		this.getImgPerfilUsuario().setHeight("100%");
		this.getImgPerfilUsuario().setWidth("50%");
	}
}