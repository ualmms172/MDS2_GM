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

public class HashtagDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_hash;
	public final IntegerExpression CreadoPorId;
	public final AssociationExpression CreadoPor;
	public final IntegerExpression NumTweets;
	public final StringExpression Titulo;
	public final CollectionExpression ContenidoPor;
	
	public HashtagDetachedCriteria() {
		super(basededatos.Hashtag.class, basededatos.HashtagCriteria.class);
		id_hash = new IntegerExpression("id_hash", this.getDetachedCriteria());
		CreadoPorId = new IntegerExpression("CreadoPor.", this.getDetachedCriteria());
		CreadoPor = new AssociationExpression("CreadoPor", this.getDetachedCriteria());
		NumTweets = new IntegerExpression("NumTweets", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		ContenidoPor = new CollectionExpression("ORM_contenidoPor", this.getDetachedCriteria());
	}
	
	public HashtagDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.HashtagCriteria.class);
		id_hash = new IntegerExpression("id_hash", this.getDetachedCriteria());
		CreadoPorId = new IntegerExpression("CreadoPor.", this.getDetachedCriteria());
		CreadoPor = new AssociationExpression("CreadoPor", this.getDetachedCriteria());
		NumTweets = new IntegerExpression("NumTweets", this.getDetachedCriteria());
		Titulo = new StringExpression("Titulo", this.getDetachedCriteria());
		ContenidoPor = new CollectionExpression("ORM_contenidoPor", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createCreadoPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("CreadoPor"));
	}
	
	public TweetDetachedCriteria createContenidoPorCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_contenidoPor"));
	}
	
	public Hashtag uniqueHashtag(PersistentSession session) {
		return (Hashtag) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Hashtag[] listHashtag(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Hashtag[]) list.toArray(new Hashtag[list.size()]);
	}
}

