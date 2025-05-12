package basededatos;

import java.util.Vector;
import basededatos.Comentario;

public class BD_Comentario {
	public BDPrincipal _bd_prin_com;
	public Vector<Comentario> _contiene_Comentarios = new Vector<Comentario>();
        public Comentario[] Cargar_Comentarios(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void Escribir_Comentario(String aTexto, String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public void BorrarComentarios(Tweet aTweet) {
		throw new UnsupportedOperationException();
	}

	public void BorrarComentario(Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public void DarLikeComentario(Comentario aComentario) {
		throw new UnsupportedOperationException();
	}

	public void QuitarLikeComentario(Comentario aComentario) {
		throw new UnsupportedOperationException();
	}









}