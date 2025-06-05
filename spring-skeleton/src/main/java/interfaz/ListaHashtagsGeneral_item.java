package interfaz;

import basededatos.Hashtag;
import vistas.VistaListahashtagsgeneral_item;

public class ListaHashtagsGeneral_item extends VistaListahashtagsgeneral_item {
	//private Label _nombreHashtag;
	//private Button _accederHashtag;
	
	public Hashtag h;
	
	public ListaHashtagsGeneral _listaHashtagsGeneral;
	
	public ListaHashtagsGeneral_item(ListaHashtagsGeneral lista,Hashtag h) {
		
		_listaHashtagsGeneral = lista;
		this.h=h;
		this.getLabelCreador().setText("Creado por: "+h.getCreadoPor().getNick());
		this.getLabelHashtag().setText(h.getTitulo());
		this.getLabelNumTweets().setText(String.valueOf(h.getNumTweets()));
		
	}
}