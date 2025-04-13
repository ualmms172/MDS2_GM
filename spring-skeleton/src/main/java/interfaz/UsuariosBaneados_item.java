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
	
	public UsuariosBaneados_item(UsuariosBaneados listaBaneados) {
		
		_usuariosBaneados = listaBaneados; 
		this.getButtonDesbanear().addClickListener(event -> Desbanearusuario());
	}
	
	

	public void Desbanearusuario() {
		this._usuariosBaneados.getVerticalListausuariosbaneados().as(VerticalLayout.class).remove(this);
	}
}