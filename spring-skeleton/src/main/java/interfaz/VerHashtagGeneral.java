package interfaz;

import vistas.VistaVerhashtaggeneral;

public class VerHashtagGeneral extends VistaVerhashtaggeneral {
	
	public VerHashtagGeneral(ListaHashtagsGeneral_item listaHashtag) {
		this.getLabelHashtag().setText(listaHashtag.h.getTitulo());
	}
	
	public VerHashtagGeneral(ListaTweetsGeneral_item listaTweets) {
		this.getLabelHashtag().setText(listaTweets.t.getContiene().getTitulo());
	}
	
	public VerHashtagGeneral(VertweetGeneral verTweet) {
		this.getLabelHashtag().setText(verTweet._listaTweetsGeneral.t.getContiene().getTitulo());
	}
}