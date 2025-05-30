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

public class TextoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_texto;
	public final IntegerExpression PerteneceAId;
	public final AssociationExpression PerteneceA;
	public final StringExpression Texto;
	
	public TextoCriteria(Criteria criteria) {
		super(criteria);
		id_texto = new IntegerExpression("id_texto", this);
		PerteneceAId = new IntegerExpression("PerteneceA.id_cont", this);
		PerteneceA = new AssociationExpression("PerteneceA", this);
		Texto = new StringExpression("Texto", this);
	}
	
	public TextoCriteria(PersistentSession session) {
		this(session.createCriteria(Texto.class));
	}
	
	public TextoCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public ContenidoCriteria createPerteneceACriteria() {
		return new ContenidoCriteria(createCriteria("PerteneceA"));
	}
	
	public Texto uniqueTexto() {
		return (Texto) super.uniqueResult();
	}
	
	public Texto[] listTexto() {
		java.util.List list = super.list();
		return (Texto[]) list.toArray(new Texto[list.size()]);
	}
}

