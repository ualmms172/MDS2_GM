package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Multimedia;

public class BD_Multimedia {
	public BDPrincipal _bd_prin_mul;
	public Vector<Multimedia> _contiene_multimedia = new Vector<Multimedia>();
        
	public UsuarioRegistrado Escribir_Multimedia(String aUrl_foto, String aUrl_video,Contenido aContenido) throws PersistentException {
	
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
	    UsuarioRegistrado autor = null;

	    try {
	        // Suponiendo que el autor es el usuario con ID 1 (ajusta esto según tu sistema)
	        autor = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aContenido.getEscritoPor().getID()); // ← ajusta si es necesario

	    
	        

	        // Crear objeto Multimedia para la foto
	        if (aUrl_foto != null && !aUrl_foto.isEmpty()) {
	            Multimedia foto = MultimediaDAO.createMultimedia();
	            foto.setUrl(aUrl_foto);
	            foto.setFoto(true);
	            foto.setPerteneceA(aContenido);
	            MultimediaDAO.save(foto);
	        }

	        // Crear objeto Multimedia para el video
	        if (aUrl_video != null && !aUrl_video.isEmpty()) {
	            Multimedia video = MultimediaDAO.createMultimedia();
	            video.setUrl(aUrl_video);
	            video.setFoto(false);
	            video.setPerteneceA(aContenido);
	            MultimediaDAO.save(video);
	        }

	        t.commit();
	    } catch (Exception e) {
	        t.rollback();
	        e.printStackTrace();
	    }

	    MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    return UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(autor.getORMID());
		
		

		
	}

	

}