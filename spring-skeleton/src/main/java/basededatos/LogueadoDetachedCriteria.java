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

public class LogueadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression Nick;
	public final StringExpression Contrasena;
	public final StringExpression Correo;
	
	public LogueadoDetachedCriteria() {
		super(basededatos.Logueado.class, basededatos.LogueadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nick = new StringExpression("Nick", this.getDetachedCriteria());
		Contrasena = new StringExpression("Contrasena", this.getDetachedCriteria());
		Correo = new StringExpression("Correo", this.getDetachedCriteria());
	}
	
	public LogueadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.LogueadoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nick = new StringExpression("Nick", this.getDetachedCriteria());
		Contrasena = new StringExpression("Contrasena", this.getDetachedCriteria());
		Correo = new StringExpression("Correo", this.getDetachedCriteria());
	}
	
	public Logueado uniqueLogueado(PersistentSession session) {
		return (Logueado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Logueado[] listLogueado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Logueado[]) list.toArray(new Logueado[list.size()]);
	}
}

