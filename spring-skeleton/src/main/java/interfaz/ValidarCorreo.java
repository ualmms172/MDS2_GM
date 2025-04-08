package interfaz;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Pantalla;
import interfaz.Registrar;
import vistas.VistaValidarcorreo;

public class ValidarCorreo extends VistaValidarcorreo{
	//private Label _titulo;
	//private Label _codigo;
	//private TextField _codigoTF;
	//private Button _atras;
	//private Button _continuar;
	//private event _registrarse;
	public Registrar _registrar;
	
	
	public ValidarCorreo(Registrar registrar) {
		
		_registrar = registrar; 
		this.getButtonValidar().addClickListener(event -> Registrarse()); 
	}
	
	
	public void Registrarse() {
		
		UsuarioRegistrado vista = new UsuarioRegistrado((MainView)Pantalla.MainView);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
	}
	
	
		
}