package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import vistas.VistaUsuariosbaneados_item;

public class UsuariosBaneados_item extends VistaUsuariosbaneados_item {
	//private event _desbanearusuario;
	//private Label _nickUsuario;
	//private Label _numSeguidores;
	//private Image _fotoPerfil;
	//private Button _desbanearB;
	public UsuariosBaneados _usuariosBaneados;
	public basededatos.UsuarioRegistrado u;
	
	public UsuariosBaneados_item(UsuariosBaneados listaBaneados,basededatos.UsuarioRegistrado u) {
		
		_usuariosBaneados = listaBaneados; 
		this.u=u;
		this.getLabelNick().setText(u.getNick());
	//	this.getLabelNumSeguidores().setText(u.getn);
		this.getImgPerfilUsuarioBaneado().setSrc(u.getFotoPerfil());
		this.getButtonDesbanear().addClickListener(event -> Desbanearusuario());
	}
	
	

	public void Desbanearusuario() {
		this._usuariosBaneados.getVerticalListausuariosbaneados().as(VerticalLayout.class).remove(this);
	}
}