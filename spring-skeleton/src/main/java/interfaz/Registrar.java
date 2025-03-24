package interfaz;

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

	}
	
	public Registrar(ValidarCorreo validarCorreo) {
		
		_validarCorreo = validarCorreo;
	}
	
	
	
	
	

	public void Comprobarsihaydatosrepetidos() {
		throw new UnsupportedOperationException();
	}

	public void ValidarCorreo() {
		throw new UnsupportedOperationException();
	}
}