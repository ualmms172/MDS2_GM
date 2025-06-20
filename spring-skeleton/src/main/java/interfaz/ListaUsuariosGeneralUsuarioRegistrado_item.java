package interfaz;

import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosGeneralUsuarioRegistrado_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralUsuarioRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);

		this.getButtonBanear().setVisible(false);
		this.getHorizontalListausuariosgeneral_item().addClickListener(event -> VerperfilUsuarioRegistrado());
	}

	public ListaUsuariosGeneralUsuarioRegistrado _listaUsuariosGeneralUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;

	public void VerperfilUsuarioRegistrado() {

		if(this.u.getID()==Interfaz.ur.u.getID()) _verperfilUsuarioRegistrado = new Verperfilpropio(this);
		else {
			boolean bloqueado=false;
			for(basededatos.UsuarioRegistrado usu : u.bloqueaA.toArray()) {
				if(usu.getID()==Interfaz.ur.u.getID()) {
					bloqueado=true;
					break;
				}
			}
			if(!bloqueado) _verperfilUsuarioRegistrado = new Verperfilnobloqueado(this);
			else _verperfilUsuarioRegistrado = new Verperfilbloqueado(this);
		}
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}
}