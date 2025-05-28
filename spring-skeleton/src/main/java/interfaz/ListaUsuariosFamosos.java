package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import basededatos.Hashtag;
import gallardoMartinez.MainView.Interfaz;

public class ListaUsuariosFamosos extends ListaUsuariosGeneralUsuarioNoRegistrado {
	public UsuarioNoRegistrado _usuarioNoRegistrado;
	public Vector<ListaUsuariosFamosos_item> _item = new Vector<ListaUsuariosFamosos_item>();
	
	public ListaUsuariosFamosos(UsuarioNoRegistrado usuario) {
		
		_usuarioNoRegistrado =  usuario; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.nr._iUsuarioNoRegistrado.Cargar_Usuarios();
		
		for(int i=0;i<10;i++) { //Como son los famosos solo se muestran los n primeros
			
			basededatos.UsuarioRegistrado user = usuarios[i];
			
			ListaUsuariosFamosos_item u = new ListaUsuariosFamosos_item(this,user);
			
			this.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(u);
		}
	}
	
}