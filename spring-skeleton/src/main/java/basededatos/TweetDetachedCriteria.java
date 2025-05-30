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

public class TweetDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_cont;
	public final CollectionExpression MeGustaPor;
	public final IntegerExpression EscritoPorId;
	public final AssociationExpression EscritoPor;
	public final CollectionExpression ContieneMultimedia;
	public final IntegerExpression ContieneTextoId;
	public final AssociationExpression ContieneTexto;
	public final IntegerExpression MencionaAId;
	public final AssociationExpression MencionaA;
	public final IntegerExpression RetweeteaAId;
	public final AssociationExpression RetweeteaA;
	public final IntegerExpression ContieneId;
	public final AssociationExpression Contiene;
	public final CollectionExpression Comentarios;
	public final CollectionExpression RetweeteadoPor;
	
	public TweetDetachedCriteria() {
		super(basededatos.Tweet.class, basededatos.TweetCriteria.class);
		id_cont = new IntegerExpression("id_cont", this.getDetachedCriteria());
		MeGustaPor = new CollectionExpression("ORM_meGustaPor", this.getDetachedCriteria());
		EscritoPorId = new IntegerExpression("EscritoPor.", this.getDetachedCriteria());
		EscritoPor = new AssociationExpression("EscritoPor", this.getDetachedCriteria());
		ContieneMultimedia = new CollectionExpression("ORM_contieneMultimedia", this.getDetachedCriteria());
		ContieneTextoId = new IntegerExpression("ContieneTexto.id_cont", this.getDetachedCriteria());
		ContieneTexto = new AssociationExpression("ContieneTexto", this.getDetachedCriteria());
		MencionaAId = new IntegerExpression("MencionaA.", this.getDetachedCriteria());
		MencionaA = new AssociationExpression("MencionaA", this.getDetachedCriteria());
		RetweeteaAId = new IntegerExpression("RetweeteaA.", this.getDetachedCriteria());
		RetweeteaA = new AssociationExpression("RetweeteaA", this.getDetachedCriteria());
		ContieneId = new IntegerExpression("Contiene.id_hash", this.getDetachedCriteria());
		Contiene = new AssociationExpression("Contiene", this.getDetachedCriteria());
		Comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		RetweeteadoPor = new CollectionExpression("ORM_retweeteadoPor", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.TweetCriteria.class);
		id_cont = new IntegerExpression("id_cont", this.getDetachedCriteria());
		MeGustaPor = new CollectionExpression("ORM_meGustaPor", this.getDetachedCriteria());
		EscritoPorId = new IntegerExpression("EscritoPor.", this.getDetachedCriteria());
		EscritoPor = new AssociationExpression("EscritoPor", this.getDetachedCriteria());
		ContieneMultimedia = new CollectionExpression("ORM_contieneMultimedia", this.getDetachedCriteria());
		ContieneTextoId = new IntegerExpression("ContieneTexto.id_cont", this.getDetachedCriteria());
		ContieneTexto = new AssociationExpression("ContieneTexto", this.getDetachedCriteria());
		MencionaAId = new IntegerExpression("MencionaA.", this.getDetachedCriteria());
		MencionaA = new AssociationExpression("MencionaA", this.getDetachedCriteria());
		RetweeteaAId = new IntegerExpression("RetweeteaA.", this.getDetachedCriteria());
		RetweeteaA = new AssociationExpression("RetweeteaA", this.getDetachedCriteria());
		ContieneId = new IntegerExpression("Contiene.id_hash", this.getDetachedCriteria());
		Contiene = new AssociationExpression("Contiene", this.getDetachedCriteria());
		Comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		RetweeteadoPor = new CollectionExpression("ORM_retweeteadoPor", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createMencionaACriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("MencionaA"));
	}
	
	public TweetDetachedCriteria createRetweeteaACriteria() {
		return new TweetDetachedCriteria(createCriteria("RetweeteaA"));
	}
	
	public HashtagDetachedCriteria createContieneCriteria() {
		return new HashtagDetachedCriteria(createCriteria("Contiene"));
	}
	
	public ComentarioDetachedCriteria createComentariosCriteria() {
		return new ComentarioDetachedCriteria(createCriteria("ORM_comentarios"));
	}
	
	public TweetDetachedCriteria createRetweeteadoPorCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_retweeteadoPor"));
	}
	
	public UsuarioRegistradoDetachedCriteria createMeGustaPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("ORM_meGustaPor"));
	}
	
	public UsuarioRegistradoDetachedCriteria createEscritoPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("EscritoPor"));
	}
	
	public MultimediaDetachedCriteria createContieneMultimediaCriteria() {
		return new MultimediaDetachedCriteria(createCriteria("ORM_contieneMultimedia"));
	}
	
	public TextoDetachedCriteria createContieneTextoCriteria() {
		return new TextoDetachedCriteria(createCriteria("ContieneTexto"));
	}
	
	public Tweet uniqueTweet(PersistentSession session) {
		return (Tweet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tweet[] listTweet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tweet[]) list.toArray(new Tweet[list.size()]);
	}
}

