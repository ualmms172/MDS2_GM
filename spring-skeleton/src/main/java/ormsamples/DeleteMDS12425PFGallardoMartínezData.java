/**
 * Licensee: Antonio Gallardo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteMDS12425PFGallardoMartínezData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Logueado lbasededatosLogueado = basededatos.LogueadoDAO.loadLogueadoByQuery(null, null);
			// Delete the persistent object
			basededatos.LogueadoDAO.delete(lbasededatosLogueado);
			basededatos.UsuarioRegistrado lbasededatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery(null, null);
			// Delete the persistent object
			basededatos.UsuarioRegistradoDAO.delete(lbasededatosUsuarioRegistrado);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.loadAdministradorByQuery(null, null);
			// Delete the persistent object
			basededatos.AdministradorDAO.delete(lbasededatosAdministrador);
			basededatos.Contenido lbasededatosContenido = basededatos.ContenidoDAO.loadContenidoByQuery(null, null);
			// Delete the persistent object
			basededatos.ContenidoDAO.delete(lbasededatosContenido);
			basededatos.Tweet lbasededatosTweet = basededatos.TweetDAO.loadTweetByQuery(null, null);
			// Delete the persistent object
			basededatos.TweetDAO.delete(lbasededatosTweet);
			basededatos.Hashtag lbasededatosHashtag = basededatos.HashtagDAO.loadHashtagByQuery(null, null);
			// Delete the persistent object
			basededatos.HashtagDAO.delete(lbasededatosHashtag);
			basededatos.baneo lbasededatosbaneo = basededatos.baneoDAO.loadBaneoByQuery(null, null);
			// Delete the persistent object
			basededatos.baneoDAO.delete(lbasededatosbaneo);
			basededatos.Multimedia lbasededatosMultimedia = basededatos.MultimediaDAO.loadMultimediaByQuery(null, null);
			// Delete the persistent object
			basededatos.MultimediaDAO.delete(lbasededatosMultimedia);
			basededatos.Texto lbasededatosTexto = basededatos.TextoDAO.loadTextoByQuery(null, null);
			// Delete the persistent object
			basededatos.TextoDAO.delete(lbasededatosTexto);
			basededatos.Comentario lbasededatosComentario = basededatos.ComentarioDAO.loadComentarioByQuery(null, null);
			// Delete the persistent object
			basededatos.ComentarioDAO.delete(lbasededatosComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteMDS12425PFGallardoMartínezData deleteMDS12425PFGallardoMartínezData = new DeleteMDS12425PFGallardoMartínezData();
			try {
				deleteMDS12425PFGallardoMartínezData.deleteTestData();
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
