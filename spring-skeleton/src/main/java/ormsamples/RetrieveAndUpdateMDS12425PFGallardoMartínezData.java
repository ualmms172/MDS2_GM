/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateMDS12425PFGallardoMartínezData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Logueado lbasededatosLogueado = basededatos.LogueadoDAO.loadLogueadoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.LogueadoDAO.save(lbasededatosLogueado);
			basededatos.UsuarioRegistrado lbasededatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.UsuarioRegistradoDAO.save(lbasededatosUsuarioRegistrado);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Contenido lbasededatosContenido = basededatos.ContenidoDAO.loadContenidoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ContenidoDAO.save(lbasededatosContenido);
			basededatos.Tweet lbasededatosTweet = basededatos.TweetDAO.loadTweetByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.TweetDAO.save(lbasededatosTweet);
			basededatos.Hashtag lbasededatosHashtag = basededatos.HashtagDAO.loadHashtagByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.HashtagDAO.save(lbasededatosHashtag);
			basededatos.Multimedia lbasededatosMultimedia = basededatos.MultimediaDAO.loadMultimediaByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.MultimediaDAO.save(lbasededatosMultimedia);
			basededatos.Texto lbasededatosTexto = basededatos.TextoDAO.loadTextoByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.TextoDAO.save(lbasededatosTexto);
			basededatos.Comentario lbasededatosComentario = basededatos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Update the properties of the persistent object
			basededatos.ComentarioDAO.save(lbasededatosComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Logueado by LogueadoCriteria");
		basededatos.LogueadoCriteria lbasededatosLogueadoCriteria = new basededatos.LogueadoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosLogueadoCriteria.ID.eq();
		System.out.println(lbasededatosLogueadoCriteria.uniqueLogueado());
		
		System.out.println("Retrieving UsuarioRegistrado by UsuarioRegistradoCriteria");
		basededatos.UsuarioRegistradoCriteria lbasededatosUsuarioRegistradoCriteria = new basededatos.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosUsuarioRegistradoCriteria.ID.eq();
		System.out.println(lbasededatosUsuarioRegistradoCriteria.uniqueUsuarioRegistrado());
		
		System.out.println("Retrieving Administrador by AdministradorCriteria");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosAdministradorCriteria.ID.eq();
		System.out.println(lbasededatosAdministradorCriteria.uniqueAdministrador());
		
		System.out.println("Retrieving Contenido by ContenidoCriteria");
		basededatos.ContenidoCriteria lbasededatosContenidoCriteria = new basededatos.ContenidoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosContenidoCriteria.id_cont.eq();
		System.out.println(lbasededatosContenidoCriteria.uniqueContenido());
		
		System.out.println("Retrieving Tweet by TweetCriteria");
		basededatos.TweetCriteria lbasededatosTweetCriteria = new basededatos.TweetCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosTweetCriteria.id_cont.eq();
		System.out.println(lbasededatosTweetCriteria.uniqueTweet());
		
		System.out.println("Retrieving Hashtag by HashtagCriteria");
		basededatos.HashtagCriteria lbasededatosHashtagCriteria = new basededatos.HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosHashtagCriteria.id_hash.eq();
		System.out.println(lbasededatosHashtagCriteria.uniqueHashtag());
		
		System.out.println("Retrieving Multimedia by MultimediaCriteria");
		basededatos.MultimediaCriteria lbasededatosMultimediaCriteria = new basededatos.MultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosMultimediaCriteria.id_mult.eq();
		System.out.println(lbasededatosMultimediaCriteria.uniqueMultimedia());
		
		System.out.println("Retrieving Texto by TextoCriteria");
		basededatos.TextoCriteria lbasededatosTextoCriteria = new basededatos.TextoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosTextoCriteria.id_texto.eq();
		System.out.println(lbasededatosTextoCriteria.uniqueTexto());
		
		System.out.println("Retrieving Comentario by ComentarioCriteria");
		basededatos.ComentarioCriteria lbasededatosComentarioCriteria = new basededatos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lbasededatosComentarioCriteria.id_cont.eq();
		System.out.println(lbasededatosComentarioCriteria.uniqueComentario());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateMDS12425PFGallardoMartínezData retrieveAndUpdateMDS12425PFGallardoMartínezData = new RetrieveAndUpdateMDS12425PFGallardoMartínezData();
			try {
				retrieveAndUpdateMDS12425PFGallardoMartínezData.retrieveAndUpdateTestData();
				//retrieveAndUpdateMDS12425PFGallardoMartínezData.retrieveByCriteria();
			}
			finally {
				basededatos.MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
