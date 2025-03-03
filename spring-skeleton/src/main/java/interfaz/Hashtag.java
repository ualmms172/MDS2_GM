package interfaz;

import java.util.Vector;

public class Hashtag {
	private int _id_hash;
	private int _numTweets;
	private String _titulo;
	public Vector<Tweet> _contenidoPor = new Vector<Tweet>();
	//public BD_Hashtag _contenedor_hashtags;
	public UsuarioRegistrado _creadoPor;
}