package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

import com.vaadin.flow.component.notification.Notification;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaRegistrar;

public class Registrar extends VistaRegistrar {
	//private Label _titulo;
	//private Label _nickT;
	//private Label _correoT;
	//private Label _contrasenaT;
	//private Label _fotoPerfilT;
	//private Label _fotoFondoT;
	//private Label _descripcionT;
	//private Label _previsualizacionFotoT;
	//private Image _preFoto;
	//private TextField _nick;
	//private TextField _correo;
	//private TextField _contrasena;
	//private TextField _fotoPerfil;
	//private TextField _fotoFondo;
	//private TextField _descripcion;
	//private Button _atras;
	//private Button _continuar;
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public ValidarCorreo _validarCorreo;
	
	public Registrar (UsuarioNoRegistrado usuarioNoRegistrado) {
		
		_usuarioNoRegistrado = usuarioNoRegistrado; 
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioNoRegistrado.MainView.removeAll(); 
			this._usuarioNoRegistrado.MainView.add(this._usuarioNoRegistrado); 
			
		});
		

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
		
		//Si falta algun campo esencial no se hace nada 
		if(nick.isBlank() || correo.isBlank() || contrasena.isBlank()) {
			Notification.show("Se deben llenar los campos de nick, correo y contraseña.");
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
		
		ValidarCorreo vista = new ValidarCorreo(this);
		_validarCorreo = vista;
		
		vista.datos[0] = nick;
		vista.datos[1] = contrasena;
		vista.datos[2] = correo;
		vista.datos[3] = descripcion;
		vista.datos[4] = fotoFondo;
		vista.datos[5] = !fotoPerfil.isBlank()?fotoPerfil:"https://images.icon-icons.com/2367/PNG/512/user_icon_143482.png";
		
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
	}
}