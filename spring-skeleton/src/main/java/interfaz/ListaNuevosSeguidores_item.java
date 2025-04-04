package interfaz;

import vistas.VistaListanuevosseguidores_item;

public class ListaNuevosSeguidores_item extends VistaListanuevosseguidores_item {
	//private event _seguirUsuario;
	//private event _dejardeseguirausuario;
	//private Label _informacion;
	//private Button _seguir;
	public ListaNuevosSeguidores _listaNuevosSeguidores;
	
	public ListaNuevosSeguidores_item (ListaNuevosSeguidores lista) {
		
		_listaNuevosSeguidores = lista; 
	}
	
	

	public void SeguirUsuario() {
			this.getButtonSeguir_NoSeguir().getStyle().set("color", "red");
			this.getButtonSeguir_NoSeguir().setText("Dejar de seguir");
			ListaNuevosSeguidores la =  _listaNuevosSeguidores;
			la._item.add(this);
			
	}

	public void Dejardeseguirausuario() {
		this.getButtonSeguir_NoSeguir().getStyle().set("color", "gray");
		this.getButtonSeguir_NoSeguir().setText("Seguir");
		ListaNuevosSeguidores la =  _listaNuevosSeguidores;
		la._item.add(this);
	}
}