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

public class HashtagCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_hash;
	public final IntegerExpression CreadoPorId;
	public final AssociationExpression CreadoPor;
	public final IntegerExpression NumTweets;
	public final StringExpression Titulo;
	public final CollectionExpression ContenidoPor;
	
	public HashtagCriteria(Criteria criteria) {
		super(criteria);
		id_hash = new IntegerExpression("id_hash", this);
		CreadoPorId = new IntegerExpression("CreadoPor.", this);
		CreadoPor = new AssociationExpression("CreadoPor", this);
		NumTweets = new IntegerExpression("NumTweets", this);
		Titulo = new StringExpression("Titulo", this);
		ContenidoPor = new CollectionExpression("ORM_contenidoPor", this);
	}
	
	public HashtagCriteria(PersistentSession session) {
		this(session.createCriteria(Hashtag.class));
	}
	
	public HashtagCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createCreadoPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("CreadoPor"));
	}
	
	public TweetCriteria createContenidoPorCriteria() {
		return new TweetCriteria(createCriteria("ORM_contenidoPor"));
	}
	
	public Hashtag uniqueHashtag() {
		return (Hashtag) super.uniqueResult();
	}
	
	public Hashtag[] listHashtag() {
		java.util.List list = super.list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

