package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
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
		
		this.getImgPerfilUsuarioBaneado().setHeight("100%");
		this.getImgPerfilUsuarioBaneado().setWidth("50%");
	}
	
	

	public void Desbanearusuario() {
		basededatos.Administrador abd = Interfaz.ad._iadministrador.Desbanear(u, Interfaz.ad.a);
		Administrador a = new Administrador((MainView)Pantalla.MainView,abd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(new Verbaneados(a));
		//this._usuariosBaneados.getVerticalListausuariosbaneados().as(VerticalLayout.class).remove(this);
	}
}