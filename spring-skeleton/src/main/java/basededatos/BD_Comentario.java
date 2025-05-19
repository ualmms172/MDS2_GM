package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Comentario;

public class BD_Comentario {
	public BDPrincipal _bd_prin_com;
	
	public Vector<Comentario> _contiene_Comentarios = new Vector<Comentario>();
        public Comentario[] Cargar_Comentarios(Tweet aTweet) {
		
        	   try {
        	        return aTweet.comentarios.toArray();
        	    } catch (Exception e) {
        	        e.printStackTrace();
        	        return new Comentario[0];
        	    }
        	
           	
        	
	}

	public UsuarioRegistrado Escribir_Comentario(Tweet aTweet,String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {

		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

			Comentario nuevoComentario = ComentarioDAO.createComentario();
			Texto texto = TextoDAO.createTexto();
			texto.setTexto(aTexto);
			TextoDAO.save(texto);

			nuevoComentario.setContieneTexto(texto);
			nuevoComentario.setComentadoEn(aTweet);

			// Suponiendo que el usuario está logueado y accesible desde algún contexto actual
			UsuarioRegistrado autor = (UsuarioRegistrado) UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuario.getId_user());
			nuevoComentario.setEscritoPor(autor);

			ComentarioDAO.save(nuevoComentario);

			t.commit();
			return autor;
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return null;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		
	}

	public Administrador BorrarComentarios(Tweet aTweet) throws PersistentException {
		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

			for (Comentario comentario : aTweet.comentarios.toArray()) {
				ComentarioDAO.delete(comentario);
			}

			t.commit();

			// Aquí podrías devolver el administrador que ha realizado esta acción si lo conoces
			return null; // O cambiar esto por el administrador actual
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return null;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
	}
		
		
	

	public Administrador BorrarComentario(Comentario aComentario) throws PersistentException {
		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
			ComentarioDAO.delete(aComentario);
			t.commit();
			return null; // Devuelve el administrador si se conoce
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return null;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
			
	}

	public UsuarioRegistrado DarLikeComentario(UsuarioRegistrado aUsuario,Comentario aComentario) throws PersistentException {
		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

			aComentario.meGustaPor.add(aUsuario);
			aUsuario.meGusta.add(aComentario);

			t.commit();
			return aUsuario;
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return null;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		
		
		
	}

	public UsuarioRegistrado QuitarLikeComentario(UsuarioRegistrado aUsuario,Comentario aComentario) throws PersistentException {
		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

			aComentario.meGustaPor.remove(aUsuario);
			aUsuario.meGusta.remove(aComentario);

			t.commit();
			return aUsuario;
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return null;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
	}
		
		
		
		
	









}