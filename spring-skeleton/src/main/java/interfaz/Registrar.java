package interfaz;

import com.vaadin.flow.component.notification.Notification;
import gallardoMartinez.MainView.Pantalla;
import vistas.VistaRegistrar;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class Registrar extends VistaRegistrar {

	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public ValidarCorreo _validarCorreo;
	private String codigoGenerado;

	private final String remitente = "twitternoreplymds2@gmail.com"; 
	private final String clave = "hxemxtbijkmzmebb";

	public Registrar(UsuarioNoRegistrado usuarioNoRegistrado) {
		_usuarioNoRegistrado = usuarioNoRegistrado;
		this.getButtonAtras().addClickListener(event -> {
			this._usuarioNoRegistrado.MainView.removeAll();
			this._usuarioNoRegistrado.MainView.add(this._usuarioNoRegistrado);
		});

		this.getButtonContinuar().addClickListener(event -> ValidarCorreo());
	}

	public void Comprobarsihaydatosrepetidos() {
		throw new UnsupportedOperationException();
	}

	public void ValidarCorreo() {
		String nick = this.getTextFieldNick().getValue();
		String contrasena = this.getTextFieldContrasena().getValue();
		String correo = this.getTextFieldCorreo().getValue();
		String descripcion = this.getTextFieldDescripcion().getValue();
		String fotoFondo = this.getTextFieldFotoDeFondo().getValue();
		String fotoPerfil = this.getTextFieldFotoDePerfil().getValue();

		if (nick.isBlank() || correo.isBlank() || contrasena.isBlank()) {
			Notification.show("Se deben llenar los campos de nick, correo y contraseña.");
			return;
		}

		this.codigoGenerado = String.valueOf((int) (Math.random() * 900000 + 100000));
		enviarCodigoPorCorreo(correo, codigoGenerado);

		ValidarCorreo vista = new ValidarCorreo(this);
		_validarCorreo = vista;

		vista.datos[0] = nick;
		vista.datos[1] = contrasena;
		vista.datos[2] = correo;
		vista.datos[3] = descripcion;
		vista.datos[4] = fotoFondo;
		vista.datos[5] = fotoPerfil;

		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
	}
	
	
	private void enviarCodigoPorCorreo(String destino, String codigo) {
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

	public String getCodigoGenerado() {
		return codigoGenerado;
	}
}
