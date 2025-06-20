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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="UsuarioRegistrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="LogueadoID", referencedColumnName="ID")
public class UsuarioRegistrado extends basededatos.Logueado implements Serializable {
	public UsuarioRegistrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIOREGISTRADO_BLOQUEAA) {
			return ORM_bloqueaA;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_SIGUEA) {
			return ORM_sigueA;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_MENCIONADOEN) {
			return ORM_mencionadoEn;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_BLOQUEADOPOR) {
			return ORM_bloqueadoPor;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_SEGUIDOPOR) {
			return ORM_seguidoPor;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_MEGUSTA) {
			return ORM_meGusta;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_CREAHASHTAG) {
			return ORM_creaHashtag;
		}
		else if (key == ORMConstants.KEY_USUARIOREGISTRADO_ESCRIBE) {
			return ORM_escribe;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id_user", nullable=false, length=10)	
	private int id_user;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String Descripcion;
	
	@Column(name="FotoPerfil", nullable=true, length=255)	
	private String FotoPerfil;
	
	@Column(name="FotoFondo", nullable=true, length=255)	
	private String FotoFondo;
	
	@Column(name="Baneo", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date Baneo;
	
	@ManyToMany(targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_UsuarioRegistrado3", joinColumns={ @JoinColumn(name="UsuarioRegistradoLogueadoID2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoLogueadoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_bloqueaA = new java.util.HashSet();
	
	@ManyToMany(targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_UsuarioRegistrado4", joinColumns={ @JoinColumn(name="UsuarioRegistradoLogueadoID2") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoLogueadoID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_sigueA = new java.util.HashSet();
	
	@OneToMany(mappedBy="MencionaA", targetEntity=basededatos.Tweet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_mencionadoEn = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_bloqueaA", targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_bloqueadoPor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_sigueA", targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_seguidoPor = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_meGustaPor", targetEntity=basededatos.Contenido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_meGusta = new java.util.HashSet();
	
	@OneToMany(mappedBy="CreadoPor", targetEntity=basededatos.Hashtag.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_creaHashtag = new java.util.HashSet();
	
	@OneToMany(mappedBy="EscritoPor", targetEntity=basededatos.Contenido.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.FALSE)	
	private java.util.Set ORM_escribe = new java.util.HashSet();
	
	public void setId_user(int value) {
		this.id_user = value;
	}
	
	public int getId_user() {
		return id_user;
	}
	
	public void setDescripcion(String value) {
		this.Descripcion = value;
	}
	
	public String getDescripcion() {
		return Descripcion;
	}
	
	public void setFotoPerfil(String value) {
		this.FotoPerfil = value;
	}
	
	public String getFotoPerfil() {
		return FotoPerfil;
	}
	
	public void setFotoFondo(String value) {
		this.FotoFondo = value;
	}
	
	public String getFotoFondo() {
		return FotoFondo;
	}
	
	public void setBaneo(java.util.Date value) {
		this.Baneo = value;
	}
	
	public java.util.Date getBaneo() {
		return Baneo;
	}
	
	private void setORM_BloqueaA(java.util.Set value) {
		this.ORM_bloqueaA = value;
	}
	
	private java.util.Set getORM_BloqueaA() {
		return ORM_bloqueaA;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection bloqueaA = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_BLOQUEAA, ORMConstants.KEY_USUARIOREGISTRADO_BLOQUEADOPOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_SigueA(java.util.Set value) {
		this.ORM_sigueA = value;
	}
	
	private java.util.Set getORM_SigueA() {
		return ORM_sigueA;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection sigueA = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_SIGUEA, ORMConstants.KEY_USUARIOREGISTRADO_SEGUIDOPOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_MencionadoEn(java.util.Set value) {
		this.ORM_mencionadoEn = value;
	}
	
	private java.util.Set getORM_MencionadoEn() {
		return ORM_mencionadoEn;
	}
	
	@Transient	
	public final basededatos.TweetSetCollection mencionadoEn = new basededatos.TweetSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_MENCIONADOEN, ORMConstants.KEY_TWEET_MENCIONAA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_BloqueadoPor(java.util.Set value) {
		this.ORM_bloqueadoPor = value;
	}
	
	private java.util.Set getORM_BloqueadoPor() {
		return ORM_bloqueadoPor;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection bloqueadoPor = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_BLOQUEADOPOR, ORMConstants.KEY_USUARIOREGISTRADO_BLOQUEAA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_SeguidoPor(java.util.Set value) {
		this.ORM_seguidoPor = value;
	}
	
	private java.util.Set getORM_SeguidoPor() {
		return ORM_seguidoPor;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection seguidoPor = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_SEGUIDOPOR, ORMConstants.KEY_USUARIOREGISTRADO_SIGUEA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_MeGusta(java.util.Set value) {
		this.ORM_meGusta = value;
	}
	
	private java.util.Set getORM_MeGusta() {
		return ORM_meGusta;
	}
	
	@Transient	
	public final basededatos.ContenidoSetCollection meGusta = new basededatos.ContenidoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_MEGUSTA, ORMConstants.KEY_CONTENIDO_MEGUSTAPOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_CreaHashtag(java.util.Set value) {
		this.ORM_creaHashtag = value;
	}
	
	private java.util.Set getORM_CreaHashtag() {
		return ORM_creaHashtag;
	}
	
	@Transient	
	public final basededatos.HashtagSetCollection creaHashtag = new basededatos.HashtagSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_CREAHASHTAG, ORMConstants.KEY_HASHTAG_CREADOPOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Escribe(java.util.Set value) {
		this.ORM_escribe = value;
	}
	
	private java.util.Set getORM_Escribe() {
		return ORM_escribe;
	}
	
	@Transient	
	public final basededatos.ContenidoSetCollection escribe = new basededatos.ContenidoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIOREGISTRADO_ESCRIBE, ORMConstants.KEY_CONTENIDO_ESCRITOPOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return super.toString();
	}
	
}
