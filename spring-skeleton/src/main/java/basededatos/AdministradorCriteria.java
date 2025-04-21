/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Antonio Gallardo(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_logueado;
	public final StringExpression Nick;
	public final StringExpression Contrasena;
	public final IntegerExpression id_admin;
	public final CollectionExpression baneos;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		id_logueado = new IntegerExpression("id_logueado", this);
		Nick = new StringExpression("Nick", this);
		Contrasena = new StringExpression("Contrasena", this);
		id_admin = new IntegerExpression("id_admin", this);
		baneos = new CollectionExpression("ORM_baneos", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public baneoCriteria createBaneosCriteria() {
		return new baneoCriteria(createCriteria("ORM_baneos"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

