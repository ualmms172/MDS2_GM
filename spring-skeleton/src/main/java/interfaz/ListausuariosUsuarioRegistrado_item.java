package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListausuariosUsuarioRegistrado_item extends ListaUsuariosGeneralUsuarioRegistrado_item {
	public ListausuariosUsuarioRegistrado_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		
		_listausuariosUsuarioRegistrado = (ListausuariosUsuarioRegistrado) lista;
		this.getButtonSeguir().addClickListener(Event -> {
			if(!dado)
				SeguirUsuario();
			else
				Dejardeseguirausuario();
		});
	}

	//private event _seguirUsuario;
	//private event _dejardeseguirausuario;
	//private Label _numSeguidores;
	//private Label _numSeguidos;
	//private Label _numTweets;
	//private Label _teSigue;
	//private Button _seguirUsuarioB;
	public ListausuariosUsuarioRegistrado _listausuariosUsuarioRegistrado;
	public boolean dado=false;

	public void SeguirUsuario() {
		this.getButtonSeguir().getStyle().set("color", "red");
		this.getButtonSeguir().setText("Dejar de seguir");

		VerlistacompletausuariosUsuarioRegistrado l = new VerlistacompletausuariosUsuarioRegistrado(_listausuariosUsuarioRegistrado._verlistacompletausuariosUsuarioRegistrado._usuarioregistrado);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(l);
		
		
	}

	public void Dejardeseguirausuario() {
		this.getButtonSeguir().getStyle().set("color", "gray");
		this.getButtonSeguir().setText("Seguir");
		
		VerlistacompletausuariosUsuarioRegistrado l = new VerlistacompletausuariosUsuarioRegistrado(_listausuariosUsuarioRegistrado._verlistacompletausuariosUsuarioRegistrado._usuarioregistrado);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(l);
	}
}