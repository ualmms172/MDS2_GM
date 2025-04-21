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

public class baneoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_baneo;
	public final DateExpression FechaFin;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	
	public baneoCriteria(Criteria criteria) {
		super(criteria);
		id_baneo = new IntegerExpression("id_baneo", this);
		FechaFin = new DateExpression("FechaFin", this);
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.null", this);
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this);
		administradorId = new IntegerExpression("ORM_Administrador.null", this);
		administrador = new AssociationExpression("ORM_Administrador", this);
	}
	
	public baneoCriteria(PersistentSession session) {
		this(session.createCriteria(baneo.class));
	}
	
	public baneoCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("ORM_Administrador"));
	}
	
	public baneo uniqueBaneo() {
		return (baneo) super.uniqueResult();
	}
	
	public baneo[] listBaneo() {
		java.util.List list = super.list();
		return (baneo[]) list.toArray(new baneo[list.size()]);
	}
}

