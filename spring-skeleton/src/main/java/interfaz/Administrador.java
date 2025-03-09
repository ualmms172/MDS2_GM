package interfaz;

import java.util.Vector;
import gallardoMartinez.MainView;

public class Administrador extends Logueado {
	private int _id_admin;
	public Vector<baneo> _unnamed_baneo_ = new Vector<baneo>();
	//public BD_Administrador _contenedor_Administradores;
	
	Administrador(MainView MainView) {
		super(MainView);
		this.getButtonNotificaciones().setVisible(false);
		this.getImg1().setVisible(false);
		this.getButtonEscribirTweet().setVisible(false);
		this.getButtonVerPerfil().setVisible(false);
		}
}