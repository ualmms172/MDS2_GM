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

public class MultimediaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_mult;
	public final IntegerExpression PerteneceAId;
	public final AssociationExpression PerteneceA;
	public final StringExpression url;
	public final BooleanExpression foto;
	
	public MultimediaCriteria(Criteria criteria) {
		super(criteria);
		id_mult = new IntegerExpression("id_mult", this);
		PerteneceAId = new IntegerExpression("PerteneceA.id_cont", this);
		PerteneceA = new AssociationExpression("PerteneceA", this);
		url = new StringExpression("url", this);
		foto = new BooleanExpression("foto", this);
	}
	
	public MultimediaCriteria(PersistentSession session) {
		this(session.createCriteria(Multimedia.class));
	}
	
	public MultimediaCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public ContenidoCriteria createPerteneceACriteria() {
		return new ContenidoCriteria(createCriteria("PerteneceA"));
	}
	
	public Multimedia uniqueMultimedia() {
		return (Multimedia) super.uniqueResult();
	}
	
	public Multimedia[] listMultimedia() {
		java.util.List list = super.list();
		return (Multimedia[]) list.toArray(new Multimedia[list.size()]);
	}
}

