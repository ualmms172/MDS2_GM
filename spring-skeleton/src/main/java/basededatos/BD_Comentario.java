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

        public Comentario Escribir_Comentario(Tweet aTweet, UsuarioRegistrado aUsuario) throws PersistentException {
            PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
//            UsuarioRegistrado autor = null;
            Comentario nuevoComentario = null;

            try {
                UsuarioRegistrado autor = aUsuario;

                // Crear el nuevo comentario
                nuevoComentario = ComentarioDAO.createComentario();
                nuevoComentario.setComentadoEn(aTweet);
                nuevoComentario.setEscritoPor(autor);



                ComentarioDAO.save(nuevoComentario);
                UsuarioRegistradoDAO.save(autor);

                t.commit();
            } catch (Exception e) {
                if (t != null) t.rollback();
                throw new PersistentException(e);
            } finally {
                MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
            }

            return ComentarioDAO.loadComentarioByORMID(nuevoComentario.getORMID());
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