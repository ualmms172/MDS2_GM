package interfaz;

import com.vaadin.flow.component.notification.Notification;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
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
	public String[] datos = new String[6];
	
	
	public ValidarCorreo(Registrar registrar) {
		
		_registrar = registrar; 
		this.getButtonValidar().addClickListener(event -> Registrarse()); 
		this.getButtonAtras().addClickListener(event->{
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(Pantalla.Anterior);
		});
	}
	
	
	public void Registrarse() {
		
		
		if (this.getTextFieldCuenta().getValue().equals(_registrar.getCodigoGenerado())) {

		basededatos.UsuarioRegistrado ubd = Interfaz.nr._iUsuarioNoRegistrado.Registrar_Usuario(datos[0], datos[3], datos[5], datos[4], datos[1],datos[2]);
		
		UsuarioRegistrado vista = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd); 
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vista);
		}
		else {
			
			Notification.show("El código de verificación es incorrecto. Por favor, inténtelo de nuevo o vuelva atrás");
			
		}
		
		
	}
	
	
		
}