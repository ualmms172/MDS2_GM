package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;

public class ListausuariosUsuarioRegistrado extends ListaUsuariosGeneralUsuarioRegistrado {
	public VerlistacompletausuariosUsuarioRegistrado _verlistacompletausuariosUsuarioRegistrado;
	public Vector<ListausuariosUsuarioRegistrado_item> _item = new Vector<ListausuariosUsuarioRegistrado_item>();
	
	public ListausuariosUsuarioRegistrado(VerlistacompletausuariosUsuarioRegistrado lista) {
		
		_verlistacompletausuariosUsuarioRegistrado = lista; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.ur._iUsuarioregistrado.Cargar_Usuarios();
		
		for(basededatos.UsuarioRegistrado user : usuarios) {
			
			if(user.getBaneo().after(new Date())) {
				continue;
			}
			
			ListausuariosUsuarioRegistrado_item u= new ListausuariosUsuarioRegistrado_item(this,user);
			
			this.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(u);
		}
	}
}