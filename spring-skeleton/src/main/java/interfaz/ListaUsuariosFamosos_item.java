package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosFamosos_item extends ListaUsuariosGeneralUsuarioNoRegistrado_item {
	public ListaUsuariosFamosos_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);
		// TODO Auto-generated constructor stub
		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		
		this.getImgPerfilUsuario().setHeight("50%");
		this.getImgPerfilUsuario().setWidth("1%");
		_listaUsuariosFamosos= (ListaUsuariosFamosos) lista;
	}

	public ListaUsuariosFamosos _listaUsuariosFamosos;
	
}