package interfaz;

import vistas.VistaListausuariosgeneral_item;

public class ListaUsuariosGeneral_item extends VistaListausuariosgeneral_item{
	
	public ListaUsuariosGeneral _listaUsuariosGeneral;
	public basededatos.UsuarioRegistrado u;
	
	
	public ListaUsuariosGeneral_item (ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		this.u=u;
		_listaUsuariosGeneral  = lista; 
		this.getLabelNick().setText(u.getNick());
		this.getLabelNumSeguidores().setText(String.valueOf(u.seguidoPor.size()) + (u.seguidoPor.size()>1?" Seguidores":" Seguidor" ));
		this.getLabelNumSeguidos().setText(String.valueOf(u.sigueA.size()) + (u.sigueA.size()>1?" Seguidos":" Seguido" ) );
		this.getImgPerfilUsuario().setSrc(u.getFotoPerfil());
		this.getLabelNumTweets().setText(String.valueOf(u.escribe.size()) +(u.escribe.size()>1?" Escritos":" Escrito" )  );
		
		this.getImgPerfilUsuario().setHeight("50px");
		this.getImgPerfilUsuario().setWidth("10px");
	}
}