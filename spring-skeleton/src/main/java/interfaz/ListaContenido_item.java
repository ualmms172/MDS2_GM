package interfaz;

import basededatos.Contenido;
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
	public Contenido cont;
	
	
	public ListaContenido_item(ListaContenido lista,Contenido c) {
	_lista = lista;

	this.cont=c;
	this.getLabelNombreUsuario().setText(c.getEscritoPor().getNick());
	this.getImgFotoPerfilTweet().setSrc(c.getEscritoPor().getFotoPerfil());
	this.getLabelCuerpoTwet().setText(c.getContieneTexto().getTexto());//Imagino que este será en un if
	//Falta el de la foto del tweet en el caso de que exista
  this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
	this.getlabelRetweeteadoPor().setVisible(false);

	}
	
}