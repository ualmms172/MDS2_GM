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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LogueadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression Nick;
	public final StringExpression Contrasena;
	public final StringExpression Correo;
	
	public LogueadoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		Nick = new StringExpression("Nick", this);
		Contrasena = new StringExpression("Contrasena", this);
		Correo = new StringExpression("Correo", this);
	}
	
	public LogueadoCriteria(PersistentSession session) {
		this(session.createCriteria(Logueado.class));
	}
	
	public LogueadoCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public Logueado uniqueLogueado() {
		return (Logueado) super.uniqueResult();
	}
	
	public Logueado[] listLogueado() {
		java.util.List list = super.list();
		return (Logueado[]) list.toArray(new Logueado[list.size()]);
	}
}

