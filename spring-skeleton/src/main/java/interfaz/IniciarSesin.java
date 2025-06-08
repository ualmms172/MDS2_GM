package interfaz;

import gallardoMartinez.MainView.Interfaz;

import gallardoMartinez.MainView.Pantalla;
import vistas.VistaIniciarsesin;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

import java.net.HttpURLConnection;

import java.net.URL;

import com.vaadin.flow.component.notification.Notification;


import vistas.VistaRegistrar;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Date;
import java.util.Properties;

import org.json.JSONObject;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.notification.Notification;

import gallardoMartinez.MainView;

public class IniciarSesin extends VistaIniciarsesin {
	//private event _autentificarse;
	//private Button _iniciarConGoogle;
	//private Button _recuperarContrase�a;
	//private Button _atras;
	//private Button _continuar;
	//private Label _titulo;
	//private Label _textoAyudaContrase�a;
	//private TextField _correoNick;
	//private TextField _contrasena;
	//private Image _iconoGoogle;
	//private Label _correoNickT;
	//private Label _contrasenaT;
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public Gestordecorreo _gestordecorreo;
	public APIDeGoogle _aPIDeGoogle;
	public IniciarsesinconGoogle _iniciarsesinconGoogle;
	private final String remitente = "twitternoreplymds2@gmail.com"; 
	private final String clave = "hxemxtbijkmzmebb";


	public IniciarSesin(UsuarioNoRegistrado usuarioNoRegistrado) {
		
		_usuarioNoRegistrado = usuarioNoRegistrado;
		this.getButtonAtras().addClickListener(event -> {
			
			this._usuarioNoRegistrado.MainView.removeAll(); 
			this._usuarioNoRegistrado.MainView.add(this._usuarioNoRegistrado);
		});
		
		this.getButtonContinuar().addClickListener(event -> Autentificarse()); 
		this.getButtonIniciarSesionConGoogle().addClickListener(event -> IniciarsesinconGoogle());
		this.getButtonRecuperarContraseña().addClickListener(event -> Recuperarlacontrasea());
		}
	
		
	public void Validardatos() {
		throw new UnsupportedOperationException();
	}

	public void Recuperarlacontrasea() {
		if(this.getTextFieldCorreo().isEmpty()) {
			Notification.show("Introduce el nick ");
			return;
		}
		String nick = this.getTextFieldCorreo().getValue();
		basededatos.UsuarioRegistrado user= this._usuarioNoRegistrado._iUsuarioNoRegistrado.BuscarUsuario(nick);
		
		if(user==null){
			Notification.show("Usuario no existente ");
			return;
		}
		
		String password = user.getContrasena();
		Gestordecorreo gestorCorreo = new Gestordecorreo();
		gestorCorreo.enviarContrasenaPorCorreo(user.getCorreo(), password);
		
		//Aqui ya haces que se envie esa contraseña.
	}
	
	

