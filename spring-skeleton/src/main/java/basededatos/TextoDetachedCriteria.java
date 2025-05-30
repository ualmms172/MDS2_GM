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

public class TextoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_texto;
	public final IntegerExpression PerteneceAId;
	public final AssociationExpression PerteneceA;
	public final StringExpression Texto;
	
	public TextoDetachedCriteria() {
		super(basededatos.Texto.class, basededatos.TextoCriteria.class);
		id_texto = new IntegerExpression("id_texto", this.getDetachedCriteria());
		PerteneceAId = new IntegerExpression("PerteneceA.id_cont", this.getDetachedCriteria());
		PerteneceA = new AssociationExpression("PerteneceA", this.getDetachedCriteria());
		Texto = new StringExpression("Texto", this.getDetachedCriteria());
	}
	
	public TextoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.TextoCriteria.class);
		id_texto = new IntegerExpression("id_texto", this.getDetachedCriteria());
		PerteneceAId = new IntegerExpression("PerteneceA.id_cont", this.getDetachedCriteria());
		PerteneceA = new AssociationExpression("PerteneceA", this.getDetachedCriteria());
		Texto = new StringExpression("Texto", this.getDetachedCriteria());
	}
	
	public ContenidoDetachedCriteria createPerteneceACriteria() {
		return new ContenidoDetachedCriteria(createCriteria("PerteneceA"));
	}
	
	public Texto uniqueTexto(PersistentSession session) {
		return (Texto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Texto[] listTexto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Texto[]) list.toArray(new Texto[list.size()]);
	}
}

