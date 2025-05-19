package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Texto;

public class BD_Texto {
	public BDPrincipal _bd_prin_tex;
	public Vector<Texto> _contiene_Textos = new Vector<Texto>();
	
	public UsuarioRegistrado Escribir_Texto(String aTexto, Contenido aContenido) throws PersistentException {
		
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
	    UsuarioRegistrado autor = null;

	    try {
	        // Obtener autor del contenido
	        autor = aContenido.getEscritoPor();

	        // Crear objeto Texto
	        Texto nuevoTexto = TextoDAO.createTexto();
	        nuevoTexto.setTexto(aTexto);
	        nuevoTexto.setPerteneceA(aContenido); // esto actualiza también el contenido

	        // Guardar texto
	        TextoDAO.save(nuevoTexto);

	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }

	    MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    return autor;
		
		
		
	
		
	}

	public Administrador BorrarTexto(Contenido aContenido) throws PersistentException {
		
		
		 PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		    Administrador admin = null;

		    try {
		        Texto texto = aContenido.getContieneTexto();

		        if (texto != null) {
		            TextoDAO.delete(texto);
		        }

		        t.commit();
		    } catch (Exception e) {
		        t.rollback();
		        e.printStackTrace();
		    }

		    MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		    return admin;
		
		
		
		
		
		
		
		
		
	}
}