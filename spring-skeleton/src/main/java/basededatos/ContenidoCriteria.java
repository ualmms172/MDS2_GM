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

public class ContenidoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_cont;
	public final CollectionExpression MeGustaPor;
	public final IntegerExpression EscritoPorId;
	public final AssociationExpression EscritoPor;
	public final CollectionExpression ContieneMultimedia;
	public final IntegerExpression ContieneTextoId;
	public final AssociationExpression ContieneTexto;
	
	public ContenidoCriteria(Criteria criteria) {
		super(criteria);
		id_cont = new IntegerExpression("id_cont", this);
		MeGustaPor = new CollectionExpression("ORM_meGustaPor", this);
		EscritoPorId = new IntegerExpression("EscritoPor.", this);
		EscritoPor = new AssociationExpression("EscritoPor", this);
		ContieneMultimedia = new CollectionExpression("ORM_contieneMultimedia", this);
		ContieneTextoId = new IntegerExpression("ContieneTexto.id_cont", this);
		ContieneTexto = new AssociationExpression("ContieneTexto", this);
	}
	
	public ContenidoCriteria(PersistentSession session) {
		this(session.createCriteria(Contenido.class));
	}
	
	public ContenidoCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createMeGustaPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_meGustaPor"));
	}
	
	public UsuarioRegistradoCriteria createEscritoPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("EscritoPor"));
	}
	
	public MultimediaCriteria createContieneMultimediaCriteria() {
		return new MultimediaCriteria(createCriteria("ORM_contieneMultimedia"));
	}
	
	public TextoCriteria createContieneTextoCriteria() {
		return new TextoCriteria(createCriteria("ContieneTexto"));
	}
	
	public Contenido uniqueContenido() {
		return (Contenido) super.uniqueResult();
	}
	
	public Contenido[] listContenido() {
		java.util.List list = super.list();
		return (Contenido[]) list.toArray(new Contenido[list.size()]);
	}
}

