package interfaz;

import java.util.Properties;

import com.vaadin.flow.component.notification.Notification;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;




public class Gestordecorreo {
	public IniciarSesin _iniciarSesin;
	
	private final String remitente = "twitternoreplymds2@gmail.com"; 
	private final String clave = "hxemxtbijkmzmebb";

	
	
	public void enviarContrasenaPorCorreo(String destino, String contrasena) {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");  // Importante si usas Java 8
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");  // Confiar en Gmail explícitamente
	//	props.put("mail.smtp.ssl.checkserveridentity", "false");  // Este en principio no se necesita

		Session sesion = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(remitente, clave);
			}
		});

		try {
			System.out.println("Enviando contraseña a: " + destino);

			Message mensaje = new MimeMessage(sesion);
			mensaje.setFrom(new InternetAddress(remitente, "Twitter"));
			mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));
			mensaje.setSubject("Recuperación de contraseña - Twitter");

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
				"          <h2 style=\"color:#1DA1F2;\">Recuperación de contraseña</h2>" +
				"          <p>Has solicitado recuperar tu contraseña. A continuación se muestra tu contraseña actual:</p>" +
				"          <div style=\"margin: 30px 0; text-align: center;\">" +
				"            <span style=\"font-size: 28px; font-weight: bold; color:#1DA1F2;\">" + contrasena + "</span>" +
				"          </div>" +
				"          <p>Por razones de seguridad, te recomendamos cambiar esta contraseña tras iniciar sesión.</p>" +
				"          <p style=\"margin-top:30px;\">Si no has solicitado esta recuperación, puedes ignorar este correo.</p>" +
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
			System.out.println("Correo con la contraseña enviado correctamente.");
			Notification.show("Se ha enviado tu contraseña al correo proporcionado.");
		} catch (Exception e) {
			System.out.println("Error al enviar la contraseña: " + e.getMessage());
			e.printStackTrace();
			Notification.show("Error al enviar el correo de recuperación.");
		}
	}
	

	public void enviarCodigoPorCorreo(String destino, String codigo) {
		Properties props = new Properties();
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.starttls.enable", "true");
//		props.put("mail.smtp.host", "smtp.gmail.com");
//		props.put("mail.smtp.port", "587");
		//Segunda versión
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");  // Importante si usas Java 8
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");  // Confiar en Gmail explícitamente
	//	props.put("mail.smtp.ssl.checkserveridentity", "false");  // Este en principio no se necesita

		Session sesion = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(remitente, clave);
			}
		});

		try {
			System.out.println("Enviando mensaje a: " + destino);

			Message mensaje = new MimeMessage(sesion);
			mensaje.setFrom(new InternetAddress(remitente, "Twitter")); 
			mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));
			mensaje.setSubject("Verificación de cuenta - Twitter");

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
				"          <h2 style=\"color:#1DA1F2;\">¡Verifica tu cuenta!</h2>" +
				"          <p>Gracias por unirte a nuestra comunidad. Para completar tu registro, introduce el siguiente código:</p>" +
				"          <div style=\"margin: 30px 0; text-align: center;\">" +
				"            <span style=\"font-size: 36px; font-weight: bold; color:#1DA1F2;\">" + codigo + "</span>" +
				"          </div>" +
				"          <p>Tenga un buen día.</p>" +
				"          <p style=\"margin-top:30px;\">Si no has solicitado este registro, puedes ignorar este correo.</p>" +
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
			System.out.println("Correo enviado correctamente.");
			Notification.show("Se ha enviado el código al correo.");
		} catch (Exception e) {
			System.out.println("Error al enviar el correo: " + e.getMessage());
			e.printStackTrace();
			Notification.show("Error al enviar el correo.");
		}
	}
	
	public void enviarCorreoAbandonoCuenta(String motivo, String userName) {
		String destino = "twitternoreplymds2@gmail.com"; 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.ssl.protocols", "TLSv1.2");  // Importante si usas Java 8
		props.put("mail.smtp.ssl.trust", "smtp.gmail.com");  // Confiar en Gmail explícitamente
	//	props.put("mail.smtp.ssl.checkserveridentity", "false");  // Este en principio no se necesita

		Session sesion = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(remitente, clave);
			}
		});

		try {
			System.out.println("Enviando notificación de abandono de cuenta de: " + userName);

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
				"          <p>El usuario <strong>" + userName + "</strong> ha decidido abandonar la aplicación.</p>" +
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