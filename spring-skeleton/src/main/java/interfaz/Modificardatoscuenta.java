package interfaz;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaModificardatoscuenta;

public class Modificardatoscuenta extends VistaModificardatoscuenta {
	//private event _modificar;
	//private Label _nick;
	//private Label _fotoPerfil;
	//private Label _fotoFondo;
	//private Label _descripcion;
	//private Label _previsualizacionFoto;
	//private Label _titulo;
	//private Image _preFotoPerfil;
	//private TextField _nickTF;
	//private TextField _fotoPerfilTF;
	//private TextField _fotoFondoTF;
	//private TextField _descripcionTF;
	//private Button _atras;
	//private Button _continuar;
	public Verperfilpropio _verperfilpropio;

	public Modificardatoscuenta(Verperfilpropio verperfilpropio) {
		
		_verperfilpropio = verperfilpropio; 
		
//		basededatos.UsuarioRegistrado u = null;
//		if(_verperfilpropio._usuarioregistrado!=null) {
//			u = _verperfilpropio._usuarioregistrado.u;
//		}
//		else if(_verperfilpropio._comentariospropios!=null) {
//			u = _verperfilpropio._comentariospropios.c.getEscritoPor();
//		}
//		else if(_verperfilpropio._mostrartweetsUsuarioRegistrado_item!=null) {
//			u = _verperfilpropio._mostrartweetsUsuarioRegistrado_item.t.getEscritoPor();
//		}
//		else if(_verperfilpropio._vertweetgeneralUsuarioRegistrado!=null) {
//			u = _verperfilpropio._vertweetgeneralUsuarioRegistrado._mostrartweetspropiosUsuarioRegistrado.t.getEscritoPor();
//		}
		
		this.getButtonModificar().addClickListener(event -> Modificar()); 
		
		this.getButtonAtras().addClickListener(event -> {
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_verperfilpropio);
			
			
		}); 
		
	}
	
	
	public void Modificar() {
			
		if(_verperfilpropio._usuarioregistrado!=null) {
			_verperfilpropio = new Verperfilpropio(_verperfilpropio._usuarioregistrado); 
		}
		else if(_verperfilpropio._mostrartweetsUsuarioRegistrado_item!=null) {
			_verperfilpropio = new Verperfilpropio(_verperfilpropio._mostrartweetsUsuarioRegistrado_item);
		}
		else if(_verperfilpropio._listaUsuariosGeneralUsuarioRegistrado!=null){
			_verperfilpropio = new Verperfilpropio(_verperfilpropio._listaUsuariosGeneralUsuarioRegistrado);
		}
		else {
			_verperfilpropio = new Verperfilpropio(_verperfilpropio._vertweetgeneralUsuarioRegistrado);
		}

		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilpropio);
		
//		if(_verperfilpropio._usuarioregistrado!=null) {
//			Verperfilpropio perfil = new Verperfilpropio(_verperfilpropio._usuarioregistrado);
//			_verperfilpropio._usuarioregistrado.MainView.removeAll();
//			_verperfilpropio._usuarioregistrado.MainView.add(perfil);
//		}
//		else if(_verperfilpropio._mostrartweetsUsuarioRegistrado_item!=null) {
//			Verperfilpropio perfil = new Verperfilpropio(_verperfilpropio._mostrartweetsUsuarioRegistrado_item);
//			if(_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado!=null) {
//				_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.removeAll();
//				_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView.add(perfil);
//			}
//			else if(_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado!=null) {
//				_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//				_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verHashtagUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
//			}
//			else {
//				_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//				_verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._verperfilgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
//			}
//		}
//		else if(_verperfilpropio._listaUsuariosGeneralUsuarioRegistrado!=null){
//			//if(_verperfilpropio._listaUsuariosGeneralUsuarioRegistrado)
//		}
//		else {
//			Verperfilpropio perfil = new Verperfilpropio(_verperfilpropio._vertweetgeneralUsuarioRegistrado);
//			_verperfilpropio._vertweetgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll();
//			_verperfilpropio._vertweetgeneralUsuarioRegistrado.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil);
//		}
		
		
	}
	
	public Modificardatoscuenta Recargar(UsuarioRegistrado log) {
		return new Modificardatoscuenta((Verperfilpropio)this._verperfilpropio.Recargar(log));
	}
}