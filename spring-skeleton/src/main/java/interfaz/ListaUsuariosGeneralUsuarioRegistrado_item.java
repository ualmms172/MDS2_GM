package interfaz;

import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosGeneralUsuarioRegistrado_item extends ListaUsuariosGeneral_item {
	public ListaUsuariosGeneralUsuarioRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		//this.getLabelSeguido_NoSeguido().setText(null);
		
		// TODO Auto-generated constructor stub
		this.getButtonBanear().setVisible(false);
		this.getHorizontalListausuariosgeneral_item().addClickListener(event -> VerperfilUsuarioRegistrado());
	}

	public ListaUsuariosGeneralUsuarioRegistrado _listaUsuariosGeneralUsuarioRegistrado;
	public VerperfilgeneralUsuarioRegistrado _verperfilUsuarioRegistrado;

	public void VerperfilUsuarioRegistrado() {
		//_verperfilUsuarioRegistrado = new VerperfilgeneralUsuarioRegistrado(this);
		if(this.u==Interfaz.ur.u ) _verperfilUsuarioRegistrado = new Verperfilpropio(this);
		else if(!this.u.bloqueaA.contains(Interfaz.ur.u)) _verperfilUsuarioRegistrado = new Verperfilnobloqueado(this);
		else _verperfilUsuarioRegistrado = new Verperfilbloqueado(this);
		Pantalla.Anterior = Pantalla.MainView.getComponentAt(0);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(_verperfilUsuarioRegistrado);
	}
}