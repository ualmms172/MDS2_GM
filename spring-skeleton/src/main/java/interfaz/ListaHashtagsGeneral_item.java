package interfaz;

import basededatos.Hashtag;
import vistas.VistaListahashtagsgeneral_item;

public class ListaHashtagsGeneral_item extends VistaListahashtagsgeneral_item {
	
	
	public Hashtag h;
	
	public ListaHashtagsGeneral _listaHashtagsGeneral;
	
	public ListaHashtagsGeneral_item(ListaHashtagsGeneral lista,Hashtag h) {
		
		_listaHashtagsGeneral = lista;
		this.h=h;
		if(h.getCreadoPor()==null)
			this.getLabelCreador().setText("Creado por: Usuario eliminado");
		else
			this.getLabelCreador().setText("Creado por: "+ h.getCreadoPor().getNick());
		this.getLabelHashtag().setText(h.getTitulo());
		this.getLabelNumTweets().setText("Num tweets "+String.valueOf(h.contenidoPor.size()));
		
	}
}