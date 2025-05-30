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

public class ComentarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_cont;
	public final CollectionExpression MeGustaPor;
	public final IntegerExpression EscritoPorId;
	public final AssociationExpression EscritoPor;
	public final CollectionExpression ContieneMultimedia;
	public final IntegerExpression ContieneTextoId;
	public final AssociationExpression ContieneTexto;
	public final IntegerExpression ComentadoEnId;
	public final AssociationExpression ComentadoEn;
	
	public ComentarioDetachedCriteria() {
		super(basededatos.Comentario.class, basededatos.ComentarioCriteria.class);
		id_cont = new IntegerExpression("id_cont", this.getDetachedCriteria());
		MeGustaPor = new CollectionExpression("ORM_meGustaPor", this.getDetachedCriteria());
		EscritoPorId = new IntegerExpression("EscritoPor.", this.getDetachedCriteria());
		EscritoPor = new AssociationExpression("EscritoPor", this.getDetachedCriteria());
		ContieneMultimedia = new CollectionExpression("ORM_contieneMultimedia", this.getDetachedCriteria());
		ContieneTextoId = new IntegerExpression("ContieneTexto.id_cont", this.getDetachedCriteria());
		ContieneTexto = new AssociationExpression("ContieneTexto", this.getDetachedCriteria());
		ComentadoEnId = new IntegerExpression("ComentadoEn.", this.getDetachedCriteria());
		ComentadoEn = new AssociationExpression("ComentadoEn", this.getDetachedCriteria());
	}
	
	public ComentarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.ComentarioCriteria.class);
		id_cont = new IntegerExpression("id_cont", this.getDetachedCriteria());
		MeGustaPor = new CollectionExpression("ORM_meGustaPor", this.getDetachedCriteria());
		EscritoPorId = new IntegerExpression("EscritoPor.", this.getDetachedCriteria());
		EscritoPor = new AssociationExpression("EscritoPor", this.getDetachedCriteria());
		ContieneMultimedia = new CollectionExpression("ORM_contieneMultimedia", this.getDetachedCriteria());
		ContieneTextoId = new IntegerExpression("ContieneTexto.id_cont", this.getDetachedCriteria());
		ContieneTexto = new AssociationExpression("ContieneTexto", this.getDetachedCriteria());
		ComentadoEnId = new IntegerExpression("ComentadoEn.", this.getDetachedCriteria());
		ComentadoEn = new AssociationExpression("ComentadoEn", this.getDetachedCriteria());
	}
	
	public TweetDetachedCriteria createComentadoEnCriteria() {
		return new TweetDetachedCriteria(createCriteria("ComentadoEn"));
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
	
	public Comentario uniqueComentario(PersistentSession session) {
		return (Comentario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comentario[] listComentario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comentario[]) list.toArray(new Comentario[list.size()]);
	}
}

