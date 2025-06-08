package interfaz;

import com.vaadin.flow.component.AttachEvent;

import gallardoMartinez.MainView;
import gallardoMartinez.MainView.Interfaz;
import gallardoMartinez.MainView.Pantalla;

public class ListausuariosUsuarioRegistrado_item extends ListaUsuariosGeneralUsuarioRegistrado_item {
	public ListausuariosUsuarioRegistrado_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);

		_listausuariosUsuarioRegistrado = (ListausuariosUsuarioRegistrado) lista;
		
		boolean seguido=false;
		for(basededatos.UsuarioRegistrado user : Interfaz.ur.u.seguidoPor.toArray()) {
			if(user.getID()==u.getID()) {
				seguido=true;
				break;
			}
		}
		this.getLabelSeguido_NoSeguido().setText(seguido?"Te sigue": "No te sigue");
		
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
	
	//Ya que se puede llegar desde un "Para atras" es importante que siempre que se llegue a esta vista se ejecute
	//Se impide que si se pulsa el boton de seguir pueda activarse el layout
	@Override
	protected void onAttach(AttachEvent attachEvent) {
	    super.onAttach(attachEvent);


	    this.getButtonSeguir().getElement()
	        .executeJs("this.addEventListener('click', function(e) { e.stopPropagation(); })");
	}
}