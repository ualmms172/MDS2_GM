package basededatos;

import java.util.Vector;
import basededatos.Administrador;

public class BD_Administrador {
	public BDPrincipal _bd_prin_adm;
	public Vector<Administrador> _contiene_Administradores = new Vector<Administrador>();

	public Administrador Buscar_administrador(String aNick, String aContrasena) {
		throw new UnsupportedOperationException();
	}
       
     public Administrador Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) {
		throw new UnsupportedOperationException();
	}

	public Administrador Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador)   {
		throw new UnsupportedOperationException();
	}






}