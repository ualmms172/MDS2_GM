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

        public UsuarioRegistrado Escribir_Comentario(Tweet aTweet, String aTexto, String aUrl_foto, String aUrl_video, UsuarioRegistrado aUsuario) throws PersistentException {
            PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
            UsuarioRegistrado autor = null;

            try {
                autor = aUsuario;

                // Crear el nuevo comentario
                Comentario nuevoComentario = ComentarioDAO.createComentario();
                nuevoComentario.setComentadoEn(aTweet);
                nuevoComentario.setEscritoPor(autor);

                // Asociar texto si lo hay
                if (aTexto != null && !aTexto.isEmpty()) {
                    Texto texto = TextoDAO.createTexto();
                    texto.setTexto(aTexto);
                    texto.setPerteneceA(nuevoComentario);
                    nuevoComentario.setContieneTexto(texto);
                    TextoDAO.save(texto);
                }

                // Asociar foto si la hay
                if (aUrl_foto != null && !aUrl_foto.isEmpty()) {
                    Multimedia foto = MultimediaDAO.createMultimedia();
                    foto.setUrl(aUrl_foto);
                    foto.setFoto(true);
                    foto.setPerteneceA(nuevoComentario);
                    MultimediaDAO.save(foto);
                }

                // Asociar video si lo hay
                if (aUrl_video != null && !aUrl_video.isEmpty()) {
                    Multimedia video = MultimediaDAO.createMultimedia();
                    video.setUrl(aUrl_video);
                    video.setFoto(false);
                    video.setPerteneceA(nuevoComentario);
                    MultimediaDAO.save(video);
                }

                ComentarioDAO.save(nuevoComentario);
                UsuarioRegistradoDAO.save(autor);

                t.commit();
            } catch (Exception e) {
                if (t != null) t.rollback();
                throw new PersistentException(e);
            } finally {
                MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
            }

            return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(autor.getID());
        }


	public void BorrarComentarios(Tweet aTweet) throws PersistentException {
		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

			for (Comentario comentario : aTweet.comentarios.toArray()) {
				ComentarioDAO.delete(comentario);
			}

			t.commit();

			// Aquí podrías devolver el administrador que ha realizado esta acción si lo conoces
			//return (Administrador)AdministradorDAO.loadAdministradorByORMID(aAdministrador.getID()); // O cambiar esto por el administrador actual
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return ;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
	}
		
		
	

	public Administrador BorrarComentario(Comentario aComentario,Administrador aAdministrador) throws PersistentException {
		
		PersistentTransaction t = null;
		try {
			t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
//			ComentarioDAO.delete(aComentario);
			ComentarioDAO.deleteAndDissociate(aComentario);
			t.commit();
			return AdministradorDAO.loadAdministradorByORMID(aAdministrador.getID()); // Devuelve el administrador si se conoce
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
			return (UsuarioRegistrado) UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuario.getID());
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
			return (UsuarioRegistrado) UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuario.getID());
		} catch (Exception e) {
			if (t != null) t.rollback();
			e.printStackTrace();
			return null;
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
	}
		
		
		
		
	









}