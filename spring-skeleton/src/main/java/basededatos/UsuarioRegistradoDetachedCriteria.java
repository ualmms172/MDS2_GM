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

public class UsuarioRegistradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression Nick;
	public final StringExpression Contrasena;
	public final StringExpression Correo;
	public final IntegerExpression id_user;
	public final StringExpression Descripcion;
	public final StringExpression FotoPerfil;
	public final StringExpression FotoFondo;
	public final DateExpression Baneo;
	public final CollectionExpression BloqueaA;
	public final CollectionExpression SigueA;
	public final CollectionExpression MencionadoEn;
	public final CollectionExpression BloqueadoPor;
	public final CollectionExpression SeguidoPor;
	public final CollectionExpression MeGusta;
	public final CollectionExpression CreaHashtag;
	public final CollectionExpression escribe;
	
	public UsuarioRegistradoDetachedCriteria() {
		super(basededatos.UsuarioRegistrado.class, basededatos.UsuarioRegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nick = new StringExpression("Nick", this.getDetachedCriteria());
		Contrasena = new StringExpression("Contrasena", this.getDetachedCriteria());
		Correo = new StringExpression("Correo", this.getDetachedCriteria());
		id_user = new IntegerExpression("id_user", this.getDetachedCriteria());
		Descripcion = new StringExpression("Descripcion", this.getDetachedCriteria());
		FotoPerfil = new StringExpression("FotoPerfil", this.getDetachedCriteria());
		FotoFondo = new StringExpression("FotoFondo", this.getDetachedCriteria());
		Baneo = new DateExpression("Baneo", this.getDetachedCriteria());
		BloqueaA = new CollectionExpression("ORM_bloqueaA", this.getDetachedCriteria());
		SigueA = new CollectionExpression("ORM_sigueA", this.getDetachedCriteria());
		MencionadoEn = new CollectionExpression("ORM_mencionadoEn", this.getDetachedCriteria());
		BloqueadoPor = new CollectionExpression("ORM_bloqueadoPor", this.getDetachedCriteria());
		SeguidoPor = new CollectionExpression("ORM_seguidoPor", this.getDetachedCriteria());
		MeGusta = new CollectionExpression("ORM_meGusta", this.getDetachedCriteria());
		CreaHashtag = new CollectionExpression("ORM_creaHashtag", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, basededatos.UsuarioRegistradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		Nick = new StringExpression("Nick", this.getDetachedCriteria());
		Contrasena = new StringExpression("Contrasena", this.getDetachedCriteria());
		Correo = new StringExpression("Correo", this.getDetachedCriteria());
		id_user = new IntegerExpression("id_user", this.getDetachedCriteria());
		Descripcion = new StringExpression("Descripcion", this.getDetachedCriteria());
		FotoPerfil = new StringExpression("FotoPerfil", this.getDetachedCriteria());
		FotoFondo = new StringExpression("FotoFondo", this.getDetachedCriteria());
		Baneo = new DateExpression("Baneo", this.getDetachedCriteria());
		BloqueaA = new CollectionExpression("ORM_bloqueaA", this.getDetachedCriteria());
		SigueA = new CollectionExpression("ORM_sigueA", this.getDetachedCriteria());
		MencionadoEn = new CollectionExpression("ORM_mencionadoEn", this.getDetachedCriteria());
		BloqueadoPor = new CollectionExpression("ORM_bloqueadoPor", this.getDetachedCriteria());
		SeguidoPor = new CollectionExpression("ORM_seguidoPor", this.getDetachedCriteria());
		MeGusta = new CollectionExpression("ORM_meGusta", this.getDetachedCriteria());
		CreaHashtag = new CollectionExpression("ORM_creaHashtag", this.getDetachedCriteria());
		escribe = new CollectionExpression("ORM_escribe", this.getDetachedCriteria());
	}
	
	public UsuarioRegistradoDetachedCriteria createBloqueaACriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("ORM_bloqueaA"));
	}
	
	public UsuarioRegistradoDetachedCriteria createSigueACriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("ORM_sigueA"));
	}
	
	public TweetDetachedCriteria createMencionadoEnCriteria() {
		return new TweetDetachedCriteria(createCriteria("ORM_mencionadoEn"));
	}
	
	public UsuarioRegistradoDetachedCriteria createBloqueadoPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("ORM_bloqueadoPor"));
	}
	
	public UsuarioRegistradoDetachedCriteria createSeguidoPorCriteria() {
		return new UsuarioRegistradoDetachedCriteria(createCriteria("ORM_seguidoPor"));
	}
	
	public ContenidoDetachedCriteria createMeGustaCriteria() {
		return new ContenidoDetachedCriteria(createCriteria("ORM_meGusta"));
	}
	
	public HashtagDetachedCriteria createCreaHashtagCriteria() {
		return new HashtagDetachedCriteria(createCriteria("ORM_creaHashtag"));
	}
	
	public ContenidoDetachedCriteria createEscribeCriteria() {
		return new ContenidoDetachedCriteria(createCriteria("ORM_escribe"));
	}
	
	public UsuarioRegistrado uniqueUsuarioRegistrado(PersistentSession session) {
		return (UsuarioRegistrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public UsuarioRegistrado[] listUsuarioRegistrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (UsuarioRegistrado[]) list.toArray(new UsuarioRegistrado[list.size()]);
	}
}

