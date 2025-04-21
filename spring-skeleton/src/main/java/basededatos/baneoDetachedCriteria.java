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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class baneoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_baneo;
	public final DateExpression FechaFin;
	public final IntegerExpression usuarioRegistradoId;
	public final AssociationExpression usuarioRegistrado;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	
	public baneoDetachedCriteria() {
		super(basededatos.baneo.class, basededatos.baneoCriteria.class);
		id_baneo = new IntegerExpression("id_baneo", this.getDetachedCriteria());
		FechaFin = new DateExpression("FechaFin", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.null", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		administradorId = new IntegerExpression("ORM_Administrador.null", this.getDetachedCriteria());
		administrador = new AssociationExpression("ORM_Administrador", this.getDetachedCriteria());
	}
	
	public baneoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.baneoCriteria.class);
		id_baneo = new IntegerExpression("id_baneo", this.getDetachedCriteria());
		FechaFin = new DateExpression("FechaFin", this.getDetachedCriteria());
		usuarioRegistradoId = new IntegerExpression("usuarioRegistrado.null", this.getDetachedCriteria());
		usuarioRegistrado = new AssociationExpression("usuarioRegistrado", this.getDetachedCriteria());
		administradorId = new IntegerExpression("ORM_Administrador.null", this.getDetachedCriteria());
		administrador = new AssociationExpression("ORM_Administrador", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createUsuarioRegistradoCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("usuarioRegistrado"));
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public baneo uniqueBaneo(PersistentSession session) {
		return (baneo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public baneo[] listBaneo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (baneo[]) list.toArray(new baneo[list.size()]);
	}
}