	public void IniciarsesinconGoogle() {
	    String clientId = "642402904207-ond1hkr3i2i5cte87rk0ghakli6dgdm1.apps.googleusercontent.com";
	    String clientSecret = "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";
	    String redirectUri = "http://localhost:8081/oauth2callback"; // asegúrate de registrar esta URL en Google

	    // 1. Construir URL de autenticación
	    String authUrl = "https://accounts.google.com/o/oauth2/v2/auth"
	        + "?scope=openid%20email%20profile"
	        + "&access_type=online"
	        + "&response_type=code"
	        + "&client_id=" + clientId
	        + "&redirect_uri=" + redirectUri;

	    // 2. Abrir la ventana de autenticación
	    getUI().ifPresent(ui -> {
	        ui.getPage().executeJs(""
	            + "const popup = window.open($0, '_blank', 'width=500,height=600');"
	            + "const interval = setInterval(async () => {"
	            + "  try {"
	            + "    if (popup.location.href.startsWith($1)) {"
	            + "      const url = new URL(popup.location.href);"
	            + "      const code = url.searchParams.get('code');"
	            + "      window.clearInterval(interval);"
	            + "      popup.close();"
	            + "      $2.$server.handleGoogleCode(code);"
	            + "    }"
	            + "  } catch (e) {}"
	            + "}, 1000);",
	            authUrl, redirectUri, getElement());
	    });
	}
	
	
	@ClientCallable
	public void handleGoogleCode(String code) {
	    try {
	        String clientId = "642402904207-ond1hkr3i2i5cte87rk0ghakli6dgdm1.apps.googleusercontent.com";
	        String clientSecret = "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";
	        String redirectUri = "http://localhost:8081/oauth2callback";

	        // 1. Intercambiar el código por un access_token
	        String tokenEndpoint = "https://oauth2.googleapis.com/token";
	        String params = "code=" + URLEncoder.encode(code, StandardCharsets.UTF_8)
	                + "&client_id=" + URLEncoder.encode(clientId, StandardCharsets.UTF_8)
	                + "&client_secret=" + URLEncoder.encode(clientSecret, StandardCharsets.UTF_8)
	                + "&redirect_uri=" + URLEncoder.encode(redirectUri, StandardCharsets.UTF_8)
	                + "&grant_type=authorization_code";

	        URL url = new URL(tokenEndpoint);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        conn.setDoOutput(true);
	        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

	        try (OutputStream os = conn.getOutputStream()) {
	            os.write(params.getBytes(StandardCharsets.UTF_8));
	        }

	        int responseCode = conn.getResponseCode();
	        InputStreamReader streamReader = (responseCode == 200) ?
	                new InputStreamReader(conn.getInputStream()) :
	                new InputStreamReader(conn.getErrorStream());

	        BufferedReader in = new BufferedReader(streamReader);
	        String response = in.lines().collect(Collectors.joining());
	        in.close();

	        if (responseCode != 200) {
	            System.err.println("Error al intercambiar el código: " + response);
	            Notification.show("Error al autenticar con Google.");
	            return;
	        }

	        String accessToken = new JSONObject(response).getString("access_token");

	        // 2. Obtener datos del usuario
	        URL userInfoUrl = new URL("https://www.googleapis.com/oauth2/v2/userinfo");
	        HttpURLConnection userConn = (HttpURLConnection) userInfoUrl.openConnection();
	        userConn.setRequestProperty("Authorization", "Bearer " + accessToken);

	        BufferedReader reader = new BufferedReader(new InputStreamReader(userConn.getInputStream()));
	        String userInfo = reader.lines().collect(Collectors.joining());
	        reader.close();

	        JSONObject userJson = new JSONObject(userInfo);
	        String email = userJson.getString("email");
	        String name = userJson.optString("name");

	        // 3. Autenticar al usuario
	        basededatos.UsuarioRegistrado user = this._usuarioNoRegistrado._iUsuarioNoRegistrado.BuscarUsuarioCorreo(email);
	        if (user == null) {
	            Notification.show("No se ha podido iniciar sesión. Debe registrarse.");
	        } else {
	            basededatos.Logueado log = user;
	            this._usuarioNoRegistrado.MainView.removeAll();
	            UsuarioRegistrado u = new UsuarioRegistrado((MainView) Pantalla.MainView, (basededatos.UsuarioRegistrado) log);
	            this._usuarioNoRegistrado.MainView.add(u);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        Notification.show("Error durante el inicio de sesión con Google.");
	    }
	}


	
	
	

	public void Autentificarse() {
		
		if(this.getTextFieldCorreo().isEmpty()) {
			Notification.show("Introduce el usuario.");
		}
		if(this.getTextFieldContraseña().isEmpty()) {
			Notification.show("Introduce la contraseña.");
            return;
		}
		
		String nick = this.getTextFieldCorreo().getValue();
		String pass = this.getTextFieldContraseña().getValue();
		basededatos.Logueado log = this._usuarioNoRegistrado._iUsuarioNoRegistrado.Loguear(nick, pass);
		if(log==null) {
			Notification.show("Datos incorrectos.");
			return;
		}
		
		
		
		if(log instanceof basededatos.Administrador) {
			this._usuarioNoRegistrado.MainView.removeAll();
			Administrador a = new Administrador((MainView)Pantalla.MainView,(basededatos.Administrador)log);
			this._usuarioNoRegistrado.MainView.add(a);
		}
		else {
			if(((basededatos.UsuarioRegistrado)log).getBaneo()!=null && ((basededatos.UsuarioRegistrado)log).getBaneo().after(new Date())) {
				Notification.show("Este usuario se encuentra baneado hasta: "+ ((basededatos.UsuarioRegistrado)log).getBaneo().toString());
				return;
			}
			this._usuarioNoRegistrado.MainView.removeAll();
			UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,(basededatos.UsuarioRegistrado)log);
			this._usuarioNoRegistrado.MainView.add(u);
		}
		
		
		
		//Autentificación Administrador
		
	     
		/*this._usuarioNoRegistrado.MainView.removeAll();
		Administrador admin = new Administrador(this._usuarioNoRegistrado.MainView); 
		this._usuarioNoRegistrado.MainView.add(admin);
	    */
		
		
		
	}
}