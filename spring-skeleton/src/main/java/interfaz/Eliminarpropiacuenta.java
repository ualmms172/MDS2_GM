package interfaz;

import java.util.Properties;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;


import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import vistas.VistaEliminarpropiacuenta;

public class Eliminarpropiacuenta extends VistaEliminarpropiacuenta  {
	//private event _eliminacuenta;
	//private Label _titulo;
	//private Label _motivo;
	//private TextField _motivoTF;
	//private Button _atras;
	//private Button _eliminar;
	public Verperfilpropio _verperfilpropio;
	private final String remitente = "twitternoreplymds2@gmail.com"; 
	private final String clave = "hxemxtbijkmzmebb";
	private final String destino = "twitternoreplymds2@gmail.com"; // Correo al que se enviará el mensaje
	
	public Eliminarpropiacuenta(Verperfilpropio verperfilpropio) {
		
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
		
		
		this.getButtonAtras().addClickListener(event -> {
			
			
//	        UsuarioRegistrado usuario = _verperfilpropio._usuarioregistrado; 
//				
//				
//		    Verperfilpropio perfil = new Verperfilpropio(usuario); 		
//				
//			this._verperfilpropio.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 	
//			this._verperfilpropio.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(perfil); 	
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_verperfilpropio);
			
				
				
			}); 
		
		
		
		this.getButtonEliminar().addClickListener(event -> Eliminacuenta()); 
	}
	
	
	

	public void Eliminacuenta() {
		
		//Si no se indica ningun motivo entonces no se hace ningun correo
		if(!this.getTextFieldMotivo().isEmpty()) {
			String motivo = this.getTextFieldMotivo().getValue();
			String userName = Interfaz.ur.u.getNick();
			Gestordecorreo gestorCorreo = new Gestordecorreo();
			gestorCorreo.enviarCorreoAbandonoCuenta(motivo, userName);
			
			
			
			//Indicar que "userName" ha eliminado su cuenta indicando este motivo: "motivo" (O algo así)
		}
		
		
//		    MainView usuario = _verperfilpropio._usuarioregistrado.MainView; 
//			
//			
//		    UsuarioNoRegistrado usuarioNoRegistrado = new UsuarioNoRegistrado(usuario); 		
//				
//			this._verperfilpropio._usuarioregistrado.MainView.removeAll(); 	
//			this._verperfilpropio._usuarioregistrado.MainView.add(usuarioNoRegistrado); 	
		Interfaz.ur._iUsuarioregistrado.Eliminar_Usuario(Interfaz.ur.u);
		Interfaz.ur=null;
		UsuarioNoRegistrado vista = new UsuarioNoRegistrado((MainView)Pantalla.MainView);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
			
			
		

	     /* MainView usuario2 = _verperfilpropio._mostrartweetsUsuarioRegistrado_item._mostrartweetspropiosUsuarioRegistrado._usuarioregistrado.MainView;  
				
				
			    UsuarioNoRegistrado usuarioNoRegistrado2 = new UsuarioNoRegistrado(usuario2); 		
					
				this._verperfilpropio._usuarioregistrado.MainView.removeAll(); 	
				this._verperfilpropio._usuarioregistrado.MainView.add(usuarioNoRegistrado); 	
		*/		
					
			
	}
	
	
	
	
	
	
	
}