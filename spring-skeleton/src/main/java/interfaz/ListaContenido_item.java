package interfaz;

import vistas.VistaListacontenido_item;

public class ListaContenido_item extends VistaListacontenido_item {
	//private Label _nombreUsuario;
	//private Label _textoTweet;
	//private Label _numMeGustas;
	//private Image _fotoPerfil;
	//private Image _iconoMeGusta;
	//private Image _fotoTweet;
	//private Button _accederUsuario;
	//public ListaContenido _listaContenido;
	public ListaContenido _lista;
	
	
	public ListaContenido_item(ListaContenido lista) {
	_lista = lista;
	this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
	this.getlabelRetweeteadoPor().setVisible(false);
	}
	
}