/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Miguel(University of Almeria)
 * License Type: Academic
 */
package basededatos;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression Nick;
	public final StringExpression Contrasena;
	public final StringExpression Correo;
	public final IntegerExpression id_admin;
	
	public AdministradorDetachedCriteria() {
		super(basededatos.Administrador.class, basededatos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nick = new StringExpression("Nick", this.getDetachedCriteria());
		Contrasena = new StringExpression("Contrasena", this.getDetachedCriteria());
		Correo = new StringExpression("Correo", this.getDetachedCriteria());
		id_admin = new IntegerExpression("id_admin", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.AdministradorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nick = new StringExpression("Nick", this.getDetachedCriteria());
		Contrasena = new StringExpression("Contrasena", this.getDetachedCriteria());
		Correo = new StringExpression("Correo", this.getDetachedCriteria());
		id_admin = new IntegerExpression("id_admin", this.getDetachedCriteria());
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

