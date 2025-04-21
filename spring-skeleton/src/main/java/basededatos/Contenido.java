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
@Table(name="Contenido")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Contenido")
public class Contenido implements Serializable {
	public Contenido() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CONTENIDO_MEGUSTAPOR) {
			return ORM_meGustaPor;
		}
		else if (key == ORMConstants.KEY_CONTENIDO_CONTIENEMULTIMEDIA) {
			return ORM_contieneMultimedia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CONTENIDO_ESCRITOPOR) {
			this.EscritoPor = (basededatos.UsuarioRegistrado) owner;
		}
		
		else if (key == ORMConstants.KEY_CONTENIDO_CONTIENETEXTO) {
			this.ContieneTexto = (basededatos.Texto) owner;
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
	
	@Column(name="Id_cont", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="BASEDEDATOS_CONTENIDO_ID_CONT_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="BASEDEDATOS_CONTENIDO_ID_CONT_GENERATOR", strategy="native")	
	private int id_cont;
	
	@ManyToMany(targetEntity=basededatos.UsuarioRegistrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="UsuarioRegistrado_Contenido", joinColumns={ @JoinColumn(name="ContenidoId_cont") }, inverseJoinColumns={ @JoinColumn(name="UsuarioRegistradoLogueadoId_logueado") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_meGustaPor = new java.util.HashSet();
	
	@ManyToOne(targetEntity=basededatos.UsuarioRegistrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UsuarioRegistradoLogueadoId_logueado", referencedColumnName="LogueadoId_logueado", nullable=false) }, foreignKey=@ForeignKey(name="FKContenido168544"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.UsuarioRegistrado EscritoPor;
	
	@OneToMany(mappedBy="PerteneceA", targetEntity=basededatos.Multimedia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contieneMultimedia = new java.util.HashSet();
	
	@OneToOne(mappedBy="PerteneceA", targetEntity=basededatos.Texto.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Texto ContieneTexto;
	
	private void setId_cont(int value) {
		this.id_cont = value;
	}
	
	public int getId_cont() {
		return id_cont;
	}
	
	public int getORMID() {
		return getId_cont();
	}
	
	private void setORM_MeGustaPor(java.util.Set value) {
		this.ORM_meGustaPor = value;
	}
	
	private java.util.Set getORM_MeGustaPor() {
		return ORM_meGustaPor;
	}
	
	@Transient	
	public final basededatos.UsuarioRegistradoSetCollection meGustaPor = new basededatos.UsuarioRegistradoSetCollection(this, _ormAdapter, ORMConstants.KEY_CONTENIDO_MEGUSTAPOR, ORMConstants.KEY_USUARIOREGISTRADO_MEGUSTA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setEscritoPor(basededatos.UsuarioRegistrado value) {
		if (EscritoPor != null) {
			EscritoPor.escribe.remove(this);
		}
		if (value != null) {
			value.escribe.add(this);
		}
	}
	
	public basededatos.UsuarioRegistrado getEscritoPor() {
		return EscritoPor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EscritoPor(basededatos.UsuarioRegistrado value) {
		this.EscritoPor = value;
	}
	
	private basededatos.UsuarioRegistrado getORM_EscritoPor() {
		return EscritoPor;
	}
	
	private void setORM_ContieneMultimedia(java.util.Set value) {
		this.ORM_contieneMultimedia = value;
	}
	
	private java.util.Set getORM_ContieneMultimedia() {
		return ORM_contieneMultimedia;
	}
	
	@Transient	
	public final basededatos.MultimediaSetCollection contieneMultimedia = new basededatos.MultimediaSetCollection(this, _ormAdapter, ORMConstants.KEY_CONTENIDO_CONTIENEMULTIMEDIA, ORMConstants.KEY_MULTIMEDIA_PERTENECEA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setContieneTexto(basededatos.Texto value) {
		if (this.ContieneTexto != value) {
			basededatos.Texto lContieneTexto = this.ContieneTexto;
			this.ContieneTexto = value;
			if (value != null) {
				ContieneTexto.setPerteneceA(this);
			}
			if (lContieneTexto != null && lContieneTexto.getPerteneceA() == this) {
				lContieneTexto.setPerteneceA(null);
			}
		}
	}
	
	public basededatos.Texto getContieneTexto() {
		return ContieneTexto;
	}
	
	public String toString() {
		return String.valueOf(getId_cont());
	}
	
}
