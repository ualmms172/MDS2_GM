/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateMDS12425PFGallardoMartínezData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = basededatos.MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			basededatos.Logueado lbasededatosLogueado = basededatos.LogueadoDAO.createLogueado();
			// Initialize the properties of the persistent object here
			basededatos.LogueadoDAO.save(lbasededatosLogueado);
			basededatos.UsuarioRegistrado lbasededatosUsuarioRegistrado = basededatos.UsuarioRegistradoDAO.createUsuarioRegistrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escribe, MeGusta, SeguidoPor, BloqueadoPor, SigueA, BloqueaA, id_user
			basededatos.UsuarioRegistradoDAO.save(lbasededatosUsuarioRegistrado);
			basededatos.Administrador lbasededatosAdministrador = basededatos.AdministradorDAO.createAdministrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_admin
			basededatos.AdministradorDAO.save(lbasededatosAdministrador);
			basededatos.Contenido lbasededatosContenido = basededatos.ContenidoDAO.createContenido();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ContieneTexto, ContieneMultimedia, EscritoPor, MeGustaPor
			basededatos.ContenidoDAO.save(lbasededatosContenido);
			basededatos.Tweet lbasededatosTweet = basededatos.TweetDAO.createTweet();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Comentarios
			basededatos.TweetDAO.save(lbasededatosTweet);
			basededatos.Hashtag lbasededatosHashtag = basededatos.HashtagDAO.createHashtag();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : NumTweets
			basededatos.HashtagDAO.save(lbasededatosHashtag);
			basededatos.Multimedia lbasededatosMultimedia = basededatos.MultimediaDAO.createMultimedia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : foto, PerteneceA
			basededatos.MultimediaDAO.save(lbasededatosMultimedia);
			basededatos.Texto lbasededatosTexto = basededatos.TextoDAO.createTexto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : PerteneceA
			basededatos.TextoDAO.save(lbasededatosTexto);
			basededatos.Comentario lbasededatosComentario = basededatos.ComentarioDAO.createComentario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ComentadoEn
			basededatos.ComentarioDAO.save(lbasededatosComentario);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateMDS12425PFGallardoMartínezData createMDS12425PFGallardoMartínezData = new CreateMDS12425PFGallardoMartínezData();
			try {
				createMDS12425PFGallardoMartínezData.createTestData();
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
