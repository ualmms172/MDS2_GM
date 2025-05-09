package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListausuariosUsuarioRegistrado_item extends ListaUsuariosGeneralUsuarioRegistrado_item {
	public ListausuariosUsuarioRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		// TODO Auto-generated constructor stub
		
		_listausuariosUsuarioRegistrado = (ListausuariosUsuarioRegistrado) lista;
		
		this.getButtonSeguir().addClickListener(Event -> {
			if(!dado)
				SeguirUsuario();
			else
				Dejardeseguirausuario();
		});
		this.getButtonSeguir().getElement()
	    .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");
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

		
		
		
	}

	public void Dejardeseguirausuario() {
		this.getButtonSeguir().getStyle().set("color", "gray");
		this.getButtonSeguir().setText("Seguir");
		
	}
}