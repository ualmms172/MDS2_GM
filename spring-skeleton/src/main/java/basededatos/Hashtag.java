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
@Table(name="Hashtag")
public class Hashtag implements Serializable {
	public Hashtag() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_HASHTAG_CONTENIDOPOR) {
			return ORM_contenidoPor;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_HASHTAG_CREADOPOR) {
			this.CreadoPor = (basededatos.UsuarioRegistrado) owner;
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
	
	@Column(name="Id_hash", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_HASHTAG_ID_HASH_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_HASHTAG_ID_HASH_GENERATOR", strategy="native")	
	private int id_hash;
	
	@ManyToOne(targetEntity=basededatos.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoLogueadoId_logueado", referencedColumnName="LogueadoId_logueado", nullable=false) }, foreignKey=@ForeignKey(name="FKHashtag816271"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.UsuarioRegistrado CreadoPor;
	
	@Column(name="NumTweets", nullable=false, length=10)	
	private int NumTweets;
	
	@Column(name="Titulo", nullable=true, length=255)	
	private String Titulo;
	
	@ManyToMany(targetEntity=basededatos.Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Tweet_Hashtag", joinColumns={ @JoinColumn(name="HashtagId_hash") }, inverseJoinColumns={ @JoinColumn(name="TweetContenidoId_cont") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contenidoPor = new java.util.HashSet();
	
	private void setId_hash(int value) {
		this.id_hash = value;
	}
	
	public int getId_hash() {
		return id_hash;
	}
	
	public int getORMID() {
		return getId_hash();
	}
	
	public void setNumTweets(int value) {
		this.NumTweets = value;
	}
	
	public int getNumTweets() {
		return NumTweets;
	}
	
	public void setTitulo(String value) {
		this.Titulo = value;
	}
	
	public String getTitulo() {
		return Titulo;
	}
	
	private void setORM_ContenidoPor(java.util.Set value) {
		this.ORM_contenidoPor = value;
	}
	
	private java.util.Set getORM_ContenidoPor() {
		return ORM_contenidoPor;
	}
	
	@Transient	
	public final basededatos.TweetSetCollection contenidoPor = new basededatos.TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_HASHTAG_CONTENIDOPOR, ORMConstants.KEY_TWEET_CONTIENE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCreadoPor(basededatos.UsuarioRegistrado value) {
		if (CreadoPor != null) {
			CreadoPor.creaHashtag.remove(this);
		}
		if (value != null) {
			value.creaHashtag.add(this);
		}
	}
	
	public basededatos.UsuarioRegistrado getCreadoPor() {
		return CreadoPor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_CreadoPor(basededatos.UsuarioRegistrado value) {
		this.CreadoPor = value;
	}
	
	private basededatos.UsuarioRegistrado getORM_CreadoPor() {
		return CreadoPor;
	}
	
	public String toString() {
		return String.valueOf(getId_hash());
	}
	
}
