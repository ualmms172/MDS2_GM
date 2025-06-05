package interfaz;

import com.vaadin.flow.component.AttachEvent;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class ListausuariosUsuarioRegistrado_item extends ListaUsuariosGeneralUsuarioRegistrado_item {
	public ListausuariosUsuarioRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		// TODO Auto-generated constructor stub
		_listausuariosUsuarioRegistrado = (ListausuariosUsuarioRegistrado) lista;
		
		
		boolean bloqueado=false;
		for(basededatos.UsuarioRegistrado user : u.bloqueaA.toArray()){
			if(user.getID()==Interfaz.ur.u.getID()) {
				bloqueado=true;
				break;
			}
		}
		if(u.getID()==Interfaz.ur.u.getID() || bloqueado) { 
			this.getButtonSeguir().setVisible(false);
		}
		else {
		
		for(basededatos.UsuarioRegistrado user : u.seguidoPor.toArray()){
			if(user.getID()==Interfaz.ur.u.getID()) {
				dado=true;
				break;
			}
		}
		
		if(dado) {
			this.getButtonSeguir().getStyle().set("color", "red");
			this.getButtonSeguir().setText("Dejar de seguir");
		}
		
		this.getButtonSeguir().addClickListener(Event -> {
			if(!dado)
				SeguirUsuario();
			else
				Dejardeseguirausuario();
		});
		this.getButtonSeguir().getElement()
	    .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");
		}
	}

	//private event _seguirUsuario;
	//private event _dejardeseguirausuario;
	//private Label _numSeguidores;
	//private Label _numSeguidos;
	//private Label _numTweets;
	//private Label _teSigue;
	//private Button _seguirUsuarioB;
	public ListausuariosUsuarioRegistrado _listausuariosUsuarioRegistrado;
	public boolean dado;

	public void SeguirUsuario() {
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Seguir_Usuario(Interfaz.ur.u, u);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(new VerlistacompletausuariosUsuarioRegistrado(u));
	}

	public void Dejardeseguirausuario() {
		basededatos.UsuarioRegistrado ubd = Interfaz.ur._iUsuarioregistrado.Dejar_Seguir(Interfaz.ur.u, u);
		UsuarioRegistrado u = new UsuarioRegistrado((MainView)Pantalla.MainView,ubd);
		Pantalla.MainView.removeAll();
		Pantalla.MainView.add(new VerlistacompletausuariosUsuarioRegistrado(u));
		
	}
	
	@Override
	protected void onAttach(AttachEvent attachEvent) {
	    super.onAttach(attachEvent);


	    this.getButtonSeguir().getElement()
	        .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");
	}
}