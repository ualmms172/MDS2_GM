package interfaz;

import java.util.Vector;

public class Tweet extends Contenido {
	public Vector<Tweet> _retweeteadoPor = new Vector<Tweet>();
	public Tweet _retweeteaA;
	//public BD_Tweet _contenedor_Tweets;
	public Vector<Comentario> _comentarios = new Vector<Comentario>();
	public Vector<Hashtag> _contiene = new Vector<Hashtag>();
	public Vector<UsuarioRegistrado> _mencionaA = new Vector<UsuarioRegistrado>();
}