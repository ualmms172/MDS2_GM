package interfaz;

import java.net.HttpURLConnection;
import java.net.URL;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
import vistas.VistaModificardatoscuenta;

public class Modificardatoscuenta extends VistaModificardatoscuenta {
	
	public Verperfilpropio _verperfilpropio;

	public Modificardatoscuenta(Verperfilpropio verperfilpropio) {
		
		_verperfilpropio = verperfilpropio; 
		

		
		this.getButtonModificar().addClickListener(event -> Modificar()); 
		
		this.getButtonAtras().addClickListener(event -> {
			
			Pantalla.MainView.removeAll();
			Pantalla.MainView.add(_verperfilpropio);
			
			
		}); 
		
		this.getTextFieldFotoDePerfil().addValueChangeListener(event -> {
		    String url = event.getValue();
		    if (url != null && !url.isEmpty()) {
		        this.getImgPerfil().setSrc(url);
		    } else {
		    	this.getImgPerfil().setSrc(""); // Limpia la imagen si el campo está vacío
		    }
		});
		
		
	}
	
	
	public void Modificar() {
			

		String descripcion = this.getTextFieldDescripcion().getValue();
		String nick = this.getTextFieldNick().getValue();
		String fotoPerfil = this.getTextFieldFotoDePerfil().getValue();
		String fotoFondo = this.getTextFieldFotoDeFondo().getValue();
		
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
		
		basededatos.UsuarioRegistrado ubd= Interfaz.ur._iUsuarioregistrado.ModificarCuenta(Interfaz.ur.u, descripcion, fotoFondo, fotoPerfil, nick);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(this._verperfilpropio.Recargar(u));
		

		
		
	}
	
	public Modificardatoscuenta Recargar(UsuarioRegistrado log) {
		return new Modificardatoscuenta((Verperfilpropio)this._verperfilpropio.Recargar(log));
	}
}