package basededatos;

import java.util.Date;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import basededatos.Administrador;

public class BD_Administrador {
	public BDPrincipal _bd_prin_adm;
	public Vector<Administrador> _contiene_Administradores = new Vector<Administrador>();

	public Administrador Buscar_administrador(String aNick, String aContrasena) throws PersistentException {

		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();
		Administrador admin = null;

		try {
			admin = AdministradorDAO.loadAdministradorByQuery("Nick = '" + aNick + "' AND Contrasena = '" + aContrasena + "'", null);
			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return admin;
		
	}
       
	public Administrador Banear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador, Date aFecha) throws PersistentException {
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aUsuarioRegistrado.setBaneo(aFecha);

			UsuarioRegistradoDAO.save(aUsuarioRegistrado);
			AdministradorDAO.save(aAdministrador);

			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aAdministrador;
	}



	public Administrador Desbanear(UsuarioRegistrado aUsuarioRegistrado, Administrador aAdministrador) throws PersistentException   {
	
		PersistentTransaction t = MDS12425PFGallardoMartínezPersistentManager.instance().getSession().beginTransaction();

		try {
			aUsuarioRegistrado.setBaneo(new Date(0));

			UsuarioRegistradoDAO.save(aUsuarioRegistrado);
			AdministradorDAO.save(aAdministrador);

			t.commit();
		} catch (Exception e) {
			t.rollback();
			throw new PersistentException(e);
		} finally {
			MDS12425PFGallardoMartínezPersistentManager.instance().disposePersistentManager();
		}
		return aAdministrador;
		
		
		
		
		
		
	}






}