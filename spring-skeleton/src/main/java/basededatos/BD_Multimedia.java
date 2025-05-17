package basededatos;

import java.util.Vector;
import basededatos.Multimedia;

public class BD_Multimedia {
	public BDPrincipal _bd_prin_mul;
	public Vector<Multimedia> _contiene_multimedia = new Vector<Multimedia>();
        
	public UsuarioRegistrado Escribir_Multimedia(String aUrl_foto, String aUrl_video) {
		throw new UnsupportedOperationException();
	}

	public Administrador BorrarMultimedia(Contenido aContenido) {
		throw new UnsupportedOperationException();
	}

}