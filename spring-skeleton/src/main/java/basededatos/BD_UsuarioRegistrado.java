package basededatos;

import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.UsuarioRegistrado;

public class BD_UsuarioRegistrado {
	public BDPrincipal _bd_prin_usu;
	public Vector<UsuarioRegistrado> _contiene_UsuariosRegistrados = new Vector<UsuarioRegistrado>();

	public UsuarioRegistrado buscar_usuario(String aNick, String aContrasena) throws PersistentException {
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado usuario = null;

		try {
			usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery("Nick = '" + aNick + "' AND Contrasena = '" + aContrasena + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return usuario;
	
	
	}

	public UsuarioRegistrado[] Cargar_Usuarios() throws PersistentException {

		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado[] usuarios = null;
       
		try {
			usuarios = UsuarioRegistradoDAO.listUsuarioRegistradoByQuery(null, null);
			if (usuarios != null && usuarios.length > 0) {
			}
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return usuarios;
	
	
	}

	public UsuarioRegistrado[] Cargar_Baneados() throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado[] baneados = null;

		try {
			baneados = UsuarioRegistradoDAO.listUsuarioRegistradoByQuery("baneo IS NOT NULL", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return baneados;
		
		

	}

	public Administrador Eliminar_Usuario(UsuarioRegistrado aUsuario) throws PersistentException {
	
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		Administrador admin = null;

		try {
			admin = aUsuario.getAdministrador(); // si está baneado, devuelve su administrador
			UsuarioRegistradoDAO.delete(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return admin;
		
		
		
		
		
		
		
		
		
	}

	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) throws PersistentException {
	
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aUsuario.setDescripcion(aDescripcion);
			aUsuario.setFotoFondo(aUrl_fondo);
			aUsuario.setFotoPerfil(aUrl_perfil);
			aUsuario.setNick(aNick);
			UsuarioRegistradoDAO.save(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aUsuario;
	}

	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, String aUrl_fondo, String aContrasena) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado nuevo = null;

		try {
			nuevo = UsuarioRegistradoDAO.createUsuarioRegistrado();
			nuevo.setNick(aNick);
			nuevo.setDescripcion(aDescripcion);
			nuevo.setFotoPerfil(aUrl_perfil);
			nuevo.setFotoFondo(aUrl_fondo);
			nuevo.setContrasena(aContrasena);

			UsuarioRegistradoDAO.save(nuevo);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return nuevo;
		
			
		
	}

	public UsuarioRegistrado Seguir_Usuario(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aSeguidor.sigueA.add(aSeguido);
			aSeguido.seguidoPor.add(aSeguidor);
			UsuarioRegistradoDAO.save(aSeguidor);
			UsuarioRegistradoDAO.save(aSeguido);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aSeguidor;
		
			
	}

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException {
	
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aSeguidor.sigueA.remove(aSeguido);
			aSeguido.seguidoPor.remove(aSeguidor);
			UsuarioRegistradoDAO.save(aSeguidor);
			UsuarioRegistradoDAO.save(aSeguido);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aSeguidor;
		
		
		
	}

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aBloqueador.bloqueaA.add(aBloqueado);
			aBloqueado.bloqueadoPor.add(aBloqueador);
			UsuarioRegistradoDAO.save(aBloqueador);
			UsuarioRegistradoDAO.save(aBloqueado);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aBloqueador;	
	}

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aBloqueador.bloqueaA.remove(aBloqueado);
			aBloqueado.bloqueadoPor.remove(aBloqueador);
			UsuarioRegistradoDAO.save(aBloqueador);
			UsuarioRegistradoDAO.save(aBloqueado);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aBloqueador;
	}

	public UsuarioRegistrado DarLikeATweet(Tweet aTweet, UsuarioRegistrado aUsuario) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado usuario = null;

		try {
			usuario = UsuarioRegistradoDAO.getUsuarioRegistradoByORMID(aUsuario.getId_user());  // Cambia según tu lógica
			aTweet.meGustaPor.add(usuario);
			usuario.meGusta.add(aTweet);
			TweetDAO.save(aTweet);
			UsuarioRegistradoDAO.save(usuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return usuario;
		

		
	}

	public UsuarioRegistrado BuscarUsuario(String aNick) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado usuario = null;

		try {
			usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery("Nick = '" + aNick + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return usuario;
		
		}
			
	}
