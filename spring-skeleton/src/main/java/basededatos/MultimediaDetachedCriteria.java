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

public class MultimediaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_mult;
	public final IntegerExpression PerteneceAId;
	public final AssociationExpression PerteneceA;
	public final StringExpression url;
	public final BooleanExpression foto;
	
	public MultimediaDetachedCriteria() {
		super(basededatos.Multimedia.class, basededatos.MultimediaCriteria.class);
		id_mult = new IntegerExpression("id_mult", this.getDetachedCriteria());
		PerteneceAId = new IntegerExpression("PerteneceA.id_cont", this.getDetachedCriteria());
		PerteneceA = new AssociationExpression("PerteneceA", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		foto = new BooleanExpression("foto", this.getDetachedCriteria());
	}
	
	public MultimediaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.MultimediaCriteria.class);
		id_mult = new IntegerExpression("id_mult", this.getDetachedCriteria());
		PerteneceAId = new IntegerExpression("PerteneceA.id_cont", this.getDetachedCriteria());
		PerteneceA = new AssociationExpression("PerteneceA", this.getDetachedCriteria());
		url = new StringExpression("url", this.getDetachedCriteria());
		foto = new BooleanExpression("foto", this.getDetachedCriteria());
	}
	
	public ContenidoDetachedCriteria createPerteneceACriteria() {
		return new ContenidoDetachedCriteria(createCriteria("PerteneceA"));
	}
	
	public Multimedia uniqueMultimedia(PersistentSession session) {
		return (Multimedia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Multimedia[] listMultimedia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
	}
}

