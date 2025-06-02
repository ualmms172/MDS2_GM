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

	private final String remitente = "antoniogg0045@gmail.com"; 
	private final String clave = "xfurqhhkhuvrzlmp";

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

		codigoGenerado = String.valueOf((int) (Math.random() * 900000 + 100000));
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
			mensaje.setFrom(new InternetAddress(remitente));
			mensaje.setRecipients(Message.RecipientType.TO, InternetAddress.parse(destino));
			mensaje.setSubject("Código de verificación");
			mensaje.setText("Tu código de verificación es: " + codigo);

			Transport.send(mensaje);
			System.out.println("Correo enviado correctamente.");
			Notification.show("Se ha enviado el código al correo.");
		} catch (MessagingException e) {
			System.out.println("Error al enviar el correo: " + e.getMessage());
			e.printStackTrace();
			Notification.show("Error al enviar el correo.");
		}
	}

	public String getCodigoGenerado() {
		return codigoGenerado;
	}
}
