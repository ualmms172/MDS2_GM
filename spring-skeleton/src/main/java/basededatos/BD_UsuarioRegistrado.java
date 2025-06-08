package basededatos;

import java.util.Arrays;
import java.util.Comparator;
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
				// Ordenar de mayor a menor número de seguidores (seguidoPor)
				Arrays.sort(usuarios, new Comparator<UsuarioRegistrado>() {
					public int compare(UsuarioRegistrado u1, UsuarioRegistrado u2) {
						int size1 = (u1.seguidoPor != null) ? u1.seguidoPor.size() : 0;
						int size2 = (u2.seguidoPor != null) ? u2.seguidoPor.size() : 0;
						return Integer.compare(size2, size1); // Orden descendente
					}
				});
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
			baneados = UsuarioRegistradoDAO.listUsuarioRegistradoByQuery("baneo IS NOT NULL AND baneo > CURRENT_TIMESTAMP", null);

			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return baneados;
		
		

	}

	public void Eliminar_Usuario(UsuarioRegistrado aUsuario) throws PersistentException {
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		Administrador admin = null;

		try {

			// Eliminar al usuario
//			UsuarioRegistradoDAO.delete(aUsuario);
			UsuarioRegistradoDAO.deleteAndDissociate(aUsuario);
			

			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
	}


	public UsuarioRegistrado ModificarCuenta(UsuarioRegistrado aUsuario, String aDescripcion, String aUrl_fondo, String aUrl_perfil, String aNick) throws PersistentException {
	
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			if(!aDescripcion.isBlank())
				aUsuario.setDescripcion(aDescripcion);
			if(!aUrl_fondo.isBlank())
				aUsuario.setFotoFondo(aUrl_fondo);
			if(!aUrl_perfil.isBlank())
				aUsuario.setFotoPerfil(aUrl_perfil);
			if(!aNick.isBlank())
				aUsuario.setNick(aNick);
			UsuarioRegistradoDAO.save(aUsuario);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getORMID());
	}

	public UsuarioRegistrado Registrar_Usuario(String aNick, String aDescripcion, String aUrl_perfil, String aUrl_fondo, String aContrasena,String aCorreo) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado nuevo = null;

		try {
			nuevo = UsuarioRegistradoDAO.createUsuarioRegistrado();
			nuevo.setNick(aNick);
			nuevo.setDescripcion(aDescripcion);
			nuevo.setFotoPerfil(aUrl_perfil);
			nuevo.setFotoFondo(aUrl_fondo);
			nuevo.setContrasena(aContrasena);
			nuevo.setCorreo(aCorreo);		

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
	        UsuarioRegistrado seguidor = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aSeguidor.getID());
	        UsuarioRegistrado seguido = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aSeguido.getID());

	        seguidor.sigueA.add(seguido); // Usa las instancias cargadas desde la sesión
	        seguido.seguidoPor.add(seguidor);

	        UsuarioRegistradoDAO.save(seguidor);
	        UsuarioRegistradoDAO.save(seguido);

	        t.commit();

	        return seguidor;
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }
	}
	

	public UsuarioRegistrado Dejar_Seguir(UsuarioRegistrado aSeguidor, UsuarioRegistrado aSeguido) throws PersistentException {
	    PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

	    try {
	        UsuarioRegistrado seguidor = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aSeguidor.getID());
	        UsuarioRegistrado seguido = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aSeguido.getID());

	        seguidor.sigueA.remove(seguido);
	        seguido.seguidoPor.remove(seguidor);

	        UsuarioRegistradoDAO.save(seguidor);
	        UsuarioRegistradoDAO.save(seguido);

	        t.commit();
	        return seguidor;
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }
		
	}

	public UsuarioRegistrado Bloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

	    try {
	        UsuarioRegistrado bloqueador = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aBloqueador.getID());
	        UsuarioRegistrado bloqueado = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aBloqueado.getID());

	        // Si el bloqueado sigue al bloqueador, eliminamos la relación
	        boolean seguido=false;
	        for(basededatos.UsuarioRegistrado usu : bloqueado.sigueA.toArray()) {
	        	if(usu.getID()==bloqueador.getID()) {
	        		seguido=true;
	        		break;
	        	}
	        }
	        if (seguido) {
	            bloqueado.sigueA.remove(bloqueador);
	            bloqueador.seguidoPor.remove(bloqueado);

	            UsuarioRegistradoDAO.save(bloqueado);
	            UsuarioRegistradoDAO.save(bloqueador);
	        }

	        bloqueador.bloqueaA.add(bloqueado);
	        bloqueado.bloqueadoPor.add(bloqueador);

	        UsuarioRegistradoDAO.save(bloqueador);
	        UsuarioRegistradoDAO.save(bloqueado);

	        t.commit();
	        return bloqueador;
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }
	}

	public UsuarioRegistrado Desbloquear(UsuarioRegistrado aBloqueador, UsuarioRegistrado aBloqueado) throws PersistentException {
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

	    try {
	        UsuarioRegistrado bloqueador = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aBloqueador.getID());
	        UsuarioRegistrado bloqueado = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aBloqueado.getID());

	        bloqueador.bloqueaA.remove(bloqueado);
	        bloqueado.bloqueadoPor.remove(bloqueador);

	        UsuarioRegistradoDAO.save(bloqueador);
	        UsuarioRegistradoDAO.save(bloqueado);

	        t.commit();
	        return bloqueador;
	    } catch (Exception e) {
	        t.rollback();
	        throw new PersistentException(e);
	    } finally {
	        MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
	    }

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
	
public UsuarioRegistrado BuscarUsuarioCorreo(String aCorreo) throws PersistentException {
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		UsuarioRegistrado usuario = null;

		try {
			usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByQuery("Correo = '" + aCorreo + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return usuario;
		
		}

	public UsuarioRegistrado ObtenerUsuarioId (UsuarioRegistrado aUsuario) throws PersistentException {
		UsuarioRegistrado usuario = null;
		
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		try {
			usuario = UsuarioRegistradoDAO.loadUsuarioRegistradoByORMID(aUsuario.getID());
					
		} catch (Exception e) {
			t.rollback();
		}

		return usuario;
	}
			
	}
