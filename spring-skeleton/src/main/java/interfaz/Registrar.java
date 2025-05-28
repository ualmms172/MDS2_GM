package interfaz;

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
			return;
		}
		
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
}