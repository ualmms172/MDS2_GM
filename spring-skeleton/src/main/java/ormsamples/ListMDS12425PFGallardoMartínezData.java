/**
 * Licensee: Antonio Gallardo(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListMDS12425PFGallardoMartínezData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Logueado...");
		basededatos.Logueado[] basededatosLogueados = basededatos.LogueadoDAO.listLogueadoByQuery(null, null);
		int length = Math.min(basededatosLogueados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosLogueados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing UsuarioRegistrado...");
		basededatos.UsuarioRegistrado[] basededatosUsuarioRegistrados = basededatos.UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
		length = Math.min(basededatosUsuarioRegistrados.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosUsuarioRegistrados[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Administrador...");
		basededatos.Administrador[] basededatosAdministradors = basededatos.AdministradorDAO.listAdministradorByQuery(null, null);
		length = Math.min(basededatosAdministradors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Contenido...");
		basededatos.Contenido[] basededatosContenidos = basededatos.ContenidoDAO.listContenidoByQuery(null, null);
		length = Math.min(basededatosContenidos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosContenidos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tweet...");
		basededatos.Tweet[] basededatosTweets = basededatos.TweetDAO.listTweetByQuery(null, null);
		length = Math.min(basededatosTweets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosTweets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Hashtag...");
		basededatos.Hashtag[] basededatosHashtags = basededatos.HashtagDAO.listHashtagByQuery(null, null);
		length = Math.min(basededatosHashtags.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosHashtags[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing baneo...");
		basededatos.baneo[] basededatosbaneos = basededatos.baneoDAO.listBaneoByQuery(null, null);
		length = Math.min(basededatosbaneos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosbaneos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Multimedia...");
		basededatos.Multimedia[] basededatosMultimedias = basededatos.MultimediaDAO.listMultimediaByQuery(null, null);
		length = Math.min(basededatosMultimedias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosMultimedias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Texto...");
		basededatos.Texto[] basededatosTextos = basededatos.TextoDAO.listTextoByQuery(null, null);
		length = Math.min(basededatosTextos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosTextos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Comentario...");
		basededatos.Comentario[] basededatosComentarios = basededatos.ComentarioDAO.listComentarioByQuery(null, null);
		length = Math.min(basededatosComentarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(basededatosComentarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Logueado by Criteria...");
		basededatos.LogueadoCriteria lbasededatosLogueadoCriteria = new basededatos.LogueadoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosLogueadoCriteria.id_logueado.eq();
		lbasededatosLogueadoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Logueado[] basededatosLogueados = lbasededatosLogueadoCriteria.listLogueado();
		int length =basededatosLogueados== null ? 0 : Math.min(basededatosLogueados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosLogueados[i]);
		}
		System.out.println(length + " Logueado record(s) retrieved."); 
		
		System.out.println("Listing UsuarioRegistrado by Criteria...");
		basededatos.UsuarioRegistradoCriteria lbasededatosUsuarioRegistradoCriteria = new basededatos.UsuarioRegistradoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosUsuarioRegistradoCriteria.id_logueado.eq();
		lbasededatosUsuarioRegistradoCriteria.setMaxResults(ROW_COUNT);
		basededatos.UsuarioRegistrado[] basededatosUsuarioRegistrados = lbasededatosUsuarioRegistradoCriteria.listUsuarioRegistrado();
		length =basededatosUsuarioRegistrados== null ? 0 : Math.min(basededatosUsuarioRegistrados.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosUsuarioRegistrados[i]);
		}
		System.out.println(length + " UsuarioRegistrado record(s) retrieved."); 
		
		System.out.println("Listing Administrador by Criteria...");
		basededatos.AdministradorCriteria lbasededatosAdministradorCriteria = new basededatos.AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosAdministradorCriteria.id_logueado.eq();
		lbasededatosAdministradorCriteria.setMaxResults(ROW_COUNT);
		basededatos.Administrador[] basededatosAdministradors = lbasededatosAdministradorCriteria.listAdministrador();
		length =basededatosAdministradors== null ? 0 : Math.min(basededatosAdministradors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosAdministradors[i]);
		}
		System.out.println(length + " Administrador record(s) retrieved."); 
		
		System.out.println("Listing Contenido by Criteria...");
		basededatos.ContenidoCriteria lbasededatosContenidoCriteria = new basededatos.ContenidoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosContenidoCriteria.id_cont.eq();
		lbasededatosContenidoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Contenido[] basededatosContenidos = lbasededatosContenidoCriteria.listContenido();
		length =basededatosContenidos== null ? 0 : Math.min(basededatosContenidos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosContenidos[i]);
		}
		System.out.println(length + " Contenido record(s) retrieved."); 
		
		System.out.println("Listing Tweet by Criteria...");
		basededatos.TweetCriteria lbasededatosTweetCriteria = new basededatos.TweetCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosTweetCriteria.id_cont.eq();
		lbasededatosTweetCriteria.setMaxResults(ROW_COUNT);
		basededatos.Tweet[] basededatosTweets = lbasededatosTweetCriteria.listTweet();
		length =basededatosTweets== null ? 0 : Math.min(basededatosTweets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosTweets[i]);
		}
		System.out.println(length + " Tweet record(s) retrieved."); 
		
		System.out.println("Listing Hashtag by Criteria...");
		basededatos.HashtagCriteria lbasededatosHashtagCriteria = new basededatos.HashtagCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosHashtagCriteria.id_hash.eq();
		lbasededatosHashtagCriteria.setMaxResults(ROW_COUNT);
		basededatos.Hashtag[] basededatosHashtags = lbasededatosHashtagCriteria.listHashtag();
		length =basededatosHashtags== null ? 0 : Math.min(basededatosHashtags.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosHashtags[i]);
		}
		System.out.println(length + " Hashtag record(s) retrieved."); 
		
		System.out.println("Listing baneo by Criteria...");
		basededatos.baneoCriteria lbasededatosbaneoCriteria = new basededatos.baneoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosbaneoCriteria.id_baneo.eq();
		lbasededatosbaneoCriteria.setMaxResults(ROW_COUNT);
		basededatos.baneo[] basededatosbaneos = lbasededatosbaneoCriteria.listBaneo();
		length =basededatosbaneos== null ? 0 : Math.min(basededatosbaneos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosbaneos[i]);
		}
		System.out.println(length + " baneo record(s) retrieved."); 
		
		System.out.println("Listing Multimedia by Criteria...");
		basededatos.MultimediaCriteria lbasededatosMultimediaCriteria = new basededatos.MultimediaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosMultimediaCriteria.id_mult.eq();
		lbasededatosMultimediaCriteria.setMaxResults(ROW_COUNT);
		basededatos.Multimedia[] basededatosMultimedias = lbasededatosMultimediaCriteria.listMultimedia();
		length =basededatosMultimedias== null ? 0 : Math.min(basededatosMultimedias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosMultimedias[i]);
		}
		System.out.println(length + " Multimedia record(s) retrieved."); 
		
		System.out.println("Listing Texto by Criteria...");
		basededatos.TextoCriteria lbasededatosTextoCriteria = new basededatos.TextoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosTextoCriteria.id_texto.eq();
		lbasededatosTextoCriteria.setMaxResults(ROW_COUNT);
		basededatos.Texto[] basededatosTextos = lbasededatosTextoCriteria.listTexto();
		length =basededatosTextos== null ? 0 : Math.min(basededatosTextos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosTextos[i]);
		}
		System.out.println(length + " Texto record(s) retrieved."); 
		
		System.out.println("Listing Comentario by Criteria...");
		basededatos.ComentarioCriteria lbasededatosComentarioCriteria = new basededatos.ComentarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lbasededatosComentarioCriteria.id_cont.eq();
		lbasededatosComentarioCriteria.setMaxResults(ROW_COUNT);
		basededatos.Comentario[] basededatosComentarios = lbasededatosComentarioCriteria.listComentario();
		length =basededatosComentarios== null ? 0 : Math.min(basededatosComentarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(basededatosComentarios[i]);
		}
		System.out.println(length + " Comentario record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListMDS12425PFGallardoMartínezData listMDS12425PFGallardoMartínezData = new ListMDS12425PFGallardoMartínezData();
			try {
				listMDS12425PFGallardoMartínezData.listTestData();
				//listMDS12425PFGallardoMartínezData.listByCriteria();
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
