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

public class UsuarioRegistradoCriteria extends AbstractORMCriteria {
	public final IntegerExpression id_logueado;
	public final StringExpression Nick;
	public final StringExpression Contrasena;
	public final IntegerExpression id_user;
	public final StringExpression Descripcion;
	public final StringExpression FotoPerfil;
	public final StringExpression FotoFondo;
	public final CollectionExpression BloqueaA;
	public final CollectionExpression SigueA;
	public final CollectionExpression MencionadoEn;
	public final CollectionExpression BloqueadoPor;
	public final CollectionExpression SeguidoPor;
	public final CollectionExpression MeGusta;
	public final CollectionExpression CreaHashtag;
	public final CollectionExpression escribe;
	public final IntegerExpression baneoId;
	public final AssociationExpression baneo;
	
	public UsuarioRegistradoCriteria(Criteria criteria) {
		super(criteria);
		id_logueado = new IntegerExpression("id_logueado", this);
		Nick = new StringExpression("Nick", this);
		Contrasena = new StringExpression("Contrasena", this);
		id_user = new IntegerExpression("id_user", this);
		Descripcion = new StringExpression("Descripcion", this);
		FotoPerfil = new StringExpression("FotoPerfil", this);
		FotoFondo = new StringExpression("FotoFondo", this);
		BloqueaA = new CollectionExpression("ORM_bloqueaA", this);
		SigueA = new CollectionExpression("ORM_sigueA", this);
		MencionadoEn = new CollectionExpression("ORM_mencionadoEn", this);
		BloqueadoPor = new CollectionExpression("ORM_bloqueadoPor", this);
		SeguidoPor = new CollectionExpression("ORM_seguidoPor", this);
		MeGusta = new CollectionExpression("ORM_meGusta", this);
		CreaHashtag = new CollectionExpression("ORM_creaHashtag", this);
		escribe = new CollectionExpression("ORM_escribe", this);
		baneoId = new IntegerExpression("baneo.null", this);
		baneo = new AssociationExpression("baneo", this);
	}
	
	public UsuarioRegistradoCriteria(PersistentSession session) {
		this(session.createCriteria(UsuarioRegistrado.class));
	}
	
	public UsuarioRegistradoCriteria() throws PersistentException {
		this(MDS12425PFGallardoMartínezPersistentManager.instance().getSession());
	}
	
	public UsuarioRegistradoCriteria createBloqueaACriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_bloqueaA"));
	}
	
	public UsuarioRegistradoCriteria createSigueACriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_sigueA"));
	}
	
	public TweetCriteria createMencionadoEnCriteria() {
		return new TweetCriteria(createCriteria("ORM_mencionadoEn"));
	}
	
	public UsuarioRegistradoCriteria createBloqueadoPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_bloqueadoPor"));
	}
	
	public UsuarioRegistradoCriteria createSeguidoPorCriteria() {
		return new UsuarioRegistradoCriteria(createCriteria("ORM_seguidoPor"));
	}
	
	public ContenidoCriteria createMeGustaCriteria() {
		return new ContenidoCriteria(createCriteria("ORM_meGusta"));
	}
	
	public HashtagCriteria createCreaHashtagCriteria() {
		return new HashtagCriteria(createCriteria("ORM_creaHashtag"));
	}
	
	public ContenidoCriteria createEscribeCriteria() {
		return new ContenidoCriteria(createCriteria("ORM_escribe"));
	}
	
	public baneoCriteria createBaneoCriteria() {
		return new baneoCriteria(createCriteria("baneo"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado() {
		return (UsuarioRegistrado) super.uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado() {
		java.util.List list = super.list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

