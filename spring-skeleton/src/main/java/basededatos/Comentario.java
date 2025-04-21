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
@Table(name="Comentario")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("Comentario")
@PrimaryKeyJoinColumn(name="ContenidoId_cont", referencedColumnName="Id_cont")
public class Comentario extends basededatos.Contenido implements Serializable {
	public Comentario() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMENTARIO_COMENTADOEN) {
			this.ComentadoEn = (basededatos.Tweet) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=basededatos.Tweet.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="TweetContenidoId_cont", referencedColumnName="ContenidoId_cont", nullable=false) }, foreignKey=@ForeignKey(name="FKComentario141332"))	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private basededatos.Tweet ComentadoEn;
	
	public void setComentadoEn(basededatos.Tweet value) {
		if (ComentadoEn != null) {
			ComentadoEn.comentarios.remove(this);
		}
		if (value != null) {
			value.comentarios.add(this);
		}
	}
	
	public basededatos.Tweet getComentadoEn() {
		return ComentadoEn;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_ComentadoEn(basededatos.Tweet value) {
		this.ComentadoEn = value;
	}
	
	private basededatos.Tweet getORM_ComentadoEn() {
		return ComentadoEn;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
