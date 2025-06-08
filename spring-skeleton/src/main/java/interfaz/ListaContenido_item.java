package interfaz;

import basededatos.Contenido;
import vistas.VistaListacontenido_item;

public class ListaContenido_item extends VistaListacontenido_item {
	
	public ListaContenido _lista;
	public Contenido cont;
	
	
	public ListaContenido_item(ListaContenido lista,Contenido c) {
	_lista = lista;

	this.cont=c;
	if(c.getContieneTexto()!=null)
		this.getLabelCuerpoTwet().setText(c.getContieneTexto().getTexto());
	else
		this.getLabelCuerpoTwet().setVisible(false);
	this.getLabelMeGusta().setText("Likes "+(String.valueOf(c.meGustaPor.size())));
	this.getLabelNombreUsuario().setText(c.getEscritoPor().getNick());
	this.getImgFotoPerfilTweet().setSrc(c.getEscritoPor().getFotoPerfil());
	
//	this.getVaadinHorizontalLayout().setMaxHeight("400px");
	this.getButtonRetweet().setMaxHeight("30px");
	this.getButtonBorrar().setMaxHeight("30px");
	this.getButtonMeGusta().setMaxHeight("30px");
	
	boolean tieneFoto =false;
	boolean tieneVideo = false;
	for (basededatos.Multimedia multimedia : c.contieneMultimedia.toArray()) {
	    if (!multimedia.getFoto()) {
	        tieneVideo = true;
	    }
	    else
	    	tieneFoto=true;
	}
	if(!tieneFoto)
		this.getImgFotoTweet().setVisible(false);
	if(!tieneVideo)
		this.getDivTweet().setVisible(false);

	for( basededatos.Multimedia multimedia : c.contieneMultimedia.toArray()) {
		if(multimedia.getFoto()) {
			this.getImgFotoTweet().setSrc(multimedia.getUrl());
			if(tieneVideo) {
				this.getImgFotoTweet().setWidth("125px");
				this.getImgFotoTweet().setHeight("125px");
			}
			else {
				this.getImgFotoTweet().setWidth("125px");
				this.getImgFotoTweet().setHeight("125px");
			}
		} else {
			String embedUrl = multimedia.getUrl();  // URL ya en formato embed

			if (embedUrl != null && !embedUrl.isBlank()) {
			    this.getDivTweet().getElement().setProperty("innerHTML",
			        "<iframe width='320' height='180' src='" + embedUrl + "' " +
			        "title='YouTube video player' frameborder='0' " +
			        "allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
//			    this.getDivTweet().getElement().setProperty("innerHTML",
//			    	    "<iframe style='width:30%; height:50%;' src='" + embedUrl + "' " +
//			    	    "title='YouTube video player' frameborder='0' " +
//			    	    "allow='accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
			} else {
			    this.getDivTweet().getElement().setProperty("innerHTML", "");
			}
		}
	}
	this.getHorizontalLayoutRetweeteadoPor().setVisible(false);
	this.getlabelRetweeteadoPor().setVisible(false);
	
	this.getImgFotoPerfilTweet().setHeight("50px");
	this.getImgFotoPerfilTweet().setWidth("50px");

	}
	
}