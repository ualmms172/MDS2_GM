package interfaz;

import basededatos.Comentario;

public class ListaComentariosGeneral_item extends ListaContenido_item {
	
	
	public ListaComentariosGeneral_item(ListaContenido lista,Comentario c) {
		super(lista,c);
		
		this.c=c;
		
		
		
		this.getButtonRetweet().setVisible(false);
	}

	public Comentario c;
	public ListaComentariosGeneral _listaComentariosGeneral;
	
	
	
}