package interfaz;

import java.util.Vector;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import gallardoMartinez.MainView.Interfaz;
import vistas.VistaUsuariosbaneados;

public class UsuariosBaneados extends VistaUsuariosbaneados {
	public Verbaneados _verbaneados;
	public Vector<UsuariosBaneados_item> _item = new Vector<UsuariosBaneados_item>();
	
	public UsuariosBaneados(Verbaneados baneados) {
		
		_verbaneados = baneados; 
		
		basededatos.UsuarioRegistrado[] usuarios = Interfaz.ad._iadministrador.Cargar_Baneados();
		
		for(basededatos.UsuarioRegistrado user : usuarios) {
			
			UsuariosBaneados_item u = new UsuariosBaneados_item(this,user);
			
			this.getVerticalListausuariosbaneados().as(VerticalLayout.class).add(u);
		}
	}
	
}