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
		
		ValidarCorreo vista = new ValidarCorreo(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
	}
}