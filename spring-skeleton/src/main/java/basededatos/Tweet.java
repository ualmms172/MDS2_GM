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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Tweet")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Tweet")
@PrimaryKeyJoinColumn(name="ContenidoId_cont", referencedColumnName="Id_cont")
public class Tweet extends basededatos.Contenido implements Serializable {
	public Tweet() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TWEET_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == ORMConstants.KEY_TWEET_CONTIENE) {
			return ORM_contiene;
		}
		else if (key == ORMConstants.KEY_TWEET_RETWEETEADOPOR) {
			return ORM_retweeteadoPor;
		}
		else if (key == ORMConstants.KEY_TWEET_MENCIONAA) {
			return ORM_mencionaA;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_TWEET_RETWEETEAA) {
			this.RetweeteaA = (basededatos.Tweet) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=basededatos.Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetContenidoId_cont", referencedColumnName="ContenidoId_cont") }, foreignKey=@ForeignKey(name="FKTweet153239"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Tweet RetweeteaA;
	
	@OneToMany(mappedBy="ComentadoEn", targetEntity=basededatos.Comentario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_contenidoPor", targetEntity=basededatos.Hashtag.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contiene = new java.util.HashSet();
	
	@OneToMany(mappedBy="RetweeteaA", targetEntity=basededatos.Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_retweeteadoPor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_mencionadoEn", targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mencionaA = new java.util.HashSet();
	
	public void setRetweeteaA(basededatos.Tweet value) {
		if (RetweeteaA != null) {
			RetweeteaA.retweeteadoPor.remove(this);
		}
		if (value != null) {
			value.retweeteadoPor.add(this);
		}
	}
	
	public basededatos.Tweet getRetweeteaA() {
		return RetweeteaA;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_RetweeteaA(basededatos.Tweet value) {
		this.RetweeteaA = value;
	}
	
	private basededatos.Tweet getORM_RetweeteaA() {
		return RetweeteaA;
	}
	
	private void setORM_Comentarios(java.util.Set value) {
		this.ORM_comentarios = value;
	}
	
	private java.util.Set getORM_Comentarios() {
		return ORM_comentarios;
	}
	
	@Transient	
	public final basededatos.ComentarioSetCollection comentarios = new basededatos.ComentarioSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_COMENTARIOS, ORMConstants.KEY_COMENTARIO_COMENTADOEN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Contiene(java.util.Set value) {
		this.ORM_contiene = value;
	}
	
	private java.util.Set getORM_Contiene() {
		return ORM_contiene;
	}
	
	@Transient	
	public final basededatos.HashtagSetCollection contiene = new basededatos.HashtagSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_CONTIENE, ORMConstants.KEY_HASHTAG_CONTENIDOPOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_RetweeteadoPor(java.util.Set value) {
		this.ORM_retweeteadoPor = value;
	}
	
	private java.util.Set getORM_RetweeteadoPor() {
		return ORM_retweeteadoPor;
	}
	
	@Transient	
	public final basededatos.TweetSetCollection retweeteadoPor = new basededatos.TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_RETWEETEADOPOR, ORMConstants.KEY_TWEET_RETWEETEAA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_MencionaA(java.util.Set value) {
		this.ORM_mencionaA = value;
	}
	
	private java.util.Set getORM_MencionaA() {
		return ORM_mencionaA;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection mencionaA = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_TWEET_MENCIONAA, ORMConstants.KEY_USUARIOREGISTRADO_MENCIONADOEN, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
