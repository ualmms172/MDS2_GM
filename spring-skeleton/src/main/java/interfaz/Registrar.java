package interfaz;

import java.net.HttpURLConnection;

import java.net.URL;

import com.vaadin.flow.component.notification.Notification;

import gallardoMartinez.MainView.Interfaz;
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



	public Registrar(UsuarioNoRegistrado usuarioNoRegistrado) {
		_usuarioNoRegistrado = usuarioNoRegistrado;
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioNoRegistrado.MainView.removeAll(); 
			this._usuarioNoRegistrado.MainView.add(this._usuarioNoRegistrado); 
			
			
		});
		
		this.getImgPerfil().setHeight("5%");
		this.getImgPerfil().setWidth("80%");

		this.getTextFieldFotoDePerfil().addValueChangeListener(event -> {
		    String url = event.getValue();
		    if (url != null && !url.isEmpty()) {
		        this.getImgPerfil().setSrc(url);
		    } else {
		    	this.getImgPerfil().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
		});

		this.getButtonContinuar().addClickListener(event -> ValidarCorreo());
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
		
		if(Interfaz.nr._iUsuarioNoRegistrado.BuscarUsuarioCorreo(correo)!=null) {
			Notification.show("Ya existe un usuario vinculado al correo proporcionado.");
			return;
		}
		if(Interfaz.nr._iUsuarioNoRegistrado.BuscarUsuario(nick)!=null) {
			Notification.show("Ya existe un usuario con ese nick.");
			return;
		}
		Boolean notificationPassword = false;
		if(!contrasena.matches(".*[!\"#$%&'()*+,\\-./:;<=>?@\\[\\\\\\]^_`{|}~].*")) {
			Notification.show("La contraseña debe tener un caracter especial.");
			notificationPassword=true;
		}
		if(!contrasena.matches(".*[A-Z].*") || !contrasena.matches(".*[a-z].*")) {
			Notification.show("La contraseña debe tener al menos una mayuscula y una minuscula.");
			notificationPassword=true;
		}
		if(contrasena.length()<8 || contrasena.length()>14) {
			Notification.show("La contraseña debe ser entre 8 y 14 caracteres");
			notificationPassword=true;
		}
		if(notificationPassword) {
			return;
		}
		
		// Comprobamos que la foto(perfil) lo sea realmente
		if (!fotoPerfil.isBlank()) {
			try {
				URL url = new URL(fotoPerfil);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("HEAD");
				connection.setConnectTimeout(3000);
				connection.setReadTimeout(3000);
				connection.connect();

				String contentType = connection.getContentType();
				if (contentType == null || !contentType.startsWith("image/")) {
					Notification.show("Si se rellena el campo foto de perfil debe contener un enlace a una foto.");
					return;
				}
			} catch (Exception e) {
				Notification.show("Si se rellena el campo foto de perfil debe contener un enlace a una foto.");
				return;
			}
		}
		// Comprobamos que la foto(fondo) lo sea realmente
		if (!fotoFondo.isBlank()) {
			try {
				URL url = new URL(fotoFondo);
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("HEAD");
				connection.setConnectTimeout(3000);
				connection.setReadTimeout(3000);
				connection.connect();

				String contentType = connection.getContentType();
				if (contentType == null || !contentType.startsWith("image/")) {
					Notification.show("Si se rellena el campo foto de fondo debe contener un enlace a una foto.");
					return;
				}
			} catch (Exception e) {
				Notification.show("Si se rellena el campo foto de fondo debe contener un enlace a una foto.");
				return;
			}
		}
		
    
		this.codigoGenerado = String.valueOf((int) (Math.random() * 900000 + 100000));
		Gestordecorreo gestorCorreo = new Gestordecorreo(); 
		gestorCorreo.enviarCodigoPorCorreo(correo, codigoGenerado);

		ValidarCorreo vista = new ValidarCorreo(this);
		_validarCorreo = vista;

		vista.datos[0] = nick;
		vista.datos[1] = contrasena;
		vista.datos[2] = correo;
		vista.datos[3] = descripcion;
		vista.datos[4] = !fotoFondo.isBlank()?fotoFondo:"https://www.lowi.es/blog/wp-content/uploads/2023/10/twitter-X-1000x625.jpeg";
		vista.datos[5] = !fotoPerfil.isBlank()?fotoPerfil:"https://images.icon-icons.com/2367/PNG/512/user_icon_143482.png";
		

		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
	}
	
	
	public String getCodigoGenerado() {
		return codigoGenerado;
	}
}
