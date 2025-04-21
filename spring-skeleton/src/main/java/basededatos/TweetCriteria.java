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

public class TweetCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_cont;
	public final CollectionExpression MeGustaPor;
	public final IntegerExpression EscritoPorId;
	public final AssociationExpression EscritoPor;
	public final CollectionExpression ContieneMultimedia;
	public final IntegerExpression ContieneTextoId;
	public final AssociationExpression ContieneTexto;
	public final IntegerExpression RetweeteaAId;
	public final AssociationExpression RetweeteaA;
	public final CollectionExpression Comentarios;
	public final CollectionExpression Contiene;
	public final CollectionExpression RetweeteadoPor;
	public final CollectionExpression MencionaA;
	
	public TweetCriteria(Criteria criteria) {
		super(criteria);
		id_cont = new IntegerExpression("id_cont", this);
		MeGustaPor = new CollectionExpression("ORM_meGustaPor", this);
		EscritoPorId = new IntegerExpression("EscritoPor.", this);
		EscritoPor = new AssociationExpression("EscritoPor", this);
		ContieneMultimedia = new CollectionExpression("ORM_contieneMultimedia", this);
		ContieneTextoId = new IntegerExpression("ContieneTexto.id_cont", this);
		ContieneTexto = new AssociationExpression("ContieneTexto", this);
		RetweeteaAId = new IntegerExpression("RetweeteaA.", this);
		RetweeteaA = new AssociationExpression("RetweeteaA", this);
		Comentarios = new CollectionExpression("ORM_comentarios", this);
		Contiene = new CollectionExpression("ORM_contiene", this);
		RetweeteadoPor = new CollectionExpression("ORM_retweeteadoPor", this);
		MencionaA = new CollectionExpression("ORM_mencionaA", this);
	}
	
	public TweetCriteria(PersistentSession session) {
		this(session.createCriteria(Tweet.class));
	}
	
	public TweetCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public TweetCriteria createRetweeteaACriteria() {
		return new TweetCriteria(createCriteria("RetweeteaA"));
	}
	
	public ComentarioCriteria createComentariosCriteria() {
		return new ComentarioCriteria(createCriteria("ORM_comentarios"));
	}
	
	public HashtagCriteria createContieneCriteria() {
		return new HashtagCriteria(createCriteria("ORM_contiene"));
	}
	
	public TweetCriteria createRetweeteadoPorCriteria() {
		return new TweetCriteria(createCriteria("ORM_retweeteadoPor"));
	}
	
	public UsuarioRegistradoCriteria createMencionaACriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_mencionaA"));
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
	
	public Tweet uniqueTweet() {
		return (Tweet) super.uniqueResult();
	}
	
	public Tweet[] listTweet() {
		java.util.List list = super.list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

