package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;

public class ListaUsuariosFamososAdministrador extends ListaUsuariosGeneralAdministrador {
	public Administrador _administrador;
	public Vector<ListaUsuariosFamososAdministrador_item> _item = new Vector<ListaUsuariosFamososAdministrador_item>();
	
	public ListaUsuariosFamososAdministrador(Administrador admin) {
		_administrador = admin; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.ad._iadministrador.Cargar_Usuarios();
		
		int n = usuarios.length;
		if(n>10)n=10;
		for(int i=0;i<n;i++) { //Como son los famosos solo se muestran los n primeros
			
			if(usuarios[i].getBaneo().after(new Date())) {
				if(n<usuarios.length) n++;
				continue;
			}
			
			basededatos.UsuarioRegistrado user = usuarios[i];
			
			ListaUsuariosFamososAdministrador_item u = new ListaUsuariosFamososAdministrador_item(this,user);
			
			this.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(u);
		}
	}
}