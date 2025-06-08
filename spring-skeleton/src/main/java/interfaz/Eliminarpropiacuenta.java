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
	
	public Verperfilpropio _verperfilpropio;
	private final String remitente = "twitternoreplymds2@gmail.com"; 
	private final String clave = "hxemxtbijkmzmebb";
	private final String destino = "twitternoreplymds2@gmail.com"; // Correo al que se enviará el mensaje
	
	public Eliminarpropiacuenta(Verperfilpropio verperfilpropio) {
		
		_verperfilpropio = verperfilpropio; 
		
		
		
		this.getButtonAtras().addClickListener(event -> {
			
			
			
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
			
			
			
		}
		
		

		Interfaz.ur._iUsuarioregistrado.Eliminar_Usuario(Interfaz.ur.u);
		Interfaz.ur=null;
		UsuarioNoRegistrado vista = new UsuarioNoRegistrado((MainView)Pantalla.MainView);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
			
			
		


					
			
	}

	
	
	
	
	
}