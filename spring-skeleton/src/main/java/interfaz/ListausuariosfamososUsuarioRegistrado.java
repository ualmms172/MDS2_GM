package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;

public class ListausuariosfamososUsuarioRegistrado extends ListaUsuariosGeneralUsuarioRegistrado {
	public UsuarioRegistrado _usuarioregistrado; //Usuarioregistrado
	public Vector<ListausuariosfamososUsuarioRegistrado_item> _item = new Vector<ListausuariosfamososUsuarioRegistrado_item>();
	
	public ListausuariosfamososUsuarioRegistrado(UsuarioRegistrado usuario) {
		
		_usuarioregistrado = usuario; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.ur._iUsuarioregistrado.Cargar_Usuarios();
		
		int n = usuarios.length;
		if(n>10)n=10;
		for(int i=0;i<n;i++) { //Como son los famosos solo se muestran los n primeros
			
			basededatos.UsuarioRegistrado user = usuarios[i];
			
			ListausuariosfamososUsuarioRegistrado_item u = new ListausuariosfamososUsuarioRegistrado_item(this,user);
			
			this.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(u);
		}
	}
	
	
}

