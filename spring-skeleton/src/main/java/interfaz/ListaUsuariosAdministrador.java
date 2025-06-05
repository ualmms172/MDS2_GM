package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;

public class ListaUsuariosAdministrador extends ListaUsuariosGeneralAdministrador {
	public VerListaCompletaUsuariosAdministrador _verListaCompletaUsuariosAdministrador;
	public Vector<ListaUsuariosAdministrador_item> _item = new Vector<ListaUsuariosAdministrador_item>();
	
	public ListaUsuariosAdministrador(VerListaCompletaUsuariosAdministrador lista) {
		
		_verListaCompletaUsuariosAdministrador = lista; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.ad._iadministrador.Cargar_Usuarios();
		
		for(basededatos.UsuarioRegistrado user : usuarios) {
			
			if(user.getBaneo()!=null && user.getBaneo().after(new Date())) {
				continue;
			}
			
			ListaUsuariosAdministrador_item u= new ListaUsuariosAdministrador_item(this,user);
			
			this.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(u);
		}
	}
}