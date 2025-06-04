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
			
			this.enviarCorreoAbandonoCuenta(userName, motivo);
			
			
			
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
	
	private void enviarCorreoAbandonoCuenta(String nombreUsuario, String motivo) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session sesion = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(remitente, clave);
			}
		});

		try {
			System.out.println("Enviando notificación de abandono de cuenta de: " + nombreUsuario);

			Message mensaje = new MimeMessage(sesion);
			mensaje.setFrom(new InternetAddress(remitente, "Twitter"));
			mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));
			mensaje.setSubject("Notificación de abandono de cuenta - Twitter");

			String contenidoHtml =
				"<html>" +
				"<body style=\"margin:0; padding:0; font-family:Arial, sans-serif; background-color:#f4f4f4;\">" +
				"  <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"padding: 40px 0;\">" +
				"    <tr><td align=\"center\">" +
				"      <table width=\"600\" cellpadding=\"0\" cellspacing=\"0\" style=\"background:#ffffff; border-radius:10px; overflow:hidden; box-shadow:0 2px 10px rgba(0,0,0,0.1);\">" +
				"        <tr style=\"background-color:#1DA1F2;\">" +
				"          <td style=\"padding: 20px; text-align:center;\">" +
				"            <h1 style=\"color:#fff; margin:0; font-size:24px;\">Twitter</h1>" +
				"          </td>" +
				"        </tr>" +
				"        <tr><td style=\"padding: 30px; color:#333;\">" +
				"          <h2 style=\"color:#1DA1F2;\">Abandono de la aplicación</h2>" +
				"          <p>El usuario <strong>" + nombreUsuario + "</strong> ha decidido abandonar la aplicación.</p>" +
				"          <p><strong>Motivo:</strong> " + motivo + "</p>" +
				"          <p style=\"margin-top:30px;\">Este mensaje es solo informativo. No es necesario responder.</p>" +
				"        </td></tr>" +
				"        <tr><td style=\"background:#f4f4f4; text-align:center; padding:20px; color:#999;\">" +
				"          <small>© 2025 Twitter. Todos los derechos reservados.<br>No respondas a este mensaje. Es un correo automático.</small>" +
				"        </td></tr>" +
				"      </table>" +
				"    </td></tr>" +
				"  </table>" +
				"</body>" +
				"</html>";

			mensaje.setContent(contenidoHtml, "text/html; charset=utf-8");

			Transport.send(mensaje);
			System.out.println("Correo de abandono enviado correctamente.");
			Notification.show("Se ha enviado la notificación por correo.");
		} catch (Exception e) {
			System.out.println("Error al enviar el correo de abandono: " + e.getMessage());
			e.printStackTrace();
			Notification.show("Error al enviar la notificación por correo.");
		}
	}

	
	
	
	
	
}