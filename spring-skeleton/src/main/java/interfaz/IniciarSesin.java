package interfaz;

import com.vaadin.flow.component.notification.Notification;
import gallardoMartinez.MainView.Pantalla;
import vistas.VistaIniciarsesin;
import gallardoMartinez.MainView;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class IniciarSesin extends VistaIniciarsesin {

    public UsuarioNoRegistrado _usuarioNoRegistrado;
    private String codigoGenerado;
    private basededatos.Logueado usuarioLogueado;

    private final String remitente = "Mds2CorreosApp@outlook.es";
    private final String clave = "mds2AntonioyMiguel";

    public IniciarSesin(UsuarioNoRegistrado usuarioNoRegistrado) {
        _usuarioNoRegistrado = usuarioNoRegistrado;

        this.getButtonAtras().addClickListener(event -> {
            this._usuarioNoRegistrado.MainView.removeAll();
            this._usuarioNoRegistrado.MainView.add(this._usuarioNoRegistrado);
        });

        this.getButtonContinuar().addClickListener(event -> Autentificarse());
    }

    public void Autentificarse() {
        if (this.getTextFieldCorreo().isEmpty()) {
            Notification.show("Introduce el usuario.");
            return;
        }
        if (this.getTextFieldContraseña().isEmpty()) {
            Notification.show("Introduce la contraseña.");
            return;
        }

        String nick = this.getTextFieldCorreo().getValue();
        String pass = this.getTextFieldContraseña().getValue();

        basededatos.Logueado log = this._usuarioNoRegistrado._iUsuarioNoRegistrado.Loguear(nick, pass);

        if (log == null) {
            Notification.show("Datos incorrectos.");
            return;
        }

        this.usuarioLogueado = log;
        this.codigoGenerado = String.valueOf((int) (Math.random() * 900000 + 100000));

        enviarCodigoPorCorreo(nick, codigoGenerado);

 
    }

    private void enviarCodigoPorCorreo(String destino, String codigo) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.office365.com");
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

    public basededatos.Logueado getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public String getCodigoGenerado() {
        return codigoGenerado;
    }
}