package interfaz;

import java.util.Vector;

public class Contenido {
	private int _id_cont;
	public Vector<UsuarioRegistrado> _meGustaPor = new Vector<UsuarioRegistrado>();
	public UsuarioRegistrado _escritoPor;
	public Vector<Multimedia> _contieneMultimedia = new Vector<Multimedia>();
	public Texto _contieneTexto;
}