package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosFamosos_item extends ListaUsuariosGeneralUsuarioNoRegistrado_item {
	public ListaUsuariosFamosos_item(ListaUsuariosGeneral lista,basededatos.UsuarioRegistrado u) {
		super(lista,u);

		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		
		this.getImgPerfilUsuario().setHeight("30px");
		this.getImgPerfilUsuario().setWidth("10px");
		_listaUsuariosFamosos= (ListaUsuariosFamosos) lista;
	}

	public ListaUsuariosFamosos _listaUsuariosFamosos;
	
}