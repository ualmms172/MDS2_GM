package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.orm.PersistentException;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.UsuarioRegistradoDAO;
import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
import interfaz.ListaUsuariosAdministrador_item;
import interfaz.VerPerfilAdministrador;
import vistas.VistaBanearusuario;

public class BanearUsuario extends VistaBanearusuario{

	public ListaUsuariosAdministrador_item _listaUsuariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	
	public BanearUsuario(ListaUsuariosAdministrador_item listaUsuariosAdministrador) {
		
		_listaUsuariosAdministrador = listaUsuariosAdministrador;
		this.getLabelAvisoBaneo().setText(_listaUsuariosAdministrador.u.getNick()); 
		this.getPlaceHolderTiempoBaneo().setPlaceholder("dd/mm/yyyy");
		
		this.getButtonAtras().addClickListener(event -> {
			
			if(this._listaUsuariosAdministrador!=null) {
				
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_listaUsuariosAdministrador);
			}
			else {
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_verPerfilAdministrador);
			}
			
			
				
		});
		
		this.getButtonTemporal().addClickListener(event -> BanearTemporalmente());
		this.getButtonIndefinido().addClickListener(event -> BanearIndefinidamente());
		
		
		
		
		
		
	}
	
	public BanearUsuario(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		this.getPlaceHolderTiempoBaneo().setPlaceholder("dd/mm/yyyy");
		//Como la forma de obtener el usuario a banear es incierta, primero se comprueba cual es para mostrar su nick
		basededatos.UsuarioRegistrado u = null;
		if(_verPerfilAdministrador._listaTweetsAdmin_item!=null) {
			if(_verPerfilAdministrador.mencion)
				u = _verPerfilAdministrador._listaTweetsAdmin_item.t.getMencionaA();
			else
				u = _verPerfilAdministrador._listaTweetsAdmin_item.t.getEscritoPor();
		}
		else if(_verPerfilAdministrador._listaComentariosAdministrador!=null) {
			u = _verPerfilAdministrador._listaComentariosAdministrador.c.getEscritoPor();
		}
		else if(_verPerfilAdministrador._verTweetAdministrador!=null) {
			if(_verPerfilAdministrador.mencion)
				u= _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getMencionaA();
			else
				u = _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor();
		}
		else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
			u = _verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
		}
		
		this.getLabelAvisoBaneo().setText(u.getNick());
		
		this.getButtonAtras().addClickListener(event -> { 
			
			if(this._listaUsuariosAdministrador!=null) {
				
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_listaUsuariosAdministrador);
			}
			else {
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_verPerfilAdministrador);
			}

	
	});
		
		this.getButtonTemporal().addClickListener(event -> BanearTemporalmente());
		this.getButtonIndefinido().addClickListener(event -> BanearIndefinidamente());		
	
	}
	
	
	
	

	public void BanearTemporalmente() {
		
		 if (getPlaceHolderTiempoBaneo().isEmpty()) {
             Notification.show("Por favor, rellena el tiempo antes de continuar.");
             return;
         }
		 
		 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        formato.setLenient(false); 
	        Date fecha=null;
	        String fechaStr = this.getPlaceHolderTiempoBaneo().getValue();
	        try {
	             fecha = formato.parse(fechaStr);
	        } catch (ParseException e) {
	        	Notification.show("La fecha debe estar en formato: dd/MM/yyyy ");
	             return;
	        }
		 
		basededatos.UsuarioRegistrado ubd = null;
		if(_listaUsuariosAdministrador!=null)
			ubd= _listaUsuariosAdministrador.u;
		else {
			if(_verPerfilAdministrador._listaTweetsAdmin_item!=null) {
				if(_verPerfilAdministrador.mencion)
					ubd= _verPerfilAdministrador._listaTweetsAdmin_item.t.getMencionaA();
				else
					ubd = _verPerfilAdministrador._listaTweetsAdmin_item.t.getEscritoPor();
			}
			else if(_verPerfilAdministrador._verTweetAdministrador!=null) {
				if(_verPerfilAdministrador.mencion)
					ubd= _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getMencionaA();
				else
					ubd = _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor();
			}
			else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
				ubd=_verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
			}
			else {
				ubd= _verPerfilAdministrador._listaComentariosAdministrador.cont.getEscritoPor();
			}
		}
			
		
	    
		basededatos.Administrador abd=Interfaz.ad._iadministrador.Banear(ubd, Interfaz.ad.a,fecha);
		Administrador ad = new Administrador((MainView)Pantalla.MainView,abd); 
		Verbaneados vb = new Verbaneados(ad);
		Pantalla.Anterior = ad;
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vb);
	}

	public void BanearIndefinidamente() {
		basededatos.UsuarioRegistrado ubd = null;
		if(_listaUsuariosAdministrador!=null)
			ubd= _listaUsuariosAdministrador.u;
		else {
			if(_verPerfilAdministrador._listaTweetsAdmin_item!=null) {
				if(_verPerfilAdministrador.mencion)
					ubd= _verPerfilAdministrador._listaTweetsAdmin_item.t.getMencionaA();
				else
					ubd = _verPerfilAdministrador._listaTweetsAdmin_item.t.getEscritoPor();
			}
			else if(_verPerfilAdministrador._verTweetAdministrador!=null) {
				if(_verPerfilAdministrador.mencion)
					ubd= _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getMencionaA();
				else
					ubd = _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor();
			}
			else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
				ubd=_verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
			}
			else {
				ubd= _verPerfilAdministrador._listaComentariosAdministrador.cont.getEscritoPor();
			}
		}
			
		basededatos.Administrador abd=Interfaz.ad._iadministrador.Banear(ubd, Interfaz.ad.a,new GregorianCalendar(9999, Calendar.DECEMBER, 31).getTime());
		Administrador ad = new Administrador((MainView)Pantalla.MainView,abd); 
		Verbaneados vb = new Verbaneados(ad);
		Pantalla.Anterior = ad;
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vb);
	}
	
	public BanearUsuario Recargar(Administrador log) {
		BanearUsuario vista = null;
		basededatos.UsuarioRegistrado u = null;
		if(this._listaUsuariosAdministrador!=null) {
			ListaUsuariosAdministrador list = new ListaUsuariosAdministrador (_listaUsuariosAdministrador._listaUsuariosAdministrador._verListaCompletaUsuariosAdministrador.Recargar(log));

			u = Interfaz.ad._iadministrador.ObtenerUsuarioId(u);
			
			ListaUsuariosAdministrador_item item = new ListaUsuariosAdministrador_item(list,u);
			vista=new BanearUsuario(item);
		}
		else {
			vista= new BanearUsuario(this._verPerfilAdministrador.Recargar(log));
		}
		return vista;
	}
}