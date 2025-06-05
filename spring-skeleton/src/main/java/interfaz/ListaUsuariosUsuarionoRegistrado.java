package interfaz;

import java.util.Date;
import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;

public class ListaUsuariosUsuarionoRegistrado extends ListaUsuariosGeneralUsuarioNoRegistrado {
	public VerListaCompletaUsuariosUsuarioNoRegistrado _verListaCompletaUsuariosUsuarioNoRegistrado;
	public Vector<ListaUsuariosUsuarionoRegistrado_item> _item = new Vector<ListaUsuariosUsuarionoRegistrado_item>();
	
	public ListaUsuariosUsuarionoRegistrado(VerListaCompletaUsuariosUsuarioNoRegistrado lista) {
		
		_verListaCompletaUsuariosUsuarioNoRegistrado = lista; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.nr._iUsuarioNoRegistrado.Cargar_Usuarios();
		
		for(basededatos.UsuarioRegistrado user : usuarios) {
			
			if(user.getBaneo()!=null && user.getBaneo().after(new Date())) {
				continue;
			}
			
			ListaUsuariosUsuarionoRegistrado_item u= new ListaUsuariosUsuarionoRegistrado_item(this,user);
			
			this.getVerticalListausuariosgeneral().as(VerticalLayout.class).add(u);
		}
	}
}