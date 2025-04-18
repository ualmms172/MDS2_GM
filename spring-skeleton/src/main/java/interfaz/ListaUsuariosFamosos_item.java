package interfaz;

import gallardoMartinez.MainView.Pantalla;

public class ListaUsuariosFamosos_item extends ListaUsuariosGeneralUsuarioNoRegistrado_item {
	public ListaUsuariosFamosos_item(ListaUsuariosGeneral lista) {
		super(lista);
		// TODO Auto-generated constructor stub
		this.getLabelNumSeguidores().setVisible(false);
		this.getLabelNumSeguidos().setVisible(false);
		this.getLabelNumTweets().setVisible(false);
		_listaUsuariosFamosos= (ListaUsuariosFamosos) lista;
	}

	public ListaUsuariosFamosos _listaUsuariosFamosos;
	
}