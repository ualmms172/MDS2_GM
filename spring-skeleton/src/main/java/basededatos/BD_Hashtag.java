package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Hashtag;

public class BD_Hashtag {
	public BDPrincipal _bd_prin_has;
	public Vector<Hashtag> _contiene_hashtags = new Vector<Hashtag>();


	public Hashtag[] Cargar_Hashtags() throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		Hashtag[] resultado = null;
		try {
			Hashtag[] hashtags = HashtagDAO.listHashtagByQuery(null, "Titulo ASC");
			resultado = hashtags;
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		return resultado;
		
		
	}

	public Hashtag BuscarHashtag(String aHashtag) throws PersistentException {
		
		  PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

			    Hashtag encontrado = null;

			    try {
			        // Escapamos el parámetro correctamente para evitar errores de sintaxis o SQL injection
			        Hashtag[] hashtags = HashtagDAO.listHashtagByQuery("Titulo = '" + aHashtag + "'", null);

			        if (hashtags != null && hashtags.length > 0) {
			            encontrado = hashtags[0];
			        }

			        t.commit();
			    } catch (Exception e) {
			        t.rollback();
			        e.printStackTrace();
			    }

			    MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
			    return encontrado;	
	}

	public Hashtag CrearHashtag(String aHashtag,UsuarioRegistrado aUsuario) throws PersistentException {
		
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		Hashtag hashtag = null;

		try {
			hashtag = HashtagDAO.createHashtag();
			hashtag.setTitulo(aHashtag);
			hashtag.setNumTweets(0); // inicializa en 0
			hashtag.setCreadoPor(aUsuario);
			// Aquí podrías establecer el usuario creador, si lo tienes disponible.
			// Por ejemplo:
			// UsuarioRegistrado autor = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(idUsuario);
			// hashtag.setCreadoPor(autor);

			HashtagDAO.save(hashtag);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			e.printStackTrace();
		}

		MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		return hashtag;
		
			
	}
	
	public Hashtag ObtenerHashtagId (Hashtag aHashtag) throws PersistentException {
		Hashtag hash = null;
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			hash = HashtagDAO.loadHashtagByORMID(aHashtag.getORMID());
					
		} catch (Exception e) {
			t.rollback();
		}

		return hash;
	}
}