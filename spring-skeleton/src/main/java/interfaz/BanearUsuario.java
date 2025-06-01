package interfaz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;
import interfaz.ListaUsuariosAdministrador_item;
import interfaz.VerPerfilAdministrador;
import vistas.VistaBanearusuario;

public class BanearUsuario extends VistaBanearusuario{
	//private event _banearTemportalmente;
	//private event _banearIndefinidamente;
	//private Label _titulo;
	//private Label _solicitudFecha;
	//private TextField _fecha;
	//private Button _atras;
	//private Button _indefinido;
	//private Button _temporal;
	//private Label _texto;
	public ListaUsuariosAdministrador_item _listaUsuariosAdministrador;
	public VerPerfilAdministrador _verPerfilAdministrador;
	
	
	public BanearUsuario(ListaUsuariosAdministrador_item listaUsuariosAdministrador) {
		
		_listaUsuariosAdministrador = listaUsuariosAdministrador;
		this.getLabelAvisoBaneo().setText(_listaUsuariosAdministrador.u.getNick()); 
		
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
		this.getButtonIndefinido().addClickListener(event -> BanearTemporalmente());
		
		
		
		
		
		
	}
	
	public BanearUsuario(VerPerfilAdministrador verPerfilAdministrador) {
		
		_verPerfilAdministrador = verPerfilAdministrador; 
		basededatos.UsuarioRegistrado u = null;
		if(_verPerfilAdministrador._listaTweetsAdmin_item!=null) {
			u = _verPerfilAdministrador._listaTweetsAdmin_item.t.getEscritoPor();
		}
		else if(_verPerfilAdministrador._listaComentariosAdministrador!=null) {
			u = _verPerfilAdministrador._listaComentariosAdministrador.c.getEscritoPor();
		}
		else if(_verPerfilAdministrador._verTweetAdministrador!=null) {
			u = _verPerfilAdministrador._verTweetAdministrador._listaTweetsAdmin.t.getEscritoPor();
		}
		else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
			u = _verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
		}
		
		this.getLabelAvisoBaneo().setText(_listaUsuariosAdministrador.u.getNick());
		
		this.getButtonAtras().addClickListener(event -> {
			
			//ListaUsuariosAdministrador lu = (ListaUsuariosAdministrador) _listaUsuariosAdministrador._listaUsuariosGeneral;
			
			//VerListaCompletaUsuariosAdministrador vista= new VerListaCompletaUsuariosAdministrador(lu._verListaCompletaUsuariosAdministrador._administrador); 
			
			if(this._listaUsuariosAdministrador!=null) {
				
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_listaUsuariosAdministrador);
			}
			else {
				Pantalla.MainView.removeAll();
				Pantalla.MainView.add(_verPerfilAdministrador);
			}

			
			//lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).removeAll(); 
			
			
	        //lu._verListaCompletaUsuariosAdministrador.getVerticalLayoutVentanaCompleta().as(VerticalLayout.class).add(vista);
	
	});
		
		this.getButtonTemporal().addClickListener(event -> BanearTemporalmente());
		this.getButtonIndefinido().addClickListener(event -> BanearIndefinidamente());		
	
	}
	
	
	
	

	public void BanearTemporalmente() {
		basededatos.UsuarioRegistrado ubd = null;
		if(_listaUsuariosAdministrador!=null)
			ubd= _listaUsuariosAdministrador.u;
		else {
			if(_verPerfilAdministrador._listaTweetsAdmin_item!=null) {
				ubd= _verPerfilAdministrador._listaTweetsAdmin_item.cont.getEscritoPor();
			}
			else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
				ubd=_verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
			}
			else {
				ubd= _verPerfilAdministrador._listaComentariosAdministrador.cont.getEscritoPor();
			}
		}
			
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        formato.setLenient(false); // Para validar fechas incorrectas
        Date fecha=null;
        String fechaStr = this.getPlaceHolderTiempoBaneo().getValue();
        try {
             fecha = formato.parse(fechaStr);
            System.out.println("Fecha convertida: " + fecha);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
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
				ubd= _verPerfilAdministrador._listaTweetsAdmin_item.cont.getEscritoPor();
			}
			else if(_verPerfilAdministrador._listaUsuariosGeneralAdministrador!=null) {
				ubd=_verPerfilAdministrador._listaUsuariosGeneralAdministrador.u;
			}
			else {
				ubd= _verPerfilAdministrador._listaComentariosAdministrador.cont.getEscritoPor();
			}
		}
			
		basededatos.Administrador abd=Interfaz.ad._iadministrador.Banear(ubd, Interfaz.ad.a,null);
		Administrador ad = new Administrador((MainView)Pantalla.MainView,abd); 
		Verbaneados vb = new Verbaneados(ad);
		Pantalla.Anterior = ad;
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(vb);
	}
	
	public BanearUsuario Recargar(Administrador log) {
		BanearUsuario vista = null;
		if(this._listaUsuariosAdministrador!=null) {
			ListaUsuariosAdministrador list = new ListaUsuariosAdministrador (_listaUsuariosAdministrador._listaUsuariosAdministrador._verListaCompletaUsuariosAdministrador.Recargar(log));
			_listaUsuariosAdministrador._listaUsuariosAdministrador=list;
			vista=new BanearUsuario(_listaUsuariosAdministrador);
		}
		else {
			vista= new BanearUsuario(this._verPerfilAdministrador.Recargar(log));
		}
		return vista;
	}
}