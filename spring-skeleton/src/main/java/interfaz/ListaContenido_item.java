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
	if(c.getContieneTexto()!=null)
		this.getLabelCuerpoTwet().setText(c.getContieneTexto().getTexto());
	else
		this.getLabelCuerpoTwet().setVisible(false);
	this.getLabelMeGusta().setText((String.valueOf(c.meGustaPor.size())));
	this.getLabelNombreUsuario().setText(c.getEscritoPor().getNick());
	this.getImgFotoPerfilTweet().setSrc(c.getEscritoPor().getFotoPerfil());
	for( basededatos.Multimedia multimedia : c.contieneMultimedia.toArray()) {
		if(multimedia.getFoto())
			this.getImgFotoTweet().setSrc(multimedia.getUrl());
		else {
			String embedUrl = multimedia.getUrl();  // URL ya en formato embed

			if (embedUrl != null && !embedUrl.isBlank()) {
			    this.getDivTweet().getElement().setProperty("innerHTML",
			        "<iframe width='560' height='315' src='" + embedUrl + "' " +
			        "title='YouTube video player' frameborder='0' " +
			        "allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
			} else {
			    this.getDivTweet().getElement().setProperty("innerHTML", "");
			}
		}
	}
	this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
	this.getlabelRetweeteadoPor().setVisible(false);
	
	this.getImgFotoPerfilTweet().setHeight("50%");
	this.getImgFotoPerfilTweet().setWidth("20%");

	}
	
}